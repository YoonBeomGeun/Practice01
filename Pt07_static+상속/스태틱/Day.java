package 스태틱;

public class Day {
	//전역변수 ==> 자동초기화
	public String doing;
	public int time;
	public String location;
	public static int count;	//static을 하지 않으면 값이 초기화 됨
	public static int sum;
	
	//객체생성 시 초기값을 자동으로 넣어줌
	public Day(String doing, int time, String location) {
		this.doing = doing;
		this.time = time;
		this.location = location;
		count++;
		sum+=time;
	}

	//객체생성 후, 값들을 출력하고 싶을 때
	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
}
