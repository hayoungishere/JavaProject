package carProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("자동차를 선택해주세요[1.현대   2.기아]");
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
			System.out.print("동작을 입력해주세요(1: 엑셀 밟기, 2 : 속도 줄이기, 0:끝내기)\t");
			input=sc.nextInt();
			if(input==0) break;
			
			if(input==1){
				if(myCar.getSpeed()>=maxSpeed) {

					System.out.println("현재 최대 속도 입니다. 속도를 줄여주세요\n");
					continue;
				}
				System.out.println("현재 속도는 "+myCar.run()+"km/h\n");
				
			}else{
				if(myCar.getSpeed()<=minSpeed) {

					System.out.println("현재 최소 속도 입니다. 속도를 높여주세요\n");
				
					continue;
				}
	
				System.out.println("현재 속도는 "+myCar.reduceSpeed()+"km/h\n");
			}
					
		}
		
		
		
		
		
		
	}

}
