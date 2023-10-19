package entities;

import lombok.Data;

import java.util.Date;

@Data
public class HourContract {

    private Date date;
    private double valuePerHour;
    private Integer hours;

    public HourContract() {
    }

    public HourContract(Date date, double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }
}
