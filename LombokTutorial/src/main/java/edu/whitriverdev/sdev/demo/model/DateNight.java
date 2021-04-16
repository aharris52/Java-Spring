package edu.whitriverdev.sdev.demo.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DateNight {
    @ToString.Exclude
    private Location[] location;
    private boolean inDoor;
    private String preferredWeather;
    private double budget;
}
