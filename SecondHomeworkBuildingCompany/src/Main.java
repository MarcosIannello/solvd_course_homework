public class Main {
    public static void main(String[] args) {

        Client client1 = new Client("marcos", "iannello", 1, 35500350, "office");
        String clientBuilding = client1.getWhatIWant();
        Constructor constructor1 = new Constructor("peter", "sosa", 0, "chief", clientBuilding);

        String constructor1Name = constructor1.getName();
        String client1Name = client1.getName();

        BuildingCompany company = new BuildingCompany(constructor1Name, client1Name, 0);

        String clientsNeed = client1.getWhatIWant();
        int estimatedTime = company.returnClientBuildingTime(clientsNeed);
        company.returnClientBuildCost(estimatedTime);

    }
}