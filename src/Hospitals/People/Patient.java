package Hospitals.People;

public class Patient extends Person{

    private String diagnoz;

    public Patient(String diagnoz) {
        this.diagnoz = diagnoz;
    }



    public Patient(String ima,int vozrast, String familia, String dataRogd, String email, String diagnoz) {
        super(ima, vozrast,familia, dataRogd, email);
        this.diagnoz = diagnoz;
    }
}
