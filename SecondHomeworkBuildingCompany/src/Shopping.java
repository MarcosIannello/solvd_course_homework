public class Shopping extends Building {
    //properties
    private int numberOfLocals;

    //constructor
    public Shopping(boolean status, int floors, int numberOfLocals, String material, String address, String owner, float estimatedTime, float cost) {
        super(status, floors, material, address, owner, estimatedTime, cost);
        this.numberOfLocals = numberOfLocals;

    }

    //getters and setters
    public int getNumberOfLocals() {
        return numberOfLocals;
    }

    public void setNumberOfLocals(int numberOfLocals) {
        this.numberOfLocals = numberOfLocals;
    }
}
