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
		// ���� �ּҰ����� �����ϱ� ������
		// list�� �����ϸ� list1���� �ݿ��ǰ� �ȴ�.
		
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.addAll(list);
		// ����, ��ü�� ������ ������ new�� ���� ���� ���� �� �� �ڿ�
		// addAll�޼ҵ带 ����ؼ� list�� ���� ���� �����ؿ´�.
		
		
		list.add("^^~!");
	
		for(String s : list1)
			System.out.println(s+" ");
	
		for(String s : list2)
			System.out.println(s+" ");
		
		
	}
	

}
