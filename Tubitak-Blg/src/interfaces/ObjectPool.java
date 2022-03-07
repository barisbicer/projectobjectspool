package interfaces;

public interface ObjectPool<T>{
	  T borrow();
	  void release(T t);
	}
