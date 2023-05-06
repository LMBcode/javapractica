class Personatge {
    private String nom;
    private int PS;
    private int PA;
    private int PD;
    private int PEX;

    public Personatge(String nom, int PS, int PA, int PD, int PEX) {
        this.nom = nom;
        this.PS = PS;
        this.PA = PA;
        this.PD = PD;
        this.PEX = PEX;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public int getPS() {
        return PS;
    }

    public int getPA() {
        return PA;
    }

    public int getPD() {
        return PD;
    }

    public int getPEX() {
        return PEX;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPS(int PS) {
        this.PS = PS;
    }

    public void setPA(int PA) {
        this.PA = PA;
    }

    public void setPD(int PD) {
        this.PD = PD;
    }

    public void setPEX(int PEX) {
        this.PEX = PEX;
    }
}
