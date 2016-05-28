package org.spongepowered.test;

import com.flowpowered.math.vector.Vector3i;
import org.spongepowered.api.event.SpongeEventFactoryUtils;
import org.spongepowered.test.event.TestEvent;

import java.util.HashMap;

public class TestEventFactory {
    private TestEventFactory() {
    }

    /**
     * AUTOMATICALLY GENERATED, DO NOT EDIT.
     * Creates a new instance of
     * {@link org.spongepowered.test.event.TestEvent}.
     * 
     * @param blockPosition The block position
     * @param someValue The some value
     * @return A new test event
     */
    public static TestEvent createTestEvent(Vector3i blockPosition, float someValue) {
        HashMap<String, Object> values = new HashMap<>();
        values.put("blockPosition", blockPosition);
        values.put("someValue", someValue);
        return SpongeEventFactoryUtils.createEventImpl(TestEvent.class, values);
    }
}

