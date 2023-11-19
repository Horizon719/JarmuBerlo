
package modell;

/**
 *
 * @author peti.dominik
 */
public abstract class Jarmu {
    private String rendszam;
    private double uzemanyagszint;
    
    public Jarmu(String rendszam) {
        this.setRendszam(rendszam);
        this.setUzemanyagszint(100.0);
    }

    public String getRendszam() {
        return rendszam;
    }

    public double getUzemanyagszint() {
        return uzemanyagszint;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public void setUzemanyagszint(double uzemanyagszint) {
        this.uzemanyagszint = uzemanyagszint;
    }

    @Override
    public String toString() {
        return "Jarmu{" + "rendszam=" + rendszam + ", uzemanyagszint=" + uzemanyagszint + '}';
    }
    
    public abstract void altalanosBerles();
    public abstract void premiumBerles();
}
