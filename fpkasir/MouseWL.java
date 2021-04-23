
package fpkasir;

public class MouseWL extends Mouse {
    int jumlahM;
    int totalM;
    int t=1;
    
    
    public MouseWL(int jumlahM, int totalM){
        super(jumlahM,totalM);
        this.jumlahM = jumlahM;
        this.totalM = totalM;
        
    }
    
     public void GetData(){
        System.out.println("Total Harga Mouse wireless yang dibeli adalah "+totalM); 
    }
}
