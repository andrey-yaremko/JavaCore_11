public class SteeringWheel {

    public int getWheelsSize() {
        return wheelsSize;
    }

    public void setWheelsSize(int wheelsSize) {
        this.wheelsSize = wheelsSize;
    }

    public String getSteeringWheelMaterial() {
        return SteeringWheelMaterial;
    }

    public void setSteeringWheelMaterial(String steeringWheelMaterial) {
        SteeringWheelMaterial = steeringWheelMaterial;
    }

    private int wheelsSize;
    private String SteeringWheelMaterial = "alcantara";

    public SteeringWheel(int wheelsSize, String steeringWheelMaterial) {
        this.wheelsSize = wheelsSize;
        this.SteeringWheelMaterial = steeringWheelMaterial;
    }

    @Override
    public String toString() {
        return "SteeringWheel [wheelsSize=" + wheelsSize + ", SteeringWheelMaterial=" + SteeringWheelMaterial + "]";
    }
}
