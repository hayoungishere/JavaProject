import java.util.Random;
import java.util.Scanner;

public class BaseballGame {

	
	boolean[] vistedNum= {false,false,false,false,false,false,false,false,false,false}; // ���ӿ� ���Ǵ� ���� �Ǵ�
	int[] gameNumber= {0,0,0}; //���� ���ڸ� ����
	int[] inputNumber= {0,0,0}; //����� �Է� ���ڸ� ����
	int ball; // ball �� ���� ������ ����� �����ϴ� ����
	int strike; // strike�� ���� ������ ����� �����ϴ� ����
	int gameTry=0; // ������ ��� �õ� �ߴ����� ����.
	
	Scanner sc; //Scanner�ν��Ͻ��� �����ϱ� ���� ���� 
	
	BaseballGame(){

		Random rand = new Random(); // Random object ����
		this.sc=new Scanner(System.in); // Scanner ��ü ����
		this.ball=0; // ball �ʱ�ȭ
		this.strike=0; //strike �ʱ�ȭ
		
		int count=0; // �������� ����
		int newNum;
		
		while(true) {
			newNum=rand.nextInt(9)+1;
			if(count==3) break;
			if(!vistedNum[newNum]) {
				//������ ������ ������ �ƴϸ� ���� ���ڸ� �����ϰ� ���� ������ 1 ���� ��Ų��.
				vistedNum[newNum]=true;
				gameNumber[count]=newNum;
				count++;
			}
		}
	}
	
	void printGameNumber() {
		//���� ���ڸ� ����ϴ� �޼ҵ�
		System.out.println(this.gameNumber[0]+" "+this.gameNumber[1]+" "+this.gameNumber[2]);
	}
	
	void gameStart() {
		boolean flag=false; //������ ���࿩�θ� ����
		int temp;
		
		while(!flag) {
			this.gameTry++; //���� �õ� Ƚ�� ����
			this.ball=0; //���� �ٽ� �ʱ�ȭ
			this.strike=0; //���� �ٽ� �ʱ�ȭ
			int userCount=0; //���� �ٽ� �ʱ�ȭ
			
			boolean[] userNum={false,false,false,false,false,false,false, false, false, false}; //����ڰ� �Է��� ��ȣ�� ��뿩�θ� ����
			System.out.println("1���� 9������ �� �� �������� ��� �ٸ���  �Է����ּ���(���������)");
			
			while(userCount<3) {
				temp=sc.nextInt();
				if(!userNum[temp]) {
					//����ڰ� �Է��� ���ڰ� ������ �������� �ʾ����� �߰��Ѵ�.
					userNum[temp]=true;
					this.inputNumber[userCount]=temp;
					userCount++;
				}
				else {
					System.out.println("���� ���ڿ� �ٸ� ���ڸ� �Է����ּ���.");
				}
			}
			
			for(int i=1; i<10; i++) {
				if(this.vistedNum[i] && userNum[i]) this.ball++;
			}
			for(int i=0; i<3; i++) {
				if(this.gameNumber[i]==this.inputNumber[i]) this.strike++;
			}
			
			this.ball=this.ball-this.strike;
			
			System.out.println("���� ��� : "+this.strike+" STRIKE & "+this.ball+" BALL");
			
			
			if(this.strike==3) flag=true;
			
		}
		System.out.println("�����մϴ�"+this.gameTry+"�� ���� ������ ����Ǿ����ϴ�.");
		
	}

}