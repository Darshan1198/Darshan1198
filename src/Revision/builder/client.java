package Revision.builder;

public class client {
    public static void main(String[] args) {
        Student st = Student.CreateBuilder().setId(20).setName("Dash").setBatchName("Mar2020").setAge(21).setPno(23456).build();
        System.out.println(st);
    }
}
