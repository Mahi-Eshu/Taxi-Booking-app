import java.util.*;
import Taxi.*;
import TaxiBooking.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        TaxiBooking t1 = new TaxiBooking();
        Taxi t2 = new Taxi();
        System.out.println("Welcome to Mahesh's Taxi Booking Application!");
        int choice;

        //number of location points
        List<Character> Points = new ArrayList<>();
        Points.add('A');
        Points.add('B');
        Points.add('C');
        Points.add('D');
        Points.add('E');
        Points.add('F');

        do{
            System.out.println("1. BOOK TAXI\n" +
                    "2. DISPLAY TAXI DETAILS\n");
            int option = sc.nextInt();
            //input
            switch (option){
                case 1:
                {
                    System.out.print("Pickup Point: ");
                    Character pickup = sc.next().charAt(0);
                    System.out.print("Drop Point: ");
                    Character drop = sc.next().charAt(0);
                    System.out.print("Pick up time: ");
                    int pickupTime = sc.nextInt();
                    t1.Booking(pickupTime, pickup, drop);
                    break;
                }
                case 2:
                {
                    for(Taxi t: t1.getTaxiList()){
                        if(t.getTaxiId()!=0) {
                            System.out.println("Taxi: " + t.getTaxiId());
                            System.out.println("Current Location: " + t.getCurrentLocation());
                            System.out.println("Pickup Location: " + t.getPickupLocation());
                            System.out.println("Pickup Time: " + t.getPickupTime());
                            System.out.println("Drop Location: " + t.getDropLocation());
                            System.out.println("Drop Time: " + t.getDropTime());
                            System.out.println("Total Earnings: " + t.getEarnings());
                            System.out.println("Total Distance Travelled: " + t.getKms());
                        }
                    }
                    break;
                }
            }
            System.out.println("Enter 1 to continue / 0 to exit");
            choice = sc.nextInt();
        }while(choice==1);
    }
}

