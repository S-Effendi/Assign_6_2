package com.assign_hashMap.services;

import com.assign_hashMap.domain.Bird;

/**
 * Created by Suzanne Effendi on 2017/08/14.
 */
public interface BirdService {
    Bird create(Bird bird);
    Bird read(long birdId);
    Bird update(Bird bird);
    void delete(long birdId);
}
