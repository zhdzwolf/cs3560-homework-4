package polymorphism_files;

public class CruiseShip extends Ship {
    private int passengers;

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    @Override
    public void print() {
        System.out.println("Cruise ship name: " + getShipName());
        System.out.println("Number of passengers: " + getPassengers());
    }
}
