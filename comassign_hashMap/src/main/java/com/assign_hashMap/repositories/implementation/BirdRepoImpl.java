package com.assign_hashMap.repositories.implementation;

import com.assign_hashMap.domain.Bird;
import com.assign_hashMap.repositories.BirdRepo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Suzanne Effendi on 2017/08/14.
 */
public class BirdRepoImpl implements BirdRepo {
    private static BirdRepoImpl repo = null;

    private Map<Long, Bird> birdTable;

    private BirdRepoImpl() {
        birdTable = new HashMap<Long, Bird>();
    }

    public static BirdRepoImpl getRepo(){
        if(repo == null){
            repo = new BirdRepoImpl();
        }
        return repo;
    }

    @Override
    public Bird create(Bird bird){
        birdTable.put(bird.getBirdId(),bird);
        Bird saveSpecimen = birdTable.get(bird.getBirdId());
        return saveSpecimen;
    }

    @Override
    public Bird read(long birdId){
        Bird bird = birdTable.get(birdId);
        return bird;
    }

    @Override
    public Bird update(Bird bird){
        birdTable.put(bird.getBirdId(),bird);
        Bird updateSpecimen = birdTable.get(bird.getBirdId());
        return updateSpecimen;
    }

    @Override
    public void delete(long birdId){
        birdTable.remove(birdId);
    }
}
