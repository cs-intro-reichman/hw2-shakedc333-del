// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 

	int N = Integer.parseInt("" + args[0]);
	double sum=0.0;
	double denominator=1.0;
	int i=0;
	while(i<N){
		if (i%2==0)// if index i is even soo do +
			sum+=(1.0/denominator);
		else// if index i is odd soo do -
			sum-=(1.0/denominator);	
		denominator+=2.0;
		i++;	

	}
	System.out.println("pi according to Java: "+Math.PI);
	System.out.println("pi, approximated:     "+(sum*4.0));

	}
}
