package com.assign_hashMap.repositories;

import com.assign_hashMap.domain.Fish;
import com.assign_hashMap.factories.FishFactory;
import com.assign_hashMap.repositories.implementation.FishRepoImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by Suzanne Effendi on 2017/08/14.
 */
public class FishRepoTest {
    Fish fish;
    FishRepo fishRepo;
    long fishId;
    String name;

    @Before
    public void setUp() throws Exception {
        fishId = 30;
        name = "pirahna";
        fish = FishFactory.getFish(fishId, name);
        fishRepo = FishRepoImpl.getRepo();
    }

    @Test
    public void createTest() throws Exception {
        fish = fishRepo.create(fish);
        assertEquals("pirahna", fish.getName());
    }

    @Test
    public void readTest() throws Exception {
        fish = fishRepo.read(30);
        assertEquals(30, fish.getFishId());
    }

    @Test
    public void updateTest() throws Exception {
        fish = fishRepo.read(30);
        Fish updateFish = new Fish.Builder()
                .fishId(fishId)
                .name("Piranha")
                .movement("swim")
                .movementMechanism("fins")
                .create();
        fishRepo.update(updateFish);
        fish = fishRepo.read(30);
        assertEquals("Piranha", fish.getName());
    }

    @Test
    public void deleteTest() throws Exception {
        fishRepo.delete(30);
        Fish fish = fishRepo.read(30);
        assertNull(fish);
    }
}
