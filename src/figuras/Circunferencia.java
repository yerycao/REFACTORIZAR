/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author Vespertino
 */
public class Circunferencia {

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param rad the radio to set
     */
    public void setRadio(double rad) {
        this.radio = rad;
    }
    private double radio;
    public Circunferencia(double radio){
        this.radio = radio;
    }
    private String color;
    public void imprimir(){
        color = "rojo";
        System.out.println("Diámetro: " + (float) (2*getRadio()));
        System.out.println("Color: " + color);
        double area = 2 * Math.PI * getRadio() * getRadio();
        System.out.println(area);
    }
    
    public boolean esIgual (boolean considerarDecimales, Circunferencia otro){
        double radio1 = this.getRadio();
        double radio2 = otro.getRadio();
        if (considerarDecimales){
            if (radio1 == radio2)
            return true;
            else
            return false;
        }else{
            if (Math.abs(radio1-radio2)<1)
            return true;
            else
            return false;
        }
    }
}
