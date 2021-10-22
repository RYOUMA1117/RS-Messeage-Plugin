package com.ryouma.messeage;

import com.ryouma.messeage.commands.backupdata;
import com.ryouma.messeage.commands.rslink;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {
    private static JavaPlugin plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("プラグインを有効にしました。");
        getCommand("rslink").setExecutor(new rslink());
        getCommand("backupdata").setExecutor(new backupdata());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        super .onDisable();
        getLogger().info("プラグインを無効にしました。");
    }
    public static JavaPlugin getPlugin(){
        return plugin;
    }

}
