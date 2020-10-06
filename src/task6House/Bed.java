package task6House;

public class Bed {

    private boolean madeUp = false;

    public boolean isMadeUp() {
        return madeUp;
    }

    public void make() {
        madeUp = true;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "madeUp=" + madeUp +
                '}';
    }
}
