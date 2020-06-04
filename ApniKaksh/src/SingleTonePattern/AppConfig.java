package SingleTonePattern;

public class AppConfig{
	private AppConfig()
	{
		
	}
	private static AppConfig obj = null;;
	private static AppConfig getInstance()
	{if(obj == null)
	{
		obj = new AppConfig();
	}
		return obj;
		
	}
	public static void main(String[] args) {
		AppConfig obj1 =AppConfig.getInstance();
		AppConfig obj2 =AppConfig.getInstance();

	}
}



