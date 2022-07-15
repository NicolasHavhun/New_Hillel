package com.hillel.havhun.homework5;

import java.util.Scanner;

public class homework5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, Please enter the name of first Team ");
        String nameTeam1 = null;
        if (scanner.hasNext()) {
            nameTeam1 = scanner.nextLine();
            System.out.println("First Team -" + nameTeam1);
        } else {
            System.out.println("Wrong Data");
            System.exit(0);

            scanner.next();
        }
        System.out.println("Please Enter the number of frags team - " + nameTeam1  +" to Player 1");
        if (scanner.hasNextInt()) {
            int team1Player1 = scanner.nextInt();
            System.out.println("Frags Player 1 =" + team1Player1);
        } else {
            System.out.println("Wrong Data");
            System.exit(0);

            scanner.next();
        }
        System.out.println("Please Enter the number of frags team - " + nameTeam1 +" to Player 2");
        if (scanner.hasNextInt()) {
            int team1Player2 = scanner.nextInt();
            System.out.println("Frags Player 2 =" + team1Player2);
        } else {
            System.out.println("Wrong Data");
            System.exit(0);
            scanner.next();
        }
        if (scanner.hasNextInt()) {
            int team1Player3 = scanner.nextInt();
            System.out.println("Frags Player 3 =" + team1Player3  +" to Player 3");
        } else {
            System.out.println("Wrong Data");
            System.exit(0);
            scanner.next();
        }
        if (scanner.hasNextInt()) {
            int team1Player4 = scanner.nextInt();
            System.out.println("Frags Player 4 =" + team1Player4  +" to Player 4");
        } else {
            System.out.println("Wrong Data");
            System.exit(0);
            scanner.next();
        }
        if (scanner.hasNextInt()) {
            int team1Player5 = scanner.nextInt();
            System.out.println("Frags Player 5 =" + team1Player5 +" to Player 5");
        } else {
            System.out.println("Wrong Data");
            System.exit(0);
            scanner.next();
        }


        scanner.close();



    }
    }

