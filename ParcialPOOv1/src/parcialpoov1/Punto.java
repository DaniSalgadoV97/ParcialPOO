/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoov1;

/**
 *
 * @author Estudiantes
 */
public class Punto {

    private int x, y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Punto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(int x1) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

}
