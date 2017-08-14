package com.assign_hashMap.repositories;

import com.assign_hashMap.domain.Species;
/**
 * Created by Suzanne Effendi on 2017/08/13.
 */
public interface SpeciesRepo {
    Species create(Species species);
    Species read(long speciesId);
    Species update(Species species);
    void delete(long speciesId);
}
