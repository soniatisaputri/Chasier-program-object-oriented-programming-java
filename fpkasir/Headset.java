package fpkasir;

public class Headset {
     
    int jumlahH;
    int totalH;
    int y=1;
    
    
    public Headset(int jumlahH, int totalH){
        this.jumlahH = jumlahH;
        this.totalH = totalH;
        
    }
    
     public void GetData(){
        System.out.println("Total Harga Headset yang dibeli adalah "+totalH); 
    }
     
}
