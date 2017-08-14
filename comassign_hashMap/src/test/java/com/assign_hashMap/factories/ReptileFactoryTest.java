package com.assign_hashMap.factories;

import com.assign_hashMap.domain.Reptile;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Suzanne Effendi on 2017/08/14.
 */
public class ReptileFactoryTest {
    Reptile reptile;
    long reptileId;
    String name;
    String movement;
    String movementMechanism;

    @Before
    public void setUp(){
        reptileId = 60;
        name = "anaconda";
        movement = "slithers";
        movementMechanism = "backbone";
        reptile = ReptileFactory.getReptile(reptileId, name);
    }

    @Test
    public void testGetReptile() throws Exception {
        assertEquals(true, reptile.equals(reptile));

    }
}
