package com.yourname.springBoot.Controller;

import com.yourname.springBoot.Entity.Flower;
import com.yourname.springBoot.Service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/flowers")
public class FlowerController {

    @Autowired
    private FlowerService flowerService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Flower> getAllFlowers(){
        return flowerService.getAllFlowers();
    }

    @RequestMapping(value = "/{id}" , method = RequestMethod.GET)
    public Flower getFlowerById(@PathVariable("id") int id){
        return flowerService.getFlowerById(id);
    }

    @RequestMapping(value = "/{id}" , method = RequestMethod.DELETE)
    public void deleteFlowerById(@PathVariable("id") int id){
        flowerService.removeFlowerById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes =MediaType.APPLICATION_JSON_VALUE)
    public void updateFlower(@RequestBody Flower flower){
        flowerService.updateFlower(flower);
    }

    @RequestMapping(method = RequestMethod.POST, consumes =MediaType.APPLICATION_JSON_VALUE)
    public void insertFlower(@RequestBody Flower flower){
        flowerService.insertFlower(flower);
    }
}
