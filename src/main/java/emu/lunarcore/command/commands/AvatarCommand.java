package emu.lunarcore.command.commands;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;
import emu.lunarcore.game.avatar.GameAvatar;
import emu.lunarcore.server.packet.send.PacketPlayerSyncScNotify;
import emu.lunarcore.util.Utils;

@Command(label = "avatar", aliases = {"a"}, requireTarget = true, permission = "player.avatar", desc = "/avatar {cur | all | lineup} lv(等级) p(晋阶等级) e(星魂数量) s(行迹等级). 设置角色的属性。【cur 当前角色，all 所有角色，lineup 当前队伍角色】")
public class AvatarCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        // Temp avatar list
        List<GameAvatar> changeList = new ArrayList<>();
        
        // Handle optional arguments
        String arg = args.get(0).toLowerCase();
        
        if (arg.isBlank()) {
            // Select current avatar if we dont specify any extra args
            changeList.add(args.getTarget().getCurrentLeaderAvatar());
        } else {
            // Handle
            switch (arg) {
                case "all":
                    args.getTarget().getAvatars().forEach(changeList::add);
                    break;
                case "lineup":
                    args.getTarget().getCurrentLineup().forEachAvatar(changeList::add);
                    break;
                case "cur":
                    changeList.add(args.getTarget().getCurrentLeaderAvatar());
                    break;
                default:
                    int avatarId = Utils.parseSafeInt(arg);
                    var avatar = args.getTarget().getAvatarById(avatarId);
                    if (avatar != null) {
                        changeList.add(avatar);
                    }
                    break;
            }
        }
        
        // Try to set properties of avatars
        Iterator<GameAvatar> it = changeList.iterator();
        while (it.hasNext()) {
            GameAvatar avatar = it.next();
            
            if (args.setProperties(avatar)) {
                // Save avatar
                avatar.save();
            } else {
                // Remove from list if nothing was changed
                it.remove();
            }
        }
        
        
        if (changeList.size() > 0) {
            // Send packet
            args.getTarget().sendPacket(new PacketPlayerSyncScNotify(changeList));
            // Send message
            args.sendMessage("设置角色属性成功。");
        } else {
            args.sendMessage("角色的属性没有被改变。");
        }
    }

}
