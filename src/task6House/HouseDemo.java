package task6House;

import java.util.ArrayList;
import java.util.List;

public class HouseDemo {

    public static void main(String[] args) {

        Room room = new Room(2);
        Room room2 = new Room(4);
        List<Room> rooms = new ArrayList<>();
        rooms.add(room);
        rooms.add(room2);
        House house = new House(rooms);     //tworzymy dom
        System.out.println(house);
        house.cleanUp();
        System.out.println(house);

    }


}
