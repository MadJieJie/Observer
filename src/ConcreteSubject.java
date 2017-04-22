import java.util.ArrayList;
import java.util.List;

/**
 * @author Created by MadJieJie on 2017/4/20-16:00.
 * @brief
 * @attention
 */
public class ConcreteSubject implements Subject
{
	
	private List<Observer> mProgramList = new ArrayList<>();
	
	@Override
	public void attach ( Observer observer )
	{
		mProgramList.add(observer);
	}
	
	@Override
	public void detach ( Observer observer )
	{
		mProgramList.remove(observer);
	}
	
	@Override
	public void notify ( String message )
	{
		for(Observer observer: mProgramList )
		{
			observer.saveData(message);
		}
	}
	
	
}

