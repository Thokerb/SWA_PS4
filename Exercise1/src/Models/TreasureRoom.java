package Models;

public class TreasureRoom extends Room {


    private double lightLevel;
    private String representation;
    private int money;

    public TreasureRoom(double lightLevel, String representation, int money){

        this.lightLevel = lightLevel;
        this.representation = representation;
        this.money = money;
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
        System.out.println("You find a treasure in the room.\nYou get "+money+" gold.");
    }
}
