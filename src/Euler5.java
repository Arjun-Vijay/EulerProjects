public class Euler5 {


    public static void main(String[] args){

        int input = 20;
        System.out.println("input: " + input);
        int[] factors = {20, 19, 18, 17, 16, 15, 14, 13, 12, 11};
        int output = findNumber(input, factors);
        System.out.println("The smallest multiple of all numbers 1-" + input + " is: " + output);

    }

    public static int findNumber(int number, int[] factors){
    		int i = 0;
    		boolean answerFound = false;
    		while(answerFound == false) {
    			if(i == factors.length){ //if every number in the array has been tested
        			answerFound = true;
        		} else if(number % factors[i] == 0) { //check a number to make sure it work s
        			i = i + 1;
        		} else {
                	number = number + 1;
                i = 0;
            }
    		}
        
        return number;
    }
}
