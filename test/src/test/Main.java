package test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "PM 11:50:59";
		int n=1;
	
		int hour;
		int min;
		int sec;
		boolean daynight;
		
		
		if(s.substring(0,2).equals("AM")) {
			hour=Integer.parseInt(s.substring(3, 5));
			daynight=true;
		}else {
			hour=Integer.parseInt(s.substring(3, 5))+12;
			daynight=false;
		}
		
		min=Integer.parseInt(s.substring(6, 8));
		sec=Integer.parseInt(s.substring(9, 11));

		System.out.println("before "+hour+" "+min+" "+sec);
		
		
		int sumHour=n/3600;
		n=n%3600;
		
		int sumMin =n/60;
		
		int sumSec =n%60;
		 
		
		hour=hour+sumHour;
		min=min+sumMin;
		sec=sec+sumSec;
		
		System.out.println("mid"+hour+" "+min+" "+sec);

		
		if(sec>=60) {
			sec=sec%60;
			min=min+1;
		}
		if(min>=60) {
			min=min%60;
			hour=hour+1;
		}
		System.out.println("after"+hour+" "+min+" "+sec);

		hour=hour%24;
		
		
		
		
		
		String answer="";
		if(hour<10) {
			answer=answer+"0"+ Integer.toString(hour);
		}else {
			answer=answer+Integer.toString(hour);
		}
		
		if(min<10) {
			answer=answer+":0"+Integer.toString(min);
		}else {
			answer=answer+":"+Integer.toString(min);
		}
		
		if(sec<10) {
			answer=answer+":0"+Integer.toString(sec);
		}else {
			answer=answer+":"+Integer.toString(sec);
		}
		
		
		System.out.println(answer);
	}

}








