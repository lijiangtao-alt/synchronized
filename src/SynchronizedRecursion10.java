/**
 * 可重入粒度测试：递归调用本方法
 * 重用：家里三个小汽车，就要上三个牌照，不能一个牌照三台小汽车公用，这是不可重用
 * 可重用的又叫递归调用
 * 粒度：scope范围
 */

public class SynchronizedRecursion10 {
    int a = 0;

    public static void main(String[] args) {
        SynchronizedRecursion10 synchronizedRecursion10 = new SynchronizedRecursion10();
        synchronizedRecursion10.method1();
    }

    private synchronized void method1() {
        System.out.println("这是method1，a = " + a);
        if (a == 0) {
            a++;
            method1();
        }
    }
}
