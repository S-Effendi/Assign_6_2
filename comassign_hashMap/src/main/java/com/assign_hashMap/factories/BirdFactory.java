package com.assign_hashMap.factories;

import com.assign_hashMap.domain.Bird;

import java.util.Map;

/**
 * Created by Suzanne Effendi on 2017/08/13.
 */
public class BirdFactory {
    public static Bird getBird(long birdId, String name){
        Bird bird = new Bird.Builder()
                .birdId(birdId)
                .name(name)
                .movement("movement")
                .movementMechanism("movementMechanism")
                .create();
        return bird;
    }
}
