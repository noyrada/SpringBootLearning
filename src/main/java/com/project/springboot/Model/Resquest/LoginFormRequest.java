package com.project.springboot.Model.Resquest;

public class LoginFormRequest {

    private String username;
    private String password;
    private String role;

    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    public String getRole(){
        return this.role;
    }
}
