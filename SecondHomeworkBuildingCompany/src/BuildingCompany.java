import java.util.Scanner;

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
    public int calculateEstimatedTime(int floors, int material) {
        int estimatedTime = 0;
        // 1 = metal
        // 2 = wood
        //3 = bricks

        if (floors >= 10 && material == 1) {
            estimatedTime = 400;
        } else if (floors < 10 && material == 2) {
            estimatedTime = 150;
        } else if (floors < 10 && material == 3)
            estimatedTime = 250;

        return estimatedTime;

    }

    public int calculateEstimatedCost(int estimatedTime) {

        int cost = 0;
        if (estimatedTime > 365) {
            cost = 50000000;
        } else if (estimatedTime <= 365) {
            cost = 25000000;
        } else if (estimatedTime <= 250) {
            cost = 1500000;
        }
        return cost;

    }

    public int returnClientBuildingTime(String clientBuilding) {
        Scanner sc = new Scanner(System.in);

        boolean stop = false;
        int estimatedTime = 0;
        BuildingCompany company = new BuildingCompany("", "", 0);

        while (!stop) {
            System.out.println("Please enter how many floors do you need in your " + clientBuilding);
            int floors = sc.nextInt();

            System.out.println("Please enter 1 number from the materials that are in the list \n1.metal \n2.wood \n3.Bricks : ");
            int material = sc.nextInt();

            estimatedTime = company.calculateEstimatedTime(floors, material);

            System.out.println("The estimated time for the building you are needing is " + estimatedTime + " days");

            stop = true;

        }

        return estimatedTime;
    }

    public int returnClientBuildCost(int estimatedTime) {
        Scanner sc = new Scanner(System.in);

        boolean stop = false;
        int estimatedCost = 0;

        BuildingCompany company = new BuildingCompany("", "", 0);

        estimatedCost = company.calculateEstimatedCost(estimatedTime);

        System.out.println("The estimated cost for the building you are asking is: $ " + estimatedCost + "");

        return estimatedCost;

    }
}
