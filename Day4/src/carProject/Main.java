package carProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ڵ����� �������ּ���[1.����   2.���]");
		int selectNumber=sc.nextInt();
		
		if(selectNumber==1) {
			myCar=new HyundaiCar();
		}
		else {
			myCar=new KiaCar();
		}
		
		myCar.startOn();
		
		int input;
		int maxSpeed=300;
		int minSpeed=0;
		
		while(true) {
			System.out.print("������ �Է����ּ���(1: ���� ���, 2 : �ӵ� ���̱�, 0:������)\t");
			input=sc.nextInt();
			if(input==0) break;
			
			if(input==1){
				if(myCar.getSpeed()>=maxSpeed) {

					System.out.println("���� �ִ� �ӵ� �Դϴ�. �ӵ��� �ٿ��ּ���\n");
					continue;
				}
				System.out.println("���� �ӵ��� "+myCar.run()+"km/h\n");
				
			}else{
				if(myCar.getSpeed()<=minSpeed) {

					System.out.println("���� �ּ� �ӵ� �Դϴ�. �ӵ��� �����ּ���\n");
				
					continue;
				}
	
				System.out.println("���� �ӵ��� "+myCar.reduceSpeed()+"km/h\n");
			}
					
		}
		
		
		
		
		
		
	}

}
