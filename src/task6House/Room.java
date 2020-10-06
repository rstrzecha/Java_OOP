package task6House;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private Bed bed = new Bed();
    List<Window> windows = new ArrayList<>();

    public Room(int windowsCount) {         //metoda dodająca/tworząca okna na podstawie podanej ilości
        for (int i = 0; i < windowsCount; i++) {
            Window window = new Window();
            windows.add(window);
        }
    }

    public void cleanUp() {
        bed.make();
        for (Window window: windows) {
            window.open();
        }
    }

    @Override
    public String toString() {
        return "Room{" +
                "bed=" + bed +
                ", windows=" + windows +
                '}';
    }
}
