package com.assign_hashMap.repositories.implementation;

import com.assign_hashMap.domain.Species;
import com.assign_hashMap.repositories.SpeciesRepo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Suzanne Effendi on 2017/08/14.
 */
public class SpeciesRepoImpl implements SpeciesRepo {
    private static SpeciesRepoImpl repo = null;

    private Map<Long, Species> speciesTable;

    private SpeciesRepoImpl() {
        speciesTable = new HashMap<Long, Species>();
    }

    public static SpeciesRepoImpl getRepo(){
        if(repo == null){
            repo = new SpeciesRepoImpl();
        }
        return repo;
    }

    @Override
    public Species create(Species species){
        speciesTable.put(species.getSpeciesId(),species);
        Species saveSpecimen = speciesTable.get(species.getSpeciesId());
        return saveSpecimen;
    }

    @Override
    public Species read(long speciesId){
        Species species = speciesTable.get(speciesId);
        return species;
    }

    @Override
    public Species update(Species species){
        speciesTable.put(species.getSpeciesId(),species);
        Species updateSpecimen = speciesTable.get(species.getSpeciesId());
        return updateSpecimen;
    }

    @Override
    public void delete(long speciesId){
        speciesTable.remove(speciesId);
    }
}
