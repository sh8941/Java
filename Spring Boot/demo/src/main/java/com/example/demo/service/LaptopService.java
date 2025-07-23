package com.example.demo.service;

import com.example.demo.repo.LaptopRepository;
import com.example.demo.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap){
        repo.addLaptop(lap);
    }

    public boolean isGoodForProg(Laptop lap){
        return true;
    }
}
