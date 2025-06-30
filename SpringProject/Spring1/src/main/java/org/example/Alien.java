package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
public class Alien {
    @Value("24")
    private int age;
    @Autowired
    @Qualifier("laptop")
    private Computer com;
    public Alien(){
        System.out.println("Alien's Constructor is called.");
    }
    @ConstructorProperties({"age","lap"})
//    annotation above mentioned use to get rid from sequence of arguments in xml file
    public Alien(int age, Computer com){
        System.out.println("parameterized constructor is called.");
        this.age = age;
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("Setter is called");
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("Alien is coding...");
        com.compile();
    }
}
