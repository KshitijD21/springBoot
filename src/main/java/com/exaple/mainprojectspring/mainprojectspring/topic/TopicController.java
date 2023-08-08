package com.exaple.mainprojectspring.mainprojectspring.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topic")
    public List<Topic> getAllTopics(){
        return Arrays.asList(

                new Topic("Spring" , "Spring Fremwork" , "Spring Fremwork description"),
                new Topic("Java" , "Java Fremwork" , "Java Fremwork description"),
                new Topic("js" , "js Fremwork" , "js Fremwork decription")

        );
    }
}
