package coupang;

import java.util.Scanner;

public class CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coinCount=0;
		int money;
		Scanner input = new Scanner(System.in);
		coinCount = input.nextInt();
		int[] coin = new int[coinCount];
		for(int i=0;i<coin.length;i++){
			coin[i] = input.nextInt();
		}
		money = input.nextInt();
		
		System.out.println(solution(coin,money));
		

	}
	
	public static int solution(int[] coinTypes,int money){
		int[] result = new int[money+1];
		result[0] = 1;
		for(int i=0; i<coinTypes.length;i++){
			for(int j=0; j<=money;j++){
				if(j>=coinTypes[i]){
					result[j] += result[j-coinTypes[i]];
				}
			}
		}
		return result[money];
	}

}
