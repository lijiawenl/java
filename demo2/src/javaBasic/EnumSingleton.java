package JavaBase;


class Resource{}
public enum EnumSingleton {
	
	    INSTANCE;
	    private Resource instance;
	    EnumSingleton() {
	        instance = new Resource();
	    }
	    public Resource getInstance() {
	        return instance;
	    }
 /*����resource��EnumSingleton.INSTANCE.getInstance() */
/*     ͨ��enum�ؼ�����ʵ��ö�٣���ö������Ҫע����У�

        1. ö���е����Ա��������ǰ�棬һ��ʹ�ô�д��ĸ��ʾ

        2. ö���п��Ժ�java��һ�����巽��

        3. ö���еĹ��췽��������˽�е�

       ͨ��һ��java����ģ��ö�ٵĹ��ܣ�*/
}

