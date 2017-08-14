package com.assign_hashMap.factories;

import com.assign_hashMap.domain.Reptile;

/**
 * Created by Suzanne Effendi on 2017/08/13.
 */
public class ReptileFactory {
    public static Reptile getReptile(long reptileId, String name){
        Reptile reptile = new Reptile.Builder()
                .reptileId(reptileId)
                .name(name)
                .movement("movement")
                .movementMechanism("movementMechanism")
                .create();
        return reptile;
    }
}
