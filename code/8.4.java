

//////////////////////////////////// My design

public class ParkingLot{
  private  int maxCount = 100;
  private  int currCount;
  private  ArrayList<Car> cars;
  private LinkedList<Car> carqueue;
  
  public boolean carIn(Car c){
    if(curreCount == maxCount){
      carqueue.add(c);
      return false;
    }
    currCount++;
    cars.add(c);
  }
  
  public boolean carOut(Car c){
    cars.remove(c);
    currCount--;
    if(currCount-- == maxCount-1){
      checkWaitingCar();
    }
  }
  
  //move waiting car to parking lot
  public boolean checkWaitingCar(){
  }

}


////////////////////////////////// Reference

//abstract class Vehicle

public enum VehicleSize {MotorCycle, Compact, Large}

public abstract class Vehicle{
  protected ArrayList<ParkingSpot> parkingSpots = new ArrayList<ParkingSplot>();
  protected String licencePlat;
  protected int splotsNeeded;
  protected VehicleSize size;
  
  public int getSpotsNeeded() {return spotsNeeded; }
  public VehicleSize() {return size;}
  
  public void parkInSpot(ParkingSpot s) {parkingSpots.add(s);}
  
  //remove car from spot and notify spot that it's gone
  public void clearSpots() {...}
  
  //check ifthe spot is bing enough for the vehicle and availability
  public abstract boolean canFitInSpot(ParkingSpot spot);
}

//////////////////////////////////////////////////////////////////////////

public clas Bus extends Vehicle{
  public Bus(){
    spotsNeeded = 5;
    size = VehicleSize.Large;
  }
  
  //check if the spot is a Large, doesn't check num of spots
  public boolean canFitInSpot(ParkingSpot spot) {...}
}

public class Car extends Vehicle{
  public Car(){
    spotNeeded = 1;
    size = VehicleSize.Compact;
  }
  
  public boolean carFitInSpot(ParkingSpot spot) {...}
}

public class MotorCycle extends Vehicle{
  public MotorCycle(){
    spotNeeded = 1;
    sie = VehicleSize.MotorCycle;
  }
  
  public boolean canFitInSpot(ParkingSpot spot) {...}
}

////////////////////////////////////////////////////////////////////////
//use Level to represent a different parking lot

public class ParkingLot{
  private Level[] levels;
  private final int NUM_LEVELS = 5;
  
  public ParkingLot() {...}
  
  //park the vehicle in a spot or multiple spots, return false if failed
  public boolean parkVehicle(Vehicle vehicle) {...}
}


////////////////////////////////////////////////////////////////////
//Represents a level in a parking garage

public class Level{
  private int floor;
  private ParkingSpot[] spots;
  private int avilableSpts = 0;
  private static final int SPOTS_PER_ROW = 10;
  
  public Level(int flr, int numberSpots) {...}
  
  public int availavleSpots() {return availableSpots;}
  
  //find a place to park this vehicle, return false if failed
  public boolean parkVehicle(Vehicle vehicle) {...}
  
  //park a vehicle starting at the spot number and a continuing until vehicle spotneeded
  private boolean parkStartingAtSpot(int num, Vehicle v) {...}
  
  //find a pot topark this vehicle, return index of spot, or -1
  private int findAvailableSpots(Vehicle vehicle) {...}
  
  //when a car was removed from the spot, increment avilableSpot
  public void spotFreed() {aviableSpots++;}
}


////////////////////////////////////////////////

//a parking spot

public class ParkingSpot{

  private Vheicle vehicle;
  private VehicleSize spotSize;
  private int rowl
  private int spotNumber;
  private Level levels;
  
  public ParkingSpot(Level lvl, int r, int n, VehicleSize s) {...}
  
  public boolean isAvailable() {return vehicle==null;}
  
  //check if the pot is big enough and is avilable
  public boolean canFitVehcile(Vehicle vehicle){...}
  
  //park vehicle in this spot
  public boolean park(Vehicle v){}
  
  public int getRow {return row;}
  public int getSpotNumber() {return spotNumber;}
  
  //remove vehicle from spot, and notify level that a new spot is avilable
  public void removeVehicle() {...}
  
}

