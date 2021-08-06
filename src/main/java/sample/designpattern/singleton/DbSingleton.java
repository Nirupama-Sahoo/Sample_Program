package sample.designpattern.singleton;

public class DbSingleton {
    private static volatile DbSingleton instance = null; //Lazy Loading

    private DbSingleton(){
        if(instance !=null){
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public  static DbSingleton getInstance(){
        if(instance == null){
            synchronized (DbSingleton.class){
                if(instance == null){
                    instance = getInstance();
                }
            }

        }
        return instance;
    }
}
