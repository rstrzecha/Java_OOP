package task14Citizen;

public class King extends Citizen {
    public King(String name) {
        super(name);
    }

    public boolean canVote() {
        return false;
    }
}