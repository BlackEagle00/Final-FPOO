import java.io.*;

public class Metodos_de_Ordenamiento 
{
	
		static BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
		static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	    
		
		public static int [] bubble_Sort(int[] unsortedArray)
		{
			boolean swap = true;
			int temp=0;
			
			while(swap)
			{
				swap = false;
				for (int i = 0; i < unsortedArray.length-1; i++)
				{
					if(unsortedArray[i] > unsortedArray[i+1])
					{
						temp = unsortedArray[i];
						unsortedArray[i] = unsortedArray[i+1];
						unsortedArray[i+1] = temp; 
						swap = true;
					}
				}
			}
			return unsortedArray;
		}
		
		
		public static int [] insertion_Sort(int [] unsortedArray)
		{
			int x;
			int index;
			for (int i = 1; i < unsortedArray.length; i++) 
			{
				x = unsortedArray [i];
				index = i;
				while(index > 0 && unsortedArray [index - 1] > x) 
				{
					unsortedArray [index] = unsortedArray [index -1];
					index -= 1;
				}
				unsortedArray [index] = x;
			}
			return unsortedArray;
		}
			
	
	    public static int binary_Search(int [] sortedArray, int number) 
	    {
	    	int min = 0;
	    	int max = sortedArray.length - 1;
	    	int index = -1;
	    	
	    	while(min < max)
		{
	    		int middle = (min + max) /2;
	    		if (number == middle) 
			{
	    			index = middle;
	    			break;
	    		}else {
	    			if(number < middle) 
				{
	    				max = middle - 1;
	    			}else {
	    				min = middle + 1;
	    			}
	    		}
	    	}
	    	
	    	return index;
	    }
	
	    
	    public static int recursive_binarySearch(int [] sortedArray, int number,int min, int max) 
	    {
	    	int middle = (min + max)/2;
	    	if(min == max)
		{
	    		if(number == sortedArray [middle]) 
			{
	        		return middle;
	        	}else 
			{
	        		return -1;
	        	}
	    	}else{
	    		if(number == sortedArray [middle]) 
			{
	    			return middle;
	    		}else {
	    			if(number < sortedArray [middle]) 
				{
	    				return recursive_binarySearch(sortedArray, number, min, middle);
	    			}else 
				{
	    				return recursive_binarySearch(sortedArray, number, middle + 1, max);
	    			}
	    		}
	    	}
	    }
	    

		public static int lineal_Search (int [] a, int x)
		{
			int index = 0;
			for (int i = 0; i < a.length; i++) 
			{
				if(a[i] == x) 
				{
					index = i;
					break;
				}
			}
			return index;
		}
		

		public static int interpolationSearch(int [] sortedArray, int number) 
		{
			int min = 0;
			int max = sortedArray.length - 1;
			int index = -1;
			while(min < max)
			{
				int middle = min + ((max - min) / (sortedArray [max] - sortedArray [min])) * (number - sortedArray [min]);
				if(number == sortedArray [middle])
				{
					index = middle;
					break;
				}else {
					if(number < sortedArray [middle])
					{
						max = middle - 1;
					}else 
					{
						min = middle + 1;
					}
				}
			}
			if(min == max && sortedArray [min] == number)
			{
				index = min;
			}
			return index;
		}
			
}
