package application;

import conta.Saldo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void  main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Saldo saldo;

        System.out.println("Coloque seus dados:");
        System.out.print("Enter account number:");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)?");
        String response = sc.next();
        if (response.equals("y")) {
            System.out.print("Enter initial deposit value: ");
            double initialDeposite = sc.nextDouble();
            saldo = new Saldo(number, name, initialDeposite);
        } else {
            saldo = new Saldo(number, name);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(saldo);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        saldo.deposito(depositValue);
        System.out.println("Updated accont data: ");
        System.out.println(saldo);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double saqueValue = sc.nextDouble();
        saldo.saque(saqueValue);
        System.out.println("Updated accont data: ");
        System.out.println(saldo);


        sc.close();

    }
}


//        if (confirmacao.equals("y")) {
//            System.out.println("Enter initial deposit value:");
//            double deposito = sc.nextDouble();
//        } else {
//            System.out.printf("Account %d, Holder: %s, Balance: $ %.2f", number, name, );
//        }

//        System.out.println("Coloque seus dados:");
//        System.out.print("Enter accont nunmber:");
//        int number = sc.nextInt();
//        System.out.print("Enter account holder: ");
//        String name = sc.nextLine();
//        System.out.print("Is there an initial deposit (y/n)?");
//        String confirmacao = sc.nextLine();


//Saldo saldo = new Saldo(number, name, depositoIniical);

// saldo.inicialDeposito(depositoIniical, depositoIniical);


//        Saldo saldo = new Saldo(number, name, balaco, deposito);
//
//        System.out.println("Account data:");
//        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f", number, name, balance);
//
//        System.out.println("Enter a deposit value:");
//        double deposito = sc.nextDouble();
//        System.out.println("Updates accont data:");
//        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n%n", number, name, balance);
//
//        System.out.println("Enter a withdraw value:");
//        double saque = sc.nextDouble();
//        System.out.println("Updates accont data:");
//        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n%n", number, name, balance);