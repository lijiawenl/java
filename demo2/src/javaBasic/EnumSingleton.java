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
 /*调用resource：EnumSingleton.INSTANCE.getInstance() */
/*     通过enum关键字来实现枚举，在枚举中需要注意的有：

        1. 枚举中的属性必须放在最前面，一般使用大写字母表示

        2. 枚举中可以和java类一样定义方法

        3. 枚举中的构造方法必须是私有的

       通过一个java类来模拟枚举的功能：*/
}


