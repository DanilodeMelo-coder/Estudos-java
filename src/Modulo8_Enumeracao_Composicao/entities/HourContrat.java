package Modulo8_Enumeracao_Composicao.entities;

import java.util.Date;

public class HourContrat {
    private Date date;
    private double hourlyRate;
    private int hours;

    public HourContrat(){}

    public HourContrat(Date date, double hourlyRate, int hours) {
        this.date = date;
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double totalValue(){
        return hourlyRate * hours;
    }
}
