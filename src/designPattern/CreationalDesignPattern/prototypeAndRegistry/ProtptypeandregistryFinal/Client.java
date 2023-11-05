package designPattern.CreationalDesignPattern.prototypeAndRegistry.ProtptypeandregistryFinal;

public class Client {
    public static void main(String[] args) {


        Studentregistry studentregistry  = Studentregistry.instance;

        Student st1  = new Student();
//        st1.setAge(10);
//        st1.setName("dash");
        st1.setSchoolName("Balya vidhya");

        studentregistry.registerProtype("StudentProto",st1);

        Student Darsh  = st1.clone();
        Darsh.setName("Darsh");
        Darsh.setAge(25);
        studentregistry.registerProtype("Darshan",Darsh);

        Student yash  = st1.clone();
        yash.setName("yash");
        yash.setAge(24);
        studentregistry.registerProtype("yeshwanth",yash);






        MeritStudent meritStudentproto = new MeritStudent();
//        meritStudentproto.setAge(20);
//        meritStudentproto.setName("vinay");
        meritStudentproto.setScholarShip(100);
        meritStudentproto.setSchoolName("vidya peeta");
//
        studentregistry.registerProtype("meritProto",meritStudentproto);

        System.out.println("******************************");
        Student retrievedStudent = studentregistry.getPrototype("meritProto");

        if (retrievedStudent instanceof MeritStudent) {
            System.out.println("The retrieved object is a MeritStudent");
        } else {
            System.out.println("The retrieved object is not a MeritStudent");
        }
        System.out.println("******************************");

        MeritStudent Pratheek = meritStudentproto.clone();
        Pratheek.setName("Pratheek");
        Pratheek.setAge(22);
        studentregistry.registerProtype("Pratheek",Pratheek);

        MeritStudent Sohan = meritStudentproto.clone();
        Sohan.setName("Sohan");
        Sohan.setAge(23);
        studentregistry.registerProtype("Sohan",Sohan);



//
//




        System.out.println(studentregistry.getPrototype("StudentProto"));
        System.out.println(studentregistry.getPrototype("Darshan"));
        System.out.println(studentregistry.getPrototype("yeshwanth")+"\n");
        System.out.println(studentregistry.getPrototype("meritProto"));
        System.out.println(studentregistry.getPrototype("Pratheek"));
        System.out.println(studentregistry.getPrototype("Sohan"));



//        System.out.println(studentregistry.getPrototype("copyofmerit"));





    }

}
