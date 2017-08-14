package com.assign_hashMap.repositories.implementation;

import com.assign_hashMap.domain.Fish;
import com.assign_hashMap.repositories.FishRepo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Suzanne Effendi on 2017/08/14.
 */
public class FishRepoImpl implements FishRepo {
    private static FishRepoImpl repo = null;

    private Map<Long, Fish> fishTable;

    private FishRepoImpl() {
        fishTable = new HashMap<Long, Fish>();
    }

    public static FishRepoImpl getRepo(){
        if(repo == null){
            repo = new FishRepoImpl();
        }
        return repo;
    }

    @Override
    public Fish create(Fish fish){
        fishTable.put(fish.getFishId(),fish);
        Fish saveSpecimen = fishTable.get(fish.getFishId());
        return saveSpecimen;
    }

    @Override
    public Fish read(long fishId){
        Fish fish = fishTable.get(fishId);
        return fish;
    }

    @Override
    public Fish update(Fish fish){
        fishTable.put(fish.getFishId(),fish);
        Fish updateSpecimen = fishTable.get(fish.getFishId());
        return updateSpecimen;
    }

    @Override
    public void delete(long fishId){
        fishTable.remove(fishId);
    }
}
