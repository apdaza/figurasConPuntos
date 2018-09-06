/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuraspuntos;

import figuraspuntos.logica.Circulo;
import figuraspuntos.logica.Cuadrado;
import figuraspuntos.logica.Figura;
import figuraspuntos.logica.Punto;
import figuraspuntos.logica.Rectangulo;
import figuraspuntos.logica.Triangulo;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class FigurasPuntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Punto uno = new Punto();
        Punto dos = new Punto();
        System.out.println("Ingrese la coordenada del punto uno");
        uno.setX(sc.nextInt());
        uno.setY(sc.nextInt());
        System.out.println("Ingrese la coordenada del punto dos");
        dos.setX(sc.nextInt());
        dos.setY(sc.nextInt());
        
        Figura figura;
        System.out.println("Si desea un cuadrado ingrese 0 \n " +
                "Si desea un circulo ingrese 1 \n " +
                "Si desea un rectangulo ingrese 2 \n " +
                "Si desea un triangulo rectangulo ingrese cualquier cosa");
        int opcion = sc.nextInt();
        String nombre = "";
        switch(opcion){
            case 0:
                figura = new Cuadrado();
                nombre = "Cuadrado";
                break;
            case 1:
                figura = new Circulo();
                nombre = "Circulo";
                break;
            case 2:
                figura = new Rectangulo();
                nombre = "Rectangulo";
                break;
            default:
                figura = new Triangulo();
                nombre = "Triangulo rectangulo";
                break;
        }
        
        figura.setPuntoUno(uno);
        figura.setPuntoDos(dos);
        
        figura.calcularArea();
        figura.calcularPerimetro();
        
        System.out.println("area de " + nombre + ": " + figura.getArea());
        System.out.println("perimetro de " + nombre + ": " + figura.getPerimetro());
    }
    
}
