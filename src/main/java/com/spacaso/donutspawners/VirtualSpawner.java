package com.spacaso.donutspawners;

import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class VirtualSpawner {

    private final EntityType type;
    private int count = 1;
    private final List<ItemStack> storage = new ArrayList<>();

    public VirtualSpawner(EntityType type) {
        this.type = type;
    }

    public EntityType getType() {
        return type;
    }

    public int getCount() {
        return count;
    }

    public void addCount(int amount) {
        count += amount;
    }

    public void addItem(ItemStack item) {
        storage.add(item);
    }

    public List<ItemStack> getStorage() {
        return storage;
    }
}
