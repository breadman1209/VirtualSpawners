package com.spacaso.donutspawners;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;

import java.util.HashMap;
import java.util.Map;

public class SpawnerManager {

    private final DonutSpawners plugin;
    private final Map<Location, VirtualSpawner> spawners = new HashMap<>();

    public SpawnerManager(DonutSpawners plugin) {
        this.plugin = plugin;
    }

    public boolean isSpawner(Block block) {
        return spawners.containsKey(block.getLocation());
    }

    public VirtualSpawner get(Block block) {
        return spawners.get(block.getLocation());
    }

    public void createSpawner(Block block, EntityType type) {
        spawners.put(block.getLocation(), new VirtualSpawner(type));
    }

    public void removeSpawner(Block block) {
        spawners.remove(block.getLocation());
    }
}
