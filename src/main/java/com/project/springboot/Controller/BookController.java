package com.project.springboot.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("books")
public class BookController {

    @GetMapping("/one/{id}")
    public String Book(@PathVariable Long id){
        return "Book id:"+id;
    }
}
