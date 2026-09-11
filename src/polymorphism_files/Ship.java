package polymorphism_files;

public class Ship {
    private String shipName;
    private String buildYear;

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }
    public void setBuildYear(String buildYear) {
        this.buildYear = buildYear;
    }

    public String getShipName() {
        return shipName;
    }
    public String getBuildYear() {
        return buildYear;
    }

    public void print() {
        System.out.println("Ship Name: " + getShipName());
        System.out.println("Build Year: " + getBuildYear());
    }
}
