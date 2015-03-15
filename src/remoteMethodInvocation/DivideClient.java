package remoteMethodInvocation;

import java.rmi.Naming;
import java.util.Scanner;

public class DivideClient {
	public static void main(String[] args) {
		try{
			DivideInterface di = (DivideInterface)Naming.lookup("rmi");
			Scanner keyboard = new Scanner(System.in);
			double d1 = Double.parseDouble(keyboard.next());
			System.out.println("First number"+d1);
			double d2 = Double.parseDouble(keyboard.next());
			System.out.println("Second number"+d2);
			System.out.println("Result is"+di.divide(d1,d2));
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
