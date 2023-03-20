import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cравнение BMX рам WeThePeople");
        Frames f1 = new Frames("DOOMSAYER", 20.5, 12.9, 76.25, 9, "Matt White");
        Frames f2 = new Frames("PATHFINDER", 20.5, 12.7, 76, 9.666, "Translucent lilac");
        Frames f3 = new Frames("CHAOS MACHINE", 21, 14, 74.25, 9.5, "Black");
        Frames f4 = new Frames("BUCK", 20.75, 13, 75.5, 9.15, "Translucent Green");
        Frames f5 = new Frames("NETWORK", 20.8, 12.5, 75.75, 9.15, "Matt Red");

        TreeSet framesList = new TreeSet<>();
        framesList.add(f1);
        framesList.add(f2);
        framesList.add(f3);
        framesList.add(f4);
        framesList.add(f5);

        System.out.println(framesList);

    }
}