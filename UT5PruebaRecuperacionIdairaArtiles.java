 /*
 * ESTA CLASE SE USARÁ PARA REALIZAR EL EXAMEN DE RECUPERACION
 * 
 * @author: IDAIRA ISABEL ARTILES TELLADO
 */
package ut5pruebarecuperacionidaira;

public class Ordenador {


    private String cpu;
    /* SIRVE PARA USARLO DE OPERANDO Y EN REALIDAD DEBERÍA DE LLAMARSE 'PROCESADOR'.*/
    private String ram;
    /* SIRVE PARA USARLO DE OPERANDO Y EN REALIDAD DEBERÍA DE LLAMARSE 'MEMORIA'.*/
    private String resolucionPantalla;
    /* SIRVE PARA USARLO DE OPERANDO .*/

    public String getProcesador() {
        return cpu;
    }
    
    public void setProcesador(String cpu) {
        this.cpu = cpu;
    }

    public String getMemoria() {
        return ram;
    }

    public void setMemoria(String memoria) {
        this.ram = ram;
    }

    public String getResolucionPantalla() {
        return resolucionPantalla;
    }

    public void setResolucionPantalla(String resolucionPantalla) {
        this.resolucionPantalla = resolucionPantalla;
    }
    
   
}