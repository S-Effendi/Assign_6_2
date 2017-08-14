package com.assign_hashMap.factories;

import com.assign_hashMap.domain.Invertebrate;

/**
 * Created by S.Effendi on 2017/08/13.
 */
public class InvertebrateFactory {
    public static Invertebrate getInvertebrate (long invertebrateId, String name){
        Invertebrate invertebrate = new Invertebrate.Builder()
                .invertebrateId(invertebrateId)
                .name(name)
                .movement("movement")
                .movementMechanism("movementMechanism")
                .create();
        return invertebrate;
    }
}
