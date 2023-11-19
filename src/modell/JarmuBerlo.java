
package modell;

import java.util.Random;

public class JarmuBerlo {
    private Jarmu[] jarmuvek;
    private int jarmuDb;

    public JarmuBerlo() {
        this(10);
    }
    
    public JarmuBerlo(int jarmuDb) {
        
        this.feltolt();
    }
    
    private Jarmu[] feltolt(){
        this.jarmuvek = new Jarmu[jarmuDb];
        for (int i = 0; i < jarmuvek.length; i++) {
            int rnd = new Random().nextInt(10 - 1 + 1) - 1;
            if (rnd>=5) {
                jarmuvek[i] = new Auto(Auto.Kavicsfelverodes.UJ, "%d".formatted(i));
            } else{
                jarmuvek[i] = new Motor(100, "%d".formatted(i));
            }
            jarmuvek[i] = new Auto(Auto.Kavicsfelverodes.UJ, "%d".formatted(i));
        }
        return jarmuvek;
    }
    
    public Jarmu kiad(String jarmuSzam){
        Jarmu j = new NemLetezoJarmu();
        int i = 0;
        while (jarmuvek[i] == null || i < jarmuDb && !(jarmuvek[i].getJarmuSzam().equals(jarmuSzam))) {
            i++;
        }
        if (i < jarmuDb) {
            String tipus = jarmuvek[i] instanceof Auto ? "auto" : "motor";
            System.out.println("Kiadva %s %s!".formatted(jarmuSzam, tipus));
            j = jarmuvek[i];
            jarmuvek[i] = null;//ez is lehetne NemletezoRuha
        } else {
            System.out.println("Nincs ilyen jarmű a bérlőben!");
        }
        return j;
    }
    
    public Jarmu[] getJarmuvek() {
        Jarmu[] kiadottJarmuvek = new Jarmu[this.jarmuvek.length];
        for (int i = 0; i < jarmuDb; i++) {
            Jarmu aktualisJarmu = this.jarmuvek[i];
            if (aktualisJarmu != null) {
                kiadottJarmuvek[i] = aktualisJarmu;
            }
        }
        return kiadottJarmuvek;
    }
}
