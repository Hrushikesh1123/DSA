package lld.traficControlSystem;

public abstract class DirectionInterfaceFactory {

    private DirectionInterface directionInterface;

    public static DirectionInterface getDirection(String direction){
        if(direction.equals("NORTH") || direction.equals("SOUTH")){
            return new NorthSouthDirection();
        }
        else{
            return new EastWestDirection();
        }

    }

}
