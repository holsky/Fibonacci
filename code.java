import java.util.Scanner; 
import java.math.BigInteger;
import java.util.*;

public class code
{

	static Stack <BigInteger> fib; //n-2
	static BigInteger x; //n-1
	static BigInteger y; //n
	static int end;
	static Scanner sdc;
	
	
	public static void main(String[] args) {
		
		sdc = new Scanner(System.in);
		fib = new Stack<BigInteger>();
		end = sdc.nextInt();
		fibuntill(end);
	}
	
	public static void fibuntill (int end)
	{

		fib.push(BigInteger.valueOf(0));
		fib.push(BigInteger.valueOf(1));
		x=BigInteger.valueOf(1);
		for (int i=0; i<end; i++)
		{
			System.out.println(fib.peek());
			y = x.add(fib.peek());
			fib.push(x);
			x=y;
		}
	}
}