package Factories;

import Models.TrapRoom;

public class TrapRoomCreator extends RoomCreator {
    @Override
    public TrapRoom buildRoom() {
        var representation = createWalls("__...._____...____");
        return new TrapRoom(3.0,representation, calculateTrapDamage());
    }

    private int calculateTrapDamage(){
        // stub method
        return 4;
    }
}
