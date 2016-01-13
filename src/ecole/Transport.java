package ecole;
public abstract class Transport {
    

    final int AGE_MIN = 5;
    protected int age;
    protected int nbEnfant;
    protected int nbAdultes;

    public Transport( int age, int nbEnfant, int nbAdultes ) {
        this.age = age;
        this.nbEnfant = nbEnfant;
        setNbAdultes( nbAdultes );
    }

    public void setNbAdultes( int nbAdultes ) {
        this.nbAdultes = nbAdultes + 1;
    }

    public int getAge() {
        return age;
    }

    public int getNbEnfant() {
        return nbEnfant;
    }

    public int getNbAdultes() {
        return nbAdultes;
    }

    public abstract double getPrixTransport();

}
