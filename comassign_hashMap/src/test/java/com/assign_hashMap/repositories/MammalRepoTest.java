package com.assign_hashMap.repositories;

import com.assign_hashMap.domain.Mammal;
import com.assign_hashMap.factories.MammalFactory;
import com.assign_hashMap.repositories.implementation.MammalRepoImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by Suzanne Effendi on 2017/08/14.
 */
public class MammalRepoTest {

    Mammal mammal;
    MammalRepo mammalRepo;
    long mammalId;
    String name;

    @Before
    public void setUp() throws Exception {
        mammalId = 50;
        name = "elephant";
        mammal = MammalFactory.getMammal(mammalId, name);
        mammalRepo = MammalRepoImpl.getRepo();
    }

    @Test
    public void createTest() throws Exception {
        mammal = mammalRepo.create(mammal);
        assertEquals("elephant", mammal.getName());
    }

    @Test
    public void readTest() throws Exception {
        mammal = mammalRepo.read(50);
        assertEquals(50, mammal.getMammalId());
    }

    @Test
    public void updateTest() throws Exception {
        mammal = mammalRepo.read(50);
        Mammal updateMammal = new Mammal.Builder()
                .mammalId(mammalId)
                .name("Buffalo")
                .movement("stomps")
                .movementMechanism("legs")
                .create();
        mammalRepo.update(updateMammal);
        mammal = mammalRepo.read(50);
        assertEquals("Buffalo", mammal.getName());
    }

    @Test
    public void deleteTest() throws Exception {
        mammalRepo.delete(50);
        Mammal mammal = mammalRepo.read(50);
        assertNull(mammal);
    }
}
