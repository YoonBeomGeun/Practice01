package 메서드연습;

import java.io.FileWriter;
import java.io.IOException;

public class 파일에쓰기테스트 {

	public static void main(String[] args) {
		// 파일에 텍스트를 저장할 수 있는 부품
		try {
			FileWriter file = new FileWriter("test2.txt");
			file.write("hi" + "\n");
			file.write("hello" + "\n");
			file.write("goodbye" + "\n");
			file.close();	//stream 닫기, 안 닫으면 자리차지함.
			
		} catch (IOException e) {
			System.out.println("에러 발생");
			e.printStackTrace();	// 자세하게 에러정보를 볼 수 있음
		}
		// 파일을 생성하고, 텍스트를 파일까지 보낼 수 있는 통로까지 만든다.
		// 이 통로 == 강물(stream, 스트림)
		// 스트림을 만든는 것을 프로그래밍할 때는 굉장히 위험한 상황
		// 위험한 상황에 대해 대처를 꼭 해야함.
		// 1. 파일을 읽고 쓸때
		// 2. 네트워크를 연결할 때
		// 3. cpu를 연결할 때
	}
}
