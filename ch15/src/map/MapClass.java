package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("java", "hello java");
		map.put("c"	,	"hello c");
		map.put("python", "hello python");
		
		Set<String> set = map.keySet();
		
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String s = iterator.next();
			System.out.println(s);
			System.out.println("get Map's value : "+map.get(s)); //map.get(key)
		}
		
	}

}
