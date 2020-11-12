package Models;

public class TrapRoom extends Room{

    private double lightLevel;
    private String representation;
    private int damage;

    public TrapRoom(double lightLevel, String representation, int damage){

        this.lightLevel = lightLevel;
        this.representation = representation;
        this.damage = damage;
    }

    @Override
    public double getLightLevel() {
        return lightLevel;
    }

    @Override
    public String getRepresentation() {
        return representation;
    }

    @Override
    public void interact() {
        enterRoom();
        System.out.println("You triggered the trap of the Room.\nYou take "+damage+" damage.");
    }

}
