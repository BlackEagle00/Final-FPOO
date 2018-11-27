public class Main {
	
	public static void main (String [] args) {
		
		MetodosOrdenamiento ordenar = new MetodosOrdenamiento ();
		
		int [] array = {70, 54, 879 ,1 ,23 ,87, 9, 45, 12, 0, 78, 6};
		int [] arrayOrdenado = new int [array.length];
		int indice = 0;
		
		arrayOrdenado = ordenar.bubble_Sort(array);
		for (int i = 0; i < arrayOrdenado.length; i++) {
			System.out.print("[" + arrayOrdenado [i] + "] ");
		}
		indice = ordenar.interpolationSearch(arrayOrdenado, 9);
		System.out.println("\n" + indice);
		
	}

}