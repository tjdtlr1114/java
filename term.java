import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Project {
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		int n;
		int max;
		int min;
		
		System.out.println("n ���� �Է��ϼ���");
		n = sc.nextInt();
				
		System.out.println("b ���� �Է��ϼ���");			
		max = sc.nextInt();

		System.out.println("a ���� �Է��ϼ���");
		min = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int randomNumber = (int)(Math.random()*((max - min)+1))+min;
		System.out.println(randomNumber);		
		}
	}
	
	private static void project(){
		int[] value = randomNumber;
		int sum = 0;
		int max = value[0];
		int min = value[0];
		
		for(int i=0; i < value.length; i++) {
			sum += value[i];	
		}
		
		for(int i=1; i < value.length; i++) {
			if(max < value[i]) {
				max = vlaue[i];
			} else if(value[i] < min) {
				min = score[i];
			}
		}
		
		System.out.println("�հ谪 : " + sum);
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
	}
}
