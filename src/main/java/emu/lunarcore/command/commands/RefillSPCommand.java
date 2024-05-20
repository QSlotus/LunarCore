package emu.lunarcore.command.commands;

import emu.lunarcore.command.Command;
import emu.lunarcore.game.player.lineup.PlayerLineup;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;

@Command(label = "energy", permission = "player.energy", requireTarget = true, desc = "/energy. 恢复你队伍角色的能量。")
public class RefillSPCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        PlayerLineup lineup = args.getTarget().getCurrentLineup();
        lineup.forEachAvatar(avatar -> {
            avatar.setCurrentSp(lineup, 10000);
            avatar.save();
        });
        lineup.refreshLineup();
        
        args.sendMessage("已为 " + args.getTarget().getName() + " 恢复了能量。");
    }

}
