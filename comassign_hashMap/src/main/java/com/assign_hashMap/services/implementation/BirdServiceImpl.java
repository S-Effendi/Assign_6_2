package com.assign_hashMap.services.implementation;

import com.assign_hashMap.domain.Bird;
import com.assign_hashMap.repositories.BirdRepo;
import com.assign_hashMap.repositories.implementation.BirdRepoImpl;
import com.assign_hashMap.services.BirdService;

/**
 * Created by Suzanne Effendi on 2017/08/14.
 */
public class BirdServiceImpl implements BirdService {

    BirdRepo repo = BirdRepoImpl.getRepo();

        @Override
        public Bird create(Bird bird){
            return repo.create(bird);
        }

        @Override
        public Bird read(long birdId){
            return repo.read(birdId);
        }

        @Override
        public Bird update(Bird bird){
            return repo.update(bird);
        }

        @Override
        public void delete(long birdId){
            repo.delete(birdId);
        }
}
