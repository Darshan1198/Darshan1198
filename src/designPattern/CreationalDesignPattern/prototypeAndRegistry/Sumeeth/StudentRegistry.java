package designPattern.CreationalDesignPattern.prototypeAndRegistry.Sumeeth;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    public static final  StudentRegistry instance = new StudentRegistry();
    private final Map<String ,Student> datastore  = new HashMap<>();

    public  void  registerPrototype(String key, Student person){
        datastore.put(key,person);
    }
    public  Student  getAPrototype(String key){
        return  datastore.get(key);
    }

}
