package com.spacaso.donutspawners.gui;

import com.spacaso.donutspawners.VirtualSpawner;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class SellGUI {

    private final VirtualSpawner spawner;

    public SellGUI(VirtualSpawner spawner) {
        this.spawner = spawner;
    }

    public void open(Player player) {
        Inventory inv = Bukkit.createInventory(null, 27, "Sell Items");
        player.openInventory(inv);
    }
}
