package herencias.basicas;

public class Triangulo extends Punto {

	
	protected float base;
	protected float altura;
	
	
	
	
	public float getArea() {
		
		return base*altura/2;
	}
	public float getPerimetro() {
		
		return Punto.CALCULO_IMPOSIBLE;
	}

	
	
	

	/* *******************
	 * SETTERS Y GETTERS
	 * 	 
	 */
	
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
}
