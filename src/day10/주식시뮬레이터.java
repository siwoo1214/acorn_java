package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class 주식시뮬레이터 extends Stock{
	Stock s = new Stock();
	ArrayList<Stock> list = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		주식시뮬레이터 stock_simul = new 주식시뮬레이터();
		
		stock_simul.createStocks();
		stock_simul.stockInfo();
		stock_simul.createStocks();
		stock_simul.stockInfo();
	}

	// 주식 생성
	public void createStocks() {
		loop: while (true) {
			System.out.println("구매하시겠습니까? 구매/종료");
			String buyOrsell = sc.next();
			if (buyOrsell.equals("구매")) {
				System.out.println("구매할 주식명과 수량을 입력하세요");
				list.add(new Stock(sc.next(), sc.nextInt(), set_bid(), set_volatility(), set_limit_order_over(),
						set_limit_order_under()));
			} else {
				break loop;
			}
		}
	}

	// 주식 정보 출력
	public void stockInfo() {
		for (Stock i : list) {
			System.out.println(i.toString());
		}
	}

}
