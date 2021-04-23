
package fpkasir;

public class Speaker {
    int jumlahS;
    int totalS;
    int x=1;
    
    
    public Speaker(int jumlahS, int totalS){
        this.jumlahS = jumlahS;
        this.totalS = totalS;
        
    }
    
     public void GetData(){
        System.out.println("Total Harga Speaker yang dibeli adalah "+totalS); 
    }
}
