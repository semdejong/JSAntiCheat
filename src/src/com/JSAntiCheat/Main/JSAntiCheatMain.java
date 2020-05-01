package com.JSAntiCheat.Main;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public class JSAntiCheatMain extends JavaPlugin  implements Listener {

    public HashMap<String, String> test;

    @Override
    public void onEnable() {
        test = new HashMap<>();
    }

    public void onDisable() {

    }


}
