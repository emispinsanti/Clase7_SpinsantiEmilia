package ej_1;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;


public class demoTest {
	
	//TEST PRECIO CARRITO
	@Test
	public void Test_1() {
		
		List <Producto> lista_prod = new ArrayList();
		
		Producto alfajor = new Producto();
		alfajor.setNombre_prod("Alfajor");
		alfajor.setCodigo_prod(1);
		alfajor.setPrecio_prod(125);
		lista_prod.add(alfajor);
		
		Producto pan = new Producto();
		pan.setNombre_prod("Pan lactal");
		pan.setCodigo_prod(2);
		pan.setPrecio_prod(240);
		lista_prod.add(pan);
		
		Producto leche = new Producto();
		leche.setNombre_prod("Leche entera");
		leche.setCodigo_prod(3);
		leche.setPrecio_prod(160);
		lista_prod.add(leche);
		
		Producto naranja = new Producto();
		naranja.setNombre_prod("Naranja");
		naranja.setCodigo_prod(4);
		naranja.setPrecio_prod(80);
		lista_prod.add(naranja);
		
		Carrito carrito1 = new Carrito();
		ItemCarrito item1 = new ItemCarrito(lista_prod.get(0), 1);
		carrito1.agregar_item(item1);
		ItemCarrito item2 = new ItemCarrito(lista_prod.get(1), 1);
		carrito1.agregar_item(item2);
		ItemCarrito item3 = new ItemCarrito(lista_prod.get(2), 1);
		carrito1.agregar_item(item3);
		
		assertEquals(525, carrito1.getTotal(),0);
	}
	
	
	@Test
	public void Test_2() {
		
		List <Producto> lista_prod = new ArrayList();
		
		Producto alfajor = new Producto();
		alfajor.setNombre_prod("Alfajor");
		alfajor.setCodigo_prod(1);
		alfajor.setPrecio_prod(125);
		lista_prod.add(alfajor);
		
		Producto pan = new Producto();
		pan.setNombre_prod("Pan lactal");
		pan.setCodigo_prod(2);
		pan.setPrecio_prod(240);
		lista_prod.add(pan);
		
		Producto leche = new Producto();
		leche.setNombre_prod("Leche entera");
		leche.setCodigo_prod(3);
		leche.setPrecio_prod(160);
		lista_prod.add(leche);
		
		Producto naranja = new Producto();
		naranja.setNombre_prod("Naranja");
		naranja.setCodigo_prod(4);
		naranja.setPrecio_prod(80);
		lista_prod.add(naranja);
		
		Carrito carrito1 = new Carrito();
		ItemCarrito item1 = new ItemCarrito(lista_prod.get(1), 5);
		carrito1.agregar_item(item1);
		ItemCarrito item2 = new ItemCarrito(lista_prod.get(2), 2);
		carrito1.agregar_item(item2);
		ItemCarrito item3 = new ItemCarrito(lista_prod.get(3), 3);
		carrito1.agregar_item(item3);
		
		assertEquals(1760, carrito1.getTotal(),0);
	}
	
	
	
	//TEST DESCUENTOS
	@Test
	public void Test_3() {
		
		float total = 5000;
		float descuento1 = (float) 140.0;
		float descuento2= (float) 0;
		float descuento3= (float) 0;
		
		Descuento desc_fijo = new DescuentoFijo();
		desc_fijo.setValorDesc(descuento1);
		float desc1 = desc_fijo.valorFinal(total);

		Descuento desc_porc = new DescuentoPorc();
		desc_porc.setValorDesc(descuento2);
		float desc2 = desc_porc.valorFinal(desc1);
		
		Descuento desc_porc_tope = new DescuentoPorcTope();
		float tope = 300;
		desc_porc_tope.setTope(tope);
		desc_porc_tope.setValorDesc(descuento3);
		float desc3 = desc_porc_tope.valorFinal(desc2);
		
		assertEquals(4860, desc3,0);
	}
	
	@Test
	public void Test_4() {
		
		float total = 5000;
		float descuento1 = (float) 140.0;
		float descuento2= (float) 0.5;
		float descuento3= (float) 0;
		
		Descuento desc_fijo = new DescuentoFijo();
		desc_fijo.setValorDesc(descuento1);
		float desc1 = desc_fijo.valorFinal(total);

		Descuento desc_porc = new DescuentoPorc();
		desc_porc.setValorDesc(descuento2);
		float desc2 = desc_porc.valorFinal(desc1);
		
		Descuento desc_porc_tope = new DescuentoPorcTope();
		float tope = 300;
		desc_porc_tope.setTope(tope);
		desc_porc_tope.setValorDesc(descuento3);
		float desc3 = desc_porc_tope.valorFinal(desc2);
		
		assertEquals(2430, desc3,0);
	}
	
	@Test
	public void Test_5() {
		
		float total = 5000;
		float descuento1 = (float) 140.0;
		float descuento2= (float) 0.5;
		float descuento3= (float) 0.1;
		
		Descuento desc_fijo = new DescuentoFijo();
		desc_fijo.setValorDesc(descuento1);
		float desc1 = desc_fijo.valorFinal(total);

		Descuento desc_porc = new DescuentoPorc();
		desc_porc.setValorDesc(descuento2);
		float desc2 = desc_porc.valorFinal(desc1);
		
		Descuento desc_porc_tope = new DescuentoPorcTope();
		float tope = 300;
		desc_porc_tope.setTope(tope);
		desc_porc_tope.setValorDesc(descuento3);
		float desc3 = desc_porc_tope.valorFinal(desc2);
		
		assertEquals(2187, desc3,0);
	}
	
	@Test
	public void Test_6() {
		
		float total = 5000;
		float descuento1 = (float) 140.0;
		float descuento2= (float) 0.5;
		float descuento3= (float) 0.1;
		
		Descuento desc_fijo = new DescuentoFijo();
		desc_fijo.setValorDesc(descuento1);
		float desc1 = desc_fijo.valorFinal(total);

		Descuento desc_porc = new DescuentoPorc();
		desc_porc.setValorDesc(descuento2);
		float desc2 = desc_porc.valorFinal(desc1);
		
		Descuento desc_porc_tope = new DescuentoPorcTope();
		float tope = 10;
		desc_porc_tope.setTope(tope);
		desc_porc_tope.setValorDesc(descuento3);
		float desc3 = desc_porc_tope.valorFinal(desc2);
		
		assertEquals(2420, desc3,0);
	}
	
}
