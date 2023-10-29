package Structural.Flyweight;

import java.awt.*;

public class PlayerFw {
    int  offencePower;
    int initialHealth;

    Image avatar;

    PlayerFw( int offencePower, int  initialHealth, Image avatar){
         this.offencePower = offencePower;
         this.initialHealth = initialHealth;
         this.avatar = avatar;
    }


}
