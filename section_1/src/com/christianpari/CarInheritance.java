// july 22
package com.christianpari;

import java.util.HashMap;
import java.util.Scanner;

public class CarInheritance {

  public void startAlg() {
    Scanner sc = new Scanner(System.in);

    int choice = sc.nextInt();
    String m = sc.next();

    HashMap<Integer, Car> choices = new HashMap<>();
    choices.put(0, new WagonR(false, "4", m));
    choices.put(1, new HondaCity(true, "4", m));
    choices.put(2, new InnovaCrysta(false, "6", m));

    Car car = choices.get(choice);
    String type = car.getClass().getTypeName().substring(18);
    String isSedan = car.getIsSedan() ? " is Sedan" : " is not Sedan";
    String seats = car.getSeats();
    String mileage = car.getMileage();

    System.out.println("A " + type + isSedan + ", is " + seats + "-seater, and has a mileage of around " + mileage + ".");
  }

}

abstract class Car {
  boolean isSedan;
  String seats;

  public Car(
    boolean isSedan,
    String seats
  ) {
    this.isSedan = isSedan;
    this.seats = seats;
  }

  Boolean getIsSedan() { return isSedan; }
  String getSeats() { return seats; }
  abstract String getMileage();
}

class WagonR extends Car{
  String mileage;

  public WagonR(
    boolean isSedan,
    String seats,
    String mileage
  ) {
    super(isSedan, seats);
    this.mileage = mileage;
  }

  @Override
  String getMileage() { return mileage + " kmpl"; }
}

class HondaCity extends Car{
  String mileage;

  public HondaCity(
    boolean isSedan,
    String seats,
    String mileage
  ) {
    super(isSedan, seats);
    this.mileage = mileage;
  }

  @Override
  String getMileage() { return mileage + " kmpl"; }
}

class InnovaCrysta extends Car{
  String mileage;

  public InnovaCrysta(
    boolean isSedan,
    String seats,
    String mileage
  ) {
    super(isSedan, seats);
    this.mileage = mileage;
  }

  @Override
  String getMileage() { return mileage + " kmpl"; }
}