package com.distribuida.entities;

import java.util.Date;

public class Factura {

	private int idFactura;
	private String numfactura;
	private Date fecha;
	private double totalneto;
	private double iva;
	private double total;
	//private int idCliente;
	private Cliente cliente;
	
	
	public Factura() {}

	public Factura(int idFactura, String numfactura, Date fecha, double totalneto, double iva, double total
			) {

		this.idFactura = idFactura;
		this.numfactura = numfactura;
		this.fecha = fecha;
		this.totalneto = totalneto;
		this.iva = iva;
		this.total = total;
		//this.idCliente = idCliente;
		
	}



	public int getIdFactura() {
		return idFactura;
	}



	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}



	public String getNumfactura() {
		return numfactura;
	}



	public void setNumfactura(String numfactura) {
		this.numfactura = numfactura;
	}



	public Date getFecha() {
		return fecha;
	}



	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}



	public double getTotalneto() {
		return totalneto;
	}



	public void setTotalneto(double totalneto) {
		this.totalneto = totalneto;
	}



	public double getIva() {
		return iva;
	}



	public void setIva(double iva) {
		this.iva = iva;
	}



	public double getTotal() {
		return total;
	}



	public void setTotal(double total) {
		this.total = total;
	}




	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", numfactura=" + numfactura + ", fecha=" + fecha + ", totalneto="
				+ totalneto + ", iva=" + iva + ", total=" + total + ", cliente=" + cliente + "]";
	}
	
	
	
	
	
	
	
	
	
}
