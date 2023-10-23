package CreationalDesignPattern.Builder.exception;

public class Student {
    private   String  name;
    private   String phoneNumber;
    private   int  id;
    private  int  age;
    private  String  psp;


    public  Student(Builder builder){
        this.age = builder.age;
        this.name = builder.name;
        this.id  = builder.id;
        this.psp = builder.psp;
        this.phoneNumber = builder.phoneNumber;
    }


    public static Builder CreateNewBuild(){
        return  new Builder();
    }



    public static class Builder {
        private String name;
        private String phoneNumber;
        private int id;
        private int age;
        private String psp;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPsp(String psp) {
            this.psp = psp;
            return this;
        }


        public Student build() {
            validate();
            return new Student(this);
        }


        public void validate() {

            if (name == null) {
                throw new illegalageexception("name  cant be null");
            }
            if (age < 20 && age > 60) {
                throw new illegalageexception("age cant  be <20 and  >60");
            }


        }
    }


        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    ", id=" + id +
                    ", age=" + age +
                    ", psp='" + psp + '\'' +
                    '}';





    }
}
