package designPattern.CreationalDesignPattern.prototypeAndRegistry.Sumeeth;

public class Client {

    static  void  populateRegistry(){
        StudentRegistry  reg  = StudentRegistry.instance;
        Student  proto  = new Student();
        proto.setName("ABc");
        proto.setAge(101);
        reg.registerPrototype("Normalstudent", proto);
        MeritStudent  proto2  = new MeritStudent();
        proto2.setScholarship(100);
        reg.registerPrototype("meritstudent",proto2);


    }
    static  Student  getstudent(Student orig){
        return orig.clone();
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(10);
        s1.setName("Harsh");

        Student copy = getstudent(s1);
        System.out.println(copy.getName());
        System.out.println(copy.getAge());

        MeritStudent s2  = new MeritStudent();
        s2.setAge(20);
        s2.setName("dashi");
        s2.setScholarship(100);

        Student copy2  =  getstudent(s2);
        System.out.println(copy2.getAge());
        System.out.println(copy2.getName());
        populateRegistry();

        StudentRegistry obj  = StudentRegistry.instance;

        for(StudentRegistry )

    }
}
