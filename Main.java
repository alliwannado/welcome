
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
		
		int[] alpha = new int[26]; //�� ���ĺ��� ���� Ƚ���� ���� �迭(�ڵ����� 0���� �ʱ�ȭ)
		for(int i =0; i< UpperrWord.length();i++) {
			alpha[((char)list.get(i)) - 'A']++;
		}
		
		System.out.println(Arrays.toString(alpha));
		
	}
}
