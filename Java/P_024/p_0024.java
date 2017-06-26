import java.util.*;
public class p_0024 {
	private static Vector<Integer> set_of_nums  = new Vector<Integer>(10,1);
	private static Vector<Integer> order_of_nums = new Vector<Integer>(10,1);
	private static int f1 = 1;
	private static int f2 = 2;
	private static int f3 = f2*3;
	private static int f4 = f3*4;
	private static int f5 = f4*5;
	private static int f6 = f5*6;
	private static int f7 = f6*7;
	private static int f8 = f7*8;
	private static int f9 = f8*9;
	
	public static void main(String[] args) {
			
		for(int i=0; i<10; i++)
			set_of_nums.add(i,i);
		
		int temp = 0;
		int prev = 0;
		int k;
		while(set_of_nums.capacity() != 0){
			int iter = 0;
			while(temp < 1000000){
				prev = temp;
				temp = temp + number_chooser();
				iter++;
			}
			if(iter == 0)
				iter++;
			temp = prev;
			if(set_of_nums.capacity() > 0){
				k = set_of_nums.get(--iter);
				set_of_nums.remove(iter);
				order_of_nums.add(k);
				set_of_nums.trimToSize();
			}
		}
		System.out.println(order_of_nums);
	}
	
	private static int number_chooser(){
		int k = set_of_nums.capacity();
		switch(k){
		case 10:	return f9;
		case 9:		return f8;
		case 8:		return f7;
		case 7:		return f6;
		case 6:		return f5;
		case 5:		return f4;
		case 4:		return f3;
		case 3:		return f2;
		case 2:		return f1;
		default:	return 1;
		}
	}

}
