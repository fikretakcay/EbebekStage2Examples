import java.util.Scanner;

public class TicketPlane {
    public static void main(String[] args) {

        int km, age,journeyType;
        Scanner sc= new Scanner(System.in);

        System.out.print("Please enter going to distance: ");
        km=sc.nextInt();

        System.out.print("Please enter your age: ");
        age=sc.nextInt();

        System.out.print("Please enter Journey type (1 => One way , 2 => Round Trip ): ");
        journeyType=sc.nextInt();

        double totalPrice=km*0.10;

        if(age>0&&km>0&&((journeyType==1)||(journeyType==2))){
            if(age<12){
                totalPrice*=0.5;
            }
            if(age<=24&&age>=12){
                totalPrice*=0.9;
            }
            if(age>=65){
                totalPrice*=0.7;
            }
            if(journeyType==2){
                totalPrice*=0.8*2;
            }

            System.out.println("Total price: "+ totalPrice +" TL");
        } else {
            System.out.println("You entered wrong information!");
        }
    }
}
