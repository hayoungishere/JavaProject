package ch05Check;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���� 1.
		int max=0;
		int [] array= {1,5,3,8,2};
		for(int i=0; i<array.length; i++)
			if(array[i]>max) max=array[i];
		
		System.out.println(max);
		
		
		
		//���� 2.
		int[][] array2 = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum=0;
		double avg=0.0;
		int count=0;
		
		for(int i=0; i<array2.length; i++) {
			for(int j=0; j<array2[i].length; j++) {
				count++;
				sum=sum+array2[i][j];
			}
		}
		avg=sum/count;
		System.out.println(sum);
		System.out.println(avg);
		
		
		//���� 3.
		boolean run=true;
		int studentNum=0;
		int[] scores=null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.�л���, 2.�����Է�, 3.��������Ʈ, 4.�м�, 5.����");
			System.out.println("-------------------------------------------");
			System.out.print("���� > ");

			int selNum=sc.nextInt();
			if(selNum==1) {
				studentNum=sc.nextInt();
				scores=new int[studentNum];
			}
			else if(selNum==2) {
				int temp;
				for(int i=0; i<studentNum; i++) {
					temp=sc.nextInt();
					scores[i]=temp;
				}
			}
			else if(selNum==3) {
				for(int i=0; i<studentNum; i++) {
					System.out.print(scores[i]+" ");
				}
			}
			else if(selNum==4) {
				int maxS=0;
				double avgS=0.0;
				int sumS=0;
				
				for(int i=0; i<studentNum; i++) {
					sumS+=scores[i];
					if(maxS<scores[i]) maxS=scores[i];
				}
				
				avgS=sumS/studentNum;
				System.out.println("�ְ����� : "+maxS);
				System.out.println("��� : "+avgS);
				
			}else {
				run=false;
			}
		}
		
		
	}

}
