package com.example.demo.repo;

import com.example.demo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void addLaptop(Laptop lap){
        System.out.println("Saved in database...");
    }
}
