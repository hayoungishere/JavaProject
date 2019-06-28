
public class StatticExcuteClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticClass sc = new StaticClass();
		
		sc.a=10;
		sc.b=20;
		System.out.println(sc.a+sc.b);
		
		StaticClass.a=20;
		StaticClass.b=50;
		System.out.println(StaticClass.a+StaticClass.b);
		System.out.println(StaticClass.result);

	}

}
