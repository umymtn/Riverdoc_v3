package Model;

public class DataStatusMutu {
    private DataHasilPantau DataPantau;
    private DataBarChart DataBar;
    private String tgl;
    
    public DataStatusMutu(DataHasilPantau dataPantau, DataBarChart dataBar, String tgl) {
        DataPantau = dataPantau;
        DataBar = dataBar;
        this.tgl = tgl;
    }

    public DataHasilPantau getDataPantau() {
        return DataPantau;
    }

    public void setDataPantau(DataHasilPantau dataPantau) {
        DataPantau = dataPantau;
    }

    public DataBarChart getDataBar() {
        return DataBar;
    }

    public void setDataBar(DataBarChart dataBar) {
        DataBar = dataBar;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }
    
    
}
