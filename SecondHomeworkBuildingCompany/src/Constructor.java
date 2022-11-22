public class Constructor extends User {
    //properties
    private String charge;
    private String what_to_build;

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public String getCharge() {
        return this.charge;
    }

    public void setWhat_to_build(String type) {
        this.what_to_build = type;
    }

    public String getWhat_to_build() {
        return this.what_to_build;
    }

    //constructor
    public Constructor() {

    }

    //methods
    public Hotel create_new_hotel() {
        Hotel hotel = new Hotel();
        return hotel;
    }

    public Office create_new_office() {
        Office office = new Office();
        return office;
    }

    public Shopping create_new_shopping() {
        Shopping shopping = new Shopping();
        return shopping;
    }

    public Hospital create_new_hospital() {
        Hospital hospital = new Hospital();
        return hospital;
    }


}
