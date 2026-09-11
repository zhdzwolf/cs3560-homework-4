package polymorphism_files;

public class CargoShip extends Ship {
    private int tonnage;

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }

    @Override
    public void print() {
        System.out.println("Cargo ship name: " + getShipName());
        System.out.println("Cargo capacity: " + getTonnage());
    }
}
