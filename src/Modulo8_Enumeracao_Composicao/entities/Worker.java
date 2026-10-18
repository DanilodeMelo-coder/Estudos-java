package Modulo8_Enumeracao_Composicao.entities;

import Modulo8_Enumeracao_Composicao.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private double baseSalary;

    //composição
    private Departament departament;

    private List<HourContrat> contrats = new ArrayList<>();


    public Worker(){
    }

    public Worker(String name, WorkerLevel level, double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public List<HourContrat> getContrats() {
        return contrats;
    }


    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }




    public void addContrat(HourContrat contrat){
        contrats.add(contrat);
    }

    public void removeContrat(HourContrat contrat){
        contrats.remove(contrat);
    }

    public double income(int year, int month) {
        Calendar cal = Calendar.getInstance();

        double sum = baseSalary;

        for (HourContrat c : contrats) {

            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = cal.get(Calendar.MONTH) + 1;

            if (c_year == year && c_month == month) {

                sum += c.totalValue();
            }
        }
        return sum;
    }




}
