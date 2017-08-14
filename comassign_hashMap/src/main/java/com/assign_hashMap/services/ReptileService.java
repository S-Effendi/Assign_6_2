package com.assign_hashMap.services;

import com.assign_hashMap.domain.Reptile;

/**
 * Created by Suzanne Effendi on 2017/08/14.
 */
public interface ReptileService {
    Reptile create(Reptile reptile);
    Reptile read(long reptileId);
    Reptile update(Reptile reptile);
    void delete(long reptileId);
}
