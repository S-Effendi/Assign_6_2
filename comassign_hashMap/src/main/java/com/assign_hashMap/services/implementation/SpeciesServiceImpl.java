package com.assign_hashMap.services.implementation;

import com.assign_hashMap.domain.Species;
import com.assign_hashMap.repositories.SpeciesRepo;
import com.assign_hashMap.repositories.implementation.SpeciesRepoImpl;
import com.assign_hashMap.services.SpeciesService;

/**
 * Created by Suzanne Effendi on 2017/08/14.
 */
public class SpeciesServiceImpl implements SpeciesService{

    SpeciesRepo repo = SpeciesRepoImpl.getRepo();

    @Override
    public Species create(Species species){
        return repo.create(species);
    }

    @Override
    public Species read(long speciesId){
        return repo.read(speciesId);
    }

    @Override
    public Species update(Species species){
        return repo.update(species);
    }

    @Override
    public void delete(long speciesId){
        repo.delete(speciesId);
    }
}