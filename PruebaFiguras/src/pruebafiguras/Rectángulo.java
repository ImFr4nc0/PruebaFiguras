/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebafiguras;

public class Rectángulo {
    int base, altura;
    
    Rectángulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    double calcularArea(){
        return base*altura;
    }
    
    double calcularPerímetro(){
        return (2*base) + (2*altura);
    }
}
