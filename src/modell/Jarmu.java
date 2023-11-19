package modell;

public abstract class Jarmu {
    private String jarmuSzam;
    private boolean amortizalt;
    
    public Jarmu(String jarmuSzam) {
        this.jarmuSzam = jarmuSzam;
        amortizalt = false;
    }

    public String getJarmuSzam() {
        return jarmuSzam;
    }

    public void setJarmuSzam(String jarmuSzam) {
        this.jarmuSzam = jarmuSzam;
    }
    
    public boolean isAmortizalt() {
        return amortizalt;
    }

    public void setAmortizalt(boolean amortizalt) {
        this.amortizalt = amortizalt;
    }

    @Override
    public String toString() {
        return "Jarmu{" + "jarmuSzam=" + jarmuSzam + ", amortizalt=" + amortizalt + '}';
    }
    
    public abstract void altalanosBerlesHatasa();
    public abstract void premiumBerlesHatasa();
}
