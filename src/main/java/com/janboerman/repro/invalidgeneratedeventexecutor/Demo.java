package com.janboerman.repro.invalidgeneratedeventexecutor;

import org.bukkit.plugin.java.JavaPlugin;

public final class Demo extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new MyEventListener(getLogger()), this);
    }

}
