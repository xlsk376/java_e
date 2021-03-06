package E6_배열6_알고리즘;

import java.util.Arrays;

public class 배열6_알고리즘_두개뽑아서더하기_문제 {

	public static void main(String[] args) {
		/*	
		 [1] arr 배열에서 숫자 2개씩 뽑아서 더한값을 차례대로 result 에 저장후출력
		 [2] 자기차례 인덱스의 값은  더하지않는다.		
		  (1) [인덱스 0] 의값 2 + (1,3,4,1) ==> 2 + 1 , 2 + 3 , 2 + 4 , 2 + 1
		  (2) [인덱스 1] 의값 1 + (2,3,4,1) ==> 1 + 2 , 1 + 3 , 1 + 4 , 1 + 1
		  (3) [인덱스 2] 의값 3 + (2,1,4,1) ==> 3 + 2 , 3 + 1 , 3 + 4 , 3 + 1
		   ....		
		 [추가 조건] result 에 저장된값들중 중복되는 값은 전부 삭제후 출력 
		*/
		int arr[]  = {2,1,3,4,1};
		int result [] = new int[100];
		int temp [] = new int[100];
		int index = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(i != j) { // 자기차례 인덱스는 제외
					result[index] = arr[i] + arr[j];
					index += 1;
					//System.out.println(arr[i] + " " + arr[j]);
				}
			}
		}
		System.out.println(Arrays.toString(result));
		index = 0;
		for(int i = 0; i < result.length; i++) {
			if(result[i] == 0) {
				continue;
			}
			boolean check = false;
			for(int j = 0; j < result.length; j++) {
				if(result[i] == temp[j]) {
					check = true;
					break;
				}
			}
			if(check == false) {
				temp[index] = result[i];
				index += 1;
			}
		}
		System.out.println(Arrays.toString(temp));
		
		//선생님 코드, 같을경우는 continue로 진행
//		int arr[]  = {2,1,3,4,1};
//		
//		int result [] = new int[100];
//		int index = 0;
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr.length; j++) {
//				if(i == j) {
//					continue;
//				}else {
//					result[index] = arr[i] + arr[j];
//					index += 1;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(result));
		

	}

}
