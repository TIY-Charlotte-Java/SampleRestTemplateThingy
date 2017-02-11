package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ben on 2/10/17.
 */
@RestController
public class SampleController {
    @Autowired
    RestTemplate template;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public NoteDataModel home() {
        Map<String, String> urlParams = new HashMap<>();

        urlParams.put("noteId", "1");
        return template.getForObject("https://private-b7de0-bensterrett.apiary-mock.com/notes/{noteId}", NoteDataModel.class, urlParams);
    }

    @RequestMapping(path = "/circular-dependency", method = RequestMethod.GET)
    public Note getCircularDependency() {
        Note n = new Note(1, "Eat my shorts");
        User u = new User(1, "Ben");

        n.setUser(u);
        u.setNote(n);

        return n;
    }

    @RequestMapping(path = "/circular-user-dependency", method = RequestMethod.GET)
    public User getCircularUserDependency() {
        Note n = new Note(1, "Eat my shorts");
        User u = new User(1, "Ben");

        n.setUser(u);
        u.setNote(n);

        return u;
    }
}
