package application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.record.GenericResponse;

@RestController
public class PublicController {
    @RequestMapping("/public")
    public GenericResponse home() {
        return new GenericResponse("Public");
    }
}