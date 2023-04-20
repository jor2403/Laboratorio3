
package Main;

import Presentation.SinpeMovilTest;
import Presentation.TransationLogTest;

/**
 *
 * @author Laboratorios
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TransationLogTest tlt = new TransationLogTest();
        SinpeMovilTest sinpeTest = new SinpeMovilTest();
        tlt.test();
        sinpeTest.sinpeTest();
        System.out.println("gg");
    }//main
    
}//class
