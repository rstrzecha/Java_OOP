package task6House;

import java.util.ArrayList;
import java.util.List;

public class House {

    private Door entranceDoor = new Door();         //to jest właśnie utworzenie automatyczne drzwi
    private List<Room> rooms;

    public House(List<Room> rooms) {        //konstruujemy dom z listą pokoji
        this.rooms = rooms;
    }

    public void cleanUp() {
        for (Room room: rooms) {
            room.cleanUp();
        }
    }

    @Override
    public String toString() {
        return "House{" +
                "entranceDoor=" + entranceDoor +
                ", rooms=" + rooms +
                '}';
    }
}
