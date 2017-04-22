/**
 * @author Created by MadJieJie on 2017/4/20-16:00.
 * @brief
 * @attention
 */
public class ConcreteObserver implements Observer
{
	
	private String mProgramName;
	
	public ConcreteObserver ( String programName )
	{
		mProgramName = programName;
	}
	
	@Override
	public void saveData ( String message )
	{
		System.out.println("Receive " + message + "information - " + mProgramName + " has save data");
	}
	
	
}
