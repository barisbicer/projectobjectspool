package interfaces;


import java.util.LinkedList;
import java.util.Queue;
  
public class AtomicIntegerCompareAndSetExample1   
{  
    public static void main(String[] args)   
    {  
      
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i < 11; i++)
            q.add(i);
       
        ObjectPool<Integer> a=new PoolObject<>(q);
        
        a.borrow();
        a.borrow();
        a.borrow();
        a.release(2);
        a.borrow();
        a.borrow();
        a.borrow();
        a.borrow();
        a.borrow();
        a.borrow();
        a.borrow();
        
        int size = q.size();
        System.out.println("Size of queue-"
                           + size);
        
     
       
        
       
        
       
        
        
    }  
}  