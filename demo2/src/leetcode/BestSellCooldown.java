package leetcode;

public class BestSellCooldown {
public static void main(String[] args){
	int i=Integer.MIN_VALUE;
	int j=i-5;
	int k=Integer.MAX_VALUE;
	System.out.println(i);
	System.out.println(j);
	System.out.println(k);
}
public int maxProfit(int[] prices){
	int sell =0,prev_sell=0,buy=Integer.MIN_VALUE,prev_buy;
	for(int price : prices){
		prev_buy=buy;
		buy=Math.max(prev_sell-price, prev_buy);//这样的话
		prev_sell=sell;
		sell=Math.max(prev_buy+price, prev_sell);
	}
	return sell;
}
}

