package designPattern.Structural.facad;

public class client {


    public static void main(String[] args) {
        shaperfacad s  = new shaperfacad();

        s.drawcircle();
        s.drawrectanle();
        s.drawsquare();
    }
}
