package Modulo7_DataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Calculos_com_datahora {
    public static void main(String[] args){

        LocalDate d04 = LocalDate.parse("2007-02-13");
        LocalDateTime d05 = LocalDateTime.parse("2007-02-13T12:30:26");
        Instant d06 = Instant.parse("2007-02-13T01:30:26Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeek = d04.plusDays(7);

        System.out.println("pastWeekLocalDate: " + pastWeekLocalDate);
        System.out.println("nextWeek: " + nextWeek);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);

        Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
        System.out.println("t1 Dias: " + t1.toDays());
    }
}
