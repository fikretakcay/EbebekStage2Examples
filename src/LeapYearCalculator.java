import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        int year;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter to year: ");
        year = scan.nextInt();

        if(year % 4 == 0 && ((year % 100 != 0) || (year % 400 == 0))){
            System.out.println(year +" year is leap year");
        }else {
            System.out.println(year +" year is not leap year");
        }
    }
}
