package lld.traficControlSystem;

public class EastWestDirection implements DirectionInterface{

    @Override
    public void notifySignal(TrafficSignal trafficSignal) {
        System.out.println("TrafficSignal{" +
                "id='" + trafficSignal.getId() + '\'' +
                ", road='" + trafficSignal.getRoad() + '\'' +
                ", currentSignalState=" + trafficSignal.getCurrentSignalState() +
                ", durationToChangeState=" + trafficSignal.getDurationToChangeState() +
                ", currentPedestrianState=" + trafficSignal.getCurrentPedestrianState() +
                '}');


    }


}
