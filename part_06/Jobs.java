package part_06;

/**
 * Created by nicola on 7/11/17.
 */
public class Jobs {
    private int foreman;
    private int workers;
    private int equipment;
    private int hours;

    Jobs(){

    }
    void show() {

        System.out.println("Jobs");
    }

    public int employees(int foreman, int workers){
        return foreman + workers;
    }
    public int time(int foreman, int workers, int hours){
        return (foreman + workers) * hours;
    }

    public Jobs(int foreman, int workers, int equipment, int hours){
        this.foreman = foreman;
        this.workers = workers;
        this.equipment = equipment;
        this.hours = hours;
    }
    public int getForeman() {
        return foreman;
    }
    public void setForeman(int foreman) {
        this.foreman = foreman;
    }
    public int getWorkers() {
        return workers;
    }
    public void setWorkers(int workers) {
        this.workers = workers;
    }
    public int getEquipment() {
        return equipment;
    }
    public void setEquipment(int equipment) {
        this.equipment = equipment;
    }
    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }

}
