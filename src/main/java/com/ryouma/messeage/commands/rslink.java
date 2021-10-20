package com.ryouma.messeage.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class rslink implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        sender.sendMessage("§b==== リンク集 ====");
        sender.sendMessage("§aRSWEB (公式WEBサイト)");
        sender.sendMessage("§fhttps://ryouma.sytes.net/");
        sender.sendMessage("§aRSWiki (誰でも編集できる公式Wiki)");
        sender.sendMessage("§fhttps://wiki-ryouma.sytes.net/");

        return true;
    }
}
