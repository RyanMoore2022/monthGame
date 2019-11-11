
public class monthGame {
    public static void main(String[] args) {
        Zellercongruence(22, 10, 2017);

    }
    static void Zellercongruence(int day, int month, int year) {

        int q = day;
        int m = month;
        int k = year % 100;
        int j = year / 100;
        int h = q + 13*(m + 1) / 5 + k + k / 4 + j / 4 + 5 * j;
        h = h % 7;

        switch (month) {
            case 1:
                (month == 1){
                month = 13;
                year--;
                }
                break;
            case 2:
                (month == 2){
                month = 14;
                year--;

            }
            default:{
                System.out.println("can't compute.");
            }
        }








    }

}


