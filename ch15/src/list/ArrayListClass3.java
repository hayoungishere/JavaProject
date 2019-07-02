package list;

import java.util.ArrayList;

public class ArrayListClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
		list.add("java");
		list.add("hello");
		list.add("world");
		list.add("!!");
		
		for(String s : list)
			System.out.println(s+" ");
	
		ArrayList<String> list1 = list; 
		// 같은 주소공간을 공유하기 때문에
		// list를 변경하면 list1에도 반영되게 된다.
		
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.addAll(list);
		// 따라서, 객체를 복사할 공간을 new를 통해 새로 지정 해 준 뒤에
		// addAll메소드를 사용해서 list의 값을 전부 복사해온다.
		
		
		list.add("^^~!");
	
		for(String s : list1)
			System.out.println(s+" ");
	
		for(String s : list2)
			System.out.println(s+" ");
		
		
	}
	

}
