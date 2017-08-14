package com.assign_hashMap.services;

import com.assign_hashMap.domain.Mammal;

/**
 * Created by Suzanne Effendi on 2017/08/14.
 */
public interface MammalService {
    Mammal create(Mammal mammal);
    Mammal read(long mammalId);
    Mammal update(Mammal mammal);
    void delete(long mammalId);
}
