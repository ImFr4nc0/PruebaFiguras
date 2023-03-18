/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebafiguras;

public class TriánguloRectángulo {
    int base, altura;
    
    TriánguloRectángulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    double calcularArea(){
        return base*altura/2;
    }
    
    double calcularPerímetro(){
        return base + altura + calcularHipotenusa();
    }
    
    double calcularHipotenusa(){
        return Math.pow(altura*altura + base*base, 0.5);
    }
    
    void determinarTipoTriángulo(){
        if((base==altura) && (base==calcularHipotenusa()) && (altura==calcularHipotenusa())){
            System.out.println("Es un triángulo equilátero");
        }
        else if ((base!=altura) && (base!=calcularHipotenusa()) && (altura!=calcularHipotenusa())){
            System.out.println("Es un triángulo escaleno");
        }
        else{
            System.out.println("Es un triángulo isóceles");
        }
    }
}
