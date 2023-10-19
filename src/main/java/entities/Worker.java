package entities;

import entities.enums.WorkerLevel;
import lombok.Data;

import java.util.ArrayList;
import java.util.Calendar;
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

    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public double income(int year, int month){

        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();

        for(HourContract c: contracts){

            cal.setTime(c.getDate());

            int c_year = cal.get(Calendar.YEAR);
            int c_month = cal.get(Calendar.MONTH);

            if (year == c_year &&  month == c_month){
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
