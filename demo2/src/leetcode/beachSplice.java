package leetcode;
//沙滩分苹果。
public class beachSplice {
	static int ts=0;//桃子总数
	int fs=1;//记录分的次数
	static int hs=5;//猴子数...
	int tsscope=5000;//桃子数的取值范围.太大容易溢出.
	public int fT(int t){
		if(t==tsscope){
		//当桃子数到了最大的取值范围时取消递归
		System.out.println("结束");
		return 0;//在这里才会退出，而不是在达到条件时退出。
		}
		else{
			if((t-1)%hs==0 && fs <=hs){
				if(fs==hs){
					System.out.println("桃子数 = "+ts +" 时满足分桃条件");
					return -1;//在这里设置退出
				}
				fs+=1;
			    return fT((t-1)/5*4);// 返回猴子拿走一份后的剩下的总数
			}
			else
				{
					//没满足条件
					fs=1;//分的次数重置为1
					return fT(ts+=1);//桃子数加+1
				}
			}
		
		}
	public static void main(String[] args) {
		//new beachSplice().fT(0);
	beachSplice splice = new beachSplice();
	int sp = splice.fT(0);
	System.out.print(sp);
	}

}
