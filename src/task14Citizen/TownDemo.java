package task14Citizen;

import java.util.ArrayList;
import java.util.List;

public class TownDemo {
    public static void main(String[] args) {

        List<Citizen> myCitizens = new ArrayList<>();

        Peasant villager1 = new Peasant("Frodo");
        Peasant villager2 = new Peasant("Samwise");
        myCitizens.add(villager1);
        myCitizens.add(villager2);

        Townsman townsman1 = new Townsman("Boromir");
        Townsman townsman2 = new Townsman("Galandriela");
        myCitizens.add(townsman1);
        myCitizens.add(townsman2);

        King theKing = new King("Aragorn");
        myCitizens.add(theKing);

        Soldier soldier1 = new Soldier("Gimli");
        Soldier soldier2 = new Soldier("Legolas");
        Soldier soldier3 = new Soldier("Faramir");
        myCitizens.add(soldier1);
        myCitizens.add(soldier2);
        myCitizens.add(soldier3);

        Town wygwizdowo = new Town("Gondor", myCitizens);

        System.out.printf("\nWykaz mieszkańców miasta %s (Ogółem %d):%n",
                wygwizdowo.getName(), wygwizdowo.calculatePopulation());
        wygwizdowo.listCitizens();

        System.out.printf("\nWykaz mieszkańców miasta %s posiadających prawo do głosowania (Ogółem %d):%n",
                wygwizdowo.getName(), wygwizdowo.howManyCanVote());
        wygwizdowo.whoCanVote();
    }
}
