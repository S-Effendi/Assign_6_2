package com.assign_hashMap.services.implementation;

import com.assign_hashMap.domain.Invertebrate;
import com.assign_hashMap.repositories.InvertebrateRepo;
import com.assign_hashMap.repositories.implementation.InvertebrateRepoImpl;
import com.assign_hashMap.services.InvertebrateService;

/**
 * Created by Suzanne Effendi on 2017/08/14.
 */
public class InvertebrateServiceImpl implements InvertebrateService{

    InvertebrateRepo repo = InvertebrateRepoImpl.getRepo();

    @Override
    public Invertebrate create(Invertebrate invertebrate){
        return repo.create(invertebrate);
    }

    @Override
    public Invertebrate read(long invertebrateId){
        return repo.read(invertebrateId);
    }

    @Override
    public Invertebrate update(Invertebrate invertebrate){
        return repo.update(invertebrate);
    }

    @Override
    public void delete(long invertebrateId){
        repo.delete(invertebrateId);
    }
}
