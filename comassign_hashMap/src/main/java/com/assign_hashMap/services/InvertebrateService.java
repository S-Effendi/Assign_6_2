package com.assign_hashMap.services;

import com.assign_hashMap.domain.Invertebrate;

/**
 * Created by Suzanne Effendi on 2017/08/14.
 */
public interface InvertebrateService {
    Invertebrate create(Invertebrate invertebrate);
    Invertebrate read(long invertebrate);
    Invertebrate update(Invertebrate invertebrate);
    void delete(long invertebrateId);
}
