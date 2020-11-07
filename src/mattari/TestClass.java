package mattari;

import java.util.Random;

public class TestClass {
	
	static TestClass test = new TestClass();
	
	public int returnMinInt(int one, int two) {
		return Math.min(one, two);
	}
	
	public double returnMinDouble(double one, double two) {
		return Math.min(one, two);
	}
	
	public long returnMinLong(long one, long two) {
		
		return Math.min(one, two);
	}
	public float returnMinFloat(float one, float two) {
		
		return Math.min(one, two);
	}
	
	public int returnMaxInt(int one, int two) {
		return Math.max(one, two);
	}
	
	public float returnMaxFloat(float one, float two) {
		
		return Math.max(one, two);
	}

	public double returnMaxDouble(double one, double two) {
		return Math.max(one, two);
	}
	
	public long returnMaxLong(long one, long two) {
		
		return Math.max(one, two);
	}
	
	public double returnExponent(double one, double two) {
		
		return Math.pow(one,two);
	}
	
	public int returnIntPlusOne(int one) {
		int answer=0;
		
			if(one<2147483647 && one>=-2147483648)answer = one + 1;
		
		return answer;
	}
	public long returnLongPlusOne(long one) {
		long answer=0;
		
			if(one<9223372036854775807L && one>=-922337203685477580L)answer = one + 1;
		
		return answer;
	}
	
	public int returnIntMinusOne(int one) {
		int answer=0;
		
			if(one<=2147483647 && one>-2147483648) answer = one - 1;
		
		return answer;
	}
	
	public long returnLongMinusOne(long one) {
		long answer=0;
		
		if(one<=9223372036854775807L && one>-9223372036854775808L)answer = one - 1;
	
	return answer;
	}
	
	public double returnRootSquare(double one) {
		
		return Math.sqrt(one);
	}
	
	public double returnRootCube(double one) {
		
		return Math.cbrt(one);
	}
	
	public double returnRandom() {
		Random r = new Random();
		r.setSeed(12345); //uses seed to predict outcome for testing purpose
		return  r.nextDouble();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(test.returnRandom());

	}

	
	

}
