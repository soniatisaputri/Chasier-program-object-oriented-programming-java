package fpkasir;
import java.util.Scanner;
public class FpKasir {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Headset[] headset = new Headset [100];
        Powerbank[] powerbank = new Powerbank [100];
        Speaker[] speaker = new Speaker [100];
        KabelData[] kabeldata = new KabelData [100];
        KabelDataB[] kabeldatab = new KabelDataB [100];
        Mouse[] mouse = new Mouse [100];
        MouseWL[] mousewl = new MouseWL [100];
        Keyboard[] keyboard = new Keyboard [100];
        
        
        
        
        int totalHeadset = 0;
        int totalPowerbank = 0;
        int totalSpeaker = 0;
        int totalKabelData = 0;
        int totalKabelDataB = 0;
        int totalMouse = 0;
        int totalMouseWL = 0;
        int totalKeyboard = 0;
        int kriteria = 0;
        
        int pilihanH;
         int pilihanP;
          int pilihanS;
           int pilihanK;
            int pilihanKb;
             int pilihanM;
              int pilihanMl;
               int pilihanKe;
        
        int exit = 0;       
        while(exit==0){
        String[]Barang={"headset","powerbank","speaker","kabeldata","kabeldatab","mouse","mousewl","keyboard"};
        int harga[]={150000,200000,150000,20000,10000,60000,100000,150000};
        
        System.out.println("===================================================");
        System.out.println("======= SELAMAT DATANG DI ALHAMDULILLAH MART ======");
        System.out.println("===================================================\n\n");
        System.out.println("Pilih barang yang dibeli ^_^\n");
        
              System.out.println("1. Headset");
              System.out.println("2. Powerbank");
              System.out.println("3. Speaker");
              System.out.println("4. Kabel Data type C");
              System.out.println("5. Kabel Data type B");
              System.out.println("6. Mouse kabel");
              System.out.println("7. Mouse Wireless");
              System.out.println("8. Keyboard");            
              System.out.println("9. EXIT");
              
              System.out.println("\n\nMasukan Pilihan anda : ");             
              int pilihan = input.nextInt();
              input.nextLine();
              
               switch(pilihan){
                case 1 :
                     System.out.println("Headset seharga\n "+harga[0]);
                     System.out.println("Masukan jumlah headset yang dibeli :");
                     int jumlahH = input.nextInt();
                     int totalH = jumlahH * harga[0];
                     headset[totalHeadset] = new Headset(jumlahH, totalH);
                     totalHeadset = totalHeadset + 1;
                     int ketemu = 0;                               
                        if(totalHeadset > 0){                            
                            for(int i = 0; i < totalHeadset; i++){
                                if(headset[i].y>=0){
                                    headset[i].GetData();                                   
                                    ketemu++;
                                }                              
                            }
                        }
                        if (ketemu==0){
                            System.out.println("EROR Data Not Found");
                        }
                        System.out.println("\n");                       
                        System.out.println("Dibayar Menggunakan Kupon?");
                        System.out.println("1. Ya");
                        System.out.println("2. Tidak");
                        System.out.println("Masukkan pilihan : ");
                        pilihanH = input.nextInt();
                        input.nextLine();
                        switch(pilihanH){
                            case 1 :
                               System.out.println("Masukan Kode Kupon : ");
                               int kupon= input.nextInt();
                               if ((kupon<=10000)&& (totalH>500000)){
                                   totalH=totalH-((totalH*5/100)+(totalH*10/100));
                                   System.out.println("Harga setelah dipotong kupon : \n"+totalH);
                                   System.out.println("Terima Kasih telah berbelanja ^_^");
                                   System.out.println("UNTUK PEMBELIAN BARANG YANG LAINNYA DAPAT DIULANG MULAI AWAL ^_^");
                                   
                               }
                               else if((kupon>10000)&& (totalH>500000)){
                                   System.out.println("Maaf Kartu kupon salah");
                               }
                               else if((kupon<=10000)&& (totalH<500000)){
                                   totalH=totalH-(totalH*5/100);
                                   System.out.println("Harga setelah dipotong kupon : \n"+totalH);
                                   System.out.println("Terima Kasih telah berbelanja ^_^");
                                   System.out.println("UNTUK PEMBELIAN BARANG YANG LAINNYA DAPAT DIULANG MULAI AWAL ^_^");
                                   
                               }
                               break;
                            case 2 :
                                if(totalH>500000){
                                   totalH=totalH-(totalH*5/100);  
                                   System.out.println("Harga Total belanja headset adalah : \n"+totalH);
                                   System.out.println("Terima Kasih telah berbelanja ^_^");
                                   System.out.println("UNTUK PEMBELIAN BARANG YANG LAINNYA DAPAT DIULANG MULAI AWAL ^_^");
                                   
                               }
                               else{                                
                                   System.out.println("Harga Total belanja headset adalah : \n"+totalH);
                                   System.out.println("Terima Kasih telah berbelanja ^_^");
                                   System.out.println("UNTUK PEMBELIAN BARANG YANG LAINNYA DAPAT DIULANG MULAI AWAL ^_^");
                                   
                               }
                               break;
                        }
                        
                     break;
                case 2 :
                     System.out.println("Power Bank seharga "+harga[1]);                  
                     System.out.println("Masukan jumlah Powerbank yang dibeli :");
                     int jumlahP = input.nextInt();
                     int totalP = jumlahP * harga[1];
                     powerbank [totalPowerbank] = new Powerbank(jumlahP, totalP);
                     totalPowerbank = totalPowerbank + 1;
                      ketemu = 0;                               
                        if(totalPowerbank > 0){                            
                            for(int i = 0; i < totalPowerbank; i++){
                                if(powerbank[i].w>=0){
                                    powerbank[i].GetData();                                   
                                    ketemu++;
                                }                              
                            }
                        }
                        if (ketemu==0){
                            System.out.println("EROR Data Not Found");
                        }
                        System.out.println("\n");                       
                        System.out.println("Dibayar Menggunakan Kupon?");
                        System.out.println("1. Ya");
                        System.out.println("2. Tidak");
                        System.out.println("Masukkan pilihan : ");
                        pilihanP = input.nextInt();
                        input.nextLine();
                        switch(pilihanP){
                            case 1 :
                               System.out.println("Masukan Kode Kupon : ");
                               int kupon= input.nextInt();
                               if ((kupon<=10000)&& (totalP>500000)){
                                   totalP=totalP-((totalP*5/100)+(totalP*10/100));
                                   System.out.println("Harga setelah dipotong kupon : \n"+totalP);
                                   System.out.println("Terima Kasih telah berbelanja ^_^");
                                   System.out.println("UNTUK PEMBELIAN BARANG YANG LAINNYA DAPAT DIULANG MULAI AWAL ^_^");
                                   
                               }
                               else if((kupon>10000)&& (totalP>500000)){
                                   System.out.println("Maaf Kartu kupon salah");
                               }
                               else if((kupon<=10000)&& (totalP<500000)){
                                   totalP=totalP-(totalP*5/100);
                                   System.out.println("Harga setelah dipotong kupon : \n"+totalP);
                                   System.out.println("Terima Kasih telah berbelanja ^_^");
                                   System.out.println("UNTUK PEMBELIAN BARANG YANG LAINNYA DAPAT DIULANG MULAI AWAL ^_^");
                                   
                               }
                               break;
                            case 2 :
                                if(totalP>500000){
                                   totalP=totalP-(totalP*5/100);  
                                   System.out.println("Harga Total belanja headset adalah : \n"+totalP);
                                   System.out.println("Terima Kasih telah berbelanja ^_^");
                                   System.out.println("UNTUK PEMBELIAN BARANG YANG LAINNYA DAPAT DIULANG MULAI AWAL ^_^");
                                   
                               }
                               else{                                
                                   System.out.println("Harga Total belanja headset adalah : \n"+totalP);
                                   System.out.println("Terima Kasih telah berbelanja ^_^");
                                   System.out.println("UNTUK PEMBELIAN BARANG YANG LAINNYA DAPAT DIULANG MULAI AWAL ^_^");
                                  
                               }
                               break;
                        }
                    break;
                case 3 :
                     System.out.println("Speaker seharga "+harga[2]);                    
                     System.out.println("Masukan jumlah Speaker yang dibeli :");
                     int jumlahS = input.nextInt();
                     int totalS = jumlahS * harga[2];
                     speaker[totalSpeaker] = new Speaker(jumlahS, totalS);
                     totalSpeaker = totalSpeaker + 1;
                     ketemu = 0;                               
                        if(totalSpeaker > 0){                            
                            for(int i = 0; i < totalSpeaker; i++){
                                if(speaker[i].x>=0){
                                    speaker[i].GetData();                                   
                                    ketemu++;
                                }                              
                            }
                        }
                        if (ketemu==0){
                            System.out.println("EROR Data Not Found");
                        }
                        System.out.println("\n");                       
                        System.out.println("Dibayar Menggunakan Kupon?");
                        System.out.println("1. Ya");
                        System.out.println("2. Tidak");
                        System.out.println("Masukkan pilihan : ");
                        pilihanS = input.nextInt();
                        input.nextLine();
                        switch(pilihanS){
                            case 1 :
                               System.out.println("Masukan Kode Kupon : ");
                               int kupon= input.nextInt();
                               if ((kupon<=10000)&& (totalS>500000)){
                                   totalS=totalS-((totalS*5/100)+(totalS*10/100));
                                   System.out.println("Harga setelah dipotong kupon : \n"+totalS);
                                   System.out.println("Terima Kasih telah berbelanja ^_^");
                                   System.out.println("UNTUK PEMBELIAN BARANG YANG LAINNYA DAPAT DIULANG MULAI AWAL ^_^");
                                   
                               }
                               else if((kupon>10000)&& (totalS>500000)){
                                   System.out.println("Maaf Kartu kupon salah");
                               }
                               else if((kupon<=10000)&& (totalS<500000)){
                                   totalS=totalS-(totalS*5/100);
                                   System.out.println("Harga setelah dipotong kupon : \n"+totalS);
                                   System.out.println("Terima Kasih telah berbelanja ^_^");
                                   System.out.println("UNTUK PEMBELIAN BARANG YANG LAINNYA DAPAT DIULANG MULAI AWAL ^_^");
                                   
                               }
                               break;
                            case 2 :
                                if(totalS>500000){
                                   totalS=totalS-(totalS*5/100);  
                                   System.out.println("Harga Total belanja headset adalah : \n"+totalS);
                                   System.out.println("Terima Kasih telah berbelanja ^_^");
                                   System.out.println("UNTUK PEMBELIAN BARANG YANG LAINNYA DAPAT DIULANG MULAI AWAL ^_^");
                                   
                               }
                               else{                                
                                   System.out.println("Harga Total belanja headset adalah : \n"+totalS);
                                   System.out.println("Terima Kasih telah berbelanja ^_^");
                                   System.out.println("UNTUK PEMBELIAN BARANG YANG LAINNYA DAPAT DIULANG MULAI AWAL ^_^");
                                   
                               }
                               break;
                        }
                    break;
                case 4 :
                     System.out.println("Kabel Data type C seharga "+harga[3]);                      
                     System.out.println("Masukan jumlah Kabel Data type C yang dibeli :");
                     int jumlahK = input.nextInt();
                     int totalK = jumlahK * harga[3];
                     kabeldata[totalKabelData] = new KabelData(jumlahK, totalK);
                     totalKabelData = totalKabelData + 1;
                     ketemu = 0;                               
                        if(totalKabelData > 0){                            
                            for(int i = 0; i < totalKabelData; i++){
                                if(kabeldata[i].z>=0){
                                    kabeldata[i].GetData();                                   
                                    ketemu++;
                                }                              
                            }
                        }
                        if (ketemu==0){
                            System.out.println("EROR Data Not Found");
                        }
                        System.out.println("\n");                       
                        System.out.println("Dibayar Menggunakan Kupon?");
                        System.out.println("1. Ya");
                        System.out.println("2. Tidak");
                        System.out.println("Masukkan pilihan : ");
                        pilihanK = input.nextInt();
                        input.nextLine();
                        switch(pilihanK){
                            case 1 :
                               System.out.println("Masukan Kode Kupon : ");
                               int kupon= input.nextInt();
                               if ((kupon<=10000)&& (totalK>500000)){
                                   totalK=totalK-((totalK*5/100)+(totalK*10/100));
                                   System.out.println("Harga setelah dipotong kupon : \n"+totalK);
                                   System.out.println("Terima Kasih telah berbelanja ^_^");
                                   System.out.println("UNTUK PEMBELIAN BARANG YANG LAINNYA DAPAT DIULANG MULAI AWAL ^_^");
                                   
                               }
                               else if((kupon>10000)&& (totalK>500000)){
                                   System.out.println("Maaf Kartu kupon salah");
                               }
                               else if((kupon<=10000)&& (totalK<500000)){
                                   totalK=totalK-(totalK*5/100);
                                   System.out.println("Harga setelah dipotong kupon : \n"+totalK);
                                   System.out.println("Terima Kasih telah berbelanja ^_^");
                                   System.out.println("UNTUK PEMBELIAN BARANG YANG LAINNYA DAPAT DIULANG MULAI AWAL ^_^");
                                   
                               }
                               break;
                            case 2 :
                                if(totalK>500000){
                                   totalK=totalK-(totalK*5/100);  
                                   System.out.println("Harga Total belanja headset adalah : \n"+totalK);
                                   System.out.println("Terima Kasih telah berbelanja ^_^");
                                   System.out.println("UNTUK PEMBELIAN BARANG YANG LAINNYA DAPAT DIULANG MULAI AWAL ^_^");
                                   
                               }
                               else{                                
                                   System.out.println("Harga Total belanja headset adalah : \n"+totalK);
                                   System.out.println("Terima Kasih telah berbelanja ^_^");
                                   System.out.println("UNTUK PEMBELIAN BARANG YANG LAINNYA DAPAT DIULANG MULAI AWAL ^_^");
                                   
                               }
                               break;
                        }
                    break;
                case 5 :
                     System.out.println("Kabel Data type B seharga "+harga[4]);                  
                     System.out.println("Masukan jumlah Kabel data type B yang dibeli :");
                     int jumlahKb = input.nextInt();
                     int totalKb = jumlahKb * harga[4];
                     kabeldatab[totalKabelDataB] = new KabelDataB(jumlahKb, totalKb);
                     totalKabelDataB = totalKabelDataB + 1;
                     ketemu = 0;                               
                        if(totalKabelDataB > 0){                            
                            for(int i = 0; i < totalKabelDataB; i++){
                                if(kabeldatab[i].r>=0){
                                    kabeldatab[i].GetData();                                   
                                    ketemu++;
                                }                              
                            }
                        }
                        if (ketemu==0){
                            System.out.println("EROR Data Not Found");
                        }
                        System.out.println("\n");                       
                        System.out.println("Dibayar Menggunakan Kupon?");
                        System.out.println("1. Ya");
                        System.out.println("2. Tidak");
                        System.out.println("Masukkan pilihan : ");
                        pilihanKb = input.nextInt();
                        input.nextLine();
                        switch(pilihanKb){
                            case 1 :
                               System.out.println("Masukan Kode Kupon : ");
                               int kupon= input.nextInt();
                               if ((kupon<=10000)&& (totalKb>500000)){
                                   totalKb=totalKb-((totalKb*5/100)+(totalKb*10/100));
                                   System.out.println("Harga setelah dipotong kupon : \n"+totalKb);
                                   System.out.println("Terima Kasih telah berbelanja ^_^");
                                   System.out.println("UNTUK PEMBELIAN BARANG YANG LAINNYA DAPAT DIULANG MULAI AWAL ^_^");
                                  
                               }
                               else if((kupon>10000)&& (totalKb>500000)){
                                   System.out.println("Maaf Kartu kupon salah");
                               }
                               else if((kupon<=10000)&& (totalKb<500000)){
                                   totalKb=totalKb-(totalKb*5/100);
                                   System.out.println("Harga setelah dipotong kupon : \n"+totalKb);
                                   System.out.println("Terima Kasih telah berbelanja ^_^");
                                   System.out.println("UNTUK PEMBELIAN BARANG YANG LAINNYA DAPAT DIULANG MULAI AWAL ^_^");
                                   
                               }
                               break;
                            case 2 :
                                if(totalKb>500000){
                                   totalKb=totalKb-(totalKb*5/100);  
                                   System.out.println("Harga Total belanja headset adalah : \n"+totalKb);
                                   System.out.println("Terima Kasih telah berbelanja ^_^");
                                   System.out.println("UNTUK PEMBELIAN BARANG YANG LAINNYA DAPAT DIULANG MULAI AWAL ^_^");
                                   
                               }
                               else{                                
                                   System.out.println("Harga Total belanja headset adalah : \n"+totalKb);
                                   System.out.println("Terima Kasih telah berbelanja ^_^");
                                   System.out.println("UNTUK PEMBELIAN BARANG YANG LAINNYA DAPAT DIULANG MULAI AWAL ^_^");
                                   
                               }
                               break;
                        }
                    break;
                case 6 :
                     System.out.println("Mouse Kabel seharga "+harga[5]);                    
                     System.out.println("Masukan jumlah Mouse kabel yang dibeli :");
                     int jumlahM = input.nextInt();
                     int totalM = jumlahM * harga[5];
                     mouse[totalMouse] = new Mouse(jumlahM, totalM);
                     totalMouse = totalMouse + 1;
                     ketemu = 0;                               
                        if(totalMouse > 0){                            
                            for(int i = 0; i < totalMouse; i++){
                                if(mouse[i].s>=0){
                                    mouse[i].GetData();                                   
                                    ketemu++;
                                }                              
                            }
                        }
                        if (ketemu==0){
                            System.out.println("EROR Data Not Found");
                        }
                        System.out.println("\n");                       
                        System.out.println("Dibayar Menggunakan Kupon?");
                        System.out.println("1. Ya");
                        System.out.println("2. Tidak");
                        System.out.println("Masukkan pilihan : ");
                        pilihanM = input.nextInt();
                        input.nextLine();
                        switch(pilihanM){
                            case 1 :
                               System.out.println("Masukan Kode Kupon : ");
                               int kupon= input.nextInt();
                               if ((kupon<=10000)&& (totalM>500000)){
                                   totalM=totalM-((totalM*5/100)+(totalM*10/100));
                                   System.out.println("Harga setelah dipotong kupon : \n"+totalM);
                                   System.out.println("Terima Kasih telah berbelanja ^_^");
                                   System.out.println("UNTUK PEMBELIAN BARANG YANG LAINNYA DAPAT DIULANG MULAI AWAL ^_^");
                                   
                               }
                               else if((kupon>10000)&& (totalM>500000)){
                                   System.out.println("Maaf Kartu kupon salah");
                               }
                               else if((kupon<=10000)&& (totalM<500000)){
                                   totalM=totalM-(totalM*5/100);
                                   System.out.println("Harga setelah dipotong kupon : \n"+totalM);
                                   System.out.println("Terima Kasih telah berbelanja ^_^");
                                   System.out.println("UNTUK PEMBELIAN BARANG YANG LAINNYA DAPAT DIULANG MULAI AWAL ^_^");
                                   
                               }
                               break;
                            case 2 :
                                if(totalM>500000){
                                   totalM=totalM-(totalM*5/100);  
                                   System.out.println("Harga Total belanja headset adalah : \n"+totalM);
                                   System.out.println("Terima Kasih telah berbelanja ^_^");
                                   System.out.println("UNTUK PEMBELIAN BARANG YANG LAINNYA DAPAT DIULANG MULAI AWAL ^_^");
                                   
                               }
                               else{                                
                                   System.out.println("Harga Total belanja headset adalah : \n"+totalM);
                                   System.out.println("Terima Kasih telah berbelanja ^_^");
                                   System.out.println("UNTUK PEMBELIAN BARANG YANG LAINNYA DAPAT DIULANG MULAI AWAL ^_^");
                                   
                               }
                               break;
                        }
                    break;
                case 7 :
                     System.out.println("Mouse Wireless seharga "+harga[6]);                     
                     System.out.println("Masukan jumlah Mouse wireless yang dibeli :");
                     jumlahM = input.nextInt();
                     totalM = jumlahM * harga[6];
                     mousewl[totalMouseWL] = new MouseWL(jumlahM, totalM);
                     totalMouseWL = totalMouseWL + 1;
                     ketemu = 0;                               
                        if(totalMouseWL > 0){                            
                            for(int i = 0; i < totalMouseWL; i++){
                                if(mousewl[i].t>=0){
                                    mousewl[i].GetData();                                   
                                    ketemu++;
                                }                              
                            }
                        }
                        if (ketemu==0){
                            System.out.println("EROR Data Not Found");
                        }
                        System.out.println("\n");                       
                        System.out.println("Dibayar Menggunakan Kupon?");
                        System.out.println("1. Ya");
                        System.out.println("2. Tidak");
                        System.out.println("Masukkan pilihan : ");
                        pilihanM = input.nextInt();
                        input.nextLine();
                        switch(pilihanM){
                            case 1 :
                               System.out.println("Masukan Kode Kupon : ");
                               int kupon= input.nextInt();
                               if ((kupon<=10000)&& (totalM>500000)){
                                   totalM=totalM-((totalM*5/100)+(totalM*10/100));
                                   System.out.println("Harga setelah dipotong kupon : \n"+totalM);
                                   System.out.println("Terima Kasih telah berbelanja ^_^");
                                   System.out.println("UNTUK PEMBELIAN BARANG YANG LAINNYA DAPAT DIULANG MULAI AWAL ^_^");
                                   
                               }
                               else if((kupon>10000)&& (totalM>500000)){
                                   System.out.println("Maaf Kartu kupon salah");
                               }
                               else if((kupon<=10000)&& (totalM<500000)){
                                   totalM=totalM-(totalM*5/100);
                                   System.out.println("Harga setelah dipotong kupon : \n"+totalM);
                                   System.out.println("Terima Kasih telah berbelanja ^_^");
                                   System.out.println("UNTUK PEMBELIAN BARANG YANG LAINNYA DAPAT DIULANG MULAI AWAL ^_^");
                                   
                               }
                               break;
                            case 2 :
                                if(totalM>500000){
                                   totalM=totalM-(totalM*5/100);  
                                   System.out.println("Harga Total belanja headset adalah : \n"+totalM);
                                   System.out.println("Terima Kasih telah berbelanja ^_^");
                                   System.out.println("UNTUK PEMBELIAN BARANG YANG LAINNYA DAPAT DIULANG MULAI AWAL ^_^");
                                   
                               }
                               else{                                
                                   System.out.println("Harga Total belanja headset adalah : \n"+totalM);
                                   System.out.println("Terima Kasih telah berbelanja ^_^");
                                   System.out.println("UNTUK PEMBELIAN BARANG YANG LAINNYA DAPAT DIULANG MULAI AWAL ^_^");
                                   
                               }
                               break;
                        }
                    break;
                case 8 :
                     System.out.println("Keyboard seharga "+harga[7]);                    
                     System.out.println("Masukan jumlah Keyboard yang dibeli :");
                     int jumlahKe = input.nextInt();
                     int totalKe = jumlahKe * harga[7];
                     keyboard[totalKeyboard] = new Keyboard(jumlahKe, totalKe);
                     totalKeyboard = totalKeyboard + 1;
                     ketemu = 0;                               
                        if(totalKeyboard > 0){                            
                            for(int i = 0; i < totalKeyboard; i++){
                                if(keyboard[i].u>=0){
                                    keyboard[i].GetData();                                   
                                    ketemu++;
                                }                              
                            }
                        }
                        if (ketemu==0){
                            System.out.println("EROR Data Not Found");
                        }
                        System.out.println("\n");                       
                        System.out.println("Dibayar Menggunakan Kupon?");
                        System.out.println("1. Ya");
                        System.out.println("2. Tidak");
                        System.out.println("Masukkan pilihan : ");
                        pilihanKe = input.nextInt();
                        input.nextLine();
                        switch(pilihanKe){
                            case 1 :
                               System.out.println("Masukan Kode Kupon : ");
                               int kupon= input.nextInt();
                               if ((kupon<=10000)&& (totalKe>500000)){
                                   totalKe=totalKe-((totalKe*5/100)+(totalKe*10/100));
                                   System.out.println("Harga setelah dipotong kupon : \n"+totalKe);
                                   System.out.println("Terima Kasih telah berbelanja ^_^");
                                   System.out.println("UNTUK PEMBELIAN BARANG YANG LAINNYA DAPAT DIULANG MULAI AWAL ^_^");
                                   
                               }
                               else if((kupon>10000)&& (totalKe>500000)){
                                   System.out.println("Maaf Kartu kupon salah");
                               }
                               else if((kupon<=10000)&& (totalKe<500000)){
                                   totalKe=totalKe-(totalKe*5/100);
                                   System.out.println("Harga setelah dipotong kupon : \n"+totalKe);
                                   System.out.println("Terima Kasih telah berbelanja ^_^");
                                   System.out.println("UNTUK PEMBELIAN BARANG YANG LAINNYA DAPAT DIULANG MULAI AWAL ^_^");
                                   
                               }
                               break;
                            case 2 :
                                if(totalKe>500000){
                                   totalKe=totalKe-(totalKe*5/100);  
                                   System.out.println("Harga Total belanja headset adalah : \n"+totalKe);
                                   System.out.println("Terima Kasih telah berbelanja ^_^");
                                   System.out.println("UNTUK PEMBELIAN BARANG YANG LAINNYA DAPAT DIULANG MULAI AWAL ^_^");
                                   
                               }
                               else{                                
                                   System.out.println("Harga Total belanja headset adalah : \n"+totalKe);
                                   System.out.println("Terima Kasih telah berbelanja ^_^");
                                   System.out.println("UNTUK PEMBELIAN BARANG YANG LAINNYA DAPAT DIULANG MULAI AWAL ^_^");
                                   
                               }
                               break;
                        }
                    break;              
                case 9 :
                     exit=1;
                    System.out.println("Thank You");
                    break;
                default :
                    System.out.println("Salah inputan!!!");
                    break; 
                    
               }
    }
    
}
}
