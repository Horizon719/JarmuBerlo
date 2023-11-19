
package main;

import modell.BerbeadasTipusa;
import modell.Jarmu;
import modell.JarmuBerlo;


public class JarmuBerloProgram {

    
    public static void main(String[] args) {
        new JarmuBerloProgram();
    }
    
    public JarmuBerloProgram() {
        JarmuBerlo jarmuBerlo = new JarmuBerlo(1, 5);
        
        jarmuvekKilistaz(jarmuBerlo);
        
        Jarmu jarmu = jarmuBerlo.berbead("AAA-  1", BerbeadasTipusa.NORMAL);
        
        jarmuvekKilistaz(jarmuBerlo);
        
        jarmuBerlo.bevesz(jarmu);
        
        jarmuvekKilistaz(jarmuBerlo);
        
        jarmuBerlo.jarmuvekMegtankol();
        
        jarmuvekKilistaz(jarmuBerlo);
        
        jarmu = jarmuBerlo.berbead("AAA-  0", BerbeadasTipusa.PREMIUM);
        jarmuBerlo.bevesz(jarmu);
        
        jarmuvekKilistaz(jarmuBerlo);
    }

    private void jarmuvekKilistaz(JarmuBerlo jarmuBerlo) {
        System.out.println("Járműbérlő járművei:");
        
        for (Jarmu jarmu : jarmuBerlo.getJarmuvek()) {
            System.out.println("\t%s".formatted(jarmu.toString()));
        }
    }
    
}
