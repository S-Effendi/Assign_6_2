package com.assign_hashMap.repositories;

import com.assign_hashMap.domain.Bird;
import com.assign_hashMap.factories.BirdFactory;
import com.assign_hashMap.repositories.implementation.BirdRepoImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by Suzanne Effendi on 2017/08/14.
 */
public class BirdRepoTest {

    Bird bird;
    BirdRepo birdRepo;
    long birdId;
    String name;

    @Before
    public void setUp() throws Exception{
        birdId = 20;
        name = "mocking_jay";
        bird = BirdFactory.getBird(birdId ,name);
        birdRepo = BirdRepoImpl.getRepo();
    }

    @Test
    public void createTest() throws Exception {
        bird = birdRepo.create(bird);
        assertEquals("mocking_jay", bird.getName());
    }

    @Test
    public void readTest() throws Exception {
        bird = birdRepo.read(20);
        assertEquals(20, bird.getBirdId());
    }

    @Test
    public void updateTest() throws Exception {
        bird = birdRepo.read(20);
        Bird updateBird = new Bird.Builder()
                .birdId(birdId)
                .name("MockingJay")
                .movement("fly")
                .movementMechanism("wings")
                .create();
        birdRepo.update(updateBird);
        bird = birdRepo.read(20);
        assertEquals("MockingJay",bird.getName());
    }

    @Test
    public void deleteTest() throws Exception{
        birdRepo.delete(20);
        Bird bird = birdRepo.read(20);
        assertNull(bird);
    }
}
