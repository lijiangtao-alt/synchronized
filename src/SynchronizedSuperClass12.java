/**
 * 可重用粒度测试，调用父类方法
 */

public class SynchronizedSuperClass12 {
    public synchronized void doSomething(){
        System.out.println("这是父类方法");
    }
}
class TestClass extends SynchronizedSuperClass12{
    public synchronized void doSomething(){
        System.out.println("这是子类方法");
        super.doSomething();
    }

    public static void main(String[] args) {
        TestClass s = new TestClass();
        s.doSomething();
    }
}
