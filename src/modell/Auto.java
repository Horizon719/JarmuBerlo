
package modell;

public class Auto extends Jarmu{
    public static enum KAVICSFELVERODES {NAGYON_KARCOLT, KOZEPESEN_KARCOLT, ENYHEN_KARCOLT, SERULESMENTES};
    private KAVICSFELVERODES kavicsfelverodes;
    
    public Auto(String rendszam) {
        this(rendszam, KAVICSFELVERODES.SERULESMENTES);
    }
    
    public Auto(String rendszam, KAVICSFELVERODES kavicsfelverodes) {
        super(rendszam);
        this.kavicsfelverodes = kavicsfelverodes;
    }

    @Override
    public void altalanosBerles() {
        if(this.kavicsfelverodes.ordinal() > 0){
            this.kavicsfelverodes = KAVICSFELVERODES.values()[this.kavicsfelverodes.ordinal() - 1];
        }
        this.setUzemanyagszint(this.getUzemanyagszint() - 8);
    }

    @Override
    public void premiumBerles() {
        this.setUzemanyagszint(this.getUzemanyagszint() - 5.5);
    }

    @Override
    public String toString() {
        return super.toString() + System.lineSeparator() + "\tAuto{" + "kavicsfelverodes=" + kavicsfelverodes + '}';
    }
    
    
    
}
