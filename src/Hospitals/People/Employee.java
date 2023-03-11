package Hospitals.People;

public class Employee extends Person {


    private String dolgnost;


    public Employee(String dolgnost) {
        this.dolgnost = dolgnost;
    }

    public Employee(String ima, String familia, String dataRogd,int vozrast, String email, String dolgnost) {
        super(ima,vozrast, familia, dataRogd, email);
        this.dolgnost = dolgnost;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
