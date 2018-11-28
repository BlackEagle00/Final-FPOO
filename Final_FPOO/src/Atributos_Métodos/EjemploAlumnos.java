package Atributos_Métodos;
import java.io.*;
public class EjemploAlumnos 
{
	static BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
	static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	
	public static void main (String [] args) throws IOException
	{
		Alumno pepe = new Alumno();
		Alumno juan = new Alumno();
		pepe.nombre = "José";
		pepe.apellidos = "Lopez Sánchez";
		juan.nombre = "Juan";
		juan.apellidos = "Rodríguez García";
		System.out.println("Nombre: "+ pepe.nombre +" Apellidos: "+ pepe.apellidos);
		System.out.println("Nombre: "+ juan.nombre +" Apellidos: "+ juan.apellidos);
		System.out.println("La nota de "+ pepe.nombre +" es "+ pepe.notaFinal(true));
	}
}
