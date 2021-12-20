package priv.xuchen.juc;

/**
 * play volatile <br/>
 * 内存可见性：当多个线程操作共享数据时，彼此不可见。<br/>
 * synchronized：保证每次获取值的时候都去内存刷新，效率非常低<br/>
 * volatile：当多个线程进行共享内存数据操作时，可以保证内存中的数据可见，效率比synchronized高，跟synchronized相比，volatile是一种较为轻量级的同步策略<br/>
 * 注意：<br/>
 * 1、volatile不具备“互斥性”，所有线程都可获得数据<br/>
 * 2、volatile不能保证变量的“原子性”<br/>
 * @version 1.0
 * @author: xuchen
 * @date: 2021/12/20 22:52
 */
public class PlayVolatile {

    public static void main(String[] args) {
        ThreadDemo td = new ThreadDemo();
        new Thread(td).start();
        
        while (true) {
            //synchronized (td) {
                if (td.isFlag()) {
                    System.out.println("============停止循环============");
                    break;
                }
            //}
        }
    }
    
}

class ThreadDemo implements Runnable {
    
    private volatile boolean flag = false;

    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;
        System.out.println("flag ==" + isFlag());
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
