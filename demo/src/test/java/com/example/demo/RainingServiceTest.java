package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("raining")
public class RainingServiceTest {

    @Autowired
    private WeatherService weatherService;

    @Test
    public void rainingProfileTest() throws Exception {
        String output = weatherService.forecast();
        assertThat(output).contains("rainy");
    }

}
