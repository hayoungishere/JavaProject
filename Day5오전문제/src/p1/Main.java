package p1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		try {	
			Class clazz= Class.forName(input);

			System.out.println(clazz);
			
			Car action = (Car)clazz.newInstance();
			
			action.excute();
			action.setCarColor("purple");
			System.out.println(action.getCarColor()); //return Class Name

			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e) {
			
		}
	}

}
