package com.company;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            String check;
            String input;
            int guesser;
            int looper = 1;
            int ub = 100 ;
            int lb = 0;
            int add;
            int count;
            System.out.println("1-100 Number Guesser v6.28");
            while(1 == 1)
                {
                    System.out.println("Enter Y to start or enter N to stop the guesser");
                    check = scan.next();
                    switch(check)
                        {
                            case "Y":
                                guesser = 50;
                                looper = 1;
                                ub = 100;
                                lb = 0;
                                count = 0;
                                System.out.println("Enter H if the guess is high. Enter L if the guess is low. Enter C if the guess is correct.");
                                while(looper == 1)
                                    {
                                        count++;
                                        if(count > 7)
                                            {
                                                System.out.println("Your number couldn't be guessed within 7 tries.");
                                                System.out.println("Try again?");
                                                input = scan.next();
                                                switch (input)
                                                    {
                                                        case "N":
                                                            System.exit(0);
                                                            break;
                                                        case "Y":
                                                            looper = 0;
                                                            break;
                                                        default:
                                                            System.out.println("Enter a valid command.");
                                                            break;
                                                    }
                                            }
                                        System.out.print("Is your number ");
                                        System.out.print(guesser);
                                        System.out.println("?");
                                        input = scan.next();
                                        switch(input)
                                            {
                                                case "H":
                                                    ub = guesser;
                                                    add = ub + lb;
                                                    if(add%2 == 1)
                                                        {
                                                            add++;
                                                        }
                                                    guesser = add / 2;
                                                    break;
                                                case "L":
                                                    lb = guesser;
                                                    add = ub + lb;
                                                    if(add%2 == 1)
                                                    {
                                                        add++;
                                                    }
                                                    guesser = add / 2;
                                                    break;
                                                case "C":
                                                    System.out.print("Your number was guessed in ");
                                                    System.out.print(count);
                                                    System.out.print("attempts.");
                                                    System.out.println("Try again?");
                                                    input = scan.next();
                                                    switch (input)
                                                    {
                                                        case "N":
                                                            System.exit(0);
                                                            break;
                                                        case "Y":
                                                            looper = 0;
                                                            break;
                                                        default:
                                                            System.out.println("Enter a valid command.");
                                                            break;
                                                    }
                                                    break;
                                                default:
                                                    System.out.println("Invalid input");
                                                    break;
                                            }
                                    }
                                break;
                            case "N":
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Enter a valid command.");
                                break;
                        }
                }
        }
}