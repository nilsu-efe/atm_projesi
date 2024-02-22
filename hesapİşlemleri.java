
package atm.projesi;


public class hesapİşlemleri {
    
    private String kullanici_adi;
    private String parola;
    private int bakiye;

    public hesapİşlemleri(String kullanici_adi, String parola, int bakiye) {
        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
        this.bakiye = bakiye;
    }
    
    public void parayatırma(int miktar){
        this.bakiye+=miktar;
        System.out.println("yeni bakiye: "+this.bakiye);
    }
    
    public void paracekme(int miktar){
        if(miktar>2000){
            System.out.println("2000 tl den fazla çekemezsizin...");
            System.out.println(bakiye);
            
        }
        
        if(miktar>bakiye){
            System.out.println("yeterli bakiye yok...");
            System.out.println(bakiye);
        }
        else if(miktar<bakiye && miktar<=2000){
            bakiye-=miktar;
            System.out.println("yeni bakiye:"+this.bakiye);
        }
    }

    /**
     * @return the kullanici_adi
     */
    public String getKullanici_adi() {
        return kullanici_adi;
    }

    /**
     * @param kullanici_adi the kullanici_adi to set
     */
    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    /**
     * @return the parola
     */
    public String getParola() {
        return parola;
    }

    /**
     * @param parola the parola to set
     */
    public void setParola(String parola) {
        this.parola = parola;
    }

    /**
     * @return the bakiye
     */
    public int getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    
    
}
