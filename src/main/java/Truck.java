public class Truck extends Vehicle{

    protected boolean trailerHitch;
    public Truck(String manufacturer, String model, int cargoCapacity, int modelYear, boolean trailerHitch) throws IllegalArgumentException {
        super(manufacturer, model, cargoCapacity, modelYear);
        this.trailerHitch = trailerHitch;
    }

    public void setTrailerHitch(boolean trailerHitch) {
        this.trailerHitch = trailerHitch;
    }

    public boolean hasTrailerHitch() {
        return trailerHitch;
    }

}
