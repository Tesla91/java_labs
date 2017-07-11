package part_06;

/**
 * Created by nicola on 7/11/17.
 */
public class Drainage extends Bunkers {
    private double baserock;
    private double pipe;

    Drainage(){
        super();

    }
    void show() {

        System.out.println("Drainage");
    }

    public double getBaserock() {
        return baserock;
    }
    public void setBaserock(double baserock) {
        this.baserock = baserock;
    }
    public double getPipe() {
        return pipe;
    }
    public void setPipe(double pipe) {
        this.pipe = pipe;
    }


    public Drainage (int foreman, int workers, int equipment, int hours, double sand, double baserock, double pipe){
        super(foreman, workers, equipment, hours, sand);
        this.baserock = baserock;
        this.pipe = pipe;
    }



}
