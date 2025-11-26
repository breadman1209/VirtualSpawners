package com.spacaso.donutspawners.gui;

import com.spacaso.donutspawners.VirtualSpawner;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class StorageGUI {

    private final VirtualSpawner spawner;
    private final int page;

    public StorageGUI(VirtualSpawner spawner, int page) {
        this.spawner = spawner;
        this.page = page;
    }

    public void open(Player player) {
        Inventory inv = Bukkit.createInventory(null, 54, "Spawner Storage - Page " + page);

        int start = page * 45;
        int end = start + 45;

        for (int i = start; i < end && i < spawner.getStorage().size(); i++) {
            inv.setItem(i - start, spawner.getStorage().get(i));
        }

        player.openInventory(inv);
    }
}
