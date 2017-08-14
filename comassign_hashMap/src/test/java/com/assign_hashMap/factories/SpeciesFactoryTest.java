package com.assign_hashMap.factories;

import com.assign_hashMap.domain.Species;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Suzanne Effendi on 2017/08/14.
 */
public class SpeciesFactoryTest {
    Species species;

    Map<String, String> speciesVal;

    @org.junit.Before
    public void setUp() throws Exception {
        long speciesId = 10;
        speciesVal = new HashMap<String, String>();
        speciesVal.put("name", "speciesName");
        speciesVal.put("movement", "all movemnts");
        speciesVal.put("movementMechanism", "All Movement mechanisms");
        speciesVal.put("habitat", "All habitats");
        species = SpeciesFactory.getSpecies(speciesId, speciesVal);
    }

    @Test
    public void testGetSpecies() throws Exception{
        assertEquals(true, species.equals(species));
    }
}
