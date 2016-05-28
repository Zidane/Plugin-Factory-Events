package org.spongepowered.test.event;

import com.flowpowered.math.vector.Vector3i;
import org.spongepowered.api.event.Event;

public interface TestEvent extends Event {

    Vector3i getBlockPosition();

    float getSomeValue();

    void setSomeValue(float value);
}
