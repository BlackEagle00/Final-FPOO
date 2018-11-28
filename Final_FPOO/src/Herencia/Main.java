package Herencia;

import java.util.Scanner;

public class Main
{
	
	public static void main (String [] args) 
	{
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Nombre");
		String nombre = sc.next();
		System.out.println("Apellido");
		String apellido = sc.next();
		System.out.println("Edad");
		int edad = sc.nextInt();
		
		Persona p1 = new Persona (nombre, apellido, edad);
		
		p1.saludo();
		p1.saludoPersona(nombre, apellido);
		p1.mostrarEdad(nombre, apellido, edad);
		
		System.out.println("\nCodigo de ususario");
		int codigo = sc.nextInt();
		System.out.println("Motivo de su cita");
		String motivo = sc.next();
		
		Paciente pct1 = new Paciente (apellido, apellido, edad, codigo, motivo);
		
		pct1.mostrarDatos();
		
	}

}
