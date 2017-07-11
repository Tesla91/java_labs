package part_06;

/**
 * Created by nicola on 7/11/17.
 */
public class MainClass extends Drainage {
    public static void main(String[] args) {
        Jobs jobsobj = new Jobs();
        Bunkers bunksobj = new Bunkers();
        Drainage drainsobj = new Drainage();

        Jobs supRef;

        supRef = jobsobj;
        supRef.show();

        supRef = bunksobj;
        supRef.show();

        supRef = drainsobj;
        supRef.show();

        System.out.println();

        Bunkers bunks = new Bunkers(1,3,2,10,3.5);
        Drainage drains = new Drainage(2,14,1,20, 1.2, 6.7, 19.5);

        System.out.println("Bunkers Foreman " + bunks.getForeman());
        System.out.println("Bunkers Workers " + bunks.getWorkers());
        System.out.println("Bunkers Equipment " + bunks.getEquipment());
        System.out.println("Bunkers Hours " + bunks.getHours());
        System.out.println("Bunkers Sand " + bunks.getSand());

        System.out.println();

        System.out.println("Drainage Foreman " + drains.getForeman());
        System.out.println("Drainage Workers " + drains.getWorkers());
        System.out.println("Drainage Equipment " + drains.getEquipment());
        System.out.println("Drainage Hours " + drains.getHours());
        System.out.println("Drainage Sand " + drains.getSand());
        System.out.println("Drainage Baserock " + drains.getBaserock());
        System.out.println("Drainage Pipe " + drains.getPipe());



    }
}
