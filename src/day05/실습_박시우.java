package day05;

import java.util.Scanner;

public class 실습_박시우 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1.
		System.out.println("나라 입력");
		String[] arr = new String[] { sc.next(), sc.next(), sc.next() };

		System.out.println("나라 출력");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		System.out.println("-----------------------------");
		
		
		// 2.
		String[] lunch = new String[] { "돈까스", "햄버거", "국밥", "삼겹살", "곱창" };
		for (String tmp : lunch) {
			System.out.println(tmp);
		}

		System.out.println("-----------------------------");
		
		
		// 3.
		String[][][] cubes = {
				{ { "red", "green", "yellow" }, { "blue", "orange", "purple" }, { "black", "cyan", "skyblue" } },
				{ { "white", "pink", "brown" }, { "gray", "navy", "lime" }, { "beige", "teal", "gold" } },
				{ { "silver", "magenta", "maroon" }, { "olive", "violet", "indigo" },{ "turquoise", "peach", "lavender" } }
		};
		
		for(int k=0; k<cubes.length; k++) {
			for(int i=0; i<cubes[k].length; i++) {
				for(int j=0; j<cubes[k][i].length; j++) {
					System.out.print(cubes[k][i][j]+", ");
				}
			}
			System.out.println();
		}
		
		sc.close();
	}
}
