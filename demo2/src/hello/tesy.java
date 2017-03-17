package hello;

/**
 * Created by DELL on 2017/3/17.
 */

public class tesy {
    public static int powern(int m,int n){
        for ( int i=0 ;i<n;i++)
            m=m<<1;
        return m;
    }
    public static int powerw(int m,int n){
        for ( int i=0 ;i<n;i++)
            m=m<<1;
        return m;
    }
    public static  void main( String[] args){
        System.out.println("3乘8=" + powern(3,8));
        System.out.println("3乘7=" + powerw(3,7));
    }
}

