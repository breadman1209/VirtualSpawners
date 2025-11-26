package com.spacaso.donutspawners.gui;

import com.spacaso.donutspawners.VirtualSpawner;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class DropAllGUI {

    private final VirtualSpawner spawner;

    public DropAllGUI(VirtualSpawner spawner) {
        this.spawner = spawner;
    }

    public void open(Player player) {
        Inventory inv = Bukkit.createInventory(null, 27, "Drop All Items");
        player.openInventory(inv);
    }
}
