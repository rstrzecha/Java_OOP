package enumy;

public class Demo {

    public static void main(String[] args) {
//        RoadSign roadSign = new RoadSign(1,2, WorldSideOldWay.NORTH);
//        RoadSign roadSign2 = new RoadSign(3,4, WorldSideOldWay.SOUTH);
//        int side = roadSign2.getWorldSide();
//
//        switch (side) {
//            case WorldSideOldWay.NORTH:
//                System.out.println("Robi się zimniej");
//                break;
//            case WorldSideOldWay.SOUTH:
//                System.out.println("Robi się cieplej");
//                break;
//        }

        RoadSign roadSign = new RoadSign(1,2, WorldSide.NORTH);
        RoadSign roadSign2 = new RoadSign(3,4, WorldSide.SOUTH);
        WorldSide side = roadSign2.getWorldSide();

        System.out.println(roadSign.getDegrees());

        switch (side) {
            case NORTH:
                System.out.println("Robi się zimniej idąc tą drogą");
                break;
            case EAST:
                break;
            case SOUTH:
                System.out.println("Robi się cieplej...");
                break;
            case WEST:
                break;
        }


    }
}
