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
public class Cuadrado extends Figura{

    @Override
    public void calcularArea() {
        int lado = this.puntoUno.calcularDistancia(puntoDos);
        this.area = lado * lado;
    }

    @Override
    public void calcularPerimetro() {
        int lado = this.puntoUno.calcularDistancia(puntoDos);
        this.perimetro = lado * 4;
    }
    
}
