import java.util.Objects;

public class Constructor extends User {
    //properties
    private String charge;
    private String whatToBuild;

    public String getCharge() {
        return charge;
    }

    //constructor
    public Constructor(String name, String lastname, int id, String charge, String whatToBuild) {
        super(name, lastname, id);
        this.charge = charge;
        this.whatToBuild = whatToBuild;

    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public String getWhatToBuild() {
        return whatToBuild;
    }

    public void setWhatToBuild(String whatToBuild) {
        this.whatToBuild = whatToBuild;
    }

    //methods
    public void startConstruccion(String whatToBuild) {
        System.out.println("The construccion of the " + whatToBuild + " has started");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Constructor)) return false;
        Constructor that = (Constructor) o;
        return getCharge().equals(that.getCharge());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCharge());
    }

    @Override
    public String toString() {
        return "Constructor{" +
                "charge='" + charge + '\'' +
                ", name=" + getName() +
                '}';
    }
}
