package Modulo9_Heranca_Polimorfismo;

import Modulo9_Heranca_Polimorfismo.Entities.Account;
import Modulo9_Heranca_Polimorfismo.Entities.BusinessAccount;
import Modulo9_Heranca_Polimorfismo.Entities.SavingsAccount;

public class aula_140 {
    public static void main(String[] args){

        Account acc1 = new Account(1001, "Alex", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());
        //Resultado: 795.0


        Account acc2 = new SavingsAccount(1002, "Tom", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());
        //Resultado: 800.0


        Account acc3 = new BusinessAccount(1003, "Tony", 1000.0, 500);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());
        //Resultado: 793.0
    }
}
