/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author Payares
 */
public class NumerosMixtos {
    private int num;
    private int den;

    public NumerosMixtos(int numerador, int denominador) throws Denominador0Exception {
        this.num = numerador;
        this.den = denominador;

        if (den == 0) {
            throw new Denominador0Exception();
        }
    }

    public int getNumerador() {
        return num;
    }

    public int getDenominador() {
        return den;
    }

    public void setNumerador(int numerador) {
        this.num = numerador;
    }

    public void setDenominador(int denominador) {
        this.den = denominador;
    }

    public NumerosMixtos Sumar(NumerosMixtos m2) throws Denominador0Exception {
        NumerosMixtos Nm;
        int num, dem;

        num = (this.num * m2.den) + (this.den * m2.num);
        dem = this.den * m2.den;

        Nm = new NumerosMixtos(num, dem);
        return Nm;
    }

    public NumerosMixtos Restar(NumerosMixtos m2) throws Denominador0Exception {
        NumerosMixtos Nm;
        int num, dem;

        num = (this.num * m2.den) - (this.den * m2.num);
        dem = this.den * m2.den;

        Nm = new NumerosMixtos(num, dem);
        return Nm;
    }

    public NumerosMixtos Multiplicar(NumerosMixtos m2) throws Denominador0Exception {
        NumerosMixtos Nm;
        int num, dem;

        num = this.num * m2.num;
        dem = this.den * m2.den;

        Nm = new NumerosMixtos(num, dem);
        return Nm;
    }

    public NumerosMixtos Dividir(NumerosMixtos m2) throws Denominador0Exception {
        NumerosMixtos Nm;
        int num, dem;

        num = this.num * m2.den;
        dem = this.den * m2.num;

        Nm = new NumerosMixtos(num, dem);
        return Nm;
    }
}
