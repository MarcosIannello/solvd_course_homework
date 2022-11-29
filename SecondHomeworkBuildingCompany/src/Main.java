import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int floors = 0;
        String material = "";
        Client client1 = new Client("marcos", "iannello", 1, 35500350, "office");
        String clientBuilding = client1.getWhatIWant();
        Constructor constructor1 = new Constructor("peter", "sosa", 0, "chief", clientBuilding);

        String constructor1Name = constructor1.getName();
        String client1Name = client1.getName();

        BuildingCompany company = new BuildingCompany(constructor1Name, client1Name, 0);

        String clientsNeed = client1.getWhatIWant();
        if (clientsNeed != null) {
            System.out.println("Please enter how many floors do you need");
            floors = sc.nextInt();
            System.out.println("Please enter 1 material from the list: \n 1.Wood \n2.Metal\n3.Bricks");
            material = sc.nextLine();
        }
        int estimatedTime = company.calculateEstimatedTime(floors, material);
        float estimatedCost = company.calculateEstimatedCost(estimatedTime);

        System.out.println("The estimated time for the building you are needing is " + estimatedTime);
        System.out.println("The estimated cost for the building you are needing is " + estimatedCost);

        if (estimatedCost > client1.getBudget()) {
            client1.declinesOffer();
            System.out.println("We are sorry to hear that you are not going to finish the building");
        } else {
            client1.acceptsOffer();
            System.out.println("We are happy to comunicate you that your building is starting");
            constructor1.startConstruccion(clientBuilding);
        }


//        String type_of_building = null;
//
//        System.out.println("Hi Client! Please register!");
//        String clientName = sc.nextLine();
//        String clientLastname = sc.nextLine();
//        int clientId = sc.nextInt();
//
//
//        Client client = new Client(clientName, clientLastname, clientId);
//        System.out.println("We are pleased to meet you! \n" + client.getName() + "\n" + client.getLastname() + "\n" + client.getId());
//
//        //Constructor constructor = new Constructor();
//        while (type_of_building == null) {
//            System.out.println("Which Building do you want us to build? \n 1.hospital \n 2.hotel \n 3.office \n 4.shopping \n :");
//            type_of_building = sc.nextLine();
//        }
//
//
//        if (type_of_building == "hotel" || type_of_building == "hospital" || type_of_building == "office" || type_of_building == "shopping") {
//            System.out.println("You selected " + type_of_building);
//        }


    }
}