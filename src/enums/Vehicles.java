package enums;

public enum Vehicles {
    Car1(1, "red"), Car2(3, "green"), Car3(4, "blue");

    private int price;
    private String color;

    Vehicles(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.name() + ": price = " + price + "; color = " + this.getColor();
    }
}

class main {
    public static void main(String[] args) {
        Vehicles vehicles = null;

        System.out.println(vehicles.Car1.toString());
        System.out.println(vehicles.Car3.toString());
    }
}