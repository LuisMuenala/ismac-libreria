package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Cliente;

public class PrincipalCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Patron de IoC o Inversion de control
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");

		ClienteDAO clienteDAO =context.getBean("clienteDAOImpl",ClienteDAO.class);
		List <Cliente> estudiante=clienteDAO.findAll();
		estudiante.forEach(item ->{
			
			System.out.println(item.toString());
		});
		
		context.close();
	}

}
