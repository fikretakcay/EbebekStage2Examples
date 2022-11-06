import java.util.Scanner;

public class ChineseZodiacCalculator {
    public static void main(String[] args) {
        int birthdayDate,whichAnimal;
         Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your birthday date: ");
        birthdayDate = scan.nextInt();

        whichAnimal = birthdayDate % 12;

        switch (whichAnimal){
            case (0):
                System.out.println("Your Chinese zodiac horoscope is: Monkey.");
                break;
            case (1):
                System.out.println("Your Chinese zodiac horoscope is: Cock.");
                break;
            case (2):
                System.out.println("Your Chinese zodiac horoscope is: Dog.");
                break;
            case (3):
                System.out.println("Your Chinese zodiac horoscope is: Pig.");
                break;
            case (4):
                System.out.println("Your Chinese zodiac horoscope is: Mouse.");
                break;
            case (5):
                System.out.println("Your Chinese zodiac horoscope is: Bullock.");
                break;
            case (6):
                System.out.println("Your Chinese zodiac horoscope is: Tiger.");
                break;
            case (7):
                System.out.println("Your Chinese zodiac horoscope is: Rabbit.");
                break;
            case (8):
                System.out.println("Your Chinese zodiac horoscope is: Dragon.");
                break;
            case (9):
                System.out.println("Your Chinese zodiac horoscope is: Snake.");
                break;
            case (10):
                System.out.println("Your Chinese zodiac horoscope is: Horse.");
                break;
            case (11):
                System.out.println("Your Chinese zodiac horoscope is: Sheep.");
                break;
        }
    }
}
