package herencias.avanzadas;

import herencias.basicas.Circulo;

public class Cono extends Circulo {

	private float altura;
	private int z;
	
	
	
	public float getVolumen() {
		
		
		return Circulo.PI*radio*radio/3*altura;
	}
	
	
	
	
	
	/* setters y getters */
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	
	
	
	
}
