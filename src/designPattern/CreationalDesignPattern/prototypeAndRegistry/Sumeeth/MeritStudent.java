package designPattern.CreationalDesignPattern.prototypeAndRegistry.Sumeeth;

public class MeritStudent extends Student{

    private  int  Scholarship;

    public int getScholarship() {
        return Scholarship;
    }

    public void setScholarship(int scholarship) {
        this.Scholarship = scholarship;
    }
    public MeritStudent(){
    }
    public MeritStudent(MeritStudent original){
        super(original);
        this.Scholarship  = original.Scholarship;

    }
    public MeritStudent clone(){
        return  new MeritStudent(this);
    }

    @Override
    public String toString() {
        return "MeritStudent{" +
                "Scholarship=" + Scholarship +
                "name="+getName()+
                "age="+getAge()+'}';
    }
}
