package sec06.exam01;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test[] = {20, 30, 40, 50, 10};
		int i, j, temp, flag;
		System.out.println("정렬 전");
		for(i = 0; i < 5; i++) {
			System.out.println((i + 1) + "번째 데이터" + test[i]);
		}
		for(i = 0; i < 4; i++) {
			flag = 0;
			for( j = 0; j < 4 - i; j++) { // j는 0에서 4-i까지 j++
				if(test[j] < test[j+1]) {
					temp = test[j];
					test[j] = test[j+1];
					test[j+1] = temp;
					flag = 1;
				}
			}
			if(flag == 0) {
				break;
			}
			System.out.println("=========================");
			System.out.println("=========================");
			System.out.println("정렬 휴");
			for(i = 0; i < 5; i++) {
				System.out.println((i + 1) + "번째 데이터" + test[i]);
			}
		}
	}

}
