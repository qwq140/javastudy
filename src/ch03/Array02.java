package ch03;

public class Array02 {

	public static void main(String[] args) {
		double score[][] = {
				{3.3, 3.4},
				{3.5, 3.6},
				{3.7, 4.0},
				{4.1, 4.2}
		};
		//4*2=8개의 double = 64Byte
//		double score2[][] = new double[4][2];
//		score2[0][0] = 3.3;
//		score2[0][1] = 3.4;
//		
//		score2[1][0] = 3.5;
//		score2[1][1] = 3.6;
//		
//		score2[2][0] = 3.7;
//		score2[2][1] = 4.0;
//		
//		score2[3][0] = 4.1;
//		score2[3][1] = 4.2;
		
		double sum = 0;
		for (int year = 0; year < score.length; year++) {
			for (int term = 0; term < score[year].length; term++) {
				sum = sum + score[year][term];
			}
		}
		
		int n = score.length;
		int m = score[0].length;
		System.out.println("4년 전체 평점 평균은 " + sum/(n*m));
	}

}
