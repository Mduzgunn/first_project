
public class Calisan {
    
    private int id;
    private String ad;
    private String soyad;
    private String departman;
    private String maas;
    private String eposta;
    
    
    public Calisan(int id, String ad, String soyad, String departman, String maas) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.departman = departman;
        this.maas = maas;
        this.eposta=eposta;
    }

    Calisan(int id, String ad, String soyad, String dept, String maas, String epost) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public String getMaas() {
        return maas;
    }

    public void setMaas(String maas) {
        this.maas = maas;
    }
    
    
      public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public String getEposta() {
        return eposta;
    }

    
}
