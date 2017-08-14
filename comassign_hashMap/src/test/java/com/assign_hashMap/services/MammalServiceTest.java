package com.assign_hashMap.services;

import com.assign_hashMap.domain.Mammal;
import com.assign_hashMap.factories.MammalFactory;
import com.assign_hashMap.services.implementation.MammalServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by Suzanne Effendi on 2017/08/14.
 */
public class MammalServiceTest {
    Mammal mammal;
    MammalService mammalService;
    long mammalId;
    String name;

    @Before
    public void setUp() throws Exception {
        mammalId = 50;
        name = "elephant";
        mammal = MammalFactory.getMammal(mammalId, name);
        mammalService = new MammalServiceImpl();
    }

    @Test
    public void createTest() throws Exception {
        mammal = MammalFactory.getMammal(mammalId, name);
        mammalService.create(mammal);
        assertEquals("elephant", mammal.getName());
    }

    @Test
    public void readTest() throws Exception {
        mammalService.read(50);
        assertEquals("elephant", mammal.getName());
    }

    @Test
    public void updateTest() throws Exception {
        mammalService.read(50);
        Mammal updateMammal = new Mammal.Builder()
                .mammalId(mammalId)
                .name("Buffalo")
                .movement("stomps")
                .movementMechanism("legs")
                .create();
        mammalService.update(updateMammal);
        mammal = mammalService.read(50);
        assertEquals("Buffalo", mammal.getName());
    }

    @Test
    public void deleteTest() throws Exception {
        mammalService.delete(50);
        mammal = mammalService.read(50);
        assertNull(mammal);
    }
}