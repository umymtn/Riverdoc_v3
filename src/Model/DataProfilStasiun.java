package Model;

public class DataProfilStasiun {
    private String KS;
    private String KL;
    private String Segmen;
    private String Alamat;
    private String urlImage;
    
    public DataProfilStasiun(String kS, String kL, String segmen, String alamat, String urlImage) {
        KS = kS;
        KL = kL;
        Segmen = segmen;
        Alamat = alamat;
        this.urlImage = urlImage;
    }

    public String getKS() {
        return KS;
    }

    public void setKS(String kS) {
        KS = kS;
    }

    public String getKL() {
        return KL;
    }

    public void setKL(String kL) {
        KL = kL;
    }

    public String getSegmen() {
        return Segmen;
    }

    public void setSegmen(String segmen) {
        Segmen = segmen;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
        Alamat = alamat;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
  
}
