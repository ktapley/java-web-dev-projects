package transportation;

public class Program {

    public static void main(String[] args) {
        Plane plane1 = new Plane("plane");
        plane1.setTopSpeed(350);
        System.out.println(plane1.getType() + " " + plane1.getTopSpeed() + "\n" + plane1.flight());

        Vehicle car1 = new Vehicle("car");
        System.out.println(car1);

        Vehicle boat1 = new Vehicle("boat", true, 10, false);
        System.out.println(boat1.canRoll() + "\n" + boat1.privatelyOwned(10));

        Vehicle boat2 = new Vehicle("boat");
        System.out.println(boat2.canRoll() + "\n" + boat2.privatelyOwned(225));

        Boat boat3 = new Boat("boat", "fast", "red");
        System.out.println(boat3.noise());

        Plane plane2 = new Plane("plane");
        System.out.println(plane2.flight());


    }

}
