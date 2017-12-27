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
//	static int totalMatched = 0 ;
	static DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	static Date date = new Date();
	
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		
		String momFile = "C://Users//user//Dropbox//LottoMatchedNum//pLotto//lotto.txt";
		String jeabFile = "C://Users//user//Dropbox//LottoMatchedNum//jeabLotto//lotto.txt";
		String testFile = "C://Users//user//Dropbox//LottoMatchedNum//testLotto//lotto.txt";
		
		/*
		 * 
		 * Id name for arrangeNum must be name of the folder of each person which cut "Lotto" out.
		 * 
		 * */
		ArrangeNum mom = new ArrangeNum(momFile,"p");
		ArrangeNum jeab = new ArrangeNum(jeabFile,"jeab");
		ArrangeNum test = new ArrangeNum(testFile,"test");
		
		createMatchedFile(mom,test);
		
		
		System.out.println(dateFormat.format(date) + "     Total Matched = " + mom.getMatched()); 
		System.out.println(match(mom,test));
		
	}
	
	
	//Match number between two two arraylist which return matched number in (num, num, ...) format.
	public static String match(ArrangeNum less, ArrangeNum more) {
		String match = "";
		int amount = 0;
		for(int i = 0; i< less.all.size(); i++) {
			if(more.all.contains(less.all.get(i))) {
				match += less.all.get(i) + ", ";
				amount++;
			}
		}
		match = match.substring(0, match.lastIndexOf(","));
		less.setMatched(amount);
		return match;
	}
	
	public static void createMatchedFile(ArrangeNum less,ArrangeNum more) throws FileNotFoundException, UnsupportedEncodingException {
		String result = match(less,more);
		PrintWriter writer = new PrintWriter("C:\\Users\\user\\Dropbox\\LottoMatchedNum\\"+less.getId()+"Lotto\\"+more.getId()+"-matched.txt", "UTF-8");
		writer.println(dateFormat.format(date) + "     Total Matched = " + less.getMatched()); //2016/11/16 12:08:43
		writer.println(result);
		writer.close();
		
		PrintWriter writer2 = new PrintWriter("C:\\Users\\user\\Dropbox\\LottoMatchedNum\\"+more.getId()+"Lotto\\"+less.getId()+"-matched.txt", "UTF-8");
		writer2.println(dateFormat.format(date) + "     Total Matched = " + less.getMatched()); //2016/11/16 12:08:43
		writer2.println(result);
		writer2.close();
	}
	
	
}

