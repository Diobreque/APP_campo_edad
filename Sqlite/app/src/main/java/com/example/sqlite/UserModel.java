package com.example.sqlite;

import java.io.Serializable;

public class UserModel implements Serializable{

    private String name, hobby, edad;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getEdad() { return edad; }
    public void setEdad(String edad) { this.edad = edad; }

}
