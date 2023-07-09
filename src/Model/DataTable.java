package Model;

public class DataTable {
    private String NamaSungai;
    private String NilaiIP;
    private String StatusMutu;
    private String ParameterKritis;
    private String tgl;
   
    public DataTable(String namaSungai, String nilaiIP, String statusMutu, String parameterKritis, String tgl) {
        NamaSungai = namaSungai;
        NilaiIP = nilaiIP;
        StatusMutu = statusMutu;
        ParameterKritis = parameterKritis;
        this.tgl = tgl;
    }

    public String getNamaSungai() {
        return NamaSungai;
    }

    public void setNamaSungai(String namaSungai) {
        NamaSungai = namaSungai;
    }

    public String getNilaiIP() {
        return NilaiIP;
    }

    public void setNilaiIP(String nilaiIP) {
        NilaiIP = nilaiIP;
    }

    public String getStatusMutu() {
        return StatusMutu;
    }

    public void setStatusMutu(String statusMutu) {
        StatusMutu = statusMutu;
    }

    public String getParameterKritis() {
        return ParameterKritis;
    }

    public void setParameterKritis(String parameterKritis) {
        ParameterKritis = parameterKritis;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    
}
