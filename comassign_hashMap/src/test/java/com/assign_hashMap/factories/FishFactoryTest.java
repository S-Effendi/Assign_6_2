package com.assign_hashMap.factories;

import com.assign_hashMap.domain.Fish;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Suzanne Effendi on 2017/08/14.
 */
public class FishFactoryTest {
    Fish fish;
    long fishId;
    String name;
    String movement;
    String movementMechanism;

    @Before
    public void setUp(){
        fishId = 30;
        name = "pirahna";
        movement = "swim";
        movementMechanism = "fins";
        fish = FishFactory.getFish(fishId, name);
    }

    @Test
    public void testGetFish() throws Exception {
        assertEquals(true, fish.equals(fish));
    }
}
