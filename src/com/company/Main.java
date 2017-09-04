package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Podaj liczbę:");
	int a = in.nextInt();
	System.out.print("Liczba " + a + " binarnie (ZM) to: ");
	int [] table = new int[32];
	if(a < 0){
		table[0] = 1;
		a *= -1;
	}
	int i = 0;
	while(a > 0){
		i++;
		table[i] = a%2;
		a /= 2;

	}
	int j = i;
	System.out.print(table[0]+".");
	while(i > 0){
		System.out.print(table[i]);
		i--;
	}


    }
}
