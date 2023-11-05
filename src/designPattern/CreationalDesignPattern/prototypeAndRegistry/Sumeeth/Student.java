package designPattern.CreationalDesignPattern.prototypeAndRegistry.Sumeeth;

public class Student implements  Prototype<Student> {

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    private  int age;
    private  String   schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

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
        this.schoolName  = orig.schoolName;

    }

    @Override
    public Student clone() {
        return  new Student(this);
    }
}
