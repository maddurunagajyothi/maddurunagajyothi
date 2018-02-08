
package logics;

public class thread {

	public static void main(String[] args)
	{
		
		System.out.println("-------------------");
		System.out.println("pre default threads info");
		System.out.println("-------------------");
		Thread t=Thread.currentThread();
		System.out.println(" "+t);
		t.setName("sathya");
		System.out.println("default threads="+t);
		boolean pt=t.isAlive();
		System.out.println("exec status of t="+pt);
		Thread.State ts=t.getState();
		System.out.println("state name"+ts);
		ThreadGroup pt1=t.getThreadGroup();
		System.out.println("thread group of ="+pt1);
		ThreadGroup pg=pt1.getParent();
		System.out.println("parent"+pg);
		ThreadGroup pr1=pg.getParent();
		System.out.println("parent of thread=+pr");
		System.out.println("------------");
		System.out.println("prog-def threads info");
		Thread t1=new Thread();
		String dfname=t1.getName();
		System.out.println("default name of fgt="+dfname);
		boolean b=t1.isAlive();
		Thread.State tt=t1.getState();
	    System.out.println(" "+b);
	    System.out.println(" "+tt);
	    ThreadGroup tt1=t1.getThreadGroup();
	    System.out.println("thread group of"+tt1);
	    ThreadGroup tg1=tt1.getParent();
	    System.out.println(" "+tg1);
	    ThreadGroup tr1=tg1.getParent();
	    System.out.println(" "+tr1);
        System.out.println("--------------------");
	    System.out.println("thread priority modifierrs");
	    System.out.println("---------------------------");
	    System.out.println("val of max pri="+Thread.MAX_PRIORITY);
	    System.out.println("val of min pri="+Thread.MIN_PRIORITY);
	    System.out.println("val of norm pri="+Thread.NORM_PRIORITY);
	    System.out.println("--------------------");
	    
	    
	}
}
		
		

	
