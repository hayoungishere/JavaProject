import java.util.Random;
import java.util.Scanner;

public class BaseballGame {

	
	boolean[] vistedNum= {false,false,false,false,false,false,false,false,false,false}; // 게임에 사용되는 숫자 판단
	int[] gameNumber= {0,0,0}; //게임 숫자를 저장
	int[] inputNumber= {0,0,0}; //사용자 입력 숫자를 저장
	int ball; // ball 에 대한 게임의 결과를 저장하는 변수
	int strike; // strike에 대한 게임의 결과를 저장하는 변수
	int gameTry=0; // 게임을 몇번 시도 했는지를 저장.
	
	Scanner sc; //Scanner인스턴스를 저장하기 위한 변수 
	
	BaseballGame(){

		Random rand = new Random(); // Random object 생성
		this.sc=new Scanner(System.in); // Scanner 객체 생성
		this.ball=0; // ball 초기화
		this.strike=0; //strike 초기화
		
		int count=0; // 난수개수 저장
		int newNum;
		
		while(true) {
			newNum=rand.nextInt(9)+1;
			if(count==3) break;
			if(!vistedNum[newNum]) {
				//이전에 생성된 난수가 아니면 게임 숫자를 저장하고 난수 개수를 1 증가 시킨다.
				vistedNum[newNum]=true;
				gameNumber[count]=newNum;
				count++;
			}
		}
	}
	
	void printGameNumber() {
		//게임 숫자를 출력하는 메소드
		System.out.println(this.gameNumber[0]+" "+this.gameNumber[1]+" "+this.gameNumber[2]);
	}
	
	void gameStart() {
		boolean flag=false; //게임의 진행여부를 저장
		int temp;
		
		while(!flag) {
			this.gameTry++; //게임 시도 횟수 증가
			this.ball=0; //변수 다시 초기화
			this.strike=0; //변수 다시 초기화
			int userCount=0; //변수 다시 초기화
			
			boolean[] userNum={false,false,false,false,false,false,false, false, false, false}; //사용자가 입력한 번호의 사용여부를 저장
			System.out.println("1부터 9까지의 수 중 세가지를 모두 다르게  입력해주세요(순서고려함)");
			
			while(userCount<3) {
				temp=sc.nextInt();
				if(!userNum[temp]) {
					//사용자가 입력한 숫자가 이전에 등장하지 않았으면 추가한다.
					userNum[temp]=true;
					this.inputNumber[userCount]=temp;
					userCount++;
				}
				else {
					System.out.println("이전 숫자와 다른 숫자를 입력해주세요.");
				}
			}
			
			for(int i=1; i<10; i++) {
				if(this.vistedNum[i] && userNum[i]) this.ball++;
			}
			for(int i=0; i<3; i++) {
				if(this.gameNumber[i]==this.inputNumber[i]) this.strike++;
			}
			
			this.ball=this.ball-this.strike;
			
			System.out.println("게임 결과 : "+this.strike+" STRIKE & "+this.ball+" BALL");
			
			
			if(this.strike==3) flag=true;
			
		}
		System.out.println("축하합니다"+this.gameTry+"번 만에 게임이 종료되었습니다.");
		
	}

}