package ej_1;

public class ItemCarrito {

	Producto producto;
	int cantidad;
	
	public ItemCarrito(Producto producto, int cantidad) {
		this.producto = producto;
        this.cantidad = cantidad;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	public float getSubtotal(){
        int cant_prod = this.getCantidad();
        float precio_prod = this.getProducto().getPrecio_prod();
        float subtotal = cant_prod * precio_prod;
        return subtotal;
	}
}
