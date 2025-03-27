/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.biblioteca.entidades;

/**
 *
 * @author ABCDE-SONY
 */
public class Estudiante {

    /**
     * @return the edad
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * @param semestre the edad to set
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    /**
     * @return the estudiant
     */
    public String getEstudiant() {
        return estudiant;
    }

    /**
     * @param estudiant the estudiant to set
     */
    public void setEstudiant(String estudiant) {
        this.estudiant = estudiant;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    
    private String estudiant;
    private String id;
    private int semestre;
}
