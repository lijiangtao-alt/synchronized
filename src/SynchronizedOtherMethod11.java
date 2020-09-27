/**
 * 可重入粒度测试：调用类内另外的方法
 */

public class SynchronizedOtherMethod11 {
    public synchronized void method1(){
        System.out.println("这是method1");
        method2();
    }

    private synchronized void method2() {
        System.out.println("这是方法2");
    }

    public static void main(String[] args) {
        SynchronizedOtherMethod11 s = new SynchronizedOtherMethod11();
        s.method1();
    }

}
