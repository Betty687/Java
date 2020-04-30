package state;

public class DeadState extends ThreadState {

	public DeadState() {
		state=StateSet.DEAD;
		System.out.println("线程死亡");
	}
	public void resume(ThreadContext tc) {
		System.out.println("获得CPU时间");
		if(state==StateSet.BLOCKED)
			tc.setThreadState(new RunnableState());
		else 
			System.out.println("当前状态不是状态");
	}


}
