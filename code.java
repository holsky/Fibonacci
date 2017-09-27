import java.util.Scanner; 
import java.math.BigInteger;
import java.util.*;

public class code
{

	static Stack <BigInteger> fib;
	static Stack <BigInteger> h1;
	static Stack <BigInteger> h2;
	static Stack <BigInteger> h3;
	static int x;
	static Scanner sdc;
	
	
	public static void main(String[] args) {
		
		sdc = new Scanner(System.in);
		fib = new Stack<BigInteger>();
		h1 = new Stack<BigInteger>();
		h2 = new Stack<BigInteger>();
		h3 = new Stack<BigInteger>();
		x = sdc.nextInt();
		fibuntill(x);
	}
	
	public static void fibuntill (int end)
	{
		int x;
		x = 0;
		BigInteger big1;
		BigInteger big2;
		BigInteger sum;
		fib.push(BigInteger.valueOf(0));
		h1.push(BigInteger.valueOf(1));
		h2.push(BigInteger.valueOf(1));
		
		while (end>x)
		{
			
			big1 = h1.peek();	
			big2 = h2.peek();
			sum = big1.add(big2);
			h3.push(sum);
			fib.push(h1.pop());
			h1.push(h2.pop());
			h2.push(h3.pop());
			System.out.println(fib.peek());
			++x;
		}
	}
} 
