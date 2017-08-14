package com.assign_hashMap.factories;

import com.assign_hashMap.domain.Mammal;

/**
 * Created by Suzanne Effendi on 2017/08/13.
 */
public class MammalFactory {
    public static Mammal getMammal (long mammalId, String name){
        Mammal mammal = new Mammal.Builder()
            .mammalId(mammalId)
            .name(name)
            .movement("movement")
            .movementMechanism("movementMechanism")
            .create();
    return mammal;
}
}
