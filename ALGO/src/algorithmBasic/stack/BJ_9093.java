package algorithmBasic.stack;

import java.io.*;
import java.util.Stack;

//stack ���� ������
//����
//������ �־����� ��, �ܾ ��� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��, �ܾ��� ������ �ٲ� �� ����. �ܾ�� ���� ���ĺ����θ� �̷���� �ִ�.
//
//�Է�
//ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, ������ �ϳ� �־�����. �ܾ��� ���̴� �ִ� 20, ������ ���̴� �ִ� 1000�̴�. �ܾ�� �ܾ� ���̿��� ������ �ϳ� �ִ�.
//
//���
//�� �׽�Ʈ ���̽��� ���ؼ�, �Է����� �־��� ������ �ܾ ��� ������ ����Ѵ�.

public class BJ_9093 {
	public static void main(String args[]) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> stack = new Stack<>();
//		����� �������� input��
		int nb = Integer.parseInt(reader.readLine());
		
		for(int i=0; i<nb; i++) {
			String input = reader.readLine();
			input += "\n";
			StringBuilder output = new StringBuilder();
			
			for(int j=0; j<input.length(); j++) {
//				��ĭ&���Ͱ� �ƴѰ�� stack�� �ִ´�
				if(input.charAt(j) != ' ' && input.charAt(j) != '\n' ) {
					stack.push(input.charAt(j));
				}else {
//				��ĭor���� �� ��� stack�� ����������� writer�� ��´�
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
