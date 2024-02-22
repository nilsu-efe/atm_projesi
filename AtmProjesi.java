
package atm.projesi;


public class AtmProjesi {

    
    public static void main(String[] args) {
        
        atm atm=new atm();
        hesapİşlemleri hesapİşlemleri =new hesapİşlemleri("nilsu", "123456",2000 );
        
        atm.calıs(hesapİşlemleri);
        System.out.println("sistemden çıkılıyor...");
        
        
    }
    
}
