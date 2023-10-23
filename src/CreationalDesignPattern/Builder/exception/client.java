package CreationalDesignPattern.Builder.exception;

public class client {

    public static void main(String[] args) {
        Student s  = Student.CreateNewBuild().setId(40).setAge(90).setName("Ash").setPsp("43").setPhoneNumber("783302020").build();
        System.out.println(s);
    }
}
