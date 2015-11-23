package entities;

public class Pokemon {
	private String nombre;
	private String descripcion;
	private String tipo1;
	private String tipo2;
	public Pokemon(String n, String t1, String t2){
		this.nombre=n;
		this.tipo1=t1;
		this.setTipo2(t2);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo1() {
		return tipo1;
	}
	public void setTipo1(String tipo1) {
		this.tipo1 = tipo1;
	}
	public String getTipo2() {
		return tipo2;
	}
	public void setTipo2(String tipo2) {
		this.tipo2 = tipo2;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
