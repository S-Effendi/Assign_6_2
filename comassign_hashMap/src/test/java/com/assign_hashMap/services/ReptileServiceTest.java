package com.assign_hashMap.services;

import com.assign_hashMap.domain.Reptile;
import com.assign_hashMap.factories.ReptileFactory;
import com.assign_hashMap.services.implementation.ReptileServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by Suzanne Effendi on 2017/08/14.
 */
public class ReptileServiceTest {
    Reptile reptile;
    ReptileService reptileService;
    long reptileId;
    String name;

    @Before
    public void setUp() throws Exception {
        reptileId = 60;
        name = "anaconda";
        reptile = ReptileFactory.getReptile(reptileId, name);
        reptileService = new ReptileServiceImpl();
    }

    @Test
    public void createTest() throws Exception {
        reptile = ReptileFactory.getReptile(reptileId, name);
        reptileService.create(reptile);
        assertEquals("anaconda", reptile.getName());
    }

    @Test
    public void readTest() throws Exception {
        reptileService.read(60);
        assertEquals("anaconda", reptile.getName());
    }

    @Test
    public void updateTest() throws Exception {
        reptileService.read(60);
        Reptile updateReptile = new Reptile.Builder()
                .reptileId(reptileId)
                .name("Python")
                .movement("slithers")
                .movementMechanism("backbone")
                .create();
        reptileService.update(updateReptile);
        reptile = reptileService.read(60);
        assertEquals("Python", reptile.getName());
    }

    @Test
    public void deleteTest() throws Exception {
        reptileService.delete(60);
        reptile = reptileService.read(60);
        assertNull(reptile);
    }
}
