package Atributos_M�todos;
import java.io.*;
public class EjemploAlumnos 
{
	static BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
	static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	
	public static void main (String [] args) throws IOException
	{
		Alumno pepe = new Alumno();
		Alumno juan = new Alumno();
		pepe.nombre = "Jos�";
		pepe.apellidos = "Lopez S�nchez";
		juan.nombre = "Juan";
		juan.apellidos = "Rodr�guez Garc�a";
		System.out.println("Nombre: "+ pepe.nombre +" Apellidos: "+ pepe.apellidos);
		System.out.println("Nombre: "+ juan.nombre +" Apellidos: "+ juan.apellidos);
		System.out.println("La nota de "+ pepe.nombre +" es "+ pepe.notaFinal(true));
	}
}
