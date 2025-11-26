package com.spacaso.donutspawners;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class SpawnerCommand implements CommandExecutor {

    private final DonutSpawners plugin;

    public SpawnerCommand(DonutSpawners plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) return true;
        Player p = (Player) sender;

        if (args.length == 0) return true;

        if (args[0].equalsIgnoreCase("give")) {
            p.getInventory().addItem(new ItemStack(Material.SPAWNER));
        }

        if (args[0].equalsIgnoreCase("reload")) {
            plugin.reloadConfig();
        }

        return true;
    }
}
