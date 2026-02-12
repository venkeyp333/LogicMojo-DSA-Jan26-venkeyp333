import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
	
	String input = new String ("ASGD");
	
	//System.out.println(bruteForece(input));
	
	System.out.println(twoPointerReverse(input));
	
}

   public static String bruteForece(String input){

        
        StringBuilder output = new StringBuilder ("");
		
		
		for(int i = input.length()-1 ; i >= 0 ; i--){
		
		output.append(input.charAt(i));
		
		}
		
		return output.toString();
    }



public static String twoPointerReverse (String input){

	int start = 0;
	
	int end = input.length()-1;
	
	StringBuilder output = new StringBuilder (input);
	
	while ( start < end){
		
		char temp = output.charAt(start);
		
            output.setCharAt(start, output.charAt(end));
            output.setCharAt(end, temp);
		
		start++;
		end--;
		
		
	}
	
	return  output.toString();
}
}