package com.project.springboot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/sample")
public class SampleController {

    @GetMapping
    public String getSampleApp(){
        return "Welcome to Sample Application...";
    }

    @GetMapping("outside")
    public String getOutsideSampleApp(){
        return "Welcome to Outside Sample Application...";
    }

    @GetMapping("/inside")
    public String getInsideSampleApp(){
        return "Welcome to Inside Sample Application...";
    }


}
