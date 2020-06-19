package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    yearIncome();
    }

    public static void dailyIncome(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("How much hours did you work today?");
        while(!scanner.hasNextDouble()){
            scanner.nextLine();
            System.out.println("Please enter a number!");
        }
        double hours = scanner.nextDouble();

        System.out.println("What is you hourly income?");
        while(!scanner.hasNextDouble()){
            scanner.nextLine();
            System.out.println("Please enter a number!");
        }
        double pay = scanner.nextDouble();

        double sum = hours*pay;
        System.out.println("You earned today : " + sum);
        scanner.close();
    }

    public static void weeklyIncome(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days have you worked this week?");
        while(!scanner.hasNextDouble()){
            scanner.nextLine();
            System.out.println("Please enter a number!");
        }
        double days = scanner.nextDouble();

        System.out.println("How much hours did you work this week?");
        while(!scanner.hasNextDouble()){
            scanner.nextLine();
            System.out.println("Please enter a number!");
        }
        double hours = scanner.nextDouble();

        double sum = days * hours;

        System.out.println("What is your hourly income?");
        while(!scanner.hasNextDouble()){
            scanner.nextLine();
            System.out.println("Please enter a number!");
        }
        double income = scanner.nextDouble();

        double weekIncome = income * sum;
        System.out.println("You earned this week: " + weekIncome);
        scanner.close();
    }

    public static void montltyIncome(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days have you worked this month?");
        while(!scanner.hasNextDouble()){
            scanner.nextLine();
            System.out.println("Please enter a number!");
        }
        double days = scanner.nextDouble();

        System.out.println("How much hours did you work this month?");
        while(!scanner.hasNextDouble()){
            scanner.nextLine();
            System.out.println("Please enter a number!");
        }
        double hours = scanner.nextDouble();

        double sum = days * hours;

        System.out.println("What is your hourly income?");
        while(!scanner.hasNextDouble()){
            scanner.nextLine();
            System.out.println("Please enter a number!");
        }
        double income = scanner.nextDouble();

        double monthIncome = income * sum;
        System.out.println("You earned this month: " + monthIncome);
        scanner.close();
    }

    public static void yearIncome(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your mount income?");
        while(!scanner.hasNextDouble()){
            scanner.nextLine();
            System.out.println("Please enter a number!");
        }
        double income = scanner.nextDouble();

        double yearIncome = income * 12;
        if(yearIncome <= 50000){
            System.out.println("You dont need to pay tax!");
        }else if(yearIncome > 50000){
            System.out.println("Tax % in your contry?");
            while(!scanner.hasNextDouble()){
                scanner.nextLine();
                System.out.println("Please enter a number!");
            }
            double taxContry = scanner.nextDouble();
            double taxPay = yearIncome / taxContry;
            System.out.println("You need to pay:" + taxPay + " tax.");
        }

        System.out.println("You earned this year: " + yearIncome);
        scanner.close();
    }
}
