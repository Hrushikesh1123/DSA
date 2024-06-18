package lld.traficControlSystem;

import java.util.ArrayList;
import java.util.List;

public class TrafficControllerInstance {
    private static  TrafficControllerInstance trafficControllerInstance=null;

    public static List<TrafficSignal> trafficSignals=new ArrayList<>();


    public TrafficControllerInstance() {
    }

    public static synchronized TrafficControllerInstance getTrafficControllerInstance() {
        if (trafficControllerInstance == null) {
            trafficControllerInstance = new TrafficControllerInstance();
        }
        return trafficControllerInstance;


    }
    public void  setTrafficSignals(List<TrafficSignal> trafficSignals){
        this.trafficSignals=trafficSignals;
    }

    public List<TrafficSignal> getTrafficSignals(){
        return trafficSignals;
    }
}
