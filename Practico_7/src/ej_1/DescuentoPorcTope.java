package ej_1;

public class DescuentoPorcTope extends Descuento {

	@Override
	public float valorFinal(float valorInicial) {
		float total = valorInicial * this.getValorDesc();
		float tope = this.getTope();
		
		if (total < tope) {
			return valorInicial - (valorInicial * this.getValorDesc());
		} else {
			return valorInicial - tope;
		}
		
	}
}
