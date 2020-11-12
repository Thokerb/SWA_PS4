package Models;

public abstract class Room {

    abstract double getLightLevel();
    abstract String getRepresentation();
    public void enterRoom(){
        System.out.println("You enter a room with light level "+getLightLevel()+".\n Room: "+getRepresentation()+".");
    }
    public abstract void interact();
}
