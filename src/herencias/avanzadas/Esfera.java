package herencias.avanzadas;

import herencias.basicas.Circulo;

public class Esfera extends Circulo {

	private int z;

	
	
	public float getVolumen() {
		
		
		return 4/3*Circulo.PI*radio*radio*radio;
	}
	
	
	
	/* setters y getters */
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	
	
	
}
