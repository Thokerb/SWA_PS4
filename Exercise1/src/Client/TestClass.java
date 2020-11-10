package Client;

import Factories.RoomCreator;
import Factories.TrapRoomCreator;
import Factories.TreasureRoomCreator;
import Models.Room;

public class TestClass {

    public static void main(String[] args) {

        RoomCreator trapRoomCreator = new TrapRoomCreator();
        RoomCreator treasureRoomCreator = new TreasureRoomCreator();

        Room trapRoom = trapRoomCreator.buildRoom();
        Room treasureRoom = treasureRoomCreator.buildRoom();

        trapRoom.interact();
        System.out.println("----------------------------------------");
        treasureRoom.interact();

    }
}
