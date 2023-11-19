
package modell;

public class Auto extends Jarmu{
    public enum Kavicsfelverodes {
        UJ, 
        KARC, 
        REPEDES, 
        TORES   
    }
    
    private Kavicsfelverodes kavics;

    public Auto(String jarmuSzam){
        this(Kavicsfelverodes.UJ, jarmuSzam);
    }
    
    public Auto(Kavicsfelverodes kavics, String jarmuSzam) {
        super(jarmuSzam);
        this.kavics = kavics;
    }
    
    public void felverodik(){
        kavics = switch (kavics) {
            case UJ -> Kavicsfelverodes.KARC;
            case KARC -> Kavicsfelverodes.REPEDES;
            case REPEDES -> Kavicsfelverodes.TORES;
            default -> Kavicsfelverodes.TORES;
        };
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + System.lineSeparator() + "\t"
                + "Auto{" + "kavics=" + kavics + '}';
    }

    @Override
    public void altalanosBerlesHatasa() {
        if(kavics.ordinal() > 0){
            kavics = Kavicsfelverodes.values()[kavics.ordinal() - 1];
        }
    }
    
    @Override
    public void premiumBerlesHatasa() {
        //nincs hatással, de kell a felülírás...
    }
}
