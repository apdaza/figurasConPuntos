/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuraspuntos.logica;

/**
 *
 * @author Estudiantes
 */
public class Triangulo extends Figura{

    @Override
    public void calcularArea() {
        Punto temporal = new Punto();
        temporal.setX(this.puntoUno.getX());
        temporal.setY(this.puntoDos.getY());
        
        int base = temporal.calcularDistancia(this.puntoDos);
        int altura = temporal.calcularDistancia(this.puntoUno);
        
        this.area = base * altura / 2;
    }

    @Override
    public void calcularPerimetro() {
        Punto temporal = new Punto();
        temporal.setX(this.puntoUno.getX());
        temporal.setY(this.puntoDos.getY());
        
        int base = temporal.calcularDistancia(this.puntoDos);
        int altura = temporal.calcularDistancia(this.puntoUno);
        int hipo = this.puntoUno.calcularDistancia(this.puntoDos);
        this.perimetro = base + altura + hipo;
    }
    
}
