package com.project.springboot.Controller;

import com.project.springboot.Model.Response.LoginFormResponse;
import com.project.springboot.Model.Resquest.LoginFormRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class LoginController {

    @PostMapping(value = "/login")
    public ResponseEntity<LoginFormResponse> login(@RequestBody LoginFormRequest loginFormRequest){

        LoginFormResponse response = new LoginFormResponse();
        response.username = loginFormRequest.getUsername().toUpperCase();
        return ResponseEntity.ok(response);
    }
}
