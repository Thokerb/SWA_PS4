package Factories;

import Models.Room;

public abstract class RoomCreator {

    protected String createWalls(String room){
        return "||_"+room+"_||";
    }
    public abstract Room buildRoom();
}
