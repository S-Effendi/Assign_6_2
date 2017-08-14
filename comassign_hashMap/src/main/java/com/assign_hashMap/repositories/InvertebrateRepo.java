package com.assign_hashMap.repositories;

import com.assign_hashMap.domain.Invertebrate;

/**
 * Created by Suzanne Effendi on 2017/08/13.
 */
public interface InvertebrateRepo{
    Invertebrate create(Invertebrate invertebrate);
    Invertebrate read(long invertebrateId);
    Invertebrate update(Invertebrate invertebrate);
    void delete(long invertebrateId);
}
