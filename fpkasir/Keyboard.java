
package fpkasir;

public class Keyboard {
    int jumlahKe;
    int totalKe;
    int u=1;
    
    
    public Keyboard(int jumlahKe, int totalKe){
        this.jumlahKe = jumlahKe;
        this.totalKe = totalKe;
        
    }
    
     public void GetData(){
        System.out.println("Total Harga Keyboard yang dibeli adalah "+totalKe); 
    }
}
