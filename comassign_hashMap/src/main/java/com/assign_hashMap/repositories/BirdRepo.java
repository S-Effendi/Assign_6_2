package com.assign_hashMap.repositories;

import com.assign_hashMap.domain.Bird;

/**
 * Created by Suzanne Effendi on 2017/08/13.
 */
public interface BirdRepo {
    Bird create(Bird bird);
    Bird read(long birdId);
    Bird update(Bird bird);
    void delete(long birdId);
}
