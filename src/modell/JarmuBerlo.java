
package modell;

import java.util.Random;

public class JarmuBerlo {
    private Jarmu[] jarmuvek;
    private static Random rnd = new Random();

    public JarmuBerlo() {
        this(10);
    }
    
    public JarmuBerlo(int jarmuDb) {
        this.jarmuvek = new Jarmu[jarmuDb];
        this.feltolt();
    }
    
    private Jarmu[] feltolt(){
        for (int i = 0; i < jarmuvek.length; i++) {
            int random = rnd.nextInt(10 - 1 + 1) - 1;
            if (random>=5) {
                jarmuvek[i] = new Auto(Auto.Kavicsfelverodes.UJ, "%d".formatted(i));
            } else{
                jarmuvek[i] = new Motor(100, "%d".formatted(i));
            }
        }
        return jarmuvek;
    }
    
    public Jarmu berbeAd(String jarmuSzam, String berlesTipus){
        Jarmu j = new NemLetezoJarmu();
        int i = 0;
        while (jarmuvek[i] == null || (i < jarmuvek.length && !(jarmuvek[i].getJarmuSzam().equals(jarmuSzam)))) {
            i++;
        }
        if (i < jarmuvek.length) {
            if("altalanos".equals(berlesTipus)){
                String tipus = jarmuvek[i] instanceof Auto ? "auto" : "motor";
                jarmuvek[i].altalanosBerlesHatasa();
                jarmuvek[i].setUzemanyag(jarmuvek[i].getUzemanyag() - 50);
                System.out.println("Kiadva általános bérléssel{jarmuszam: %s, tipus: %s}".formatted(jarmuSzam, tipus));
                j = jarmuvek[i];
                jarmuvek[i] = null;
            } else{
                String tipus = jarmuvek[i] instanceof Auto ? "auto" : "motor";
                jarmuvek[i].premiumBerlesHatasa();
                jarmuvek[i].setUzemanyag(jarmuvek[i].getUzemanyag() - 50);
                System.out.println("Kiadva prémium bérléssel{jarmuszam: %s, tipus: %s}".formatted(jarmuSzam, tipus));
                j = jarmuvek[i];
                jarmuvek[i] = null;
            }
            
        } else {
            System.out.println("Nincs ilyen jarmű a bérlőben!");
        }
        return j;
    }
    
    public void bevesz(Jarmu jarmu) {
        int i = 0;
        
        while(i < this.jarmuvek.length && this.jarmuvek[i] != null && !(this.jarmuvek[i] instanceof NemLetezoJarmu)) {
            i++;
        }
        
        this.jarmuvek[i] = jarmu;
        System.out.println("Visszahozva a(z) %s számú %s".formatted(jarmu.getJarmuSzam(), this.jarmuvek[i].getClass().getSimpleName()));
    }
    
    public void tankol(){
        for (int i = 0; i < jarmuvek.length; i++) {
            if (jarmuvek[i] != null) {
                jarmuvek[i].setUzemanyag(1000);
            }
        }
    }
    
    public Jarmu[] getJarmuvek() {
        return jarmuvek;
    }
}
