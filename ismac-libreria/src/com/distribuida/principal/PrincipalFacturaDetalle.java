package com.distribuida.principal;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.dao.FacturaDAO;
import com.distribuida.dao.FacturaDetalleDAO;
import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.Factura;
import com.distribuida.entities.FacturaDetalle;

public class PrincipalFacturaDetalle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				//Patron de Ioc o Inversion de control
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("ApplicationContext.xml");
				FacturaDetalleDAO  facturaDetalleDAO = context.getBean("facturaDetalleDAOImpl",FacturaDetalleDAO.class);
				//FacturaDetalleDAO  facturaDetalleDAO = context.getBean("facturaDetalleDAO",FacturaDetalleDAO.class);
				//CRUD CREEATE READ UPDATE Y DELETE
				FacturaDAO facturaDAO=context.getBean("facturaDAOImpl",FacturaDAO.class);
				LibroDAO libroDAO=context.getBean("libroDAOImpl",LibroDAO.class);
				//add
				FacturaDetalle facturaDetalle = new FacturaDetalle(0,2,2.3);
				facturaDetalle.setFactura(facturaDAO.findOne(2));
				facturaDetalle.setLibro(libroDAO.findOne(2));
				facturaDetalleDAO.add(facturaDetalle);
				
				//UPDATE ACTUALIZADO
				
				FacturaDetalle facturad = new FacturaDetalle(0,2,2.3);
				facturad.setFactura(facturaDAO.findOne(3));
				facturad.setLibro(libroDAO.findOne(3));
				//facturaDetalleDAO.up(facturad);
				
				//del BORRADO
				//facturaDetalleDAO.del(86);
				//findOne
				
				
				System.out.println("*****DEL**"+facturaDetalleDAO.findOne(86));
				//findAll
				//List<Factura> Facturas= FacturaDAO.findAll();	
				facturaDAO.findAll().forEach(item -> {System.out.println(item.toString());});
						
				context.close();
			}
			

		}
