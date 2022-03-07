package interfaces;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;


public class PoolObject<T> implements ObjectPool<T>{

	// Maximum number of objects are 0
    public static final int MAX_OBJECTS = 10;
  	private Queue<T> pool;
    private final AtomicInteger usageCount = new AtomicInteger(0);
    
    public PoolObject(Queue<T> pool) {
       // initialize pool
		this.pool = pool;
	}

	
	@Override
	public T borrow() {
		
		 T object;

		    if(usageCount.compareAndSet(MAX_OBJECTS, MAX_OBJECTS)){
		      return null;
		    }
         
		 	    
		    int preBorrowCount = usageCount.get();

		    if ((object = pool.poll()) == null) {
		    	 System.out.println("wait until relase object");
		    }

		    while (usageCount.compareAndSet(preBorrowCount, preBorrowCount+1));

		    return object;
		
	}

	@Override
	public void release(T t) {
		// TODO Auto-generated method stub
		if (t == null) {
		    return;
		    }

		    int preReturnCount = usageCount.get();
		    this.pool.offer(t);

		    while (usageCount.compareAndSet(preReturnCount, preReturnCount-1));
		
	}

	


}
