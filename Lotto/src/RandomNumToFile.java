import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class RandomNumToFile {
	// Random number for test.
	public static void main(String[] args) {
		int num ;
		String value;
		try {
			PrintStream output = new PrintStream(new File("C://Users//user//Desktop//lotto_num//lottoTest.txt"));
			for(int i = 0 ; i< 100 ; i++) {
				num = (int) (Math.random() * (9999 - 0) + 0);
				value = String.valueOf(num);
				while(value.length() != 4) {
					value = 0 + value;
				}
				output.println(value);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
