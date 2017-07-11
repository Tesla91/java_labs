package part_06;

/**
 * Created by nicola on 7/11/17.
 */
public class Bunkers extends Jobs {

    private double sand;

    Bunkers(){
        super();

    }
    void show() {

        System.out.println("Bunkers");
    }
    public int time(int foreman, int hours){
        return foreman * hours;
    }

    public double getSand() {
        return sand;
    }
    public void setSand(double sand) {
        this.sand = sand;
    }

    public Bunkers (int foreman, int workers, int equipment, int hours, double sand){
        super(foreman, workers, equipment, hours);
        this.sand = sand;
    }


}
