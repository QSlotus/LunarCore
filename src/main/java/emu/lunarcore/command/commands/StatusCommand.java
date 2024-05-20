package emu.lunarcore.command.commands;

import emu.lunarcore.LunarCore;
import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;

@Command(label = "status", aliases = {"st", "stats"}, permission = "admin.status", desc = "/status. 显示服务器状态。")
public class StatusCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        // Run garbage collector
        if (!args.hasFlag("-nogc")) {
            System.gc();
        }
        
        // Show status
        args.sendMessage("以下是服务器状态：");
        
        args.sendMessage("当前 Git 提交 Hash: " + LunarCore.getGitHash());
        args.sendMessage("当前已用内存: " + LunarCore.getMemoryUsage() + " MB");
        
        if (LunarCore.getGameServer() != null) {
            args.sendMessage("在线玩家人数: " + LunarCore.getGameServer().getPlayerCount());
        }
    }
}
