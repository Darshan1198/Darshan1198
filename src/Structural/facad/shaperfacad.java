package Structural.facad;

public class shaperfacad {

    private  static shape circle;
    private  static shape rectangle;
    private  static  shape square;


    public  shaperfacad (){

        circle = new circle();
        rectangle = new rectangle();
        square  = new square();


    }


    public  void  drawcircle(){
        circle.draw();
    }
    public  void  drawrectanle(){
        rectangle.draw();
    }
    public  void  drawsquare(){
        square.draw();
    }

}
