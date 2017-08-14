package com.assign_hashMap.services;

import com.assign_hashMap.domain.Species;

/**
 * Created by Suzanne Effendi on 2017/08/14.
 */
public interface SpeciesService {
    Species create(Species species);
    Species read(long speciesId);
    Species update(Species species);
    void delete(long speciesId);
}
