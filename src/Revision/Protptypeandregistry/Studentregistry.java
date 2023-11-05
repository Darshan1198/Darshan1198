package Revision.Protptypeandregistry;

import java.util.HashMap;
import java.util.Map;

public class Studentregistry {

    public  static final  Studentregistry instance  = new Studentregistry();

    private final Map<String, Student> Datastore  = new HashMap<>();

    public  void  registerProtype(String key, Student prototype){
        Datastore.put(key,prototype);
    }

    public Student getPrototype(String key){
         return Datastore.get(key);
    }





}
