package ej_1;

public abstract class Descuento {

	private float valor;
	float tope;

	public float getValorDesc() {
		return valor;
	}
	
	public void setValorDesc(float valor) {
		this.valor = valor;
	}
		
	public float getTope() {
		return tope;
	}

	public void setTope(float tope) {
		this.tope = tope;
	}

	public abstract float valorFinal(float valorInicial);

}
