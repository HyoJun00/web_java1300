package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask {
	public static void main(String[] args) {
		// 현재 경로에 animal.txt 파일을 생성
		// 파일 내용은 사슴, 고라니, 너구리 ,토끼, 네가지 동물을 작성
		// 각 동물은 줄바꿈 후 다음 동물을 넣도록 한다
		// 배열 이용, 반복문 사용
		
		// 로직구성
		// BufferWriter 객체 안에 FileWriter 안에 File 객체 생성
		// File 객체 안에 animal.txt 파일 이름 부여
		// 문자열 타입 배열 사용하여 사슴, 고라니, 너구리 ,토끼, 네가지 동물을 값으로 넣어준다
		// 반복문을 사용
		// .write() 메소드 안에 배열명을 넣어준다
		// .newLine() 메소드 사용하여 각 동물마다 줄바꿈
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("animal.txt")));
			String[] animal = {"사슴", "고라니", "너구리", "토끼"};
			for(int i = 0; i < animal.length; i++) {
				bw.write(animal[i]);
				bw.newLine();
			}
			bw.close();
			System.out.println("animal.txt 파일이 생성되었습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("animal.txt"));
			String line = null;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
