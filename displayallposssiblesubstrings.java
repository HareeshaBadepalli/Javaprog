import java.util.Scanner;

public class displayallposssiblesubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
	    char []arr=s1.toCharArray();
	    for(int i=0;i<s1.length();i++) {
	    	String temp="";
	    	for(int j=i;j<s1.length();j++) {
	    		temp+=s1.charAt(j);
	    	System.out.println(temp);
	    }
	    }

	}

}
