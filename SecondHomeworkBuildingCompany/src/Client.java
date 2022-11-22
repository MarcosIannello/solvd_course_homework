public class Client extends User {
    //properties
    private float budget;
    private String what_i_want;

    private String name;

    private String lastname;

    private int id;

    //setters and getters

    public void setBudget(int value) {
        this.budget = value;
    }

    public float getBudget() {
        return this.budget;
    }

    public void setWhat_i_want(String type_of_building) {
        this.what_i_want = type_of_building;
    }

    public String getWhat_i_want() {
        return this.what_i_want;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getName() {
        return this.name;
    }

    public void setLastname(String Lastname) {
        this.lastname = Lastname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setId(int Id) {
        this.id = Id;
    }

    public int getId() {
        return this.id;
    }

    //client constructor
    public Client(String Name, String Lastname, int Id) {
        this.name = Name;
        this.lastname = Lastname;
        this.id = Id;
    }

    //method
    public BuildingOrder create_building_order(String type_of_building) {
        BuildingOrder order = new BuildingOrder(type_of_building);
        return order;
    }
}
