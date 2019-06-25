
public class Gugu {
	public static void main(String[] args) {
		
		/*
		for (int i=2; i<=9; i++) {
			System.out.println("===="+i+"단 시작 ====");

			for(int j=1; j<=9; j++) {
				System.out.println(i+"x"+j+"="+(i*j));
			}
		}
		*/
		
		//header
		for(int j=2; j<=9; j++) {
			System.out.print(j+"단\t");
		}
		System.out.println();
		
		//body
		point:for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				if(j==4) break point;
				System.out.print(j+"x"+i+"="+(i*j)+"\t");
			}
			System.out.println("\n");
		}
	}
}
