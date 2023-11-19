
package modell;

public class Motor extends Jarmu{
    private double kerekKopas;

    public Motor(double kerekKopas, String jarmuSzam) {
        super(jarmuSzam);
        this.kerekKopas = kerekKopas;
    }

    public double getKerekKopas() {
        return kerekKopas;
    }

    public void setKerekKopas(double kerekKopas) {
        this.kerekKopas = kerekKopas;
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + System.lineSeparator() + "\t"
                + "Motor{" + "kerekKopas=" + kerekKopas + '}';
    }
    
    @Override
    public void altalanosBerlesHatasa() {
        kerekKopas *= .97;
    }

    @Override
    public void premiumBerlesHatasa() {
        kerekKopas *= .985;
    }
}
