package emu.lunarcore.command.commands;

import emu.lunarcore.LunarCore;
import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;

@Command(label = "help", permission = "player.help", desc = "/help. 展示所有当前可用指令。")
public class HelpCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        args.sendMessage("以下是所有可用指令:");
        args.sendMessage("注意：");
        args.sendMessage("大括号 {} 是在其中选择一个参数填入");
        args.sendMessage("中括号 [] 是必须填入此参数");
        args.sendMessage("小括号 () 是可选填入的参数");
        args.sendMessage("--------------");
        args.sendMessage("指令生成工具：https://sr-tool.qiusyan.top，欢迎使用");
        
        // Sort command names
        var labels = LunarCore.getCommandManager().getLabels().keySet().stream().sorted().toList();
        for (var label : labels) {
            // Get command
            Command command = LunarCore.getCommandManager().getLabels().get(label).getClass().getAnnotation(Command.class);
            if (command == null) continue;
            
            // Only send command description if the sender has permission to use the command
            if (LunarCore.getCommandManager().checkPermission(args.getSender(), command)) {
                args.sendMessage(command.desc());
            }
        }
    }

}
