package Model;

public class DataHasilPantau {
    private String NilaiIP;
    private String StatusMutu;
    private String ParameterKritis;
    
    
    public DataHasilPantau(String nilaiIP, String statusMutu, String parameterKritis) {
        NilaiIP = nilaiIP;
        StatusMutu = statusMutu;
        ParameterKritis = parameterKritis;
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
    
    
}
