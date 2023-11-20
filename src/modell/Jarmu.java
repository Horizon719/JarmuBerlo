package modell;

public abstract class Jarmu {
    private String jarmuSzam;
    private int uzemanyag;
    
    public Jarmu(String jarmuSzam) {
        this.jarmuSzam = jarmuSzam;
        uzemanyag = 1000;
    }

    public String getJarmuSzam() {
        return jarmuSzam;
    }

    public void setJarmuSzam(String jarmuSzam) {
        this.jarmuSzam = jarmuSzam;
    }
    
    public int getUzemanyag() {
        return uzemanyag;
    }

    public void setUzemanyag(int uzemanyag) {
        this.uzemanyag = uzemanyag;
    }

    @Override
    public String toString() {
        return "Jarmu{" + "jarmuSzam=" + jarmuSzam + ", uzemanyag=" + uzemanyag + '}';
    }
    
    public abstract void altalanosBerlesHatasa();
    public abstract void premiumBerlesHatasa();
}
