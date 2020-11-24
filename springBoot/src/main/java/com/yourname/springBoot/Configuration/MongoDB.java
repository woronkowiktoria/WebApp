package com.yourname.springBoot.Configuration;

import com.yourname.springBoot.Dao.FlowerDao;
import com.yourname.springBoot.Entity.Flower;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = FlowerDao.class)
@Configuration

public class MongoDB {

    @Bean
    CommandLineRunner commandLineRunner(FlowerDao flowerDao) {
        return args -> {
            flowerDao.save(new Flower(1, "Tulipan", 15));
            flowerDao.save(new Flower(2, "Pelargonia", 10));
        };
    }
}