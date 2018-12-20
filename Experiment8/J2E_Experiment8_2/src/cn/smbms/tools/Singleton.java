package cn.smbms.tools;

public class Singleton {
	
	private static Singleton singleton;
	
	private Singleton(){
		//������Ӧ�������ڼ䣬ִֻ��һ�ε�ҵ��������(���磺��ȡ�����ļ��Ĳ���)
	}
	
	public static class SingletonHelper{
		private static final Singleton INSTANCE = new Singleton();
	}
	
	public static Singleton getInstance(){
		return SingletonHelper.INSTANCE;
	}
	public static Singleton test(){
		return singleton;
	}
	
}
