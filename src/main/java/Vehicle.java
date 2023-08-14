public class Vehicle implements VehicleStorage {
    private String manufacturer;
    private String model;
    private int cargoCapacity;
    private int modelYear;


    public Vehicle(String manufacturer, String model, int cargoCapacity, int modelYear) throws IllegalArgumentException {
        this.manufacturer = manufacturer;
        this.model = model;
        this.cargoCapacity = cargoCapacity;
        this.modelYear = modelYear;
        if (manufacturer == null || model == null || (cargoCapacity == 0 || modelYear == 0)) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String storeStuff(String stuff) {
        return String.format("The %s %s can store a %s %d units of %s.", this.manufacturer, this.model, adjective(), cargoCapacity,stuff);
    }
    protected String adjective(){
        if(cargoCapacity > 20){
            return "whopping";
        } else{
            return "measly";
        }
    }



    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public int getModelYear() {
        return modelYear;
    }
}
