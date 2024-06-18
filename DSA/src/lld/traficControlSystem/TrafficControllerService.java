package lld.traficControlSystem;

import java.util.ArrayList;
import java.util.List;

public  class TrafficControllerService {
    public List<TrafficSignal> trafficSignals=new ArrayList<>();
    public TrafficControllerInstance trafficControllerInstance;

    public  DirectionInterface directionInterface;

    public TrafficControllerService(){
        this.trafficControllerInstance=new TrafficControllerInstance();
    }

    public void addTrafficSignal(List<TrafficSignal> trafficSignals){
        trafficControllerInstance.setTrafficSignals(trafficSignals);

    }

    private List<TrafficSignal> getTrafficSignals(){
        return trafficControllerInstance.getTrafficSignals();
    }

    public void start() throws InterruptedException {
            List<TrafficSignal> trafficSignals=trafficControllerInstance.getTrafficSignals();
            for(TrafficSignal trafficSignal:trafficSignals){
                if(trafficSignal.getCurrentSignalState().equals(Signal.GREEN)) {
                    Thread.sleep(trafficSignal.getDurationToChangeState());
                    changeSignalState(Signal.RED, Signal.YELLOW);
                    Thread.sleep(1000);
                    changeSignalState(Signal.GREEN, Signal.RED);
                    changeSignalState(Signal.YELLOW, Signal.GREEN);
                }
        }
    }

    public void changeSignalState(Signal Currentsignal,Signal TransitionSignal) throws InterruptedException {
        List<TrafficSignal> trafficSignals=trafficControllerInstance.getTrafficSignals();
        for(TrafficSignal trafficSignal:trafficSignals){
            if(trafficSignal.getCurrentSignalState().equals(Currentsignal)){
                trafficSignal.setCurrentSignalState(TransitionSignal);
               directionInterface = DirectionInterfaceFactory.getDirection(trafficSignal.getId());
               directionInterface.notifySignal(trafficSignal);
            }
        }
        trafficControllerInstance.setTrafficSignals(trafficSignals);

    }

}
