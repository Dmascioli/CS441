package calculate;

public class Compute {

	public static int gcd(int a,int b)
	{
		int gcd = 1;
		if(a >= b)
		{
			for(int i = a; i > gcd; i--)
				if(a%i == 0)
					if(b%i == 0)
						return i;
		}
		else
		{
			for(int i = b; i > gcd; i--)
				if(b%i == 0)
					if(a%i == 0)
						return i;
		}
		return gcd;
	}
	public static int lcm(int a,int b)
	{
		if(a > b)
		{
			for(int i = b; i <= a*b; i++)
			{
				if(i%a == 0 && i%b == 0)
					return i;	
			}
		}
		else
			for(int i = a; i <= a*b; i++)
			{
				if(i%a == 0 && i%b == 0)
					return i;
			}
		return a*b;
	}
	public static int[] primeFactorization(int a)
	{
		int[] primeFactors = null;
		
		
		return primeFactors;
	}
	public static String baseConversion(int a, int baseA, int b, int baseB)
	{
		
		return "";
	}
	public static boolean isPrime(int a)
	{
		if(a==1)
			return true;
		for(int i = 2; i <= Math.sqrt(a); i++)
			if(a%i == 0)
				return false;
		
		return true;
	}
	public static String[] euclidAlg(int a, int b)
	{
		String[] euclidSteps = null;
		
		return euclidSteps;
	}
	public static int[] solveCong(int[] coeff)
	{
		int[] congruencyCoeffs = null;
		
		return congruencyCoeffs;
	}
	
}
