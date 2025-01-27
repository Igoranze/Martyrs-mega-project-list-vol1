package deffault.test;

/**
 * Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz" 
 * instead of the number and for the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz".
 * 
 * @author selimovic
 *
 */
public class Main {

	
	public static void main(String[] args) {
		boolean hit = false;
		
		for (int i = 1; i <= 100; i++) {
				
			StringBuilder b = new StringBuilder();
			
			if ((i % 3) == 0){
				hit = true;
				b.append("fizz");
			}
			if ((i % 5) == 0){
				hit = true;
				b.append("buzz");
			}

			if(!hit){
				b.append(i);
				
			}
			
			System.out.println(b);
			hit = false;

		}
	}
}
