package com.assign_hashMap.factories;

import com.assign_hashMap.domain.Fish;

/**
 * Created by S.Effendi on 2017/08/13.
 */
public class FishFactory {
    public static Fish getFish (long fishId, String name){
        Fish fish = new Fish.Builder()
                .fishId(fishId)
                .name(name)
                .movement("movement")
                .movementMechanism("movementMechanism")
                .create();
        return fish;
    }
}
