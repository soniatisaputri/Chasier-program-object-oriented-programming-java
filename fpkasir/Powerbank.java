
package fpkasir;

public class Powerbank {
    
    int jumlahP;
    int totalP;
    int w=1;
    
    
    public Powerbank(int jumlahP, int totalP){
        this.jumlahP = jumlahP;
        this.totalP = totalP;
        
    }
    
     public void GetData(){
        System.out.println("Total Harga Powerbank yang dibeli adalah "+totalP); 
    }
}
