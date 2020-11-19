package code6015_space;

public class NumberSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			int number[] = { 55,40,80,65,30};
			int n = number.length;  //array length
			
			System.out.print("Given List is :");
			
			for(int i =0; i<n; i++)
			{
				
				System.out.print(" " + number[i]);
			
			}
			
			System.out.println("");
			
			//sorting begins
			
			for(int i= 0; i < n; i++)
			{
				for(int j = i+1; j < n; j++)
				{
				if (number[i] < number[j])	
					
					{
					int temp = number[i];
					number[i] = number[j];
					number[j] = temp;
					}
				}
			}
			
		System.out.print("sorted list: ");	
		
		for(int i= 0; i < n; i++)
		{
			System.out.print(" " + number[i]);
		}
		}

	}
