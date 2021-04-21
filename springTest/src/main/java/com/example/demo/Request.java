package com.example.demo;

public class Request {
    public String user;
    public String profilePic;
    Request(String u, String p){
        user = u;
        profilePic = p;
    }
    Request(){
        user="";
        profilePic="";
    }
}
