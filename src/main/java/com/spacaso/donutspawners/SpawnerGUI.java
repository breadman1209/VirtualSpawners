package com.spacaso.donutspawners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class SpawnerGUI {

    private final DonutSpawners plugin;
    private final VirtualSpawner spawner;

    public SpawnerGUI(DonutSpawners plugin, VirtualSpawner spawner) {
        this.plugin = plugin;
        this.spawner = spawner;
    }

    public void open(Player p) {
        Inventory inv = Bukkit.createInventory(null, 27, "Virtual Spawner");
        p.openInventory(inv);
    }
}
