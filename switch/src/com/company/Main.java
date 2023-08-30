package com.company;

import java.util.Random;
import java.util.Scanner;

class Game{
    int computer;
    public Game(){
        Random rand = new Random();
        computer = rand.nextInt(100);
        System.out.println("Guess the Number from 1 to 100");

    }
    public int computerNo(){
        return computer;

    }
}
public class Main {
    static int Input(){
        int user;
        System.out.println("Enter ");
        Scanner sc= new Scanner(System.in);
        user=sc.nextInt();
        return user;
    }

    static void isCorrectNumber(int i, int j){
        if(i==j){
            System.out.println("Correct No.");
        }
        else if(i>j){
            System.out.println("The No.guessed is too high");
        }
        else{
            System.out.println("The No.guessed is too low ");
        }
    }

    public static void main(String[] args) {
        int user=0,computer=0,itteration=0;
        Game g = new Game();
        do {
            user = Input();
            computer = g.computerNo();
            isCorrectNumber(user, computer);
            itteration++;
        }while (user!=computer);
        System.out.println("No. Guessed in "+ itteration+" itterations");
    }
}