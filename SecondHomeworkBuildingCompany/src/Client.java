import java.util.Objects;

public class Client extends User {
    //properties
    private float budget;
    private String whatIWant;

    private String name;

    private String lastname;

    private int id;

    //client constructor
    public Client(String name, String lastname, int id, float budget, String whatIWant) {
        super(name, lastname, id);
        this.budget = budget;
        this.whatIWant = whatIWant;
    }

    //setters and getters


    public float getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }

    public String getWhatIWant() {
        return whatIWant;
    }

    public void setWhatIWant(String whatIWant) {
        this.whatIWant = whatIWant;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getLastname() {
        return lastname;
    }

    @Override
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    //method
//    public String buildingNeeds(int floors,String material){
//
//    }
    public Boolean acceptsOffer() {
        return true;
    }

    public Boolean declinesOffer() {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return getId() == client.getId() && getName().equals(client.getName()) && getLastname().equals(client.getLastname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLastname(), getId());
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", id=" + id +
                '}';
    }
}
