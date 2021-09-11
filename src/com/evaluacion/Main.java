
package com.evaluacion;

public class Main {
    public static void main(String[] args) {
        CentroOperaciones centroOperaciones = new CentroOperaciones();
        int[] coordenadasCO = new int[2];
        
        //centro de operaciones está en las coordenadas 0,0
        coordenadasCO[0] = 0;
        coordenadasCO[1] = 0;
        centroOperaciones.setCoordenadasCO(coordenadasCO);
        
        //número máximo de estaciones
        int numeroEstaciones = 3;
        if(numeroEstaciones <= 5){
            centroOperaciones.setNumeroEstaciones(numeroEstaciones);
        }else{
            System.out.println("Estaciones máximas deben ser 5");
        }
        
        //Creamos las estaciones
        //estacion 1
        EstBombero estacion1 = new EstBombero();
        estacion1.setCodigoEstacion(1);
        double[] coordenadas1 = {-3,-2.5};
        estacion1.setCoordenadasEstacion(coordenadas1);
        
        //estacion2
        EstBombero estacion2 = new EstBombero();
        estacion2.setCodigoEstacion(2);
        double[] coordenadas2 = {-2,-2.7};
        estacion1.setCoordenadasEstacion(coordenadas2);
        
        
        //estacion 3
        EstBombero estacion3 = new EstBombero(); 
        estacion3.setCodigoEstacion(2);
        double[] coordenadas3 = {-3,-2};
        estacion2.setCoordenadasEstacion(coordenadas3);

        //guardamos las estaciones en una coleccion llamada EST
        EstBombero EST[] = new EstBombero[3];
        EST[0] = estacion1;
        EST[1] = estacion2;
        EST[2] = estacion3;
        
        //creamos el siniestro y le pasamos sus coordenadas del incendio
        Siniestro incendio = new Siniestro();
        double[]coordernadasSiniestro = {-1.5,-1.5};
        incendio.setCoordenadasIncendio(coordernadasSiniestro);
        
        double[] estacionAtendera = new double[2];
        
        double coordenadaSiniestroX = (incendio.getCoordenadasIncendio()[0]);
        double coordenadaSiniestroY = (incendio.getCoordenadasIncendio()[1]);
        double[] coordenadaEstacion = new double[2];
        
        double distancia = 0;
        
        for(EstBombero estacion:EST){
            
       
            
        }
        
        
    }
}
