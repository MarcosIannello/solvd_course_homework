public class Hospital extends Building {
    private int capacity;

    //constructor
    public Hospital(Boolean status, int floors, String material, String address, String owner, float estimatedTime, float cost, int capacity) {
        super(status, floors, material, address, owner, estimatedTime, cost);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
