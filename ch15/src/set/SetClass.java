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
		
		
		//set에 저장된 데이터 가져오는 방법
		// ** set은 Iterator를 사용해서 값에 접근 할 수 있다.
		//1. Iterator 를 사용해서 set 데이터에 접근해야된
		//2. while 반복문을 iterator.next()가 있을 때 까지 수행하도록 함
		
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
