package com.assign_hashMap.repositories.implementation;

import com.assign_hashMap.domain.Invertebrate;
import com.assign_hashMap.repositories.InvertebrateRepo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Suzanne Effendi on 2017/08/14.
 */
public class InvertebrateRepoImpl implements InvertebrateRepo {
    private static InvertebrateRepoImpl repo = null;

    private Map<Long, Invertebrate> invertebrateTable;

    private InvertebrateRepoImpl() {
        invertebrateTable = new HashMap<Long, Invertebrate>();
    }

    public static InvertebrateRepoImpl getRepo(){
        if(repo == null){
            repo = new InvertebrateRepoImpl();
        }
        return repo;
    }

    @Override
    public Invertebrate create(Invertebrate invertebrate){
        invertebrateTable.put(invertebrate.getInvertebrateId(),invertebrate);
        Invertebrate saveSpecimen = invertebrateTable.get(invertebrate.getInvertebrateId());
        return saveSpecimen;
    }

    @Override
    public Invertebrate read(long invertebrateId){
        Invertebrate invertebrate = invertebrateTable.get(invertebrateId);
        return invertebrate;
    }

    @Override
    public Invertebrate update(Invertebrate invertebrate){
        invertebrateTable.put(invertebrate.getInvertebrateId(),invertebrate);
        Invertebrate updateSpecies = invertebrateTable.get(invertebrate.getInvertebrateId());
        return updateSpecies;
    }

    @Override
    public void delete(long invertebrateId){
        invertebrateTable.remove(invertebrateId);
    }
}
