import java.util.Scanner;

public class monthGame {
    public static void main(String[] args) {

        System.out.println("There's an old rhyme that says...");
        System.out.println("");
        System.out.println("Monday's child is fair of face,");
        System.out.println("Tuesday's child is full of grace,");
        System.out.println("Wednesday's child is full of woe,");
        System.out.println("Thursday's child has far to go.");
        System.out.println("Friday's child is loving and giving,");
        System.out.println("Saturday's child works hard for a living,");
        System.out.println("But the child born on the Sabbath Day,");
        System.out.println("Is fair and wise and good in every way.");
        System.out.println("You were born on a...");
        System.out.println("");

        Zeller(1,11,2000);

    }

    public static void Zeller(int day, int month, int year) {

        int q = day;
        int m = month;
        int k = year % 100;
        int j = year / 100;
        int h = q + 13 * (m + 1) / 5 + k + k / 4 + j / 4 + 5 * j;
        h = h % 7;

        if (month == 1)
        {
            month = 13;
            year--;
        }
        if (month == 2)
        {
            month = 14;
            year--;
        }

            switch (h) {
                case 0:
                    System.out.println("Saturday, Saturday's child works hard for a living.");
                    break;
                case 1:
                    System.out.println("Sunday, the child born on the Sabbath Day, Is fair and wise and good in every way.");
                    break;
                case 2:
                    System.out.println("Monday, Monday's child is fair of face.");
                    break;
                case 3:
                    System.out.println("Tuesday, Tuesday's child is full of grace.");
                    break;
                case 4:
                    System.out.println("Wednesday, Wednesday's child is full of woe.");
                    break;
                case 5:
                    System.out.println("Thursday, Thursday's child has far to go.");
                    break;
                case 6:
                    System.out.println("Friday, Friday's child is loving and giving");
                    break;

            }
        }
    }




