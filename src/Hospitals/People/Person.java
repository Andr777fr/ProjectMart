package Hospitals.People;

public class Person {

    private String ima;
    private String familia;
    private int vozrast;

    public int getVozrast() {
        return vozrast;
    }

    public void setVozrast(int vozrast) {
        this.vozrast = vozrast;
        if (vozrast>0){
            this.vozrast=vozrast;
        }
        else {
            System.out.println("Введите другое значение");
        }
    }

    private String dataRogd;
    private String email;

    public Person() {
    }

    public Person(String ima, int vozrast,String familia, String dataRogd, String email) {
        this.ima = ima;
        this.vozrast = vozrast;
        this.familia = familia;
        this.dataRogd = dataRogd;
        this.email = email;
    }

    public String getIma() {
        return ima;
    }

    public void setIma(String ima) {
        this.ima = ima;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getDataRogd() {
        return dataRogd;
    }

    public void setDataRogd(String dataRogd) {
        this.dataRogd = dataRogd;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ima='" + ima + '\'' +
                ", familia='" + familia + '\'' +
                ", dataRogd='" + dataRogd + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
