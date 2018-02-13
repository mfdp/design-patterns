package com.example.demo;

import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
public class WeatherServiceTest {

    @Autowired
    private WeatherService weatherService;

    @Rule
    public OutputCapture outputCapture = new OutputCapture();


    @Test
    public void testSmoggyDay() {
        System.setProperty("spring.profiles.active", "smoggy");
        DemoApplication.main(new String[0]);
        String output = this.outputCapture.toString();
        assertThat(output).contains("smoggy");
    }

    @Test
    public void testRainyDay() {
        System.setProperty("spring.profiles.active", "raining");
        DemoApplication.main(new String[0]);
        String output = this.outputCapture.toString();
        assertThat(output).contains("rainy");
    }

    @Test
    public void testSunnyDay() {
        System.setProperty("spring.profiles.active", "sunny");
        DemoApplication.main(new String[0]);
        String output = this.outputCapture.toString();
        assertThat(output).contains("sunny");
    }

    @Test
    public void testDefaultDay() {
        System.setProperty("spring.profiles.active", "default");
        DemoApplication.main(new String[0]);
        String output = this.outputCapture.toString();
        assertThat(output).contains("sunny");
    }

    @After
    public void after() {
        System.clearProperty("spring.profiles.active");
    }
}
