package Revision.Protptypeandregistry;

public class MeritStudent extends Student{



    private int  ScholarShip ;
    public int getScholarShip() {
        return ScholarShip;
    }

    public void setScholarShip(int scholarShip) {
        ScholarShip = scholarShip;
    }

    public  MeritStudent(){

    }

    public  MeritStudent(MeritStudent ms){
        super(ms);
        this .ScholarShip = ms.ScholarShip;
    }


    public  MeritStudent clone(){
        return  new MeritStudent(this);
    }

    @Override
    public String toString() {
        return "MeritStudent{" +
                "Age=" + getAge() +
                "Name=" + getName() + ","+
                "SchoolName=" + getSchoolName() + ","+
                "ScholarShip=" + ScholarShip +
                '}';
    }
}
