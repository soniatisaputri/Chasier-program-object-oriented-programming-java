
package fpkasir;

public class KabelDataB extends KabelData{
    int jumlahK;
    int totalK;
    int r=1;
    
    
    public KabelDataB(int jumlahK, int totalK){
        super(jumlahK,totalK);
        this.jumlahK = jumlahK;
        this.totalK = totalK;
        
    }
    
    @Override
     public void GetData(){
        System.out.println("Total Harga Kabel Data type B yang dibeli adalah "+totalK); 
    }
}
