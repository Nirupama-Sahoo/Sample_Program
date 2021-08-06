package sample;

public class SingletonEx {
    private SingletonEx singletonEx;
    private SingletonEx(){

    }
    public SingletonEx getSingletonEx(){
        if(singletonEx == null){
            synchronized (SingletonEx.class){
                if(singletonEx == null)
                    singletonEx = new SingletonEx();
            }

        }
        return singletonEx;
    }

}
