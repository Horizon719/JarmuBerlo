
package main;

import modell.Jarmu;
import modell.JarmuBerlo;


public class JarmuBerloProgram {

    private JarmuBerlo berlo;
    
    public static void main(String[] args) {
        new JarmuBerloProgram();
    }
    
    public JarmuBerloProgram(){
        berlo = new JarmuBerlo(5);
        System.out.println("A bérlő eretedi állapota:");
        berloJarmuvei();
        System.out.println("");
        Jarmu kiadott = berlo.berbeAd("1", "altalanos");
        berloJarmuvei();
        berlo.bevesz(kiadott);
        berloJarmuvei();
        kiadott = berlo.berbeAd("2", "premium");
        berloJarmuvei();
        berlo.bevesz(kiadott);
        berloJarmuvei();
    }
    
    private void berloJarmuvei() {
        System.out.println("----------------");
        for (Jarmu jarmu : berlo.getJarmuvek()) {
            if(jarmu != null){
                System.out.println(jarmu);
            }
        }
        System.out.println("----------------");
    }
}
