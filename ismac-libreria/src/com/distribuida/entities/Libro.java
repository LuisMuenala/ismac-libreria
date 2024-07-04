package com.distribuida.entities;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Libro {

	private int idLibro;
	private String titulo;
	private String editorial;
	private int paginas;
	private String edition;
	private String idioma;
	private Date FechaPublicacion;
	private String descripcion;
	private String TipoPasta;
	private String ISBN;
	private int numEjemplares;
	private String portada;
	private String presentacion;
	private Double precio;
	private Categoria categoria;
	private Autor autor; 
	
	public Libro () {}

	public Libro(int idLibro, String titulo, String editorial, int paginas, String edition, String idioma,
			Date fechaPublicacion, String descripcion, String tipoPasta, String iSBN, int numEjemplares, String portada,
			String presentacion, Double precio, Categoria categoria, Autor autor) {
		this.idLibro = idLibro;
		this.titulo = titulo;
		this.editorial = editorial;
		this.paginas = paginas;
		this.edition = edition;
		this.idioma = idioma;
		this.FechaPublicacion = fechaPublicacion;
		this.descripcion = descripcion;
		this.TipoPasta = tipoPasta;
		this.ISBN = iSBN;
		this.numEjemplares = numEjemplares;
		this.portada = portada;
		this.presentacion = presentacion;
		this.precio = precio;
		this.categoria = categoria;
		this.autor = autor;
	}
	
	

	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public Date getFechaPublicacion() {
		return FechaPublicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		FechaPublicacion = fechaPublicacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipoPasta() {
		return TipoPasta;
	}

	public void setTipoPasta(String tipoPasta) {
		TipoPasta = tipoPasta;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getNumEjemplares() {
		return numEjemplares;
	}

	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}

	public String getPortada() {
		return portada;
	}

	public void setPortada(String portada) {
		this.portada = portada;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libro [idLibro=" + idLibro + ", titulo=" + titulo + ", editorial=" + editorial + ", paginas=" + paginas
				+ ", edition=" + edition + ", idioma=" + idioma + ", FechaPublicacion=" + FechaPublicacion
				+ ", descripcion=" + descripcion + ", TipoPasta=" + TipoPasta + ", ISBN=" + ISBN + ", numEjemplares="
				+ numEjemplares + ", portada=" + portada + ", presentacion=" + presentacion + ", precio=" + precio
				+ ", categoria=" + categoria + ", autor=" + autor + "]";
	}
	
	
	
	
}
