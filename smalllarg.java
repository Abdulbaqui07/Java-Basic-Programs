public class smalllarg {
	// Result function with N
	// Driver code
	public static void main(String []args)
	{       
		// input goes here
		int[] arr={10,4,3,6,2};

        for (int i = 0; i < arr.length; i++)   
        {  
            for (int j = i + 1; j < arr.length; j++)   
            {  
                int tmp = 0;  
                if (arr[i] > arr[j])   
                {  
                    tmp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = tmp;  
                }  
            }  
            //prints the sorted element of the array
            
	    }
    System.out.println(arr[0]);
    System.out.println(arr[arr.length-1]);
    }
}