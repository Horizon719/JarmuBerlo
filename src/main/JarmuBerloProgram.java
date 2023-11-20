
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
        berloJarmuvei();
    }
    
    private void berloJarmuvei() {
        for (Jarmu jarmu : berlo.getJarmuvek()) {
            if(jarmu != null){
                System.out.println(jarmu);
            }
        }
    }
}
