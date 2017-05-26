import java.util.*;
import static java.lang.Math.sqrt;
public class p_0021 {
	

	private static Vector<Integer> primes = new Vector<Integer>(1,1);  
	private static int[] nums = new int[10000];
	
	public static void main(String[] args) {
		primes.addElement(2);
		prime_init();
		for(int i= 0; i<3; i++) //out of habit I often deal with 0-2 separately when dealing when primes bc they are obvious corner cases
			nums[i] = 0;
		for(int i=3; i<10000; i++){ 
			nums[i] = sum_of_divisors(i);
		}

		for(int i=3; i<10000; i++){
			amicable_check(i);
		}
			
		int sum = 0;
		for(int i = 0; i<10000; i++){
			if(nums[i]!=0){
				sum+=i;
			}
		}
			
		System.out.println(sum);
		
	}
	
	private static void prime_init(){
		int div = 0;
		for(int i=3; i<317; i+=2){
			for(int j=0; j< primes.capacity() && primes.get(j) <= Math.sqrt(i); j++){
				
				if((i%primes.get(j)) == 0)
					div = 1;
			}
			if(div == 0)
				primes.addElement(i);
			else
				div = 0;
		}
	}
	
	private static int sum_of_divisors(int num){
		int total = 0;
		Vector<Integer> divs = new Vector<Integer>(0,1);  
		for(int i = 0; i < primes.capacity() && primes.get(i) <num ; i++){		
			int div_num = primes.get(i);
			if((num%div_num)==0){
				divs.addElement(div_num);
			}
		}	
		for(int i = 0; i < divs.capacity(); i++){
			int num_i = divs.get(i);
			for(int j = 0; j < divs.capacity(); j++){			
				int num_j = divs.get(j);
				if( (num % (num_i*num_j)) == 0 && (num_i*num_j) < num && !divs.contains(num_i*num_j))
					divs.addElement(num_i*num_j);	
			}
		}
		for(int i = 0; i< divs.capacity(); i++)
			total += divs.get(i);
		return total+1;
	}
	
	private static void amicable_check(int i){
		int num1 = nums[i];
		if(num1<10000){
			int num2 = nums[num1];
			if(num2<10000){
				if(num2 != i)
					nums[i]=0;
			}else{
				nums[num1] = 0;
				nums[i] = 0;
			}
		}
		else
			nums[i]=0;
		
		if(i == num1)
			nums[i]=0;
	}
}
