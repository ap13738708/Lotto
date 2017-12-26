import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//Date date = new Date();
//System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43

public class MatchNum {
	/* 
	 * All number in text file have to be 4 digits or 15 digits
	 * 
	 * */
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		String momFile = "C://Users//user//Dropbox//lotto//lotto.txt";
		//String jeabFile = "C://Users//user//Dropbox//JeabLotto//lotto.txt";
		String testFile = "C://Users//user//Desktop//lotto_num//lottoTest.txt";
		
		ArrangeNum mom = new ArrangeNum(momFile);
//		ArrangeNum jeab = new ArrangeNum(jeabFile);
		ArrangeNum test = new ArrangeNum(testFile);
		
		
		//randomNum(20,testFile);
		System.out.println(dateFormat.format(date)); 
		System.out.println(match(mom,test));
		
		
		
		PrintWriter writer = new PrintWriter("C:\\Users\\user\\Dropbox\\lotto\\matched.txt", "UTF-8");
		writer.println(dateFormat.format(date)); //2016/11/16 12:08:43
		writer.println(match(mom,test));
		writer.close();
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
	
	public static String match(ArrangeNum less, ArrangeNum more) {
		String match = "";
		for(int i = 0; i< less.all.size(); i++) {
			if(more.all.contains(less.all.get(i))) {
				match += less.all.get(i) + ", ";
			}
		}
		match = match.substring(0, match.lastIndexOf(","));
		return match;
	}
}

