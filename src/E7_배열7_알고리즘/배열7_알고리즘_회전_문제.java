package E7_�迭7_�˰�����;

import java.util.Arrays;
import java.util.Scanner;

public class �迭7_�˰�����_ȸ��_���� {

	public static void main(String[] args) {
		/*
		 * ����)  �Ʒ� ���ɾ �Է¹��������� block�迭�� 90�� ȸ���غ�����.
		 * [1.left_turn] [2.right_turn]
		 * 
		 * ��) [1.left_turn] (�������� 90�� ȸ��)
		 * 
		 * 4 8 12 16
		 * 3 7 11 15
		 * 2 6 10 14
		 * 1 5 9  13
		 */
		
			int block[][] = {
					{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					{13,14,15,16},
			};
			// 1 : 0,0 -> 3ĭ�̵� -> 3,0 -> 3ĭ�̵� -> 3,3 -> 3ĭ�̵� -> 0,3 -> 3ĭ�̵� -> 0,0
			//     0,1 -> 3ĭ�̵� -> 2,0 -> 3ĭ�̵� -> 3,2 -> 3ĭ�̵� -> 1,3 -> 3ĭ�̵� -> 0,1
			//     0,2 -> 3ĭ�̵� -> 1,0 -> 3ĭ�̵� -> 3,1 -> 3ĭ�̵� -> 2,3 -> 3ĭ�̵� -> 0,2
			//     0,3 -> 3ĭ�̵� -> 0,0 -> 3ĭ�̵� -> 3,0 -> 3ĭ�̵� -> 3,3 -> 3ĭ�̵� -> 0,3
			
			// 2 : 0,0 -> 3ĭ�̵� -> 0,3 -> 3ĭ�̵� -> 3,3 -> 3ĭ�̵� -> 3,0 -> 3ĭ�̵� -> 0,0
			// 2 : 0,1 -> 3ĭ�̵� -> 1,3 -> 3ĭ�̵� -> 3,2 -> 3ĭ�̵� -> 2,0 -> 3ĭ�̵� -> 0,1
			// 2 : 0,2 -> 3ĭ�̵� -> 2,3 -> 3ĭ�̵� -> 3,1 -> 3ĭ�̵� -> 1,0 -> 3ĭ�̵� -> 0,2
			// 2 : 0,3 -> 3ĭ�̵� -> 3,3 -> 3ĭ�̵� -> 3,0 -> 3ĭ�̵� -> 0,0 -> 3ĭ�̵� -> 0,3
			Scanner scan = new Scanner(System.in);
			
			while(true) {
				for(int i = 0; i < block.length; i++) {
					System.out.println(Arrays.toString(block[i]));
				}
				System.out.println("[1.left_turn] [2.right_turn][0.break]");
				int n = scan.nextInt();
				int temp[][] = new int[4][4];
				if(n == 1) {
					for(int i = 0; i < block.length; i++) {
						int y = block.length-1;
						for(int j = 0; j < block.length; j++) {
							temp[y][i] = block[i][j];
							//System.out.println(y + " " + i);
							y -= 1;
						}
					}
					block = temp;
				}else if(n == 2) {
					int x = block.length-1;
					for(int i = 0; i < block.length; i++) {
						System.out.println(x);
						for(int j = 0; j < block.length; j++) {
							temp[j][x] = block[i][j];
							//System.out.println(j + " " + x);
						}
						x -= 1;
					}
					block = temp;
				}else if(n == 0) {
					break;
				}
				
			}
			
			

	}

}
