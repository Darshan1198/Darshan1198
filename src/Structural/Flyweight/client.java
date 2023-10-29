package Structural.Flyweight;

import java.util.HashMap;

public class client {
    public static void main(String[] args) {

        // StartUp code

        HashMap<String, PlayerFw> registry = new HashMap<>();

        registry.put("DumbEnemyFW",new PlayerFw(10,10,null));
        registry.put("TankerFW",new PlayerFw(10,10,null));
        registry.put("BomberFW",new PlayerFw(10,10,null));
        registry.put("MachineFW",new PlayerFw(10,10,null));


        Player[] player  = new Player[1000];
        for (int i = 0; i < 9000; i++) {
            player[i]  = new  Player();
            player[i].fw = registry.get("DumbEnemyFW");


            
        }



    }
}
