
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		String UpperrWord = word.toUpperCase();
		ArrayList list = new ArrayList();
		for(int i =0; i< UpperrWord.length();i++) {
			list.add(UpperrWord.charAt(i));
		}
		
		int[] alpha = new int[26]; //각 알파벳이 사용된 횟수를 담을 배열(자동으로 0으로 초기화)
		for(int i =0; i< UpperrWord.length();i++) {
			alpha[((char)list.get(i)) - 'A']++;
		}
		
		System.out.println(Arrays.toString(alpha));
		
	}
}
