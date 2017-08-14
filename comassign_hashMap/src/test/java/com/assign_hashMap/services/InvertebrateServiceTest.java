package com.assign_hashMap.services;

import com.assign_hashMap.domain.Invertebrate;
import com.assign_hashMap.factories.InvertebrateFactory;
import com.assign_hashMap.services.implementation.InvertebrateServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by Suzanne Effendi on 2017/08/14.
 */
public class InvertebrateServiceTest {
    Invertebrate invertebrate;
    InvertebrateService invertebrateService;
    long invertebrateId;
    String name;

    @Before
    public void setUp() throws Exception {
        invertebrateId = 40;
        name = "spider";
        invertebrate = InvertebrateFactory.getInvertebrate(invertebrateId, name);
        invertebrateService = new InvertebrateServiceImpl();
    }

    @Test
    public void createTest() throws Exception {
        invertebrate = InvertebrateFactory.getInvertebrate(invertebrateId, name);
        invertebrateService.create(invertebrate);
        assertEquals("spider", invertebrate.getName());
    }

    @Test
    public void readTest() throws Exception {
        invertebrateService.read(40);
        assertEquals("spider", invertebrate.getName());
    }

    @Test
    public void updateTest() throws Exception {
        invertebrateService.read(40);
        Invertebrate updateInvertebrate = new Invertebrate.Builder()
                .invertebrateId(invertebrateId)
                .name("Black Widow")
                .movement("crawls")
                .movementMechanism("legs")
                .create();
        invertebrateService.update(updateInvertebrate);
        invertebrate = invertebrateService.read(40);
        assertEquals("Black Widow", invertebrate.getName());
    }

    @Test
    public void deleteTest() throws Exception {
        invertebrateService.delete(40);
        invertebrate = invertebrateService.read(40);
        assertNull(invertebrate);
    }
}
