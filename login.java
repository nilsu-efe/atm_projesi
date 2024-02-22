
package atm.projesi;

import java.util.Scanner;


public class login {
    
    public boolean login(hesapİşlemleri hesapİşlemleri) {
        
        Scanner scanner=new Scanner(System.in);
        String kullanici_adi;
        String parola;
        
            System.out.println("kullanıcı adınızı giriniz:");
            kullanici_adi=scanner.nextLine();
            System.out.println("parolanızı giriniz:");
            parola=scanner.nextLine();
            
         if(hesapİşlemleri.getKullanici_adi().equals(kullanici_adi) && hesapİşlemleri.getParola().equals(parola)){
             
             return true;
         }
         else{
             return false;
         }
        
    }
    
}
