public class Office extends Building {
    private int offices;

    //constructor

    public Office(Boolean status, int floors, String material, String address, String owner, float estimatedTime, float cost, int offices) {
        super(status, floors, material, address, owner, estimatedTime, cost);
        this.offices = offices;
    }

    //getters and setters

    public int getOffices() {
        return offices;
    }

    public void setOffices(int offices) {
        this.offices = offices;
    }


}
