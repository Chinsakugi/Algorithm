package design_pattern;

//线程不安全
public class Singleton {
    private static Singleton instance;
    private Singleton(){}

    public static Singleton getInstance(){
        if (instance==null)
            instance = new Singleton();
        return instance;
    }
}

//饿汉式  线程安全
/*
public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton (){}
    public static Singleton getInstance() {
        return instance;
    }
}
*/

//双重加锁    线程安全
/*
public class Singleton {
    private volatile static Singleton singleton;
    private Singleton (){}
    public static Singleton getSingleton() {
    if (singleton == null) {
        synchronized (Singleton.class) {
        if (singleton == null) {
            singleton = new Singleton();
        }
        }
    }
    return singleton;
    }
}
 */



