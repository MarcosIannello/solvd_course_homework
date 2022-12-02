public class Hotel extends Building {
    //properties
    private int rooms;

    //constructor
    public Hotel(boolean status, int floors, int rooms, String material, String address, String owner, float estimatedTime, float cost) {
        super(status, floors, material, address, owner, estimatedTime, cost);
        this.rooms = rooms;
    }

    //methods

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
}
