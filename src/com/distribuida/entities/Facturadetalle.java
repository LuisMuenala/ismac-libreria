package com.distribuida.entities;

public class Facturadetalle {

	private int idFacturaDetalle;
	private int cantidad;
	private Double subtotal;
	private Factura factura;
	private Libro libro;
	
	public Facturadetalle () {}

	public Facturadetalle(int idFacturaDetalle, int cantidad, Double subtotal, Factura factura, Libro libro) {
		
		this.idFacturaDetalle = idFacturaDetalle;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		this.factura = factura;
		this.libro = libro;
	}

	public int getIdFacturaDetale() {
		return idFacturaDetalle;
	}

	public void setIdFacturaDetale(int idFacturaDetale) {
		this.idFacturaDetalle = idFacturaDetale;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	@Override
	public String toString() {
		return "FacturaDetalle [idFacturaDetalle=" + idFacturaDetalle + ", cantidad=" + cantidad + ", subtotal="
				+ subtotal + ", factura=" + factura + "]";
	}

	
	
	
}