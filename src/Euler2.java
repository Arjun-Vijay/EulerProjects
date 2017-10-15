public class Euler2 
{
	public static void main(String[] args)
	{
			int num1 = 0;
			int num2 = 1;
			int num3 = 0;
			int a = 0;
		
		if(num3 < 35) {
		for(int i = 1; i<10; i++) 
		{
			
			num3 = num1 + num2;
			System.out.println(num3);
			
			if(num3%2 == 0){
				a = a + num3;
			}
			
			num1 = num2;
			num2 = num3;
			
			
			
			
		}
			
		}
		
		System.out.println("a: " + a);
	}
}