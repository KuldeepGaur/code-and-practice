package JavaDesignPatterns.src.com.designPatterns.singleton;

import java.io.Serializable;
/**
 * Created by KULDEEP on 20-08-2016.
 */
public class SingletonWithSerialization implements Serializable {

    private static final long serialVersionUID = -7604766932017737115L;

    private SingletonWithSerialization(){}

    private static class SingletonHelperClass{
        private static final SingletonWithSerialization instance = new SingletonWithSerialization();
    }
    public static SingletonWithSerialization getInstance(){
        return SingletonHelperClass.instance;
    }

    //used in object
    protected Object readResolve(){
        return getInstance();
    }
}
