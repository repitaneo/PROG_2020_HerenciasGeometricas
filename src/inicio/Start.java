package inicio;

import java.util.Scanner;

import herencias.avanzadas.Cono;
import herencias.avanzadas.Esfera;
import herencias.basicas.Circulo;
import herencias.basicas.Cuadrado;
import herencias.basicas.Triangulo;

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
		 
		 
		 
		 Esfera esfera = new Esfera();
		 esfera.setZ(4);
		 esfera.setRadio(4.3f);
		 System.out.println(esfera.getVolumen());
		 
		 
		 
		 Cono cono = new Cono();
		 cono.setZ(3);
		 cono.setRadio(5.4f);
		 cono.setAltura(7.2f);
		 System.out.println(cono.getVolumen());
		 
		 
	  }  
}
