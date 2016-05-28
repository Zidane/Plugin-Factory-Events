package org.spongepowered.test;

import com.flowpowered.math.vector.Vector3i;
import org.slf4j.Logger;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GamePreInitializationEvent;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.test.event.TestEvent;

import javax.inject.Inject;

@Plugin(id = "test")
public class Test {

    @Inject Logger logger;

    @Listener
    public void onGamePreInit(GamePreInitializationEvent event) {
        this.logger.info("About to call test event!");
        TestEventFactory.createTestEvent(new Vector3i(0, 0, 0), 1);
    }

    @Listener
    public void onTest(TestEvent event) {
        this.logger.info("TEST EVENT FIRED: " + event);
    }
}
