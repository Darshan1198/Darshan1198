package Javabasics;

public class client {

    public static void main(String[] args) {
//        A obj  = new  A(); //  compile time  error we cannot  make  an  object  of  abstract class   A can  be  the  refrence  but   cant be  the instance;
//        obj.fun();

        A obj = new B();  // this  is  fine
        obj.fun();  // this  will work


    }
}
