/**
 * @author Created by MadJieJie on 2017/4/20-16:00.
 * @brief
 * @attention
 */
public interface Subject
{
	/**
	 * Add Observer element.
	 * @param observer register element
	 */
	void attach( Observer observer );
	
	/**
	 * Remove Observer element.
	 * @param observer unregister element.
	 */
	void detach( Observer observer );
	
	/**
	 * Notify Observer's elements that subject's state has changed.
	 * @param message send message
	 */
	void notify(String message);
	
}
