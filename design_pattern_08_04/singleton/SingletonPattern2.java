package com.dkc.design_pattern_08_04.singleton;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:单例饿汉式
 *
 * 这种写法起到了Lazy Loading的效果，但是只能在单线程下使用。如果在多线程下，
 * 一个线程进入了if (singleton == null)判断语句块，还未来得及往下执行，
 * 另一个线程也通过了这个判断语句，这时便会产生多个实例。所以在多线程环境下不可使用这种方式。
 *
 *
 * User:Mr.Du
 * Date:2019/8/4
 * Time:11:46
 */
public class SingletonPattern2{
    private static SingletonPattern2 singletonPattern2;
    private SingletonPattern2(){}
    public static SingletonPattern2 getInstance(){
        if(singletonPattern2 == null){
            singletonPattern2 = new SingletonPattern2();
        }
        return singletonPattern2;
    }

}
