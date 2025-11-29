package com.agamenon.aula18;

import java.util.Scanner;

public class BreakEContinue {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num,max;
		
		System.out.println("Entre com um numero:");
		num = scan.nextInt();
		
		System.out.println("Entre com um limite:");
		max = scan.nextInt();
		
		//utilização do comando break 
		for (int i = num; i<= max; i++) {
			System.out.println(i);
			if (i % 7 ==0) {
				System.out.println("O valor de i é: " + i);
				break;
			}
			
		}
		
		// utilização do comando continue
		for (int i = num; i<= max; i++) {
			System.out.println(i);
			if (i % 7 ==0) {
				continue;
			}
			System.out.println("O valor de i é: " + i);
			
		}

	}

}
