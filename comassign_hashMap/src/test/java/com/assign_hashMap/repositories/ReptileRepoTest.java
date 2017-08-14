package com.assign_hashMap.repositories;

import com.assign_hashMap.domain.Reptile;
import com.assign_hashMap.factories.ReptileFactory;
import com.assign_hashMap.repositories.implementation.ReptileRepoImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by Suzanne Effendi on 2017/08/14.
 */
public class ReptileRepoTest {
    Reptile reptile;
    ReptileRepo reptileRepo;
    long reptileId;
    String name;

    @Before
    public void setUp() throws Exception {
        reptileId = 60;
        name = "anaconda";
        reptile = ReptileFactory.getReptile(reptileId, name);
        reptileRepo = ReptileRepoImpl.getRepo();
    }

    @Test
    public void createTest() throws Exception {
        reptile = reptileRepo.create(reptile);
        assertEquals("anaconda", reptile.getName());
    }

    @Test
    public void readTest() throws Exception {
        reptile = reptileRepo.read(60);
        assertEquals(60,reptile.getReptileId());
    }

    @Test
    public void updateTest() throws Exception {
        reptile = reptileRepo.read(60);
        Reptile updateReptile = new Reptile.Builder()
                .reptileId(reptileId)
                .name("Python")
                .movement("slithers")
                .movementMechanism("backbone")
                .create();
        reptileRepo.update(updateReptile);
        reptile = reptileRepo.read(60);
        assertEquals("Python", reptile.getName());
    }

    @Test
    public void deleteTest() throws Exception {
        reptileRepo.delete(60);
        Reptile reptile = reptileRepo.read(60);
        assertNull(reptile);
    }
}
