package E5_배열5_알고리즘;

import java.util.Arrays;

public class 배열5_알고리즘_압축하기 {

	public static void main(String[] args) {
		/*
		 위 데이터는 압축전 데이터이다.
		 연속으로 이뤄진 데이터를 모아 압축할려고한다.
		 예) 33    ==> {3,2}
		 예) 55555 ==> {5,5}
		 예) 3     ==> {3,1};
		 예) 444   ==> {4,3};
		  0번은 압축할값 , 1번은 연속된개수 
		 문제) 위 압축전데이터를 분석후 2차원으로 저장하시요.
		 */
		int before[] = {3,3,5,5,5,5,5,3,4,4,4};		
		int after[][] = new int[4][2];
		int index = 0;
		after[index][0] = before[0]; // 값을 저장하고 비교
		after[index][1] = 1;         // 값을 저장했으므로 +1
		
		//1부터 시작, 이미 처음값을 저장했기때문에
		for(int i = 1; i < before.length; i++) {
			if(after[index][0] == before[i]) {
				after[index][1] += 1;
			}else {
				index += 1;
				after[index][0] = before[i];
				after[index][1] = 1;
			}
		}
		for(int i = 0; i < after.length; i++) {
			System.out.println(Arrays.toString(after[i]));
		}
		

	}

}
