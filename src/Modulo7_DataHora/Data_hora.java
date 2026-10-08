package Modulo7_DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data_hora {
    public static void main(String[] args){

        //Instanciando data-hora a partir do agora

        //Data
        LocalDate d01 = LocalDate.now();
        System.out.println("d01: " + d01);

        //data-hora local
        LocalDateTime d02 = LocalDateTime.now();
        System.out.println("d02: " + d02);

        //Instant (Gera do GMT: horario de londres)
        Instant d03 = Instant.now();
        System.out.println("d03: "+ d03);



        System.out.println("");
        //Pegar um texto ISO 8601 e gerar um texto a partir dele
        LocalDate d04 = LocalDate.parse("2007-02-13");
        System.out.println("d04: "+ d04);

        LocalDateTime d05 = LocalDateTime.parse("2007-02-13T12:30:26");
        System.out.println("d05: " + d05);

        Instant d06 = Instant.parse("2007-02-13T12:30:26Z");
        System.out.println("d06: " + d06);

        //Utilizando outro fuso(Sp) a partir do GMT de londres
        Instant d07 = Instant.parse("2007-02-13T12:30:26-03:00");
        System.out.println("d07: " + d07);


        System.out.println("");
        //converter texto personalizado para data hora

        //LocalDate d08 =  LocalDate.parse(22/08/2008) *ERRO

        DateTimeFormatter ft1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08 = LocalDate.parse("22/08/2008", ft1);
        System.out.println("d08: " + d08);

        //LocalDate d09 =  LocalDate.parse(22/08/2008 1:30) *ERRO
        //DateTimeFormatter ft2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d09 = LocalDateTime.parse("22/08/2008 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println("d09: " + d09);

        System.out.println("");
        LocalDate d10 = LocalDate.of(2022, 7, 20);
        System.out.println("d10: " + d10);

        LocalDateTime d11 = LocalDateTime.of(2022,9,10,1,30);

    }
}
