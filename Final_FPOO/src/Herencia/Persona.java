package Herencia;

public class Persona
{
	private String nombre;
	private String apellido;	
	private int edad;
	
	public Persona(String nombre, String apellido, int edad) 
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this. edad= edad;
	}
	
	public String getNombre	() 
	{
		return nombre;
	}
	public String getApellido() 
	{
		return apellido;
	}
	public int getEdad() 
	{
		return edad;
	}
	
	public void saludo () 
	{
		System.out.println("Hola");
	}
	public void saludoPersona(String nombre, String apellido) 
	{
		System.out.println("Hola " + nombre + " " + apellido);
	}
	public void mostrarEdad (String nombre, String apellido, int edad)
	{
		System.out.println(nombre + " " + apellido + " tiene " + edad + " años de edad");
	}

}
