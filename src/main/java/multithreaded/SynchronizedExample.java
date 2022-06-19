package multithreaded;

/**
 * @author zhao wen
 * @sice 2022/6/19
 **/
public class SynchronizedExample {
    // 关键字在实例方法上，锁为当前实例
    public synchronized void method1() {
        // code
    }

    // 关键字在代码块上，锁为括号里面的对象
    public void method2() {
        Object o = new Object();
        synchronized (o) {
            // code
        }
    }
}
