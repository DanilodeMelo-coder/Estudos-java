package Modulo8_Enumeracao_Composicao;

import Modulo8_Enumeracao_Composicao.entities.Departament;
import Modulo8_Enumeracao_Composicao.entities.HourContrat;
import Modulo8_Enumeracao_Composicao.entities.Worker;
import Modulo8_Enumeracao_Composicao.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exer_ContratosTrabalhador {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner((System.in));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String workerDepartament = sc.nextLine();

        System.out.println("Enter worker data");
        System.out.print("Name: ");
        String workerName = sc.nextLine();

        System.out.print("Level: ");
        String workerLevel = sc.nextLine();

        System.out.print("Base salary: ");
        double workerBaseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary, new Departament(workerDepartament));


        System.out.print("How many contratsto this worker: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){

            System.out.printf("Enter contrat #%d data %n", i);

            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());

            System.out.print("Hourly Rate: ");
            double hourlyDate = sc.nextDouble();

            System.out.print("Duration (Hours): ");
            int hours = sc.nextInt();

            HourContrat contrat = new HourContrat(contractDate, hourlyDate, hours);
            worker.addContrat(contrat);
        }


        System.out.println();

        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();

        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));


        System.out.println("Name: " + worker.getName());
        System.out.println("Departament: " + worker.getDepartament().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}
