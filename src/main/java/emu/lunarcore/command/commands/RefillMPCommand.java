package emu.lunarcore.command.commands;

import emu.lunarcore.GameConstants;
import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;

@Command(label = "refill", aliases = {"rf"}, permission = "player.refill", requireTarget = true, desc = "/refill - 在世界中补充你的秘技点。")
public class RefillMPCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        args.getTarget().getCurrentLineup().addMp(GameConstants.MAX_MP);
        args.sendMessage("已经为 " + args.getTarget().getName() + " 补充了所有秘技点。");
    }

}
