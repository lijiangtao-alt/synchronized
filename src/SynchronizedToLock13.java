import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description synchronized 和 lock 等价的过程
 * @Author lijiangtao
 * @Date 2020/9/1 20:14
 * @Version 1.0
 */
public class SynchronizedToLock13 {
    Lock lock = new ReentrantLock();
    public synchronized void method1(){
        System.out.println("这是 synchronized 形式的锁");
    }
    public void method2(){
        lock.lock();
        try{
            System.out.println("这是 lock 形式的锁");
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        SynchronizedToLock13 s = new SynchronizedToLock13();
        s.method1();
        s.method2();
    }
}
