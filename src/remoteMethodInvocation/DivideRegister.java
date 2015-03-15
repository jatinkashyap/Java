package remoteMethodInvocation;

import java.rmi.Naming;

public class DivideRegister {
	public static void main(String[] args) {
		try{
			DivideServer ds = new DivideServer();
			System.out.println("Registering the Object...");
			Naming.bind("rmi", ds);
			System.out.println("Registering Id....Ready to execute");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
