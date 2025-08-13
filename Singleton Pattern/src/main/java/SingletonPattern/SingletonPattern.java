package SingletonPattern;

public class SingletonPattern {
    public static void main(String[] args) {
    }
}

// 饿汉式
class Singleton1 {
    private static Singleton1 singleton = new Singleton1();
    private Singleton1(){}

    public static Singleton1 getInstance(){
        return null;
    }
}
// 懒汉式
class Singleton2 {
    private static Singleton2 singleton;
    private Singleton2(){}

    public synchronized static Singleton2 getInstance(){//加锁防止被多次实例化
        if(singleton == null)
        synchronized (Singleton2.class){
            if (singleton == null)
                singleton = new Singleton2();
        }
        return singleton;
    }
}
/**
 * 饿汉式
 * 懒汉式
 */