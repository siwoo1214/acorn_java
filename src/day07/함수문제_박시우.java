package day07;

import java.util.ArrayList;
import java.util.Random;

/*
  함수문제)
  1. 수배열을 매개변수로 짝수의 개수를 반환하는 함수를 만들기 
  2. 날씨정보를 반환하는 함수 만들기 (임의의 날씨 정보)
  3. 주간날씨정보를  반환하는 함수 만들기
  4. 오늘 메뉴 추전해주는 함수 만들기 ( Math.random()  )사용하여  메뉴배열에서 임의의 메뉴를 반환하기
  5. 수를 매개변수로 약수를 반환하는 함수 만들기
  6. 수목록(배열)을 입력으로 받아 가장 큰값을 반환하는 함수 만들기 ( 수 중에서 가장 큰값을 찾아주는 함수)
  7. 수목록(배열)을 주면 평균을 반환하는 함수 만들기
  8. 출장비가 매개변수가 전달되면 화폐매수를 반환하는 함수 만들기
 */

public class 함수문제_박시우 {
	public static void main(String[] args) {
		// 1.
		System.out.println("1번");
		int[] arr1 = { 23, 1, 2, 34, 27, 18, 14, 22 };
		System.out.println("짝수 : " + EvenCount(arr1) + "개");

		System.out.println("==============================");

		
		// 2.
		System.out.println("2번");
		double temperature = 38.4;
		System.out.println(todaytemperature(temperature));

		System.out.println("==============================");

		
		// 3.
		System.out.println("3번");
		int[][] arr2 = { { 4, 7, 8, 12, 13, 13, 8 }, { -5, -3, -4, -1, 2, 5, 2 } };
		System.out.println(weatherCaution(arr2));

		System.out.println("==============================");

		
		// 4.
		System.out.println("4번");
		String[] menu = { "햄버거", "돈까스", "라면", "초밥", "덮밥", "국밥" };
		System.out.println(menuSelect(menu));

		System.out.println("==============================");

		
		// 5.
		System.out.println("5번");
		int num = 263;
		System.out.println(measure(num));

		System.out.println("==============================");

		
		// 6.
		System.out.println("6번");
		int[] arr3 = { 23, 1, 2, 34, 27, 18, 14, 22 };
		System.out.println(maxNum(arr3));

		System.out.println("==============================");

		
		// 7.
		System.out.println("7번");
		int[] arr4 = { 23, 1, 2, 34, 27, 18, 14, 22};
		System.out.println(avgcalc(arr4));
		
		System.out.println("==============================");

		
		//8.
		System.out.println("8번");
		int money=463800;
		System.out.println(howmanysheets(money));
	}

	// 1.
	public static int EvenCount(int[] arr) {
		int cnt = 0;
		for (int i : arr) {
			if (i % 2 == 0)
				cnt++;
		}
		return cnt;
	}

	// 2.
	public static String todaytemperature(double temperature) {
		if (temperature > 28) {
			return "오늘은 더우니까 반팔,반바지와 같은 시원한 옷을 입으세요";
		} else if (temperature > 23) {
			return "움직이면 더운날씨입니다 반팔, 얇은 셔츠, 반바지가 적당해보이네요";
		} else if (temperature > 17) {
			return "블라우스, 긴팔티, 슬랙스가 어울리는 봄날씨에요";
		} else if (temperature > 9) {
			return "추위에 민감하신 분들은 자켓, 가디건을 입는것을 추천드립니다";
		} else if (temperature < 2) {
			return "울코트, 히트텍, 기모를 입으세요. 얇게 입었다가 감기에 걸립니다";
		} else if (temperature < 1) {
			return "추운날씨네요. 따뜻하게 입으세요";
		} else {
			return "기상천외한 날씨군요";
		}
	}

	// 3.
	public static String weatherCaution(int[][] arr) {
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < arr[0].length; i++) {
			int tmp = arr[0][i] - arr[1][i];

			result.append(i + 1).append("일 최고온도: ").append(arr[0][i]).append(" / 최저온도: ").append(arr[1][i])
					.append(" / 일교차: ").append(tmp).append("\n");

			if (tmp >= 10) {
				result.append("⚠️ 일교차가 큰 날씨이니 조심하세요! ⚠️\n");
			}

			result.append("\n");
		}

		return result.toString();
	}

	// 4.
	public static String menuSelect(String[] arr) {
		Random rd = new Random();
		int tmp = rd.nextInt(5);
		return arr[tmp];
	}

	// 5.
	public static ArrayList<Integer> measure(int num) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				list.add(i);
		}
		return list;
	}

	// 6.
	public static int maxNum(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] < arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
		return arr[0];
	}
	
	//7.
	public static double avgcalc(int[] arr) {
		int sum=0;
		double avg = 0;
		for(int i : arr) {
			sum+=i;
		}
		avg=sum/arr.length;
		return avg;
	}
	
	//8.
	public static String howmanysheets(int money) {
		StringBuilder sb = new StringBuilder();
		int[] currency_unit = new int[8];
		String[] unit = new String[] {"오만원권","만원권","오천원권","천원권","오백원권","백원권","오십원권","십원권"};
		int[] unit_money = new int[] {50000,10000,5000,1000,500,100,50,10};
		
		for(int i=0; i<unit.length; i++) {
			currency_unit[i] = money/unit_money[i];
			money%=unit_money[i];
		}
		
		for(int i=0; i<currency_unit.length; i++) {
			sb.append(unit[i]+":");
			sb.append(currency_unit[i]+"장, ");
		}
		return sb.toString();
	}
}
