
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class clazz= Class.forName("Car");
			System.out.println(clazz.getName()); //return Class Name
			System.out.println(clazz.getClass()); //return Super Class Name
			System.out.println(clazz.getPackage());  //return Package Name
			
			
			
			
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
