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
public class Circulo extends Figura{

    @Override
    public void calcularArea() {
        int radio = this.puntoUno.calcularDistancia(this.puntoDos);
        this.area = (int)(Math.PI * Math.pow(radio, 2));
    }

    @Override
    public void calcularPerimetro() {
        int radio = this.puntoUno.calcularDistancia(this.puntoDos);
        this.perimetro = (int)(2 * Math.PI * radio);
    }
    
}
