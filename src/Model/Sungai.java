package Model;

public class Sungai {
    private String NamaStasiun;
    private String NamaSungai;
    private AllDataHasilPantau DatabasePantau;
    private AllDataStatusMutu DatabaseStatus;
    private DataProfilStasiun DataProfil;
    private DataGrafik DataGrafik;
    private boolean Dipilih;

    public Sungai(String namaStasiun, String namaSungai, AllDataHasilPantau databasePantau,
            AllDataStatusMutu databaseStatus, DataProfilStasiun dataProfil, Model.DataGrafik dataGrafik) {
        NamaStasiun = namaStasiun;
        NamaSungai = namaSungai;
        DatabasePantau = databasePantau;
        DatabaseStatus = databaseStatus;
        DataProfil = dataProfil;
        DataGrafik = dataGrafik;
        Dipilih = false;
    }

    public String getNamaStasiun() {
        return NamaStasiun;
    }

    public void setNamaStasiun(String namaStasiun) {
        NamaStasiun = namaStasiun;
    }

    public String getNamaSungai() {
        return NamaSungai;
    }

    public void setNamaSungai(String namaSungai) {
        NamaSungai = namaSungai;
    }

    public AllDataHasilPantau getDatabasePantau() {
        return DatabasePantau;
    }

    public void setDatabasePantau(AllDataHasilPantau databasePantau) {
        DatabasePantau = databasePantau;
    }

    public AllDataStatusMutu getDatabaseStatus() {
        return DatabaseStatus;
    }

    public void setDatabaseStatus(AllDataStatusMutu databaseStatus) {
        DatabaseStatus = databaseStatus;
    }

    public DataProfilStasiun getDataProfil() {
        return DataProfil;
    }

    public void setDataProfil(DataProfilStasiun dataProfil) {
        DataProfil = dataProfil;
    }

    public DataGrafik getDataGrafik() {
        return DataGrafik;
    }

    public void setDataGrafik(DataGrafik dataGrafik) {
        DataGrafik = dataGrafik;
    }

    public boolean isDipilih() {
        return Dipilih;
    }

    public void setDipilih(boolean dipilih) {
        Dipilih = dipilih;
    }
    
    
}
