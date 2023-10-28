package Structural.Decorator;

public class vannilaCone implements  Icecream{
    @Override
    public int getCost() {
        return 9;
    }

    @Override
    public String getDesc() {
        return "A vanilla  cone";
    }
}
