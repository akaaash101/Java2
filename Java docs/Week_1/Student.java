package Week_1;

public class Student {
    String name;
    int ID;
    int numofstudents;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public int getNumofstudents() {
        return numofstudents;
    }

    public void setNumofstudents(int numofstudents) {
        this.numofstudents = numofstudents;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", ID=" + ID + ", numofstudents=" + numofstudents + "]";
    }

}