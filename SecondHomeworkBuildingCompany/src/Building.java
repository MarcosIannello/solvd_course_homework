import java.util.Objects;

public abstract class Building {

    private boolean status;
    private int floors;
    private String material;
    private String address;
    private String owner;
    private float estimatedTime;
    private float cost;

    //constructor

    public Building(Boolean status, int floors, String material, String address, String owner, float estimatedTime, float cost) {
        this.status = status;
        this.floors = floors;
        this.material = material;
        this.address = address;
        this.owner = owner;
        this.estimatedTime = estimatedTime;
        this.cost = cost;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = Boolean.parseBoolean(status);
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public float getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(float estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Building)) return false;
        Building building = (Building) o;
        return getFloors() == building.getFloors() && getMaterial().equals(building.getMaterial());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFloors(), getMaterial());
    }

    @Override
    public String toString() {
        return "Building{" +
                "floors=" + floors +
                ", material='" + material + '\'' +
                ", address='" + address + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}

