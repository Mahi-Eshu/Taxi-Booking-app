package TaxiBooking;
import Taxi.*;
import java.util.*;

public class TaxiBooking {
    private static ArrayList<Taxi> TaxiList = new ArrayList<>();
    private static int taxiLimit = 4, id = 1;

    public ArrayList<Taxi> getTaxiList(){
        return TaxiList;
    }

    public static String Booking(int pickupTime, char pickUpLocation, char dropLocation){
        if(TaxiList.size() < taxiLimit){
            TaxiList.add(new Taxi());
        }
        int min = Integer.MAX_VALUE;
        Taxi ReadyTaxi = null;

        //to assign taxi that is available at the specified time and is close to the pickup location
        for(Taxi taxi: TaxiList){
            if(taxi.getDropTime() <= pickupTime && Math.abs(taxi.getCurrentLocation()-pickUpLocation) < min){
                min = Math.abs(taxi.getCurrentLocation()-pickUpLocation);
                ReadyTaxi = taxi;
            }
        }
         if(ReadyTaxi!=null){
             ReadyTaxi.setCustomerId(id++);
             ReadyTaxi.setTaxiId(TaxiList.indexOf(ReadyTaxi)+1);
             ReadyTaxi.setCurrentLocation(dropLocation);
             ReadyTaxi.setPickupLocation(pickUpLocation);
             ReadyTaxi.setDropLocation(dropLocation);
             ReadyTaxi.setPickupTime(pickupTime);
             ReadyTaxi.setDropTime(pickupTime + Math.abs(pickUpLocation - dropLocation));
             ReadyTaxi.setEarnings(ReadyTaxi.getEarnings() + Math.abs(pickUpLocation - dropLocation) * 200);
             ReadyTaxi.setKms(ReadyTaxi.getKms() + Math.abs(pickUpLocation - dropLocation) * 15);
         }
         return ReadyTaxi != null ? "Taxi " + (ReadyTaxi.getTaxiId()+1) + " is booked!" : "Taxi not available;(";
    }
}
