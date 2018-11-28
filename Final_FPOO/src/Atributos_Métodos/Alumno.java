package Atributos_Métodos;

public class Alumno 
{
	public String nombre;
	public String apellidos;
	public int edad;
	public float notaTeoria;
	public float notaPractica1;
	public float notaPractica2;
	public float notaPractica3;
	public float notaParcial1;
	public float notaParcial2;
	public float notaParcial3;
	public float notaJunio;
	public float notaSeptiembre;
	
	public float notaFinal (boolean estamosEnSeptiembre) 
	{
		float notaParciales = notaPractica1 + notaPractica2 + notaPractica3 + notaParcial1 + notaParcial2 + notaParcial3 + (notaJunio * 0.4f);
		if (estamosEnSeptiembre) 
		{
			if(notaParciales > notaSeptiembre) 
			{
				return notaParciales;
			}
			else 
			{
				return notaSeptiembre;
			}
		}
		else 
		{
			if(notaParciales > notaJunio) 
			{
				return notaParciales;
			}
			else 
			{
				return notaJunio;
			}
		}
	}
}
