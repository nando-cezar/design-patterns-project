package org.example.model;

public class FichaNutricional {

    private int qtdeCHO;
    private int qtdePTN;
    private int qtdeLIP;

    public FichaNutricional(int qtdeCHO, int qtdePTN, int qtdeLIP) {
        this.qtdeCHO = qtdeCHO;
        this.qtdePTN = qtdePTN;
        this.qtdeLIP = qtdeLIP;
    }

    public int getQtdeCHO() {
        return qtdeCHO;
    }

    public void setQtdeCHO(int qtdeCHO) {
        this.qtdeCHO = qtdeCHO;
    }

    public int getQtdePTN() {
        return qtdePTN;
    }

    public void setQtdePTN(int qtdePTN) {
        this.qtdePTN = qtdePTN;
    }

    public int getQtdeLIP() {
        return qtdeLIP;
    }

    public void setQtdeLIP(int qtdeLIP) {
        this.qtdeLIP = qtdeLIP;
    }
}
