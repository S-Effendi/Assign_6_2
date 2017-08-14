package com.assign_hashMap.factories;

import com.assign_hashMap.domain.Bird;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Suzanne Effendi on 2017/08/14.
 */
public class BirdFactoryTest {

    Bird bird;
    long birdId;
    String name;
    String movement;
    String movementMechanism;

    @Before
    public void setUp(){
    birdId = 20;
    name = "mocking_jay";
    movement = "fly";
    movementMechanism = "wings";
    bird = BirdFactory.getBird(birdId, name);
    }

    @Test
    public void testGetBird() throws Exception {
        assertEquals(true, bird.equals(bird));

    }
}
