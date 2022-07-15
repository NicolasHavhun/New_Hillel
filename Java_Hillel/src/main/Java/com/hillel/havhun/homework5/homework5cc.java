package com.hillel.havhun.homework5;

public class homework5cc {
    public static void main(String[] args) {

        String nameofTeam1 = "df";
        try {
            int  summFragsTeam1 = Integer.parseInt(nameofTeam1);
            System.out.println(summFragsTeam1);
        } catch (NumberFormatException e) {
            System.err.println("Неправильный формат строки!");
        }

    }
}
