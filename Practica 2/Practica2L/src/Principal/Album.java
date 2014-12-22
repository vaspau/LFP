package Principal;

public class Album {
	private String autor="";
	private String titulo="";
	private String formato="";
	private String portada="";
	
	public Album(String autor, String titulo, String formato, String portada){
		this.autor=autor;
		this.titulo=titulo;
		this.formato=formato;
		this.portada=portada;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public String getPortada() {
		return portada;
	}

	public void setPortada(String portada) {
		this.portada = portada;
	}

	
}
