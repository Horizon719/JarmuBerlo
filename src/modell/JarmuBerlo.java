
package modell;

public class JarmuBerlo {
    private Jarmu[] jarmuvek;
    
    public JarmuBerlo() {
        this(10, 0);
    }
    
    public JarmuBerlo(int autoDb, int motorDb) {        
        this.jarmuvek = new Jarmu[autoDb + motorDb];
        
        for (int i = 0; i < jarmuvek.length; i++) {
            if (autoDb > i) {
                this.jarmuvek[i] = new Auto("AAA-%03d".formatted(i));
            } else {
                this.jarmuvek[i] = new Motor("AAA-%03d".formatted(i));
            }
        }
    }
    
    public Jarmu berbead(String rendszam, BerbeadasTipusa berbeadasTipusa) {
        Jarmu nemLetezo = new NemLetezoJarmu();
        int index = 0;
        
        while(index < this.jarmuvek.length && !(this.jarmuvek[index].getRendszam().equals(rendszam)) || this.jarmuvek[index] == null) {
            index++;
        }
        
        if (index >= this.jarmuvek.length) {
            System.out.println("%s rendszámmal nem található jármű.".formatted(rendszam));
            return nemLetezo;
        }
        
        System.out.println("Bérbeadva a() %s rendszámú %s (%s bérlés)".formatted(rendszam, this.jarmuvek[index].getClass().getSimpleName(), berbeadasTipusa));
        Jarmu j = this.jarmuvek[index];
        switch (berbeadasTipusa) {
            case PREMIUM:
                j.premiumBerles();
                break;
            default:
                j.altalanosBerles();
        }
        this.jarmuvek[index] = new NemLetezoJarmu();
        return j;
    }
    
    public void bevesz(Jarmu jarmu) {
        int index = 0;
        
        while(index < this.jarmuvek.length && this.jarmuvek[index] != null && !(this.jarmuvek[index] instanceof NemLetezoJarmu)) {
            index++;
        }
        
        if (index >= this.jarmuvek.length) {
            System.out.println("Nincs elég hely");
        } else {
            this.jarmuvek[index] = jarmu;
            System.out.println("Visszahozva a() %s rendszámú %s".formatted(jarmu.getRendszam(), this.jarmuvek[index].getClass().getSimpleName()));
        }
    }

    public Jarmu[] getJarmuvek() {
        return jarmuvek;
    }
    
    public void jarmuvekMegtankol(){
        for (Jarmu jarmu : jarmuvek) {
            jarmu.setUzemanyagszint(100);
        }
        System.out.println("Járművek megtankolva!");
    }
    
}
