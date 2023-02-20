package ie.atu.productv5;

public class TV extends Printable {

    private String screen;  //version
    private String manufacturer;   //code

    public TV() {
        super();
        screen = "";
        manufacturer = "";
        count++;
    }
    public void setScreen(String version) {
        this.screen = screen;
    }
    public String getScreen() {
        return screen;
    }

    public void setManufacturer(String code) {
        this.manufacturer = manufacturer;
    }
    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + screen;
    }
}