package WeekTwo.WorkshopTwo;

public class AutomobileTest {

    public static void main(String[] args) {
        Automobile ford = new Automobile("Ford", "Mustang");
        System.out.println("Make: " + ford.getMake());

        System.out.println("Model: " + ford.getModel() + "\n");

        System.out.println("Initial power on: " + ford.isPower());
        ford.setPower();
        System.out.println("Power status: " + ford.isPower() + "\n");

        System.out.println("Starting gear: " + ford.getGear());
        ford.setGear('D');
        System.out.println("Next gear: " + ford.getGear());
        ford.setGear('R');
        System.out.println("Last gear: " + ford.getGear() + "\n");

        System.out.println("Starting volume level: " + ford.getVolume());
        ford.increaseVolume();
        System.out.println("Volume level after one increase: " + ford.getVolume());
        ford.decreaseVolume();
        System.out.println("Volume level after one decrease: " + ford.getVolume());

        System.out.println("\n/---------------------------------------- \n");

        Automobile dodge = new Automobile("Dodge", "Challenger");
        System.out.println("Make: " + dodge.getMake());

        System.out.println("Model: " + dodge.getModel() + "\n");

        System.out.println("Initial power on: " + dodge.isPower());
        dodge.setPower();
        System.out.println("Power status: " + dodge.isPower() + "\n");

        System.out.println("Starting gear: " + dodge.getGear());
        dodge.setGear('D');
        System.out.println("Next gear: " + dodge.getGear());
        dodge.setGear('R');
        System.out.println("Last gear: " + dodge.getGear() + "\n");

        System.out.println("Starting volume level: " + dodge.getVolume());
        dodge.increaseVolume();
        dodge.increaseVolume();
        System.out.println("Volume level after two increases: " + dodge.getVolume());
        dodge.decreaseVolume();
        System.out.println("Volume level after one decrease: " + dodge.getVolume());
    }

}
