import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

//PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
//writer.println("The first line");
//writer.println("The second line");
//writer.close();

public class MatchNum {
	/* 
	 * All number in text file have to be 4 digits or 15 digits
	 * 
	 * */
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		String momFile = "C://Users//user//Dropbox//lotto//lotto.txt";
		//String jeabFile = "C://Users//user//Dropbox//JeabLotto//lotto.txt";
		String testFile = "C://Users//user//Desktop//lotto_num//lottoTest.txt";
		
		ArrangeNum mom = new ArrangeNum(momFile);
//		ArrangeNum jeab = new ArrangeNum(jeabFile);
		ArrangeNum test = new ArrangeNum(testFile);
		
		
		//randomNum(20,testFile);
		mom.printNum(mom.all);
		System.out.println("_____________________");
		
		test.printNum(test.all);
		
	}
	
	public static void randomNum(int amount, String file) {
		int num ;
		String value;
		try {
			PrintStream output = new PrintStream(new File(file));
			for(int i = 0 ; i< amount ; i++) {
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
