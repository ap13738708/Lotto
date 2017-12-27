import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class MatchNum {
	/* 
	 * All number in text file have to be 4 digits or 15 digits and one num per line.
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
		
		
		System.out.println(dateFormat.format(date)); 
		System.out.println(match(mom,test));
		
		
		
		PrintWriter writer = new PrintWriter("C:\\Users\\user\\Dropbox\\lotto\\matched.txt", "UTF-8");
		writer.println(dateFormat.format(date)); //2016/11/16 12:08:43
		writer.println(match(mom,test));
		writer.close();
	}
	
	
	//Match number between two two arraylist which return matched number in (num, num, ...) format.
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

