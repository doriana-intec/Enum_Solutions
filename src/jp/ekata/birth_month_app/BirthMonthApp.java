package jp.ekata.birth_month_app;

import java.util.Scanner;

public class BirthMonthApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Month birthMonth;
        String userEntry;
        int position;
        int comparison;

        System.out.println("The months are:\n");

        for (Month month : Month.values()) {
            System.out.print(month + " ");
        }

        do {
            System.out.print("\n\nEnter the month of your birth >>");
            userEntry = scanner.nextLine().toUpperCase();
        }while (isValid(userEntry));

        birthMonth = Month.valueOf(userEntry);
        System.out.println("\nYou entered " + birthMonth);

        position = birthMonth.ordinal();
        System.out.println(birthMonth + " is in position " + position);

        System.out.println("So it's month number is " + (position + 1));
        comparison = birthMonth.compareTo(Month.JUNE);

        if (comparison < 0) {
            System.out.println(birthMonth + " is earlier in the year than " + Month.JUNE);

        } else if (comparison > 0) {
            System.out.println(birthMonth + " is later in the year than " + Month.JUNE);

        } else {
            System.out.println(birthMonth + " is " + Month.JUNE);
        }
    }

    private static boolean isValid(String month) {
        for (Month m : Month.values()) {
            if (m.name().equals(month)) {
                return false;
            }
        }
        return true;
    }
}
