package oops2.accessmodifier;

public class VehicleExample {
    //NA - 0
    int gears; // default
    public int seats;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private String model = "dfrgf";
    protected String brand;

    private  void printHi(){
        System.out.println("sdfc");
    }
    public void print() {
        System.out.println(gears + " " + seats + " " + model + " " + brand);
    }

    //how to modify or read
}