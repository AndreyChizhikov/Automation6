package patterns.singelton;

public class SingletonThreadSafe {
    private static SingletonThreadSafe instance;

    private  String value;

    public String getValue()
    {
        return value;
    }

    private SingletonThreadSafe (String value)
    {
        this.value =value;
    }

    public static SingletonThreadSafe getInstance(String value)
    {
        SingletonThreadSafe result = instance;
        if(result!=null)
        {
            return result;
        }

        synchronized (SingletonThreadSafe.class) {
            if (instance == null) {
                instance = new SingletonThreadSafe(value);
            }
            return instance;
        }
    }
}
