package com.mycompany.laba5.enemy_fabrics;

import com.mycompany.laba5.enemys.LiuKang;
import com.mycompany.laba5.player.Player;






public class LiuKangFabric implements EnemyFabricInterface {

    @Override
    public Player create(int i) {
        Player enemy;
        enemy = new LiuKang(1, 70, 20, 1);
        return enemy;
    }
}
