public class StudentT {
    private int id;
    private String name;
    private double gpa;

    public StudentT(int id, String name) {
        this.id= id;
        this.name= name;
        this.gpa= 0.0;
    }
    public boolean qualifiesForScholarship() {
        return gpa >= 3.0;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa= gpa;
    }
    public String toString() {
        return name + " (" + id + ") " + gpa;
    }
}