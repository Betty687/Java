package state;

public class ThreadContext {
	
	private ThreadState threadState;
	
	public ThreadContext() {
		threadState=new NewState();
	}
	
	public ThreadState getThreadState() {
		return threadState;
	}

	public void setThreadState(ThreadState threadState) {
		// TODO Auto-generated method stub
		this.threadState=threadState;
	}
	
	public void start()
	{
		((NewState)threadState).start(this);
	}

	public void getCpu() {
		// TODO Auto-generated method stub
		((RunnableState)threadState).getCpu(this);
	}

	public void suspend() {
		// TODO Auto-generated method stub
		((RunningState)threadState).suspend(this);
	}
	
	public void stop() {
		// TODO Auto-generated method stub
		((RunningState)threadState).stop(this);
	}
	public void resume() {
		((BlockedState)threadState).resume(this);
	}
	

	

}
