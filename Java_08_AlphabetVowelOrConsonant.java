package JavaInterviewQuestions;

import java.util.Scanner;

public class Java_08_AlphabetVowelOrConsonant {

	public static void main(String[] args) {
		
      //Question: Check whether an alphabet is Vowel or Consonant
		// a e i o u
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Gir krk");
		char ch=scan.next().charAt(0);
		
		if (ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u') {
			
			System.out.println("Harf unludur.");
			
		}else System.out.println("Harf unsuzdur.");
		
		
		//Second way
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("'"+ch+"'" + " is vowel(sesli harf)");
			break;

		default:
			System.out.println("'"+ch+"'" + " is consonant(sessiz harf)");
			break;
			
		
		}
	}

}
