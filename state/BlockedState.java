package state;

public class BlockedState extends ThreadState {

	public BlockedState()
	{
		state=StateSet.BLOCKED;
		System.out.println("阻塞线程");
	}
	public void resume(ThreadContext tc)
	{
		System.out.println("调用resume方法");
		if(state==StateSet.BLOCKED)
			tc.setThreadState(new RunnableState());
		else 
			System.out.println("当前线程不是新建状态");
		
	}
	
	/*public void stop(ThreadContext tc) 
	{
		System.out.println("调用stop方法");
		if(state==StateSet.RANNABLE)
			tc.setThreadState(new DeadState());
		else 
			System.out.println("当前状态不是运行状态");
	}*/
}
