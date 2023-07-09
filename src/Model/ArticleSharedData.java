package Model;

public class ArticleSharedData {
    private String Judul;
    private String url;
    private String Isi;
    private boolean dipilih;
    
    public ArticleSharedData(String judul, String url, String isi) {
        this.Judul = judul;
        this.url = url;
        this.Isi = isi;
        this.dipilih = false;
    }


    public String getJudul() {
        return Judul;
    }


    public void setJudul(String judul) {
        Judul = judul;
    }


    public String getURL() {
        return url;
    }


    public void setURL(String url) {
        this.url = url;
    }


    public String getIsi() {
        return Isi;
    }


    public void setIsi(String isi) {
        Isi = isi;
    }


    public boolean isDipilih() {
        return dipilih;
    }


    public void setDipilih(boolean dipilih) {
        this.dipilih = dipilih;
    }
    
}
