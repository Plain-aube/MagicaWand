package com.plain;

import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class Main extends JavaPlugin {


    Logger logger = getServer().getLogger();

    @Override
    public void onEnable() {
        logger.info(ChatColor.LIGHT_PURPLE+"MagicaWand 플러그인 활성화");
        initEvents();
    }

    @Override
    public void onDisable() {
        logger.info(ChatColor.LIGHT_PURPLE+"MagicaWand 플러그인 비활성화");
    }

    public void initEvents() {
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new EventManager(this), this);
    }


}
