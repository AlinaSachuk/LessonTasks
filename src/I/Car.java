package I;

public class Car implements Vehicle, Movable {
    private int carCost;
    final double TAX = 0.20;
    private String carColor;
    private String carBrand;

    @Override
    public void start() {
        System.out.println("Press button to start engine.");
    }

    @Override
    public void end() {
        System.out.println("Press button to stop engine.");
    }

    @Override
    public int getCost() {
        return (int) (carCost + (carCost * TAX));
    }

    @Override
    public void getColor() {
        System.out.println(carColor);
    }

    @Override
    public void getBrand() {
        System.out.println(carBrand);
    }

    public int getCarCost() {
        return carCost;
    }

    public void setCarCost(int carCost) {
        this.carCost = carCost;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }
}
