public class Euler7{
	public static void main(String[] args){
		int nth_prime_number = 2; //keeps track of the actual numerical value of the prime number
		int counter = 1; //keeps track of how many prime number we have figured out
		int number = 2;

		while(counter < 10002) {
			if(isPrime(number) == true) {
				nth_prime_number = number;
				//System.out.println("The " + counter + " prime number is " + nth_prime_number);
				counter++;
				number++;
			} else {
				number++;
			}

		}

		System.out.println("The 10,001 prime number is " + nth_prime_number);

	}

	public static boolean isPrime(int number) {
		int counter = 2;
		while (counter <= number) {
			int remainder = number % counter;
			if(number == counter) {
				return true;
			} else if(remainder == 0) {
				return false;
			} else {
				counter++;
			}
		}

		return false;
	}

}



