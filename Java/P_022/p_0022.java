import java.util.*;
import java.io.*;
public class p_0022 {
	
	public static void main(String[] args) {
		Scanner x;
		List<String> name_list = new Vector<String>();
		try{
			x = new Scanner( new File("/Users/z/Desktop/project_euler/Java/P_022/names.txt")).useDelimiter(",");
			while(x.hasNext()){
				String name_string = x.next();
				name_string = name_string.replace("\"", "");
				name_list.add(name_string);
			}
		}catch(FileNotFoundException | NullPointerException e){
			System.out.println("error in scanner");
		}
		
		Collections.sort(name_list);
		int pos = 0;
		int total = 0;
		do{
			 String name = name_list.get(pos);
			 pos++; 							// handles off-by-one error with pos++ here
			 int prev = total;
			 total += name_score(name, pos);
			 if(total < prev)
			 	System.out.println("overflow error!!!");
		}while (pos < name_list.size());
		System.out.println("total = "+total);
	}
	
	private static int name_score(String name, int pos){
		int name_val = 0;
		for(int i=0; i< name.length(); i++){
			name_val += (Character.getNumericValue(name.charAt(i)) - 9);  // note: getNumericValue of an alpha char has an off-by-9 error
		}
		name_val *= pos;
		return name_val;
	}
}
	
