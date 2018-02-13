package com.example.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("smoggy")
public class SmoggyDayService implements WeatherService {
    @Override
    public String forecast() {
        return "Very smoggy day.";
    }
}
