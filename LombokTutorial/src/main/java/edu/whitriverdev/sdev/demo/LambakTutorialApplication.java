package edu.whitriverdev.sdev.demo;

import edu.whitriverdev.sdev.demo.model.DateNight;
import edu.whitriverdev.sdev.demo.model.Location;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* This simple app introduces project Lombok,
* a tool for creating POJOs
* */

@SpringBootApplication
public class LambakTutorialApplication {

    public static void main(String[] args) {

        SpringApplication.run(LambakTutorialApplication.class, args);

        Location location1 = new Location();
        location1.setLocation("Seattle");

        Location location2 = new Location();
        location2.setLocation("Hawaii");

        DateNight date = new DateNight(new Location[] {location1, location2},
                false, "sunny", 1200.00);

        location1.setDateNight(date);
        location2.setDateNight(date);

        System.out.println(date);
    }

}
