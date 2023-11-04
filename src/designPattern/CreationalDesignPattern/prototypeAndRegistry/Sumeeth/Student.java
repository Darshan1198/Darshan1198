package designPattern.CreationalDesignPattern.prototypeAndRegistry.Sumeeth;

public class Student implements  Prototype<Student> {

    private  int age;

    private  String  name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  Student(){

    }
    public Student(Student orig ){
        this.age  = orig.age;
        this.name = orig.name;

    }

    @Override
    public Student clone() {
        return  new Student(this);
    }
}
