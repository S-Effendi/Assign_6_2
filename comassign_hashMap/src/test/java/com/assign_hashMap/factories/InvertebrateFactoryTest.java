package com.assign_hashMap.factories;

import com.assign_hashMap.domain.Invertebrate;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Suzanne Effendi on 2017/08/14.
 */
public class InvertebrateFactoryTest {
    Invertebrate invertebrate;
    long invertebrateId;
    String name;
    String movement;
    String movementMechanism;

    @Before
    public void setUp(){
        invertebrateId = 40;
        name = "spider";
        movement = "crawls";
        movementMechanism = "legs";
        invertebrate = InvertebrateFactory.getInvertebrate(invertebrateId, name);
    }

    @Test
    public void testGetIvertebrate() throws Exception {
        assertEquals(true, invertebrate.equals(invertebrate));
    }
}
