package com.assign_hashMap.repositories;

import com.assign_hashMap.domain.Mammal;

/**
 * Created by Suzanne Effendi on 2017/08/13.
 */
public interface MammalRepo {
    Mammal create(Mammal mammal);
    Mammal read(long mammalId);
    Mammal update(Mammal mammal);
    void delete(long mammalId);
}
