package part_07;

/**
 * Created by nicola on 7/12/17.
 */


class Vehicles implements Series{
    private int length;
    private int width;
    private boolean hasWheels;

    @Override
    public void reset(){
        System.out.println("reset");
    }
    @Override
    public void start(){
        System.out.println("start");
    }
    @Override
    public void end(){
        System.out.println("end");
    }

    public Vehicles() {
    }

    public Vehicles(int length, int width, boolean hasWheels) {
        this.length = length;
        this.width = width;
        this.hasWheels = hasWheels;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isHasWheels() {
        return hasWheels;
    }

    public void setHasWheels(boolean hasWheels) {
        this.hasWheels = hasWheels;
    }

    public int size(int width, int height) {
        return width * height;
    }

    public boolean isCar(boolean hasWheels) {
        if (hasWheels) {
            return true;

        }
        return false;
    }
}

class Cars extends Vehicles {
    private int weight;
    private String color;
    private boolean roof;

    public Cars() {
    }

    public Cars(int length, int width, boolean hasWheels, int weight, String color, boolean roof) {
        super(length, width, hasWheels);
        this.weight = weight;
        this.color = color;
        this.roof = roof;
    }
    public int mpg (int range, int gallons) {
        return range / gallons;
    }
    public boolean isConvertible(boolean roof) {
        if (roof) {
            return true;
        } return false;
    }
}

class SportsCars extends Cars {
    private String brand;
    private String year;

    public SportsCars(){
    }

    public SportsCars(String brand, String year) {
        this.brand = brand;
        this.year = year;
    }

    public SportsCars(int length, int width, boolean hasWheels, int weight, String color, boolean roof, String brand,
                      String year) {
        super(length, width, hasWheels, weight, color, roof);
        this.brand = brand;
        this.year = year;
    }

    private int horsepower(int cylinders, int cubicliters) {
        return cylinders * cubicliters;
    }

    private int topSpeed(int weight, int size) {
        return weight * size;
    }
}

class Ferrari extends SportsCars {
    private int price;
    private int model;

    public Ferrari(){
    }

    public Ferrari(String brand, String year, int price, int model) {
        super(brand, year);
        this.price = price;
        this.model = model;
    }

    public Ferrari(int length, int width, boolean hasWheels, int weight, String color, boolean roof, String brand, String year, int price, int model) {
        super(length, width, hasWheels, weight, color, roof, brand, year);
        this.price = price;
        this.model = model;
    }
}

public class Controller{
    public static void main(String[] args) {
        Ferrari ferr = new Ferrari(100,20,true,6000,"red",true,
                "ferrari", "2017",500,200);
        Vehicles veh = new Vehicles();
        veh.reset();
        veh.start();
        veh.end();

    }

}



