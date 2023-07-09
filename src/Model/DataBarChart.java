package Model;

public class DataBarChart {
    private final String P1 = "Amonia";
    private final String P2 = "BOD";
    private final String P3 = "COD";
    private final String P4 = "DO";
    private final String P5 = "Nitrat";
    private final String P6 = "PH";
    private final String P7 = "TDS";
    private final String P8 = "TSS";
    private Double Amonia;
    private Double BOD;
    private Double COD;
    private Double DO;
    private Double Nitrat;
    private Double PH;
    private Double TDS;
    private Double TSS;
    
    public DataBarChart(Double amonia, Double bOD, Double cOD, Double dO, Double nitrat, Double pH, Double tDS,
            Double tSS) {
        Amonia = amonia;
        BOD = bOD;
        COD = cOD;
        DO = dO;
        Nitrat = nitrat;
        PH = pH;
        TDS = tDS;
        TSS = tSS;
    }

    public String getP1() {
        return P1;
    }

    public String getP2() {
        return P2;
    }

    public String getP3() {
        return P3;
    }

    public String getP4() {
        return P4;
    }

    public String getP5() {
        return P5;
    }

    public String getP6() {
        return P6;
    }

    public String getP7() {
        return P7;
    }

    public String getP8() {
        return P8;
    }

    public Double getAmonia() {
        return Amonia;
    }

    public void setAmonia(Double amonia) {
        Amonia = amonia;
    }

    public Double getBOD() {
        return BOD;
    }

    public void setBOD(Double bOD) {
        BOD = bOD;
    }

    public Double getCOD() {
        return COD;
    }

    public void setCOD(Double cOD) {
        COD = cOD;
    }

    public Double getDO() {
        return DO;
    }

    public void setDO(Double dO) {
        DO = dO;
    }

    public Double getNitrat() {
        return Nitrat;
    }

    public void setNitrat(Double nitrat) {
        Nitrat = nitrat;
    }

    public Double getPH() {
        return PH;
    }

    public void setPH(Double pH) {
        PH = pH;
    }

    public Double getTDS() {
        return TDS;
    }

    public void setTDS(Double tDS) {
        TDS = tDS;
    }

    public Double getTSS() {
        return TSS;
    }

    public void setTSS(Double tSS) {
        TSS = tSS;
    }
    
}
