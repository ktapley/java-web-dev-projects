public class HouseCat extends Cat {
    private String name;
    private String species = "Felis catus";

    public HouseCat(String aName, double aWeight) {
        super(aWeight);
        name = aName;
    }

    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }

    @Override //Doesn't NEED the override, but is helpful to still have/use
    public String noise() {
        return "Hello, my name is " + name + "!";
    }

    public String purr() {
        return "I'm a HouseCat";
    }
}