
package fpkasir;

public class Mouse {
    int jumlahM;
    int totalM;
    int s=1;
    
    
    public Mouse(int jumlahM, int totalM){
        this.jumlahM = jumlahM;
        this.totalM = totalM;
        
    }
    
     public void GetData(){
        System.out.println("Total Harga Mouse kabel yang dibeli adalah "+totalM); 
    }
}
