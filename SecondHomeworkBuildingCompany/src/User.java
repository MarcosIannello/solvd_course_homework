public abstract class User {
    private String name;
    private String lastname;
    private int id;

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
        return lastname;
    }

    public void setId(int Id) {
        this.id = Id;
    }

    public int getId() {
        return this.id;
    }
}
