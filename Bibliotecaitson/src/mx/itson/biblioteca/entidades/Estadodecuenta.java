/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.biblioteca.entidades;

/**
 *
 * @author ABCDE-SONY
 */
public class Estadodecuenta {

    /**
     * @return the deuda
     */
    public int getDeuda() {
        return deuda;
    }

    /**
     * @param deuda the deuda to set
     */
    public void setDeuda(int deuda) {
        this.deuda = deuda;
    }

    /**
     * @return the abonar
     */
    public int getAbonar() {
        return abonar;
    }

    /**
     * @param abonar the abonar to set
     */
    public void setAbonar(int abonar) {
        this.abonar = abonar;
    }
    private int deuda;
    private int abonar;
    /**
     * 
     * @param deuda
     * @param abonar
     * @return 
     */
    public int estadofinal(int deuda , int abonar){
        int resultadofinal = deuda-abonar;
        return resultadofinal;
        
    
    }
}
