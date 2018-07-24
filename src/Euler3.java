import java.util.ArrayList;
import java.util.Arrays;

public class Euler3 {

    public static void main(String[] args) {
    double input = 600851475143.0;
    ArrayList<Integer> list = findPrimeFactors(input);
    System.out.println("The largest prime factor of " + input + " is " + list.get(list.size()-1));

    }

    public static ArrayList<Integer> findPrimeFactors(double input) {
    	ArrayList<Integer> factorList = new ArrayList<Integer>(); //stores all the prime factors of the input
    	boolean answerFound = false;
    	int i = 2; //functions as a list iterator


    		while(answerFound == false) {
    				if(input == 1) {
    					answerFound = true;
    				}
    			 if(input % i == 0) { //If the input number can be divided by i, do the division and reset the iterator
        			factorList.add(i);
        			input = input / i;
        			i = 2; //reset the list iterator
        		} else {
        			i++;
        		}

    		}


	return factorList;
    }

}
