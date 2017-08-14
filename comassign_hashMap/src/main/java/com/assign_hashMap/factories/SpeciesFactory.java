package com.assign_hashMap.factories;

import com.assign_hashMap.domain.Species;

import java.util.Map;

/**
 * Created by Suzanne Effendi on 2017/08/13.
 */
public class SpeciesFactory {
    public static Species getSpecies(long speciesId, Map<String, String> speciesVal){
        Species species = new Species.Builder()
                .speciesId(speciesId)
                .name(speciesVal.get("species"))
                .sciName(speciesVal.get("scientificName"))
                .gender(speciesVal.get("gender"))
                .habitat(speciesVal.get("habitat"))
                .create();
        return species;
    }
}
