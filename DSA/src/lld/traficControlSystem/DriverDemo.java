package lld.traficControlSystem;

import java.util.ArrayList;
import java.util.List;

public class DriverDemo {
    public static void main(String[] args) throws InterruptedException {
        TrafficControllerInstance trafficControllerInstance=new TrafficControllerInstance();
        List<TrafficSignal>signals=new ArrayList<>();
                signals.add(new TrafficSignal("NORTH","ROAD1",Signal.GREEN,2000,Pedestrian.DO_NOT_WALK));
        signals.add(new TrafficSignal("SOUTH","ROAD2",Signal.GREEN,2000,Pedestrian.DO_NOT_WALK));
        signals.add(new TrafficSignal("EAST","ROAD3",Signal.RED,2000,Pedestrian.WALK));
        signals.add(new TrafficSignal("WEST","ROAD3",Signal.RED,2000,Pedestrian.WALK));
        trafficControllerInstance.setTrafficSignals(signals);
        TrafficControllerService trafficControllerService=new TrafficControllerService() ;
        trafficControllerService.start();
    }
}
