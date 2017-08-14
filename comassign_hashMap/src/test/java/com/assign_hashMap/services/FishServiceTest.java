package com.assign_hashMap.services;

import com.assign_hashMap.domain.Fish;
import com.assign_hashMap.factories.FishFactory;
import com.assign_hashMap.services.implementation.FishServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by Suzanne Effendi on 2017/08/14.
 */
public class FishServiceTest {
    Fish fish;
    FishService fishService;
    long fishId;
    String name;

    @Before
    public void setUp() throws Exception {
        fishId = 30;
        name = "pirahna";
        fish = FishFactory.getFish(fishId, name);
        fishService = new FishServiceImpl();
    }

    @Test
    public void createTest() throws Exception {
        fish = FishFactory.getFish(fishId, name);
        fishService.create(fish);
        assertEquals("pirahna", fish.getName());
    }

    @Test
    public void readTest() throws Exception {
        fishService.read(30);
        assertEquals("pirahna", fish.getName());
    }

    @Test
    public void updateTest() throws Exception {
        fishService.read(30);
        Fish updateFish = new Fish.Builder()
                .fishId(fishId)
                .name("Piranha")
                .movement("swim")
                .movementMechanism("fins")
                .create();
        fishService.update(updateFish);
        fish = fishService.read(30);
        assertEquals("Piranha", fish.getName());
    }

    @Test
    public void deleteTest() throws Exception {
        fishService.delete(30);
        fish = fishService.read(30);
        assertNull(fish);
    }
}
