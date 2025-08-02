package transportation;

public class Program {

    public static void main(String[] args) {
//        Plane plane1 = new Plane("plane", );
//        plane1.setTopSpeed(350);
//        System.out.println(plane1.getType() + " " + plane1.getTopSpeed() + "\n" + plane1.flight());
//
//        Vehicle car1 = new Vehicle("car", true, 5, true);
//        System.out.println(car1.isHasWheels());

        Vehicle boat1 = new Vehicle("boat", true, 10, false);
        System.out.println(boat1.canRoll() + "\n" + boat1.privatelyOwned());

        Vehicle boat2 = new Vehicle("boat", 225);
        System.out.println(boat1.canRoll() + "\n" + boat1.privatelyOwned());

    }

}
