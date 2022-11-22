public class BuildingOrder {
    //properties
    private String person_in_charge;
    private int id;
    private String type_of_building;
    private String owner;

    //getters and setters

    public void setPerson_in_charge(String Person_in_charge) {
        this.person_in_charge = Person_in_charge;
    }

    public String getPerson_in_charge() {
        return this.person_in_charge;
    }

    public void setId(int Id) {
        this.id = Id;
    }

    public int getId() {
        return this.id;
    }

    public void setOwner(String Owner) {
        this.owner = Owner;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setType_of_building(String Type_of_building) {
        this.type_of_building = Type_of_building;
    }

    public String getType_of_building() {
        return this.type_of_building;
    }

    //constructor with a type_of_building_argument
    public BuildingOrder(String type_of_building) {
        this.type_of_building = type_of_building;
    }

    //methods
}
