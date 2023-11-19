package modell;

public class NemLetezoJarmu extends Jarmu{
    
    public NemLetezoJarmu() {
        super("Nemlétező jármű!");
    }

    /* kár, hogy a Ruha az őse, így ide nehéz kitalálni 
     * értelmes megoldást, így meg kivételt adhat
    */ 
    @Override
    public void altalanosBerlesHatasa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void premiumBerlesHatasa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
