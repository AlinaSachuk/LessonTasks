package I;

public class Airplane implements Vehicle, Flyable {
    private int airplaneCost;
    final double TAX = 0.50;
    private String airplaneColor;
    private String airplaneBrand;

    @Override
    public void fly() {
        System.out.println("You can fly!");
    }

    @Override
    public int getCost() {
        return (int) (airplaneCost + (airplaneCost * TAX));

    }

    @Override
    public void getColor() {
        System.out.println(airplaneColor);
    }

    @Override
    public void getBrand() {
        System.out.println(airplaneBrand);
    }

    public int getAirplaneCost() {
        return airplaneCost;
    }

    public void setAirplaneCost(int airplaneCost) {
        this.airplaneCost = airplaneCost;
    }

    public String getAirplaneColor() {
        return airplaneColor;
    }

    public void setAirplaneColor(String airplaneColor) {
        this.airplaneColor = airplaneColor;
    }

    public String getAirplaneBrand() {
        return airplaneBrand;
    }

    public void setAirplaneBrand(String airplaneBrand) {
        this.airplaneBrand = airplaneBrand;
    }
}
