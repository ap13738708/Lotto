import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrangeNum {
	ArrayList<String> zero = new ArrayList<String>();
	ArrayList<String> one = new ArrayList<String>();
	ArrayList<String> two = new ArrayList<String>();
	ArrayList<String> three = new ArrayList<String>();
	ArrayList<String> four = new ArrayList<String>();
	ArrayList<String> five = new ArrayList<String>();
	ArrayList<String> six = new ArrayList<String>();
	ArrayList<String> seven = new ArrayList<String>();
	ArrayList<String> eight = new ArrayList<String>();
	ArrayList<String> nine = new ArrayList<String>();
	ArrayList<String> all = new ArrayList<String>();
	
	public ArrangeNum(String filePath) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(filePath));
		String input,s = "";
		while (sc.hasNext()) {
			input = sc.nextLine();
			if(input.length() != 4) {
				s = input.substring(9, 13);
			}
			else {
				s = input;
			}
			
			switch(s.substring(3)) {
				case "0" :zero.add(s);
						  break;
				case "1" :one.add(s);
				  		  break;
				case "2" :two.add(s);
						  break;
				case "3" :three.add(s);
				          break;
				case "4" :four.add(s);
				          break;
				case "5" :five.add(s);
						  break;
				case "6" :six.add(s);
						  break;
				case "7" :seven.add(s);
						  break;
				case "8" :eight.add(s);
						  break;
				case "9" :nine.add(s);
						  break;
				default : System.out.println("Not number");
						  break;
			}
		}
		sc.close();
		Collections.sort(zero);
		Collections.sort(one);
		Collections.sort(two);
		Collections.sort(three);
		Collections.sort(four);
		Collections.sort(five);
		Collections.sort(six);
		Collections.sort(seven);
		Collections.sort(eight);
		Collections.sort(nine);
		
		putInArrayList(zero);
		putInArrayList(one);
		putInArrayList(two);
		putInArrayList(three);
		putInArrayList(four);
		putInArrayList(five);
		putInArrayList(six);
		putInArrayList(seven);
		putInArrayList(eight);
		putInArrayList(nine);
	}
	
	public void printNum(ArrayList<String> list){
		for(String num : list) {
			System.out.println(num);
		}
	}
	
	public void putInArrayList(ArrayList<String> list){
		for(String num : list) {
			all.add(num);
		}
	}
	
}
