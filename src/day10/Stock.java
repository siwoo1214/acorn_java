package day10;

public class Stock {
	String stock;  //종목이름
	int cnt;  //주식 수량
	int bid;  //매수가
	int ask;  //매도가
	double limit_order_over;  //지정가에 도착하면 팔게 설정하는 금액
	double  limit_order_under;  //지정가에 도착하면 사게 설정하는 금액
	double volatility;  //가격변동률	
	
	public Stock(){}
	
	public Stock(String stock, int cnt, int bid, double volatility, double limit_order_over, double limit_order_under) {
		this.stock=stock;
		this.cnt=cnt;
		this.bid=bid;
		this.volatility=volatility;
		this.limit_order_over=limit_order_over;
		this.limit_order_under=limit_order_under;
	}
	
	public String toString() {
		return "주식명:"+stock+" | 수량:"+cnt+" | 매매가:"+bid+" | 총 가격:"+(bid*cnt)+" | 변동률:"+volatility+" | 자동판매가:"+limit_order_over+" | 자동구매가:"+limit_order_under;
	}
	
	// 매수가 랜덤설정
	protected int set_bid() {
		return bid=(int)(Math.random()*3900)+1;
	}
	
	//가격변동률 랜덤설정
	protected double set_volatility() {
		return volatility = (double)Math.round((Math.random() * 20 - 10) * 100) / 100; //소수점 2째자리까지
	}
	
	// 자동 매매가(상한가) 랜덤설정
	protected double set_limit_order_over() {
		return limit_order_over=bid+bid*0.1; 
	}
	
	// 자동 매매가(상한가) 랜덤설정
	protected double set_limit_order_under() {
		return limit_order_over=bid-bid*0.1; 
	}
	
	//변동률 반영한 매도가
	private void set_ask() {
		bid*=volatility;
	}
	
	
	
	
	
	
	
}
