package com.mycompany.laba5.enemys;

import com.mycompany.laba5.player.Player;
import javax.swing.ImageIcon;


public class SonyaBlade extends Player{
    
    public SonyaBlade (int level, int health, int  damage, int attack){
        super (level, health, damage, attack);
        picture = new ImageIcon(this.getClass().getResource("/SonyaBlade.png"));
    }
    
    @Override
    public String getName(){
        return "Sonya Blade";
    }
}
