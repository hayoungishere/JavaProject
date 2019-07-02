package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set = new HashSet<String>();
		set.add("Java");
		set.add("Hello");
		set.add("java");
		set.add("Java");
		
		
		//set�� ����� ������ �������� ���
		// ** set�� Iterator�� ����ؼ� ���� ���� �� �� �ִ�.
		//1. Iterator �� ����ؼ� set �����Ϳ� �����ؾߵ�
		//2. while �ݺ����� iterator.next()�� ���� �� ���� �����ϵ��� ��
		
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String s = iterator.next();
			System.out.println(s);
		}
		
		
		for(String s : set) {
			System.out.println("forEach"+s);
		}
	}

}
