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
public abstract class Figura {
    protected Punto puntoUno;
    protected Punto puntoDos;
    protected int area;
    protected int perimetro;

    public void setPuntoUno(Punto puntoUno) {
        this.puntoUno = puntoUno;
    }

    public void setPuntoDos(Punto puntoDos) {
        this.puntoDos = puntoDos;
    }

    public Punto getPuntoUno() {
        return puntoUno;
    }

    public Punto getPuntoDos() {
        return puntoDos;
    }
    
    public abstract void calcularArea();
    
    public abstract void calcularPerimetro();

    public int getArea() {
        return area;
    }

    public int getPerimetro() {
        return perimetro;
    }
    
    
    
}
