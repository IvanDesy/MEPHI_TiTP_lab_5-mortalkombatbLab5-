package com.mycompany.laba5.enemy_fabrics;

import com.mycompany.laba5.enemys.SubZero;
import com.mycompany.laba5.player.Player;



public class SubZeroFabric implements EnemyFabricInterface {

    @Override
    public Player create(int i) {
        Player enemy;
        enemy = new SubZero(1, 60, 16, 1);
        return enemy;
    }

}
