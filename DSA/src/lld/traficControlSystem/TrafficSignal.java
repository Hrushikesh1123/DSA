package lld.traficControlSystem;

public class TrafficSignal {
    private String id;
    private String road;
    private Signal currentSignalState;

    private long durationToChangeState;
    private Pedestrian currentPedestrianState;

    public TrafficSignal(String id, String road, Signal currentSignalState, long durationToChangeState, Pedestrian currentPedestrianState) {
        this.id = id;
        this.road = road;
        this.currentSignalState = currentSignalState;
        this.durationToChangeState = durationToChangeState;
        this.currentPedestrianState = currentPedestrianState;
    }

    public long getDurationToChangeState() {
        return durationToChangeState;
    }

    public void setDurationToChangeState(long durationToChangeState) {
        this.durationToChangeState = durationToChangeState;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public Signal getCurrentSignalState() {
        return currentSignalState;
    }

    public void setCurrentSignalState(Signal currentSignalState) {
        this.currentSignalState = currentSignalState;
    }

    public Pedestrian getCurrentPedestrianState() {
        return currentPedestrianState;
    }

    public void setCurrentPedestrianState(Pedestrian currentPedestrianState) {
        this.currentPedestrianState = currentPedestrianState;
    }

    @Override
    public String toString() {
        return "TrafficSignal{" +
                "id='" + id + '\'' +
                ", road='" + road + '\'' +
                ", currentSignalState=" + currentSignalState +
                ", durationToChangeState=" + durationToChangeState +
                ", currentPedestrianState=" + currentPedestrianState +
                '}';
    }
}
