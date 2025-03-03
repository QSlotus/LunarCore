package emu.lunarcore.command.commands;

import java.util.ArrayList;
import java.util.List;

import emu.lunarcore.GameConstants;
import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;
import emu.lunarcore.game.avatar.GameAvatar;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.game.player.lineup.PlayerLineup;
import emu.lunarcore.util.Utils;

@Command(label = "lineup", permission = "player.lineup", requireTarget = true, desc = "/lineup [角色id]. 请自行承担风险。设置你当前的队伍角色.")
public class LineupCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        // Get target player
        Player target = args.getTarget();
        
        // Do not set lineup while the target player is in a battle
        if (target.isInBattle()) {
            args.sendMessage("Error: The targeted player is in a battle");
            return;
        }
        
        // Temp avatar list
        List<Integer> avatars = new ArrayList<>();
        
        // Validate avatars in temp list
        for (String arg : args.getList()) {
            // Make sure the avatar actually exist
            GameAvatar avatar = target.getAvatarById(Utils.parseSafeInt(arg));
            if (avatar == null) continue;
            
            avatars.add(avatar.getAvatarId());
            
            // Soft cap check
            if (avatars.size() >= GameConstants.MAX_AVATARS_IN_TEAM) {
                break;
            }
        }
        
        // Replace cleanly
        if (avatars.size() > 0) {
            // Only replace lineup if we have avatars to replace with
            // The client wont like it if we have a lineup with 0 avatars.
            PlayerLineup lineup = target.getCurrentLineup();
            lineup.getAvatars().clear();
            lineup.getAvatars().addAll(avatars);
            lineup.save();
            
            // Send client packets to sync lineup
            lineup.refreshLineup();
            target.getScene().syncLineup();
            
            args.sendMessage("设置 " + target.getName() + " 的角色编队成功。");
        } else {
            args.sendMessage("No avatars could be added");
        }
    }

}
