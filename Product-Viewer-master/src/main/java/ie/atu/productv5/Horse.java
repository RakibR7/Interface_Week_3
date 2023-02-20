package ie.atu.productv5;

public class Horse extends Animal {
    private String Dam;
    private String Sire;
    private String Height;

    public Horse() {
        super();
        Dam = "";
        Sire = "";
        Height = "";
        //count++;
    }

    public String getDam() {
        return Dam;
    }

    public void setDam(String dam) {
        Dam = dam;
    }

    public String getSire() {
        return Sire;
    }

    public void setSire(String sire) {
        Sire = sire;
    }

    public String getHeight() {
        return Height;
    }

    public void setHeight(String height) {
        Height = height;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + Dam;
    }
}
