package E4_배열4_알고리즘;

import java.util.Arrays;

public class 배열4_알고리즘_배열비교1 {

	public static void main(String[] args) {
		/*
		 *  [문제] array 배열 안의 값들중에서 b배열의 값이 있으면 
			     b와 array의 각각 겹치는값을  0으로 변경	
			 
			 [예] 
			 	array[] = {0,0,30,40};
				   b[] = {0,3,0,50};	
			
		 */
		
//		int array[] = {10,20,30,40};
//		int b[] = {10,3,20,50};
//		
//		for(int i = 0; i < array.length; i++) {
//			for(int j = 0; j < b.length; j++) {
//				if(array[i] == b[j]) {
//					array[i] = 0;
//					b[j] = 0;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(array));
//		System.out.println(Arrays.toString(b));
		
		int array[] = {10,20,30,40};
		int b[] = {10,3,20,50};
		int count = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < b.length; j++) {
				if(array[i] == 0) { // 0값이면 패스
					continue;
				}
				if(b[j] == 0) { // 0값이면 패스
					continue;
				}
				if(array[i] == b[j]) {
					array[i] = 0;
					b[j] = 0;
				}
				count += 1;
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(b));
		System.out.println(count);

	}

}
