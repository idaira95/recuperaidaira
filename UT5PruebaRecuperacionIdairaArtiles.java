/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut5pruebarecuperacionidaira;

public class Ordenador {


    private String cpu;
    private String ram;
    private String resolucionPantalla;

    public String getProcesador() {
        return cpu;
    }

    public void setProcesador(String procesador) {
        this.cpu = procesador;
    }

    public String getMemoria() {
        return ram;
    }

    public void setMemoria(String memoria) {
        this.ram = memoria;
    }

    public String getResolucionPantalla() {
        return resolucionPantalla;
    }

    public void setResolucionPantalla(String resolucionPantalla) {
        this.resolucionPantalla = resolucionPantalla;
    }
    
   
}