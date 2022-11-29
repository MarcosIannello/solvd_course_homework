public class BuildingCompany {
    String constructors; //I will change it for a list in the future
    String clients; //I will change it for a list in the future
    int buildingsConstructed;

    //constructor
    public BuildingCompany(String constructors, String clients, int buildingsConstructed) {
        this.constructors = constructors;
        this.clients = clients;
        this.buildingsConstructed = buildingsConstructed;
    }

    public String getConstructors() {
        return constructors;
    }

    public void setConstructors(String constructors) {
        this.constructors = constructors;
    }

    public String getClients() {
        return clients;
    }

    public void setClients(String clients) {
        this.clients = clients;
    }

    public int getBuildingsConstructed() {
        return buildingsConstructed;
    }

    public void setBuildingsConstructed(int buildingsConstructed) {
        this.buildingsConstructed = buildingsConstructed;
    }

    //methods
    public int calculateEstimatedTime(int floors, String material) {
        int estimatedTime = 0;
        if (floors >= 10 && material == "metal") {
            estimatedTime = 400;
        } else if (floors < 10 && material == "wood") {
            estimatedTime = 150;
        } else if (floors < 10 && material == "bricks")
            estimatedTime = 250;

        return estimatedTime;

    }

    public float calculateEstimatedCost(int estimatedTime) {
        float cost = 0;
        if (estimatedTime > 365) {
            cost = 50000000;
        } else if (estimatedTime <= 365) {
            cost = 25000000;
        } else if (estimatedTime <= 250) {
            cost = 1500000;
        }
        return cost;

    }
}
