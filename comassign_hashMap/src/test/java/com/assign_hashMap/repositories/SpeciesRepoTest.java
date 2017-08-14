package com.assign_hashMap.repositories;

import com.assign_hashMap.domain.Species;
import com.assign_hashMap.factories.SpeciesFactory;
import com.assign_hashMap.repositories.implementation.SpeciesRepoImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by Suzanne Effendi on 2017/08/14.
 */
public class SpeciesRepoTest {

    Species species;
    Map<String, String> speciesVal;
    SpeciesRepo speciesRepo;
    long speciesId;

    @Before
    public void setUp() throws Exception{
        speciesId = 11;
        speciesVal = new HashMap<String, String>();
        speciesVal.put("name","specimen name");
        speciesVal.put("movement","specimen movement");
        speciesVal.put("movementMechanism","movementMechanism");

        species = SpeciesFactory.getSpecies(speciesId, speciesVal);
        speciesRepo = SpeciesRepoImpl.getRepo();
    }

    @Test
    public void createTest() throws Exception{
        species = speciesRepo.create(species);
        assertEquals("Object:", species.getName());
    }

    @Test
    public void readTest() throws Exception{
        speciesRepo.read(11);
        assertEquals(11, species.getSpeciesId());
    }

    @Test
    public void updateTest() throws Exception{
        species = speciesRepo.read(11);
        Species updateMammal = new Species.Builder()
                .name("species name")
                .sciName("scientific species name")
                .gender("gender type")
                .habitat("species environment")
                .create();
        speciesRepo.update(updateMammal);
        species = speciesRepo.read(11);
        assertEquals("Genetic Family",species.getName());
    }

    @Test
    public void deleteTest() throws Exception{
        speciesRepo.delete(11);
        species = speciesRepo.read(11);
        assertNull(species);
    }

}
