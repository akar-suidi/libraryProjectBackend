package com.akar_dev.project.Controller;


import com.akar_dev.project.Entity.Authors;
import com.akar_dev.project.ServiceImplementation.AuthorServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthorController {

    @Autowired
    AuthorServiceImplementation authserviceImlp;

    @GetMapping("/")
    private String welcome() {
        return "<p>Welcome";
    }

    @PostMapping("/auth")
    private Authors addAuthors(@RequestBody Authors authors) {
        return authserviceImlp.addAuthor(authors);
    }

    @GetMapping("/showAuth")
    private List<Authors> showAuthors() {
        return authserviceImlp.retrieveJsonAuthors();
    }

    @PutMapping("/updateAuth/{id}")
    private Authors updateAuthors(@PathVariable("id") Long authID, @RequestBody Authors authors) {

        return authserviceImlp.updateAuth(authID, authors);
    }


}
