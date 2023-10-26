package Javabasics;

public abstract class A {
    abstract  void  work();

    void  fun (){
        System.out.println("Pre work");
        work();
        System.out.println("post work");
    }

}


