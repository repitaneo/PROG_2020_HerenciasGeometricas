package herencia;

import java.util.Scanner;

public class Start {

	 public static void main(String[] args) {
	      
		 Cuadrado cuadrado = new Cuadrado();
		 cuadrado.setX(12);
		 cuadrado.setY(25);
		 cuadrado.setLado(6);
		 
		 System.out.println(cuadrado.getArea());
		 System.out.println(cuadrado.getPerimetro());

		 
		 
		 Triangulo triangulo = new Triangulo();
		 triangulo.setX(256);
		 triangulo.setY(-23);
		 triangulo.setBase(120);
		 triangulo.setAltura(45);
		 
		 System.out.println(triangulo.getArea());
		 System.out.println(triangulo.getPerimetro());

		 
		 
		 
		 Circulo circulo = new Circulo();
		 circulo.setX(-23);
		 circulo.setX(23);
		 circulo.setRadio(45);
		 
		 System.out.println(circulo.getArea());
		 System.out.println(circulo.getPerimetro());
		 
		 
	  }  
}
