package com.assign_hashMap.repositories;

import com.assign_hashMap.domain.Reptile;

/**
 * Created by Suzanne Effendi on 2017/08/13.
 */
public interface ReptileRepo {
    Reptile create(Reptile reptile);
    Reptile read(long reptileId);
    Reptile update(Reptile reptile);
    void delete(long reptileId);
}
