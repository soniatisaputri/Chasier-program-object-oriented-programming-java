
package fpkasir;

public class KabelData {
    int jumlahK;
    int totalK;
    int z=1;
    
    
    public KabelData(int jumlahK, int totalK){
        this.jumlahK = jumlahK;
        this.totalK = totalK;
        
    }
    
     public void GetData(){
        System.out.println("Total Harga Kabel Data type C yang dibeli adalah "+totalK); 
    }
}
