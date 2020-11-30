package conn;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("D:\\test.txt");
			while(true) {
				String line = scanner.nextLine(); // 빈칸을 포함하여 한 줄 읽기
				if(line.length()==0) // g한 줄에 <Enter>키만 입력한 경우
					break;
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2);
			}
			fout.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
		scanner.close();

	}

}
