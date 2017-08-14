package com.assign_hashMap.repositories;

import com.assign_hashMap.domain.Invertebrate;
import com.assign_hashMap.factories.InvertebrateFactory;
import com.assign_hashMap.repositories.implementation.InvertebrateRepoImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by Suzanne Effendi on 2017/08/14.
 */
public class InvertebrateRepoTest {
    Invertebrate invertebrate;
    InvertebrateRepo invertebrateRepo;
    long invertebrateId;
    String name;

    @Before
    public void setUp() throws Exception {
        invertebrateId = 40;
        name = "spider";
        invertebrate = InvertebrateFactory.getInvertebrate(invertebrateId, name);
        invertebrateRepo = InvertebrateRepoImpl.getRepo();
    }

    @Test
    public void createTest() throws Exception {
        invertebrate = invertebrateRepo.create(invertebrate);
        assertEquals("spider", invertebrate.getName());
    }

    @Test
    public void readTest() throws Exception {
        invertebrate = invertebrateRepo.read(40);
        assertEquals(40,invertebrate.getInvertebrateId());
    }

    @Test
    public void updateTest() throws Exception {
        invertebrate = invertebrateRepo.read(40);
        Invertebrate updateInvertebrate = new Invertebrate.Builder()
                .invertebrateId(invertebrateId)
                .name("Black Widow")
                .movement("crawls")
                .movementMechanism("legs")
                .create();
        invertebrateRepo.update(updateInvertebrate);
        invertebrate = invertebrateRepo.read(40);
        assertEquals("Black Widow", invertebrate.getName());
    }

    @Test
    public void deleteTest() throws Exception {
        invertebrateRepo.delete(40);
        Invertebrate invertebrate = invertebrateRepo.read(40);
        assertNull(invertebrate);
    }
}
