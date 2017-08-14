package com.assign_hashMap.services.implementation;

import com.assign_hashMap.domain.Fish;
import com.assign_hashMap.repositories.FishRepo;
import com.assign_hashMap.repositories.implementation.FishRepoImpl;
import com.assign_hashMap.services.FishService;

/**
 * Created by Suzanne Effendi on 2017/08/14.
 */
public class FishServiceImpl implements FishService {

    FishRepo repo = FishRepoImpl.getRepo();

    @Override
    public Fish create(Fish fish){
        return repo.create(fish);
    }

    @Override
    public Fish read(long fishId){
        return repo.read(fishId);
    }

    @Override
    public Fish update(Fish fish){
        return repo.update(fish);
    }

    @Override
    public void delete(long fishId){
        repo.delete(fishId);
    }
}
