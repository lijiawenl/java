package leetcode;
//ɳ̲��ƻ����
public class beachSplice {
	static int ts=0;//��������
	int fs=1;//��¼�ֵĴ���
	static int hs=5;//������...
	int tsscope=5000;//��������ȡֵ��Χ.̫���������.
	public int fT(int t){
		if(t==tsscope){
		//����������������ȡֵ��Χʱȡ���ݹ�
		System.out.println("����");
		return 0;//������Ż��˳����������ڴﵽ����ʱ�˳���
		}
		else{
			if((t-1)%hs==0 && fs <=hs){
				if(fs==hs){
					System.out.println("������ = "+ts +" ʱ�����������");
					return -1;//�����������˳�
				}
				fs+=1;
			    return fT((t-1)/5*4);// ���غ�������һ�ݺ��ʣ�µ�����
			}
			else
				{
					//û��������
					fs=1;//�ֵĴ�������Ϊ1
					return fT(ts+=1);//��������+1
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
