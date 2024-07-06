package com.distribuida.principal;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.dao.CategoriaDAO;
import com.distribuida.dao.FacturaDAO;
import com.distribuida.dao.FacturaDetalleDAO;
import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.FacturaDetalle;
import com.distribuida.entities.Libro;

public class PrincipalLibro {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("ApplicationContext.xml");//esete es el contenedor
		LibroDAO  libroDAO = context.getBean("libroDAOImpl",LibroDAO.class);
		//FacturaDetalleDAO  facturaDetalleDAO = context.getBean("facturaDetalleDAO",FacturaDetalleDAO.class);
		//CRUD CREEATE READ UPDATE Y DELETE
		CategoriaDAO  categoriaDAO=context.getBean("categoriaDAOImpl",CategoriaDAO.class);
		AutorDAO autorDAO=context.getBean("autorDAOImpl",AutorDAO.class);
		//add
		Libro  libro = new Libro(0,"jg","df",23,"er","ing",new Date(),"autor","ll","fd",25,"titulo","inicial",12.3);
		libro.setCategoria(categoriaDAO.findOne(2));
		libro.setAutor(autorDAO.findOne(2));
		libroDAO.add(libro);
		
		//UPDATE ACTUALIZADO
		
		Libro  libro2 = new Libro();
		libro2.setCategoria(categoriaDAO.findOne(2));
		libro2.setAutor(autorDAO.findOne(2));
		//libroDAO.up(libro2);
		
		//del BORRADO
		//libroDAO.del(86);
		//findOne
		
		
		System.out.println("*****DEL**"+libroDAO.findOne(86));
		//findAll
		//List<Factura> Facturas= FacturaDAO.findAll();	
		libroDAO.findAll().forEach(item -> {System.out.println(item.toString());});
				
		context.close();
	}
	

}

