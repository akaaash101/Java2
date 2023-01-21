package week_2;

public class Course {
    // data fields
    private int id;
    private String name;

    // constructors
    public Course() {
    }

    public Course(int id, String name) {
        this.id = id;
        this.name = name;
    }// getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String st = "------------------------\n";
        st += "ID: " + this.id + "\n";
        st += "Name: " + this.name + "\n";
        st += "------------------------\n";
        return st;
    }

}
