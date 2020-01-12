package algorithmBasic.stack;

import java.io.*;
import java.util.Stack;

//����
//�� �ٷ� �� ������ �����͸� �����Ϸ��� �Ѵ�. �� ������� ���� �ҹ��ڸ��� ����� �� �ִ� �������, �ִ� 600,000���ڱ��� �Է��� �� �ִ�.
//
//�� �����⿡�� 'Ŀ��'��� ���� �ִµ�, Ŀ���� ������ �� ��(ù ��° ������ ����), ������ �� ��(������ ������ ������), �Ǵ� ���� �߰� ������ ��(��� ���ӵ� �� ���� ����)�� ��ġ�� �� �ִ�. 
//�� ���̰� L�� ���ڿ��� ���� �����⿡ �ԷµǾ� ������, Ŀ���� ��ġ�� �� �ִ� ���� L+1���� ��찡 �ִ�.
//
//�� �����Ⱑ �����ϴ� ��ɾ�� ������ ����.
//
//L	Ŀ���� �������� �� ĭ �ű� (Ŀ���� ������ �� ���̸� ���õ�)
//D	Ŀ���� ���������� �� ĭ �ű� (Ŀ���� ������ �� ���̸� ���õ�)
//B	Ŀ�� ���ʿ� �ִ� ���ڸ� ������ (Ŀ���� ������ �� ���̸� ���õ�)
//������ ���� Ŀ���� �� ĭ �������� �̵��� ��ó�� ��Ÿ������, ������ Ŀ���� �����ʿ� �ִ� ���ڴ� �״����
//P $	$��� ���ڸ� Ŀ�� ���ʿ� �߰���
//�ʱ⿡ �����⿡ �ԷµǾ� �ִ� ���ڿ��� �־�����, �� ���� �Է��� ��ɾ ���ʷ� �־����� ��, ��� ��ɾ �����ϰ� �� �� �����⿡ �ԷµǾ� �ִ� ���ڿ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ��, ��ɾ ����Ǳ� ���� Ŀ���� ������ �� �ڿ� ��ġ�ϰ� �ִٰ� �Ѵ�.

public class BJ_1406 {
	public static void main(String args[]) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> orgStack = new Stack<>();
		Stack<Character> editStack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		//���ڿ��� Ŀ�ǵ� ���� �Է¹޴´�
		String orgString = reader.readLine();
		int nb = Integer.parseInt(reader.readLine());
		
		//���ڸ� �ϳ��� stack�� ��´�
		for(int i=0; i<orgString.length(); i++) {
			orgStack.push(orgString.charAt(i));
		}
		for(int i=0; i<nb ; i++) {
			String cmd = reader.readLine();
			
			//�� ���� ��� skip
			if(!orgStack.isEmpty()) {
				//L COMMAND
				if(cmd.equals("L")) {
					editStack.push(orgStack.peek());
					orgStack.pop();
				}
				//B COMMAND
				if(cmd.equals("B")) {
					orgStack.pop();
				}
			}
			//�� ���� ��� skip
			if(!editStack.isEmpty()) {
				//D COMMAND
				if(cmd.equals("D")) {
					orgStack.push(editStack.peek());
					editStack.pop();
				}
			}
			//P * COMMAND
			if(cmd.startsWith("P")) {
				Character addChar = cmd.charAt(cmd.length()-1);
				orgStack.push(addChar);
			}
		}
		while(!orgStack.isEmpty()) {
			editStack.push(orgStack.peek());
			orgStack.pop();
		}
		while(!editStack.isEmpty()) {
			sb.append(editStack.peek());
			editStack.pop();
		}
		writer.write(sb.toString());
		reader.close();
		writer.flush();
		writer.close();
	}
}
