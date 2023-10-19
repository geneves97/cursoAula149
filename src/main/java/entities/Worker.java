package entities;

import entities.enums.WorkerLevel;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private  Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }
}