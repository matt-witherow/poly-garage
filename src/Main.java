import fleet.Boat;
import fleet.Car;
import fleet.Jet;
import garage.Garage;
import garage.Vehicle;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

      Garage garage = new Garage(new ArrayList<Vehicle>());

      Car ford   = new Car(100);
      Car holden = new Car(100);
      Boat speedBoat = new Boat(225);
      Jet privateJet = new Jet(12000);

      ford.drive(25);
      holden.drive(30);
      speedBoat.drive(12);
      privateJet.drive(50);

      garage.store(ford);
      garage.store(holden);
      garage.store(speedBoat);
      garage.store(privateJet);


      double bill = garage.repairAll();

      System.out.println(String.format("The Total cost of running the fleet was $%.2f", bill));
    }
}
