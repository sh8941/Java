package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer{
    public Desktop(){
        System.out.println("Desktop object is created.");
    }
    @Override
    public void compile(){
        System.out.println("Compiling... using Desktop.");
    }
}
