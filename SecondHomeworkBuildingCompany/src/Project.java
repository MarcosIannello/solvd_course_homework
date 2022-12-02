public class Project {
    //properties
    private String status;
    private String typeOfBuilding;
    private int id;

    //constructor
    public Project(String status, String typeOfBuilding, int id) {
        this.status = status;
        this.typeOfBuilding = typeOfBuilding;
        this.id = id;
    }

    //getters and setters


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTypeOfBuilding() {
        return typeOfBuilding;
    }

    public void setTypeOfBuilding(String typeOfBuilding) {
        this.typeOfBuilding = typeOfBuilding;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
