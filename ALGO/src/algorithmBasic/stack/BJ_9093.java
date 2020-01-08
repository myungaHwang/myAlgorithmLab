package algorithmBasic.stack;

import java.io.*;
import java.util.Stack;

//stack 문자 뒤집기
//문제
//문장이 주어졌을 때, 단어를 모두 뒤집어서 출력하는 프로그램을 작성하시오. 단, 단어의 순서는 바꿀 수 없다. 단어는 영어 알파벳으로만 이루어져 있다.
//
//입력
//첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있으며, 문장이 하나 주어진다. 단어의 길이는 최대 20, 문장의 길이는 최대 1000이다. 단어와 단어 사이에는 공백이 하나 있다.
//
//출력
//각 테스트 케이스에 대해서, 입력으로 주어진 문장의 단어를 모두 뒤집어 출력한다.

public class BJ_9093 {
	public static void main(String args[]) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> stack = new Stack<>();
//		몇문장이 들어오는지 input수
		int nb = Integer.parseInt(reader.readLine());
		
		for(int i=0; i<nb; i++) {
			String input = reader.readLine();
			input += "\n";
			StringBuilder output = new StringBuilder();
			
			for(int j=0; j<input.length(); j++) {
//				빈칸&엔터가 아닌경우 stack에 넣는다
				if(input.charAt(j) != ' ' && input.charAt(j) != '\n' ) {
					stack.push(input.charAt(j));
				}else {
//				빈칸or엔터 일 경우 stack이 비워질때까지 writer에 담는다
					while(!stack.isEmpty()) { 
						output.append(stack.peek());
						stack.pop();
					}
					if(input.charAt(j) ==' ') {
						output.append(input.charAt(j));
					}
				}
			}
			writer.write(output.toString()+"\n");
		}
		reader.close();
		writer.flush();
		writer.close();
	}
}
