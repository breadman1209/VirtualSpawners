package com.spacaso.donutspawners;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class SpawnerListener implements Listener {

    private final DonutSpawners plugin;

    public SpawnerListener(DonutSpawners plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlace(BlockPlaceEvent e) {
        ItemStack item = e.getItemInHand();
        if (item.getType() == Material.SPAWNER) {
            plugin.getSpawnerManager().createSpawner(e.getBlock(), EntityType.ZOMBIE);
        }
    }

    @EventHandler
    public void onBreak(BlockBreakEvent e) {
        Block b = e.getBlock();
        if (plugin.getSpawnerManager().isSpawner(b)) {
            e.setDropItems(false);
            e.getPlayer().getInventory().addItem(new ItemStack(Material.SPAWNER, 1));
            plugin.getSpawnerManager().removeSpawner(b);
        }
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
        if (e.getClickedBlock() == null) return;
        if (plugin.getSpawnerManager().isSpawner(e.getClickedBlock())) {
            e.setCancelled(true);
            new SpawnerGUI(plugin, plugin.getSpawnerManager().get(e.getClickedBlock()))
                    .open(e.getPlayer());
        }
    }
}
