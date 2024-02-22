
package atm.projesi;

import java.util.Scanner;


public class atm {
    
    public void calıs(hesapİşlemleri hesapİşlemleri){
        
        login login=new login();
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("bankamıza hoşgeldiniz...");
        
        System.out.println("kullacı girişi.........");
        
        int giris_hakki=3;
        
        while(true){
            if(login.login(hesapİşlemleri)){
                System.out.println("giriş başarılı..");
                break;
            }
            else{
                System.out.println("giriş başarısız..");
                giris_hakki-=1;
                System.out.println("kalan giriş hakkı:"+giris_hakki);
            }
            
            if(giris_hakki== 0){
                System.out.println("giriş hakkınız bitti");
                
                return;
            }
            
            
            
        }
        
        String islemler="1.para çekme \n"
                    +"2.para yatırma \n"
                    +"3.bakiye görüntüle \n"
                    +"çıkmak için q tuşuna basınız ";
            
            System.out.println(islemler);
            
        while(true){
            System.out.println("işlem seçiniz:");
            String islem=scanner.nextLine();
            
            if(islem.equals("q")){
                break;
            }
            else if(islem.equals("3")){
                System.out.println("bakiyeniz:"+hesapİşlemleri.getBakiye());
            }
            else if(islem.equals("2")){
                System.out.println("yatırmak istediğiniz tutarı giriniz:");
                int tutar=scanner.nextInt();
                scanner.nextLine();// güvence altına almak için nextint ten sonra nextline aldık 
                hesapİşlemleri.parayatırma(tutar);
            }
            else if(islem.equals("1")){
                System.out.println("çekmek istediğiniz tutarı giriniz:");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                hesapİşlemleri.paracekme(tutar);
            }
            
        }    
        
        
        
    }
    
    
    
}
