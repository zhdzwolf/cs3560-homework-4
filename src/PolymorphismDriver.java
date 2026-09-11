import polymorphism_files.*;

public static void main(String[] args) {
    Ship[] ships =  new Ship[3];

    Ship ship1 = new Ship();
    ship1.setShipName("survivors of the void");
    ship1.setBuildYear("2022");
    ships[0] = ship1;

    CruiseShip ship2 = new CruiseShip();
    ship2.setShipName("seekers of the void");
    ship2.setPassengers(2);
    ships[1] = ship2;

    CargoShip ship3 = new CargoShip();
    ship3.setShipName("alloyed collective");
    ship3.setTonnage(7);
    ships[2] = ship3;

    for (Ship ship : ships) {
        ship.print();
        System.out.println();
    }
}
