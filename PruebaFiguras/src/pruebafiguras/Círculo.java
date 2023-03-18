/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebafiguras;

public class Círculo {
    int radio;
    
    Círculo(int radio){
        this.radio = radio;
    }
    
    double calcularArea(){
        return Math.PI*Math.pow(radio,2);
    }
    
    double calcularPerímetro(){
        return Math.PI*radio*2;
    }
}
