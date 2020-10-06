package task14Citizen;

import java.util.List;

public class Town {
    private String name;
    private List<Citizen> citizens;

    public Town(String name, List<Citizen> citizens) {
        this.name = name;
        this.citizens = citizens;
    }

    public String getName() {
        return name;
    }

    public int howManyCanVote() {
        int counterHowManyCanVote = 0;

        for (Citizen citizen: citizens) {
            if(citizen.canVote()) {
                counterHowManyCanVote++;
            }
        }
        return counterHowManyCanVote;
    }

    public void whoCanVote() {
        for (Citizen citizen: citizens) {
            if(citizen.canVote()) {
                System.out.println(citizen.getName());
            }
        }
    }

    public int calculatePopulation() {
        return citizens.size();
    }

    public void listCitizens() {
        for (Citizen citizen: citizens) {
            System.out.println(citizen.getName());
        }
    }
}