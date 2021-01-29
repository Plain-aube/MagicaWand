package com.plain;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class EventManager implements Listener {

    public EventManager(Main instance) {
    }

    @EventHandler
    public void onPlayerJoinEvent(PlayerInteractEvent e) {

        Player p = e.getPlayer();
        Action a = e.getAction();

        if (a.equals(Action.RIGHT_CLICK_AIR) | a.equals(Action.RIGHT_CLICK_BLOCK) && (p.getInventory().getItemInMainHand().getType() == Material.CARROT_ON_A_STICK)) {
            p.sendMessage(ChatColor.LIGHT_PURPLE+"폭발합니다!");
            World w = p.getWorld();
            Location loc = p.getTargetBlock(null, 0).getLocation();
            w.createExplosion(loc, 8F, true);
        }

        if (a.equals(Action.RIGHT_CLICK_AIR) | a.equals(Action.RIGHT_CLICK_BLOCK) && (p.getInventory().getItemInMainHand().getType() == Material.STICK)) {
            p.sendMessage(ChatColor.LIGHT_PURPLE+"번개가 내리칩니다!");
            World w = p.getWorld();
            Location loc = p.getTargetBlock(null, 0).getLocation();
            w.strikeLightning(loc);
        }

        }

}
