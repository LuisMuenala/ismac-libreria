package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Autor;

public class PrincipalAutor {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Patron de IoC o Inversión de Conrtol
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
				AutorDAO autorDAO = context.getBean("autorDAOImpl2",AutorDAO.class);
				
				//CRUD : CREATE, READ UPDATE Y DELETE
				//ADD
				Autor Autor = new Autor(0,"juan","taipe","pais","direccion","098764321","jtaipe@correo.com");
				//autorDAO.add(Autor); //crear
				//up
				Autor Autor2 = new Autor(54,"juan2","taipe2","pais2","direccion2","0987643212","jtaipe2@correo.com");
				autorDAO.up(Autor2); //modificar 
				//del
				//autorDAO.del(40);
				//findOne
				System.out.print("*****************DEL********************"+autorDAO.findOne(40));
				//findAll	
				//List<Autor> Autors = autorDAO.findAll();
				autorDAO .findAll().forEach(item -> { System.out.println(item.toString()); });
				
				context.close();
		
	}

}
