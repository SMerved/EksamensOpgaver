public class User {
    private String fornavn;
    private String efternavn;
    private String email;
    private Double telefonNummer;
    public User(String fornavn, String efternavn, String email, double telefonNummer){
        this.fornavn=fornavn;
        this.efternavn=efternavn;
        this.email=email;
        this.telefonNummer=telefonNummer;
    }
    public User(String fornavn, String efternavn, String email){
        this.fornavn=fornavn;
        this.efternavn=efternavn;
        this.email=email;
    }

    public boolean equals(User u){
        if (this==u){
            return true;
        }
        if (u == null){
            return false;
        }
        return u.getEmail().equals(this.getEmail());
    }
    public String toString(){
        return "Fornavn: "+fornavn+", Efternavn: "+efternavn+", Email: "+email+", Telefonnummer: "+telefonNummer;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public void setEfternavn(String efternavn) {
        this.efternavn = efternavn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getTelefonNummer() {
        return telefonNummer;
    }

    public void setTelefonNummer(Double telefonNummer) {
        this.telefonNummer = telefonNummer;
    }
}
