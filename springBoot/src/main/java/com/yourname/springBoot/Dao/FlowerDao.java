package com.yourname.springBoot.Dao;

import com.yourname.springBoot.Entity.Flower;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
@Repository
public interface FlowerDao extends MongoRepository<Flower, Integer> {
    Collection<Flower> getAllFlowers();

    Flower getFlowerById(int id);

    void removeFlowerById(int id);

    void updateFlower(Flower flower);

    void insertFlowerToDb(Flower flower);
}
