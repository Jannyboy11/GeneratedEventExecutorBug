package com.janboerman.repro.invalidgeneratedeventexecutor;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.logging.Logger;

public class MyEventListener implements Listener {

    private final Logger logger;

    public MyEventListener(Logger logger) {
        this.logger = logger;
    }

    @EventHandler
    public long onJoin(PlayerJoinEvent event) {
        logger.severe("This line is unreachable when running on Paper because the bytecode of the generated EventExecutor is invalid!");
        return 0L;
    }

}
