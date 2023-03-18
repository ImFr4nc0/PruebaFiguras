/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebafiguras;

public class PruebaFiguras {

    public static void main(String[] args) {
        Círculo figura1 = new Círculo(2);
        Rectángulo figura2 = new Rectángulo(1,2);
        Cuadrado figura3 = new Cuadrado(3);
        TriánguloRectángulo figura4 = new TriánguloRectángulo(5,5);
        
        System.out.println("El area del circulo es: " + figura1.calcularArea());
        System.out.println("El perimetro del circulo es: " + figura1.calcularPerímetro() + "\n");
        
        System.out.println("El area del rectangulo es: " + figura2.calcularArea());
        System.out.println("El perimetro del circulo es: " + figura2.calcularPerímetro() + "\n");
        
        System.out.println("El area del cuadrado es: " + figura3.calcularArea());
        System.out.println("El perimetro del circulo es: " + figura3.calcularPerímetro() + "\n");
        
        System.out.println("El area del triangulo es: " + figura4.calcularArea());
        System.out.println("El perimetro del triangulo es: " + figura4.calcularPerímetro());
        figura4.determinarTipoTriángulo();
    }
    
}
