package com.hillel.havhun.homework5;


import java.util.Scanner;

public class homework5Havhun {
    public static void main(String[] args) {

        System.out.println("Hello, Please enter the Name of your first Team ");

        String nameofTeam1 = teamInfo();
        System.out.println( " Okey, The name of your first Team -" + nameofTeam1);
        System.out.println("Please Enter the number of frags Team " + nameofTeam1 + " to Player 1");
        String player1Team1 = playerInfo();
        System.out.println("Frags Player 1 =" + player1Team1);
        System.out.println("Please Enter the number of frags Team " + nameofTeam1 +" to Player 2");
        String player2Team1 = playerInfo();
        System.out.println("Frags Player 2 =" + player2Team1);
        System.out.println("Please Enter the number of frags Team " + nameofTeam1 + "to Player 3");
        String player3Team1 = playerInfo();
        System.out.println("Frags Player 3 =" + player3Team1);
        System.out.println("Please Enter the number of frags Team " + nameofTeam1 +" to Player 4");
        String player4Team1 = playerInfo();
        System.out.println("Frags Player 4 =" + player4Team1);
        System.out.println("Please Enter the number of frags Team " + nameofTeam1 +" to Player 5");
        String player5Team1 = playerInfo();
        System.out.println("Frags Player 5 =" + player5Team1);

        System.out.println("Please enter the Name of second Team ");
        String nameofTeam2 = teamInfo();
        System.out.println("The name of your second Team " +nameofTeam2);

        System.out.println("Please Enter the number of frags Team " + nameofTeam2 +" to Player 1");
        String player1Team2 = playerInfo();
        System.out.println("Frags Player 1 =" + player1Team2);
        System.out.println("Please Enter the number of frags Team " + nameofTeam2 +" to Player 2");
        String player2Team2 = playerInfo();
        System.out.println("Frags Player 2 =" + player2Team2);
        System.out.println("Please Enter the number of frags Team " + nameofTeam2 + " to Player 3");
        String player3Team2 = playerInfo();
        System.out.println("Frags Player 3 =" + player3Team2);
        System.out.println("Please Enter the number of frags Team " + nameofTeam2 +" to Player 4");
        String player4Team2 = playerInfo();
        System.out.println("Frags Player 4 =" + player4Team2);
        System.out.println("Please Enter the number of frags Team " + nameofTeam2 +" to Player 5");
        String player5Team2 = playerInfo();
        System.out.println("Frags Player 5 =" + player5Team2);

        try {
            Integer summFragsTream1 = Integer.valueOf(player1Team1)
                    +Integer.valueOf(player2Team1)
                    +Integer.valueOf(player3Team1)
                    +Integer.valueOf(player4Team1)
                    +Integer.valueOf(player5Team1);
            System.out.println("Общее количество Фрагов команды "+ nameofTeam1 +" " +summFragsTream1);
        } catch (NumberFormatException e) {
            System.err.println("Неправильный формат строки!");
        }

        try {
            Integer summFragsTream2 = Integer.valueOf(player1Team2)
                    +Integer.valueOf(player2Team2)
                    +Integer.valueOf(player3Team2)
                    +Integer.valueOf(player4Team2)
                    +Integer.valueOf(player5Team2);
            System.out.println("Общее количество Фрагов команды " + nameofTeam2 +" " +summFragsTream2);
        } catch (NumberFormatException e) {
            System.err.println("Неправильный формат строки!");
        }
        int part1 = (Integer.valueOf(player1Team1)
                +Integer.valueOf(player2Team1)
                +Integer.valueOf(player3Team1)
                +Integer.valueOf(player4Team1)
                +Integer.valueOf(player5Team1))/5;
        int part2 = (Integer.valueOf(player1Team2)
                +Integer.valueOf(player2Team2)
                +Integer.valueOf(player3Team2)
                +Integer.valueOf(player4Team2)
                +Integer.valueOf(player5Team2))/5;
        System.out.println("Средние количество фрагов команды  "+ nameofTeam2+" "+part1);
        System.out.println("Средние количество фрагов команды  "+ nameofTeam2 +" " +part2);

        if (part1>part2) {
            System.out.println("Команда "+ nameofTeam1+" выграла");
        }
        else if (part1<part2){
            System.out.println("Команда " +nameofTeam2+" выграла");
        }
        else {
            System.out.println( "Ничья)");
        }

    }

    private static String playerInfo() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            String teamPlayer = scanner.nextLine();
            return teamPlayer;
        } else {
            System.out.println("Wrong Data");
            System.exit(0);

            scanner.next();
        }
        String result = " +";
        return result;

    }

    private static String teamInfo() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String teamName = scanner.nextLine();
            return teamName;
        } else {
            System.out.println("Wrong Data");
            System.exit(0);

            scanner.next();
        }
        String result = " ";
        return result;

    }
    }




