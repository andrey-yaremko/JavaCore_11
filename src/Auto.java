public class Auto {

    private int horsePower;
    private int manufactureYear;
    private SteeringWheel steeringWheel;
    private Engine engine;

    public int getHorsePower() {
        return horsePower;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public Auto(int horsePower, int manufactureYear, SteeringWheel steeringwheel, Engine engine) {
        super();
        this.horsePower = horsePower;
        this.manufactureYear = manufactureYear;
        this.steeringWheel = steeringwheel;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Auto [horsePower=" + horsePower + ", manufactureYear=" + manufactureYear + ", steeringwheel="
                + steeringWheel + ", engine=" + engine + "]";
    }
}
