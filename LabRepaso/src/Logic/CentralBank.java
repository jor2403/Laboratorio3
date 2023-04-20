/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author jorma
 */
public class CentralBank {
    
    private NationalBank bn;
    private BCR bcr;

    
     public CentralBank() {}
     
    public CentralBank(NationalBank bn, BCR bcr) {
        this.bn = bn;
        this.bcr = bcr;
    }

    public NationalBank getBn() {
        return bn;
    }

    public void setBn(NationalBank bn) {
        this.bn = bn;
    }

    public BCR getBcr() {
        return bcr;
    }

    public void setBcr(BCR bcr) {
        this.bcr = bcr;
    }
    
     public void SinpeMovil() {

         
         
    }//sinpe

    @Override
    public String toString() {
        return "CentralBank{" + "bn=" + bn + ", bcr=" + bcr + '}';
    }
    
    
}//class
