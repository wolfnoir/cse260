import java.util.*;
import java.io.*;

//everett yang 111756324
//listen to this while you go over this code: https://www.youtube.com/watch?v=EqiCObZh-rA

public class Letters {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int vowels = 0;
		int cons = 0;
		
		System.out.println("Please input file name. ");
		String filename = input.next();
		
		File file = new File(filename);
		if(!file.exists()) { //checks if file exists
			System.out.println("File does not exist! :^( ");
			System.exit(1);
		}
		//im just assuming all of the vowels are capital letters because it's easier and also im going to convert them all to upper case
		Set<Character> vowelSet = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U'));
		
		try (Scanner inputFile = new Scanner(file); ){
			while (inputFile.hasNext()) {
				String line = inputFile.nextLine();
				for (int i = 0; i < line.length(); i++) {
					if (vowelSet.contains(Character.toUpperCase(line.charAt(i))))
						vowels++;
					else if (Character.isLetter(line.charAt(i))) cons++; } } }
		System.out.println("Vowels in file: " + vowels
				+ "\nConstanants in file: " + cons);
	}

}
