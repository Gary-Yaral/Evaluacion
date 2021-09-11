
package com.evaluacion;

public class Siniestro {
    private double[] coordenadasIncendio = new double[2];
    private int[] codEstacionQueAtendio;
    public Siniestro() {
    }

    public double[] getCoordenadasIncendio() {
        return coordenadasIncendio;
    }

    public void setCoordenadasIncendio(double[] coordenadasIncendio) {
        this.coordenadasIncendio = coordenadasIncendio;
    }

    public int[] getCodEstacionQueAtendio() {
        return codEstacionQueAtendio;
    }

    public void setCodEstacionQueAtendio(int[] codEstacionQueAtendio) {
        this.codEstacionQueAtendio = codEstacionQueAtendio;
    }
    
}
