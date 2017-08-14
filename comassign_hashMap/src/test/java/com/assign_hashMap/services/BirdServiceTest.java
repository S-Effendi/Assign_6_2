package com.assign_hashMap.services;

import com.assign_hashMap.domain.Bird;
import com.assign_hashMap.factories.BirdFactory;
import com.assign_hashMap.services.implementation.BirdServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by Suzanne Effendi on 2017/08/14.
 */
public class BirdServiceTest {
    
    Bird bird;
    BirdService birdService;
    long birdId;
    String name;
    
    @Before
    public void setUp() throws Exception{
        birdId = 20;
        name = "mocking_jay";
        bird = BirdFactory.getBird(birdId ,name);
        birdService = new BirdServiceImpl();
    }

    @Test
    public void createTest() throws Exception {
        bird = BirdFactory.getBird(birdId, name);
        birdService.create(bird);
        assertEquals("mocking_jay", bird.getName());
    }

    @Test
    public void readTest() throws Exception {
        birdService.read(20);
        assertEquals("mocking_jay", bird.getName());
    }

    @Test
    public void updateTest() throws Exception {
        birdService.read(20);
        Bird updateBird = new Bird.Builder()
                .birdId(birdId)
                .name("MockingJay")
                .movement("fly")
                .movementMechanism("wings")
                .create();
        birdService.update(updateBird);
        bird = birdService.read(20);
        assertEquals("MockingJay",bird.getName());
    }

    @Test
    public void deleteTest() throws Exception{
        birdService.delete(20);
        bird = birdService.read(20);
        assertNull(bird);
    }
}
