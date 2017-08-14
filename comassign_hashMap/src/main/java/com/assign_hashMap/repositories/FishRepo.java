package com.assign_hashMap.repositories;

import com.assign_hashMap.domain.Fish;

/**
 * Created by Suzanne Effendi on 2017/08/13.
 */
public interface FishRepo {
    Fish create(Fish fish);
    Fish read(long fishId);
    Fish update(Fish fish);
    void delete(long fishId);
}
