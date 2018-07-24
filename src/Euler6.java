public class Euler6{
	public static void main(String[] args){
		int input = 100;
		int sumOfSqaures = sumOfSqaures(input);
		int squareOfSum = squareOfSum(input);

		int difference = squareOfSum - sumOfSqaures;
		System.out.println("The difference between the sqaure of sums and sum of sqaures for input " + input + " is " + difference);


	}

	public static int sumOfSqaures(int number){
		int sum = 0;
		for(int i = 1; i <(number+1); i++){
			sum = sum + (i * i);
		}
		return sum;

	}

	public static int squareOfSum(int number){
		int sum = 0;
		for(int i = 1; i < (number+1); i++){
			sum = sum + i;
		}

		int sumSquared = sum * sum;
		return sumSquared;

	}
}
