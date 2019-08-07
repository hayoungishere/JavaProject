package test;

public class Main222222222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String a="1234";
			String b="9999";
			String ans="";
	      
			String[] arrA=null;
		    String[] arrB=null;
		    String[] arrAns=null;
		    int j=0;
		    
			if(a.length()>=b.length()) {
				arrA=new String[a.length()];
				arrB=new String[a.length()];
				arrAns=new String[a.length()];
				
				for(int i=0; i<a.length()-b.length(); i++) {
					arrB[i]="0";
					}
				j=a.length()-b.length();  	
		      
		      for(int i=0; i<a.length(); i++) {
		         arrA[i]=a.substring(i,i+1);
		         arrB[j]=b.substring(i,i+1);
		         j++;
		      }

			}
			
			else {
				arrA=new String[b.length()];
				arrB=new String[b.length()];
				arrAns=new String[b.length()];
				
				for(int i=0; i<b.length()-a.length(); i++) {
					arrA[i]="0";
					}
			
					j=b.length()-a.length();  	
				
			      for(int i=0; i<b.length(); i++) {
				         arrA[j]=a.substring(i,i+1);
				         arrB[i]=b.substring(i,i+1);

				         j++;
			      }
			     

			}
			
			int idx=arrA.length-1;
		      int upp=0;
		      while(idx>=0) {
		    	  int temp=Integer.parseInt(arrA[idx])+Integer.parseInt(arrB[idx])+upp;
		    	  upp=temp/10;
		    	  temp=temp%10;
		    	  arrAns[idx]=String.valueOf(temp);
		    	  idx--;
		      }
		      
		      if(upp>0) {
		    	  ans=ans+upp;
		      }
		
		      
		      for(int i=0; i<arrA.length; i++) {
		    	  ans=ans+arrAns[i];
		      }
		    
		      System.out.println(ans);

	}

}
