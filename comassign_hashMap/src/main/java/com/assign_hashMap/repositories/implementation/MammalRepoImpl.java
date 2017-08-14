package com.assign_hashMap.repositories.implementation;

import com.assign_hashMap.domain.Mammal;
import com.assign_hashMap.repositories.MammalRepo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Suzanne Effendi on 2017/08/14.
 */
public class MammalRepoImpl implements MammalRepo {
    private static MammalRepoImpl repo = null;

    private Map<Long, Mammal> mammalTable;

    private MammalRepoImpl() {
        mammalTable = new HashMap<Long, Mammal>();
    }

    public static MammalRepoImpl getRepo(){
        if(repo == null){
            repo = new MammalRepoImpl();
        }
        return repo;
    }

    @Override
    public Mammal create(Mammal mammal){
        mammalTable.put(mammal.getMammalId(),mammal);
        Mammal saveSpecimen = mammalTable.get(mammal.getMammalId());
        return saveSpecimen;
    }

    @Override
    public Mammal read(long mammalId){
        Mammal mammal = mammalTable.get(mammalId);
        return mammal;
    }

    @Override
    public Mammal update(Mammal mammal){
        mammalTable.put(mammal.getMammalId(),mammal);
        Mammal updateSpecies = mammalTable.get(mammal.getMammalId());
        return updateSpecies;
    }

    @Override
    public void delete(long mammalId){
        mammalTable.remove(mammalId);
    }
}