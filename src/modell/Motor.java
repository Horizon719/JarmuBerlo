
package modell;

public class Motor extends Jarmu{
    private double kerekvastagsag;

    public Motor(String rendszam) {
        this(rendszam, 100);
    }
    
    public Motor(String rendszam, double kerekvastagsag) {
        super(rendszam);
        this.setKerekvastagsag(kerekvastagsag);
    }

    public double getKerekvastagsag() {
        return kerekvastagsag;
    }

    public void setKerekvastagsag(double kerekvastagsag) {
        this.kerekvastagsag = kerekvastagsag;
    }

    @Override
    public void altalanosBerles() {
        this.setUzemanyagszint(this.getUzemanyagszint() - 5);
        this.setKerekvastagsag(this.getKerekvastagsag() * 0.90);
    }

    @Override
    public void premiumBerles() {
        this.setUzemanyagszint(this.getUzemanyagszint() - 3.3);
        this.setKerekvastagsag(this.getKerekvastagsag() * 0.95);
    }

    @Override
    public String toString() {
        return super.toString() + System.lineSeparator() + "\tMotor{" + "kerekvastagsag=" + kerekvastagsag + '}';
    }
    
    
    
}
