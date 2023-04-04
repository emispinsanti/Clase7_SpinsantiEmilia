package ej_1;
import java.util.ArrayList;
import java.util.List;

public class Carrito {

	List <ItemCarrito> listacarrito = new ArrayList();
	
	public Carrito() {
	}
		
	public void agregar_item(ItemCarrito ic) {
		this.listacarrito.add(ic);
	}
	
	public ItemCarrito mostrar_item(int posicion) {
		return listacarrito.get(posicion);
	}
	
	public int cant_items() {
		return listacarrito.size();
	}

	public float getTotal(){
		float total = 0;
		for (int i=0; i<listacarrito.size() ; i++){
			total += this.listacarrito.get(i).getSubtotal();
        }
        return total;
    }
	
}
