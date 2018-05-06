package com.songoda.epicfarming.api;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.InventoryHolder;

public interface IFarm extends InventoryHolder {

    public void view(Player player);

    public void upgrade(UpgradeType type, Player player);

    public Location getLocation();

    public ILevel getLevel();
}
