package E1_배열1_알고리즘;

public class 배열1_알고리즘_교차저장_문제 {

	public static void main(String[] args) {
		/*
		 * [문제1] a의 값과 b의 값을 번갈아가면서 c에 저장한다.
		 * [예] 
		 * 	c = {10,40,20,50,30,60}
		 * 
		 * 
		 * [문제2] d의 값을 번갈아가면서 e, f 에 각각 저장 
		 * [예]
		 * 	e = {10,30,50}
		 * 	f = {20,40,60};
		 * 
		 */
		int a[] = {10,20,30};
		int b[] = {40,50,60};
		int c[] = {0,0,0,0,0,0};
			
		int d[] = {10,20,30,40,50,60};
		int e[] = {0,0,0};
		int f[] = {0,0,0};
		int index = 0;
		for(int i = 0; i < 3; i++) { //i = 0; a[0]넣고 인덱스 증가, b[0] 증가된 인덱스에 값이 들어가고 인덱스 증가 
			c[index] = a[i];
			index += 1;
			c[index] = b[i];
			index += 1;
		}
		for(int i = 0; i < 6; i++) {
			System.out.println(c[i]);
		}
		index = 0; //index가 6이 들어가 있기때문에 0으로 초기화 시켜준다.
		for(int i = 0; i < 3; i++) {
			e[i] = d[index];
			index += 1;
			f[i] = d[index];
			index += 1;
		}
		for(int i = 0; i < 3; i++) {
			System.out.println(e[i]);
		}
		System.out.println();
		for(int i = 0; i < 3; i++) {
			System.out.println(f[i]);
		}

	}

}
