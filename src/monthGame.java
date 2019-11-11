
public class monthGame {
    public static void main(String[] args) {
        Zellercongruence(22, 10, 2017);

    }
    // Print Day for a Date
    static void Zellercongruence(int day, int month, int year)
    {
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

        int q = day;
        int m = month;
        int k = year % 100;
        int j = year / 100;    }

}


