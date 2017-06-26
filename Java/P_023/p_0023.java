import java.util.*;
import static java.lang.Math.sqrt;
public class p_0023 {
	
	private static Vector<Integer> primes = new Vector<Integer>(7031,1); // note: 7031 > maximum number of possible primes 
	private static int[] abundant_nums = new int[28124];
	private static int[] sum_of_ab_nums = new int[28124];
	
	public static void main(String[] args) {
		int sum=0;
		primes.addElement(2);
		prime_init();
		for(int i= 0; i<12; i++)
			abundant_nums[i] = 0;
		for(int i=10; i<28124; i++){ 
			if(i < sum_of_divisors(i))
				abundant_nums[i] = 1;
			else
				abundant_nums[i] = 0;
		}
	
		sum = abundant_num_search();
				
		System.out.println(sum);
		
	}
	
	private static void prime_init(){
		int div = 0;
		int size = 1;
		for(int i=3; i<14062; i+=2){
			for(int j=0; j< size && primes.get(j) <= Math.sqrt(i); j++){
				
				if((i%primes.get(j)) == 0)
					div = 1;
			}
			if(div == 0){
				primes.addElement(i);
				size++;
			}else
				div = 0;
		}
		primes.trimToSize();
	}
	
	private static int sum_of_divisors(int num){
		int total = 0;
		Vector<Integer> divs = new Vector<Integer>(0,1);  
		int primes_cap = primes.capacity();
		for(int i = 0; i < primes_cap && primes.get(i) <num ; i++){		
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
		int divs_cap=divs.capacity();
		for(int i = 0; i< divs_cap; i++)
			total += divs.get(i);

		return total+1;
	}
	
	private static int abundant_num_search(){
		int total = 0;
		int prev;
		for(int i=0; i<28124; i++)
			sum_of_ab_nums[i] = 0;
		
		for(int i=13; i < 28124; i++)
			for(int j=12; j<i; j++){
				if(abundant_nums[j]==1 && abundant_nums[i-j]==1)
					sum_of_ab_nums[i] = 1;
			}
		
		for(int i=1; i < 28124; i++)
			if(sum_of_ab_nums[i] == 0){
				prev = total;
				total += i;
				if(prev > total)
					System.out.println("ERROR!: overflow");
			}
		
		return total;
	}

}
