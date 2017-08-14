package com.assign_hashMap.factories;

import com.assign_hashMap.domain.Mammal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Suzanne Effendi on 2017/08/14.
 */
public class MammalFactoryTest {
    Mammal mammal;
    long mammalId;
    String name;
    String movement;
    String movementMechanism;

    @Before
    public void setUp(){
        mammalId = 50;
        name = "elephant";
        movement = "stomps";
        movementMechanism = "legs";
        mammal = MammalFactory.getMammal(mammalId, name);
    }

    @Test
    public void testGetMammal() throws Exception {
        assertEquals(true, mammal.equals(mammal));

    }
}
