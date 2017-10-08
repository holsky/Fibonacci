import java.util.Scanner; 
import java.math.BigInteger;
import java.util.*;

public class code
{

	static ArrayList <BigInteger> fib;
	
	
	static int end;
	static Scanner sdc;
	
	
	public static void main(String[] args) {
		
		sdc = new Scanner(System.in);
		fib = new ArrayList<BigInteger>();
		end = sdc.nextInt();
		fibuntill(end);
	}
	
	public static void fibuntill (int end)
	{

		fib.add(BigInteger.valueOf(0));
		fib.add(BigInteger.valueOf(1));
		
		for (int i=0; i<end; i++)
		{
			x = fib.size();
			fib.add((fib.get(x-1)) + fib.add(fib.get(x-2)));
			
			
			
		}
	}
}
