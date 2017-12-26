
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AdjustFormatLotto {

	public static void main(String[] args) throws FileNotFoundException {
		String filePath = "C://Users//user//Desktop//lotto_num//lotto.txt";
		Scanner sc = new Scanner(new File(filePath));

		while (sc.hasNext()) {
			String t = sc.next();
			while(t.length() != 4) {
				t = 0 + t;
			}
			System.out.println(t);
		}
		sc.close();

	}

}
/*
*/