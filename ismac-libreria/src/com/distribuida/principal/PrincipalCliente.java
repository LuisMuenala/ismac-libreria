package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Cliente;

public class PrincipalCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Patron de IoC o Inversión de Conrtol
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		ClienteDAO clienteDAO = context.getBean("clienteDAOImpl",ClienteDAO.class);
		
		//CRUD : CREATE, READ UPDATE Y DELETE
		//ADD
		Cliente cliente = new Cliente(0,"1789456123","juan","taipe","direccion","098764321","jtaipe@correo.com");
		//clienteDAO.add(cliente);
		//up
		Cliente cliente2 = new Cliente(49,"17894561232","juan2","taipe2","0987643212","direccion2","jtaipe2@correo.com");
		clienteDAO.add(cliente2);
		//del
		//clienteDAO.del(40);
		//findOne
		System.out.print("*****************DEL********************"+clienteDAO.findOne(40));
		//findAll	
		//List<Cliente> clientes = clienteDAO.findAll();
		clienteDAO .findAll().forEach(item -> { System.out.println(item.toString()); });
		
		context.close();
		
	}

}
