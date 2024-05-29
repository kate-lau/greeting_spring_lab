package com.example.task_01.controllers;

import com.example.task_01.models.Celebration;
import com.example.task_01.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping // do we need this as well as GetMapping?

public class GreetingController {

    @GetMapping(value = "/greeting")
    public String newGreeting(@RequestParam(defaultValue = "evening") String timeOfDay){
        Greeting greeting = new Greeting("Kate",timeOfDay);
        return String.format("Good %s, %s!", greeting.getTimeOfDay(), greeting.getName());
    }

    @GetMapping(value = "/greeting/summer")
    public String celebrationGreeting(){
        Celebration summer = new Celebration("summer solstice");
        return String.format("Happy %s!", summer.getMessage());
    }

}