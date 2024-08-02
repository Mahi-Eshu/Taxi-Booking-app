package Taxi;
import TaxiBooking.TaxiBooking;

import java.util.*;

public class Taxi {
    private char currentLocation = 'A';
    private int customerId;
    private int taxiId;
    private char pickupLocation;
    private char dropLocation;
    private int pickupTime;
    private int dropTime;
    private int earnings;
    private int kms;

    public void setCurrentLocation(char currentLocation) {this.currentLocation = currentLocation;}
    public char getCurrentLocation() {return currentLocation;}

    public void setCustomerId(int id) {this.customerId = id;}
    public int getCustomerId() {return customerId;}

    public void setTaxiId(int taxiId) {this.taxiId = taxiId;}
    public int getTaxiId() {return taxiId;}

    public void setPickupTime(int pickupTime) {this.pickupTime = pickupTime;}
    public int getPickupTime() { return pickupTime;}

    public void setDropTime(int dropTime) {this.dropTime = dropTime;}
    public int getDropTime(){return dropTime;}

    public void setPickupLocation(char pickupLocation) {this.pickupLocation = pickupLocation;}
    public char getPickupLocation() {return pickupLocation;}

    public void setDropLocation(char dropLocation) {this.dropLocation = dropLocation;}
    public char getDropLocation() {return dropLocation;}

    public void setEarnings(int earnings) {this.earnings = earnings;}
    public int getEarnings() {return earnings;}

    public void setKms(int kms) {this.kms = kms;}
    public int getKms() {return kms;}
}
