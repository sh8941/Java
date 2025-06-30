package org.example.config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
public class AppConfig {
//    @Bean(name="computer")
//    @Scope("prototype")
//    @Bean
//    public Desktop desktop(){
//        // name of method is defautl name of Bean unless not passed in Annotation
//        return new Desktop();
//    }
//
//    @Primary
//    @Bean
//    public Laptop laptop(){
//        return  new Laptop();
//    }
//
//    @Bean
//    public Alien alien(@Autowired Computer com){
////        @Qualifier("Laptop") annotation use is argument list instead of primary
//        Alien obj = new Alien();
//        obj.setCom(com);
//        obj.setAge(29);
//        return obj;
//    }
}
