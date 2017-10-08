import java.util.Scanner; 
import java.math.BigInteger;
import java.util.*;

public class Fibonacci
{

	
	public static void main(String[] args) {
		System.out.print("Generate Fibonacci Sequence up to: ");
		final Scanner scanner = new Scanner(System.in);
		int end = scanner.nextInt();
		final List<BigInteger> fibonacciSequence = fibuntill(end);

		for (BigInteger i : fibonacciSequence) {
			System.out.println(i);
		}
	}
	
	public static List<BigInteger> fibuntill (int end)
	{
		final ArrayList <BigInteger> fib = new ArrayList<BigInteger>(end);
		fib.add(BigInteger.valueOf(0));
		fib.add(BigInteger.valueOf(1));
		
		for (int i = 2; i < end; i++)
		{
			fib.add((fib.get(i-1)).add(fib.get(i-2)));
		}

		return fib;
	}
}
