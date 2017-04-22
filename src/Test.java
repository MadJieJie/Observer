/**
 * @author Created by MadJieJie on 2017/4/20-16:00.
 * @brief
 * @attention
 */
public class Test
{
	
	public static void main(String[] args)
	{
		Subject subject = new ConcreteSubject();
		
		Observer qqObserver = new ConcreteObserver("QQ");
		Observer weiXinObserver = new ConcreteObserver("WeiXin");
		
		subject.attach(qqObserver);
		subject.attach(weiXinObserver);
		
		subject.notify("close");
		
	}
	
}
