/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.biblioteca.ui;


import java.util.ArrayList;
import java.util.Scanner;
import mx.itson.biblioteca.entidades.Estadodecuenta;
import mx.itson.biblioteca.entidades.Estudiante;
import mx.itson.biblioteca.entidades.Libro;


/**
 *
 * @author ABCDE-SONY
 */
public class Main {
    public static void main(String[] args) {
        
    
        
        Scanner scanner = new Scanner (System.in);
        ArrayList<String> listalibro = new ArrayList<>();
        ArrayList<String> potrousuario = new ArrayList<>();
        Estudiante usuario = new Estudiante ();
        Libro libresito = new Libro ();
        Estadodecuenta comprasyventas = new Estadodecuenta ();
        String repetir;
        
        System.out.println("Ingrese su nombre");
        String estudiant = scanner.nextLine();
        
        System.out.println("Ingrese su id potros");
        String id = scanner.nextLine();
          
        System.out.println("ingrese el semestre en el que va");
        int semestre = Integer.parseInt(scanner.nextLine());
        
            //estudiante
        usuario.setEstudiant(estudiant);
        usuario.setId(id);
        usuario.setSemestre(semestre);
        potrousuario.add("id:"+id+", hola "+estudiant+" de "+semestre+"° semestre estos son los libros que tienes");
                
        int numero_de_libro=0;
        int deuda=0;
        do {
             System.out.print("que quieres hacer?"+
                    "\n 1. agregar libro por 100 pesos"+
                    "\n 2. ver la lista de libros"+
                    "\n 3. pagar deuda"+
                    "\n 4. salir"+
                    "\n  ");
            String hacer = scanner.nextLine();
            System.out.println("##############"+"\n");
            
            if(hacer.equals("1")) {
                deuda=deuda+100;
                comprasyventas.setDeuda(deuda);
                System.out.println("Ingrese el nombre del libro");
                String portada = scanner.nextLine();
        
                System.out.println("Ingrese el genero del libro");
                String genero = scanner.nextLine();  
        
                //libro
                libresito.setPortada(portada);
                libresito.setGenero(genero);
                numero_de_libro=numero_de_libro+1;
                listalibro.add("\n"+numero_de_libro+(".el nombre del libro es: "+portada+"\n  el genero es: "+genero));
                
            }
            if(hacer.equals("2")) {
                System.out.println(potrousuario);
                System.out.println("los libros que tienes son:" + listalibro);
                System.out.println("\n");
            }
            if(hacer.equals("3")) {
                System.out.println("tiene una deuda de: "+deuda+" desea abonar solo puede abonar en numeros enteros, si desea abonar ponga (1)");
                String talvez = scanner.nextLine();
                
                if(talvez.equals("1")) {
                    System.out.println("cuando desea abonar?");
                    int abonar = Integer.parseInt(scanner.nextLine());
                    comprasyventas.setAbonar(abonar);
                    int resultadofinal = comprasyventas.estadofinal( deuda, abonar);
                    deuda=deuda-abonar;
                    System.out.println("su deuda quedo en "+resultadofinal);
                    
                }
            }
            if(hacer.equals("4")) {
                break;
            }
                    
       
            System.out.println("si quiere volver al menu precione  (s) o (S)"+
                   "\n para terminar el programa ingrese calcuer cosa que no sea (S) o (s)");
            repetir = scanner.nextLine().toLowerCase();
            System.out.println("##############"+"\n");
        } while (repetir.equals("s"));
        System.out.println("Programa terminado");
        
    }
}
