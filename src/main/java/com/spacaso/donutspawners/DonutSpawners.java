package com.spacaso.donutspawners;

import org.bukkit.plugin.java.JavaPlugin;

public class DonutSpawners extends JavaPlugin {

    private static DonutSpawners instance;
    private SpawnerManager spawnerManager;

    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        spawnerManager = new SpawnerManager(this);
        getServer().getPluginManager().registerEvents(new SpawnerListener(this), this);
        getCommand("donutspawners").setExecutor(new SpawnerCommand(this));
    }

    public static DonutSpawners getInstance() {
        return instance;
    }

    public SpawnerManager getSpawnerManager() {
        return spawnerManager;
    }
}
