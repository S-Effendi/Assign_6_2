package com.assign_hashMap.repositories.implementation;

import com.assign_hashMap.domain.Reptile;
import com.assign_hashMap.repositories.ReptileRepo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Suzanne Effendi on 2017/08/14.
 */
public class ReptileRepoImpl implements ReptileRepo {
    private static ReptileRepoImpl repo = null;

    private Map<Long, Reptile> reptileTable;

    private ReptileRepoImpl() {
        reptileTable = new HashMap<Long, Reptile>();
    }

    public static ReptileRepoImpl getRepo(){
        if(repo == null){
            repo = new ReptileRepoImpl();
        }
        return repo;
    }

    @Override
    public Reptile create(Reptile reptile){
        reptileTable.put(reptile.getReptileId(),reptile);
        Reptile saveSpecimen = reptileTable.get(reptile.getReptileId());
        return saveSpecimen;
    }

    @Override
    public Reptile read(long reptileId){
        Reptile reptile = reptileTable.get(reptileId);
        return reptile;
    }

    @Override
    public Reptile update(Reptile reptile){
        reptileTable.put(reptile.getReptileId(),reptile);
        Reptile updateSpecimen = reptileTable.get(reptile.getReptileId());
        return updateSpecimen;
    }

    @Override
    public void delete(long reptileId){
        reptileTable.remove(reptileId);
    }
}