package com.assign_hashMap.services.implementation;

import com.assign_hashMap.domain.Reptile;
import com.assign_hashMap.repositories.ReptileRepo;
import com.assign_hashMap.repositories.implementation.ReptileRepoImpl;
import com.assign_hashMap.services.ReptileService;

/**
 * Created by Suzanne Effendi on 2017/08/14.
 */
public class ReptileServiceImpl implements ReptileService {

    ReptileRepo repo = ReptileRepoImpl.getRepo();

    @Override
    public Reptile create(Reptile reptile){
        return repo.create(reptile);
    }

    @Override
    public Reptile read(long reptileId){
        return repo.read(reptileId);
    }

    @Override
    public Reptile update(Reptile reptile){
        return repo.update(reptile);
    }

    @Override
    public void delete(long reptileId){
        repo.delete(reptileId);
    }
}
