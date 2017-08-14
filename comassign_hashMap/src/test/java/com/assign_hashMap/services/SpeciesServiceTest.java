package com.assign_hashMap.services;

import com.assign_hashMap.domain.Mammal;
import com.assign_hashMap.domain.Species;
import com.assign_hashMap.factories.SpeciesFactory;
import com.assign_hashMap.services.implementation.SpeciesServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by Suzanne Effendi on 2017/08/14.
 */
public class SpeciesServiceTest {
    Species species;
    Map<String, String> speciesVal;
    SpeciesService speciesService;
    long speciesId;

    @Before
    public void setUp() throws Exception{
        speciesId = 10;
        speciesVal = new HashMap<String, String>();
        speciesVal.put("name","specimen name");
        speciesVal.put("movement","specimen movement");
        speciesVal.put("movementMechanism","movementMechanism");

        species = SpeciesFactory.getSpecies(speciesId, speciesVal);
        speciesService = new SpeciesServiceImpl();

    }

    @Test
    public void createTest() throws Exception{
        speciesService.read(10);
        assertEquals("Object:", species.getName());
    }

    @Test
    public void readTest() throws Exception{
        speciesService.read(10);
        assertEquals("Specimen: ", species.getName());
    }

    @Test
    public void updateTest() throws Exception{
        speciesService.read(10);
        Species updateMammal = new Species.Builder()
                .name("species name")
                .sciName("scientific species name")
                .gender("gender type")
                .habitat("species environment")
                .create();
        speciesService.update(updateMammal);
        species = speciesService.read(10);
        assertEquals("Genetic Family",species.getName());
    }

    @Test
    public void deleteTest() throws Exception{
        speciesService.delete(10);
        species = speciesService.read(10);
        assertNull(species);
    }



}
