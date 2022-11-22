import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type_of_building = null;

        System.out.println("Hi Client! Please register!");
        String clientName = sc.nextLine();
        String clientLastname = sc.nextLine();
        int clientId = sc.nextInt();


        Client client = new Client(clientName, clientLastname, clientId);
        System.out.println("We are pleased to meet you! \n" + client.getName() + "\n" + client.getLastname() + "\n" + client.getId());

        //Constructor constructor = new Constructor();
        while (type_of_building == null) {
            System.out.println("Which Building do you want us to build? \n 1.hospital \n 2.hotel \n 3.office \n 4.shopping \n :");
            type_of_building = sc.nextLine();
        }


        if (type_of_building == "hotel" || type_of_building == "hospital" || type_of_building == "office" || type_of_building == "shopping") {
            System.out.println("You selected " + type_of_building);
        }


    }
}