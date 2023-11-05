package Revision.builder;

import Javabasics.B;
import Revision.builder.Exceptions.IllegalBatchNameexception;
import Revision.builder.Exceptions.IllegalNameexcepion;

public class Student {

    private int age;
    private String name;
    private String  BatchName;



    private int  pno;
    private int id;


    public  Student( Builder  builder){
        this.age  = builder.age;
        this.name = builder.name;
        this.pno   = builder.pno;
        this.BatchName =builder.BatchName;
        this.id  = builder.id;




    }

    public  static  Builder CreateBuilder(){
        return  new Builder();
    }

    public static class Builder{

        private int age;
        private String name;
        private String  BatchName;
        private int  pno;
        private int id;
        public  Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return  this;
        }

        public Builder setBatchName(String batchName) {
            this.BatchName = batchName;
            return  this;
        }

        public Builder setPno(int pno) {
            this.pno = pno;
            return this;
        }

        public Builder setId(int id) {
            this.id = id;
            return  this;

        }

        public  Student build(){
            validate();
            return  new Student(this);
        }

        public void validate(){
            if(name == null){
                throw  new IllegalNameexcepion("Name cant be null");


            }
            if(age <20 && age >60){
                throw  new IllegalArgumentException("Age  should be  between 20 and  60");
            }
            if (BatchName.length()>10){
                throw  new IllegalBatchNameexception("Invalid  batch name format");
            }
        }

    }
    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", BatchName='" + BatchName + '\'' +
                ", pno=" + pno +
                ", id=" + id +
                '}';
    }

}
