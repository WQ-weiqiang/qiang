package qiang.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import qiang.base.doman.Qiang;

@RestController
public class Hello {
    @Autowired
    Qiang q;

    @GetMapping("/")
    String hello() {

        //return "This is hello ";
        return q.toString();

    }
}
