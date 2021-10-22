package com.ryouma.messeage.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class backupdata implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        sender.sendMessage("§b==== バックアップデータのダウンロード ====");
        sender.sendMessage("§aこちらからダウンロードができます。（ZIP）");
        sender.sendMessage("§fhttps://media-ryouma.sytes.net/rs/backups/worlds/");
        sender.sendMessage("§cこれを使用して問題が発生してもRSは責任を負いません。");
        sender.sendMessage("§aこのコンテンツはCC BY-SAで提供されます。");
        sender.sendMessage("§fCC BY-SA:https://creativecommons.org/licenses/by-sa/4.0/deed.ja");

        return true;
    }
    }