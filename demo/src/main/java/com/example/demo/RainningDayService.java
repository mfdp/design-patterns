package com.example.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("raining")
public class RainningDayService implements WeatherService {
    @Override
    public String forecast() {
        return "It's rainy day!";
    }
}
