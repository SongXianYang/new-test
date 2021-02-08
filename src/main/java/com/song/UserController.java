package com.song;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SongXianYang
 */
@RestController
public class UserController {
    @RequestMapping(value = "song",method = RequestMethod.GET)
    private String Song() {
        return "hahaha";
    }
}
