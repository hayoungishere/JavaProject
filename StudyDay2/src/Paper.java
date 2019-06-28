import java.util.Scanner;

public class Paper {

	int T, N,K;
	Scanner sc;
	int answer;
	
	Paper(){

		sc = new Scanner(System.in);	
	}
	
	public int solution() {

		this.T=sc.nextInt();
	
		while(this.T>0) {
			//T �� �ݺ��Ѵ�.
			
			//�Էºκ�
			N=sc.nextInt(); // �������� ����
			K=sc.nextInt(); // ������ ������ ������ �Է¹޴´�.
			
			int[] paper= new int[N]; //�������� ���� ���¸� ������ ����
			int[] type= new int[K+1]; // ������ ������ �������� ������ ������ ����
			int temp;
			for(int i=0; i<N; i++) {
				temp=sc.nextInt();
				paper[i]=temp;
			}
			
			for(int i=0; i<K+1; i++) 
				type[i]=0;
			
			
			
			//����κ�
			int[] startPoint= new int[K+1];
			
			for(int i=0; i<K+1; i++)
				startPoint[i]=-1;
			
			int curNum;
			for(int i=0; i<N; i++) {
				if(paper[i] == 0 ) continue;
				if(startPoint[paper[i]]==-1) startPoint[paper[i]]=i;
			}
			
			int max=0;
			int idx = 0;
			int[] candi=new int[K];
			
			for(int i=1; i<K; i++) {
				if(startPoint[i]==-1) {
					int zeroCount=1;
					int before=i;
					i++;
					while(startPoint[i] != -1) {
						zeroCount++;
						i++;
					}
					candi[idx]=startPoint[i]-startPoint[before]-zeroCount;
					idx++;
					if(max<candi[idx]) max=candi[idx];
				}else {
					candi[idx]=startPoint[i+1]-startPoint[i];
					if(max<candi[idx]) max=candi[idx];
				}
			
			}
			this.answer=max;
			System.out.println(max);
			
			/*int pTypeIdx=1;
			int bNumber=paper[0];
			if(bNumber==0) 
				type[pTypeIdx]++; //1�� ������ ���� ����
			
			for(int i=1; i<N; i++) {
				if(bNumber==paper[i]) {
					type[pTypeIdx]++;
				}else {
					if(paper[i] != 0) {
						pTypeIdx++;
						type[pTypeIdx]++;
						bNumber=paper[i];
					}
					else {
						// 0�� ���
						int cnt=1;
						i++;
						while(paper[i] == 0 ) {
							cnt++;
							i++;
						}
						if(paper[i] == bNumber) { // [ 2 0 0 2 ] �� ���
							type[pTypeIdx]+=cnt; //0�� ���� ��ŭ ����
						}
						else {
							
						}
						
					}
				}
				
			}
			if(K>1 && type[2]==0 ) {
				//��� ���� 0���� ��� �� ���
				this.answer = N-K+1;
			}
			*/
		}
	return this.answer;
	}
	
	
}
