package Factories;

import Models.TreasureRoom;

public class TreasureRoomCreator extends RoomCreator {

    @Override
    public TreasureRoom buildRoom() {
        var representation = createWalls("______T_______");
        return new TreasureRoom(7.0,representation, calculateTreasureGold());
    }


    private int calculateTreasureGold(){
        // stub method
        return 50;
    }
}
