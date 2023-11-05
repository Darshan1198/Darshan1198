package Revision.Protptypeandregistry;

public class Student implements  StudentProto<Student>{




    private  String name;
    private  int  age;
    private String  schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }


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

    public Student(){

    }

    public Student( Student orig){
        this.age = orig.age;
        this.name = orig.name;
        this.schoolName = orig.schoolName;
    }




    @Override
    public Student clone() {
        return new Student(this);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
