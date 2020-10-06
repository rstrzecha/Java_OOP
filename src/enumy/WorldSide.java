package enumy;

public enum WorldSide {
    NORTH(0), EAST(90), SOUTH(180), WEST(270);

    private int degrees;

    WorldSide(int degrees) {        //konstruktor w Enumie nie może byc publiczny
        this.degrees = degrees;
    }

    public int getDegrees() {
        return degrees;
    }


}
