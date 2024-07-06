package com.distribuida.principal;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.distribuida.dao.CategoriaDAO;
import com.distribuida.entities.Categoria;
public class PrincipalCategoria {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Patron de Ioc o Inversion de control
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("ApplicationContext.xml");//esete es el contenedor
		CategoriaDAO CategoriaDAO = context.getBean("CategoriaDAOImpl",CategoriaDAO.class);
		//CRUD CREEATE READ UPDATE Y DELETE
		//add
		Categoria categoria = new Categoria (0,"Terror","causa sensacion de miedo");
		//CategoriaDAO.add(categoria);
		//UPDATE
		Categoria categoria2 = new Categoria (40,"Ficcion","la travesia de santiago");
		//categoriaDAO.up(categoria2);

		//del
		//categoriaDAO.del(40);
		//findOne

		System.out.println("************DEL*******"+CategoriaDAO.findOne(40));
		//findAll
		//List<Cliente> clientes= clienteDAO.findAll();	
		CategoriaDAO.findAll().forEach(item -> {System.out.println(item.toString());});
		context.close();
	}

 
}