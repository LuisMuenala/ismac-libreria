package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.distribuida.entities.Autor;
import com.distribuida.entities.Cliente;
import com.distribuida.entities.Factura;

public class FacturaDAOImpl implements FacturaDAO{
		
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Factura> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("SELECT au FROM Factura au",Factura.class).getResultList();
	}

	@Override
	@Transactional
	public Factura findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("SELECT au FROM Factura au WHERE au.idFactura =: keyIdFactura");
		query.setParameter("keyIdFactura", id);
		return (Factura) query.getSingleResult();
	}

	@Override
	@Transactional
	public void add(Factura factura) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(factura); 

	}

	@Override
	@Transactional
	public void up(Factura factura) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("UPDATE Factura au SET au.num_factura =: keyNum_factura"
				+"                    ,au.fecha =: keyFecha"
				+"                    ,au.total_neto =: keyTotal_neto"
				+"                    ,au.iva =: keyIva"
				+"                    ,au.total =: keyTotal"
				+"               WHERE au.idFactura =: keyIdFactura");
		query.setParameter("keyNum_factura", factura.getNum_factura());
		query.setParameter("keyFecha", factura.getFecha());
		query.setParameter("keyTotal_neto", factura.getTotal_neto());
		query.setParameter("keyIva", factura.getIva());
		query.setParameter("keyTotal", factura.getTotal());
		query.setParameter("keyIdFactura", factura.getIdFactura());
		
		query.executeUpdate();
		
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("DELETE FROM Factura au WHERE au.idFactura =: keyIdFactura");
		query.setParameter("keyFactura", id); 
		query.executeUpdate(); 

	}

}


