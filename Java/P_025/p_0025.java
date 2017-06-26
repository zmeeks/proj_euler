import java.util.*;
import java.math.BigInteger;
public class p_0025 {
	public static void main(String[] args) {
		BigInteger F_a = new BigInteger("1");
		BigInteger F_b = new BigInteger("1");
		BigInteger F_temp;
		BigInteger F_new;
		int f_index = 2;
		while(F_b.toString().length() < 1000){
			F_temp = F_b;
			F_new = F_b.add(F_a);
			F_a = F_temp;
			F_b = F_new;
			f_index++;
		}
		System.out.println(f_index);
	}
}
