/**
 * 对象锁示例1，代码块形式
 */

public class SynchronizedObjectCodeBlock2 implements Runnable{

    static SynchronizedObjectCodeBlock2 instance1 = new SynchronizedObjectCodeBlock2();
    static SynchronizedObjectCodeBlock2 instance2 = new SynchronizedObjectCodeBlock2();
    Object lock1 = new Object();
    Object lock2 = new Object();

    @Override
    public void run() {
        synchronized (lock1) {
            System.out.println("这是lock1对象锁的代码块形式，名字是：" + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("lock1部分"+Thread.currentThread().getName() +"运行结束");
        }
        synchronized (lock2) {
            System.out.println("这是lock2对象锁的代码块形式，名字是：" + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("lock2部分"+Thread.currentThread().getName() +"运行结束");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance1);
        Thread t2 = new Thread(instance2);
        t1.start();
        t2.start();
        while(t1.isAlive()||t2.isAlive()){

        }
        System.out.println("Finished");
    }
}
