package com.lucas.rest.medium;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medium")
public class MediumController {

    @GetMapping("example-one")
    public int exampleOne(@RequestParam int id) {
        return id;
    }

    @GetMapping("example-two/id/{id}")
    public int exampleTwo(@PathVariable("id") int id) {
        return id;
    }

    @GetMapping("example-three")
    public String exampleTree(@RequestHeader("User-Agent") String userAgent, @RequestParam("id") int id) {
        return id + " - " + userAgent;
    }
}
