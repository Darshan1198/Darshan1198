package Structural.Decorator;

public class client {

    public static void main(String[] args) {
        Icecream mc  = new MangoCone();

        Icecream mcwvs  = new VanillaScoopAddOn(mc);

        Icecream mcwvswch = new Cherriscoupaddon(mcwvs);

        System.out.println( mcwvswch.getCost());
        System.out.println(mcwvswch.getDesc());

    }
}
