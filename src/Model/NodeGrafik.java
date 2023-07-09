package Model;

public class NodeGrafik {
    private String tgl;
    private Double nilaiIP;
    
    public NodeGrafik(String tgl, Double nilaiIP) {
        this.tgl = tgl;
        this.nilaiIP = nilaiIP;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public Double getNilaiIP() {
        return nilaiIP;
    }

    public void setNilaiIP(Double nilaiIP) {
        this.nilaiIP = nilaiIP;
    }
    
    
}