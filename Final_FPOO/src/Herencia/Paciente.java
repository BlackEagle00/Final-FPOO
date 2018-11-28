package Herencia;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Paciente extends Persona 
{
	
	Scanner sc = new Scanner (System.in);
	Calendar calendario = new GregorianCalendar();
	
	private int codigoPaciente;
	private String motivoCita;
	
	public Paciente (String nombre,String apellido, int edad, int codigoPaciente, String motivoCita) 
	{
		super (nombre, apellido, edad);
		this.codigoPaciente = codigoPaciente;
		this.motivoCita = motivoCita;
	}
	
	public void mostrarDatos () 
	{
		int dia = calendario.get(Calendar.DAY_OF_MONTH);
		int mes = calendario.get(Calendar.MONTH);
		int año = calendario.get(Calendar.YEAR);
		int hora = calendario.get(Calendar.HOUR_OF_DAY);
		int minuto = calendario.get(Calendar.MINUTE);
		int costoCita = 58000;
		
		if(hora > 12) 
		{
			System.out.println("Paciente: " + getNombre()+ " " + getApellido() 
			+ "\nCodigo: " + codigoPaciente 
			+ "\nMotivo de la consulta: " + motivoCita
			+ "\nFecha de la cita: " +  dia + "/" + mes + "/"  + año
			+ "\nHora de la cita: " +  hora + ":" + minuto + " PM"
			+ "\nCosto de la cita: " + costoCita + " pesos");
		}
		else 
		{
			System.out.println("Paciente: " + getNombre()+ " " + getApellido() 
			+ "\nCodigo: " + codigoPaciente 
			+ "\nMotivo de la consulta: " + motivoCita
			+ "\nFecha de la cita: " +  dia + "/" + mes + "/"  + año
			+ "\nHora de la cita: " +  hora + ":" + minuto + " AM"
			+ "\nCosto de la cita: " + costoCita + " pesos");
		}
	}
}