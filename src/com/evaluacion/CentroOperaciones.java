
package com.evaluacion;
    
public class CentroOperaciones {
    private int [] coordenadasCO = new int[2];
    private int numeroEstaciones;
    public CentroOperaciones() {
    }

    public int[] getCoordenadasCO() {
        return coordenadasCO;
    }

    public void setCoordenadasCO(int[] coordenadasCO) {
        
        this.coordenadasCO = coordenadasCO;
    }

    public int getNumeroEstaciones() {
        return numeroEstaciones;
    }

    public void setNumeroEstaciones(int numeroEstaciones) {
        this.numeroEstaciones = numeroEstaciones;
    }
    
}
