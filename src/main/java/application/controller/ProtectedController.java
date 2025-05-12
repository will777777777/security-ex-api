package application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.record.GenericResponse;

@RestController
public class ProtectedController {
    @RequestMapping("/protected")
    public GenericResponse home() {
        return new GenericResponse("Protected");
    }
}