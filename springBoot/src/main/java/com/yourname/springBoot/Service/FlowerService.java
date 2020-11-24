package com.yourname.springBoot.Service;

import com.yourname.springBoot.Dao.FlowerDao;
import com.yourname.springBoot.Entity.Flower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class FlowerService {

    @Autowired
    @Qualifier("fakeData")
    private FlowerDao flowerDao;

    public Collection<Flower> getAllFlowers(){
        return this.flowerDao.getAllFlowers();
    }
    public Flower getFlowerById(int id){
        return this.flowerDao.getFlowerById(id);
    }

    public void removeFlowerById(int id){
        this.flowerDao.removeFlowerById(id);
    }

    public void updateFlower(Flower flower){
        this.flowerDao.updateFlower(flower);
    }

    public void insertFlower(Flower flower) {
        this.flowerDao.insertFlowerToDb(flower);
    }
}
