package list;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> list = new ArrayList<String>();
		LinkedList<String> list1 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime=System.nanoTime();
		
		for(int i=0; i<100000; i++)
			list.add(String.valueOf(i));
		
		
		
		endTime=System.nanoTime();
		
		System.out.println("Arraylist 걸린시간 : "+(endTime-startTime));
		
		
		
	startTime=System.nanoTime();
		
		for(int i=0; i<100000; i++)
			list1.add(String.valueOf(i));
		
		
		
		endTime=System.nanoTime();
		
		System.out.println("Linkedlist 걸린시간 : "+(endTime-startTime));
	
		
		
		
		
		/// get(검색) 시간 구하기
		
		startTime=System.nanoTime();
		
		for(int i=0; i<100000; i++)
			list.get(i);
		
		
		
		endTime=System.nanoTime();
		
		System.out.println("Arraylist 걸린시간 : "+(endTime-startTime));
		
		
		
	startTime=System.nanoTime();
		
		for(int i=0; i<100000; i++)
			list1.get(i);
		
		
		
		endTime=System.nanoTime();
		
		System.out.println("Linkedlist 걸린시간 : "+(endTime-startTime));
		
		
		
		
	}

}
