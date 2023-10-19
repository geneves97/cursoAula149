package entities;

import lombok.Data;

@Data
public class Department {

    private String name;

    public Department(){}
    public Department(String name){
        this.name = name;
    }
}