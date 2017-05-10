package ikm.test;

import java.util.Scanner;

public class compareData {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testcases = Integer.parseInt(scan.nextLine());
        String str1="", str2="";
        for(int i=0;i<testcases;i++){
        	str1 = scan.nextLine();
        	str2 = scan.nextLine();
        	System.out.println(str1);
        	System.out.println(str2);
	        for(int x=0; x<str1.length(); x++)
			{
				if (str1.charAt(x)==str2.charAt(x))
					System.out.print(".");
				else
					System.out.print("*");
			}
	        System.out.print("\n\n");		        
        }
        scan.close();
    }
}
