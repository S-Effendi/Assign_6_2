package com.assign_hashMap.services;

import com.assign_hashMap.domain.Fish;

/**
 * Created by Suzanne Effendi on 2017/08/14.
 */
public interface FishService {
    Fish create(Fish fish);
    Fish read(long fish);
    Fish update(Fish fish);
    void delete(long fishId);
}
