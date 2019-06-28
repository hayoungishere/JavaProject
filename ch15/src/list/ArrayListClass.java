package list;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>(); //제네릭 타입 사용
		list.add("Hello");
		list.add("Java");
		list.add("World");
		list.add("안녕");
		list.add("자바");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println("list["+i+"] : "+list.get(i));
		}
		
		System.out.println("\n");
		list.add(0,"HI");
		int idx=0;
		for(String s : list) {
			System.out.println("list["+idx+"] : "+s);
		}
		
		list.set(1, "Hi");
		System.out.println("\n");
		
		idx=0;
		for(String s : list) {
			System.out.println("list["+idx+"] : "+s);
		}
		
		
		list.remove(0);
		System.out.println("\n");
		
		idx=0;
		for(String s : list) {
			System.out.println("list["+idx+"] : "+s);
		}
			
		
		list.clear();
		
		System.out.println("\n");
		System.out.println("리스트 모두 출력");
		
		idx=0;
		for(String s : list) {
			System.out.println("list["+idx+"] : "+s);
		}
		
		
	}

}
