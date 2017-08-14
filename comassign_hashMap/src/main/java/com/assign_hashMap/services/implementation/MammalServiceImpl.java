package com.assign_hashMap.services.implementation;

import com.assign_hashMap.domain.Mammal;
import com.assign_hashMap.repositories.MammalRepo;
import com.assign_hashMap.repositories.implementation.MammalRepoImpl;
import com.assign_hashMap.services.MammalService;

/**
 * Created by Suzanne Effendi on 2017/08/14.
 */
public class MammalServiceImpl implements MammalService {

    MammalRepo repo = MammalRepoImpl.getRepo();

    @Override
    public Mammal create(Mammal mammal){
        return repo.create(mammal);
    }

    @Override
    public Mammal read(long mammalId){
        return repo.read(mammalId);
    }

    @Override
    public Mammal update(Mammal mammal){
        return repo.update(mammal);
    }

    @Override
    public void delete(long mammalId){
        repo.delete(mammalId);
    }
}
