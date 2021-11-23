package com.company;
import java.util.Scanner;
public class Main {
    public static Scanner input = new Scanner(System.in);

    private enum Days {
        MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5),
        SATURDAY(6), SUNDAY(7);

        private final int number;

        Days(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of the day you want to print:");
        while (true) {
            int num = input.nextInt();
            if (num <= 0) {
                System.out.println("Count starts with one!");
            } else if (num >= 8) {
                System.out.println("Come on, there are only 7 days");
            } else {checkTheDay(num);}
        }
    }
    private static void checkTheDay(int number){
        for (Days day : Days.values()) {
            if (day.getNumber() == number) {
                System.out.println(day);
                break;
            }
        }
    }
}
