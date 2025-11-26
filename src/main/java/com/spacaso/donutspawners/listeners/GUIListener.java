package com.spacaso.donutspawners.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class GUIListener implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (e.getView().getTitle().contains("Spawner Storage")) e.setCancelled(true);
        if (e.getView().getTitle().contains("Sell Items")) e.setCancelled(true);
        if (e.getView().getTitle().contains("Drop All Items")) e.setCancelled(true);
        if (e.getView().getTitle().contains("Spawner XP")) e.setCancelled(true);
    }
}
