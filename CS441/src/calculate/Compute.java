package calculate;

public class Compute {

	public static int gcd(int a,int b)
	{
		int gcd = 1;
		if(a > b)
		{
			for(int i = gcd; i < a; i++)
				if(a%i == 0)
				{
					
				}
		}
		return gcd;
	}
	public static int lcm(int a,int b)
	{
		
		return 0;
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
