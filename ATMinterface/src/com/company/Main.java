package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

	int balance=100000,withdraw,deposit;
	Scanner SC=new Scanner(System.in);

	while(true){
        System.out.println("Automated Teller Machine");
        System.out.println("Choose 1 for withdraw");
        System.out.println("Choose 2 for deposit");
        System.out.println("Choose 3 for check balance");
        System.out.println("Choose 4 for EXIT");
        System.out.print("Choose the operation you want");

        int choice=SC.nextInt();
        switch(choice)
        {
            case 1:
                System.out.print("Enter money to be withdrawn:");
                withdraw=SC.nextInt();
                if (balance>=withdraw)
                {
                    balance=balance-withdraw;
                    System.out.println("Please collect your money");
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
                System.out.println("");
                break;
            case 2:
                System.out.print("Enter money to be deposited");
                deposit=SC.nextInt();
                balance=balance+deposit;
                System.out.println("Your money has been successfully deposited");
                System.out.println("");
                break;
            case 3:
                System.out.println("Balance:"+balance);
                System.out.println("");
                break;
            case 4:
                System.exit(0);
        }
    }
    }
}
