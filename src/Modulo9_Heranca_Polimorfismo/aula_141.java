package Modulo9_Heranca_Polimorfismo;

import Modulo9_Heranca_Polimorfismo.Entities.Account;
import Modulo9_Heranca_Polimorfismo.Entities.SavingsAccount;

public class aula_141 {
    public static void main(String[] args){

        Account x = new Account(1001, "Alex", 1000.0);
        Account y = new SavingsAccount(1002, "Anna", 1000.0, 0.01);

        x.withdraw(50);
        y.withdraw(50);

        System.out.println("X: " + x.getBalance());
        System.out.println("Y:" + y.getBalance());
    }
}
