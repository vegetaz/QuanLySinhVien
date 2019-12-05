package studentmanagement20191205;

public class Student {
    private String id;
    private String name;
    private int old;
    private float gpa;

    public Student() {
    }

    public Student(String id, String name, int old, float gpa) {
        this.id = id;
        this.name = name;
        this.old = old;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("%-12s%-15s%-9s%-7s", id, name, old, gpa);
    }
}
