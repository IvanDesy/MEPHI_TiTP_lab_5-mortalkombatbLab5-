
package com.mycompany.laba5.fight;

import com.mycompany.laba5.player.Human;
import com.mycompany.laba5.player.Items;
import com.mycompany.laba5.player.Player;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;


public class ChangeTexts {



    public void NewRoundTexts(Player human, Player enemy, JProgressBar pr1,
            JProgressBar pr2, JLabel label, JLabel label2, JLabel label3,
            JLabel label4, JLabel label5, JLabel label6, JLabel label7, JLabel label8, JLabel label9,
            int i, Items[] items, JRadioButton rb1, JRadioButton rb2, JRadioButton rb3) {
        label.setText(Integer.toString(((Human) human).getPoints()));
        label2.setText(Integer.toString(((Human) human).getExperience()) + "/" + ((Human) human).getNextExperience());
        label3.setText(Integer.toString(human.getLevel()) + " level");
        label4.setText(Integer.toString(enemy.getLevel()) + " level");
        label5.setText(Integer.toString(human.getMaxHealth()) + "/" + Integer.toString(human.getMaxHealth()));
        label6.setText(Integer.toString(enemy.getMaxHealth()) + "/" + Integer.toString(enemy.getMaxHealth()));
        label7.setText(Double.toString(human.getDamage()));
        if (i % 2 == 1) {
            label8.setText("Your turn");
        }
        else{
            label8.setText(enemy.getName()+"'s turn");
        }
        BagText(items, rb1, rb2, rb3);
        label9.setText("");
    }

    public void RoundTexts(Player human, Player enemy, JLabel label, JLabel label2, int i, JLabel label3) {
        if (enemy.getHealth() >= 0) {
            label.setText(Integer.toString(enemy.getHealth()) + "/" + Integer.toString(enemy.getMaxHealth()));
        } else {
            label.setText("0/" + Integer.toString(enemy.getMaxHealth()));
        }
        if (human.getHealth() >= 0) {
            label2.setText(Integer.toString(human.getHealth()) + "/" + Integer.toString(human.getMaxHealth()));
        } else {
            label2.setText("0/" + Integer.toString(human.getMaxHealth()));
        }
        if (i % 2 == 1) {
            label3.setText("Your turn");
        }
        else{
            label3.setText(enemy.getName()+"'s turn");
        }
    }
    
    public void EndGameText(Human human, JLabel label){
        if(human.getWin()==12){
            label.setText("Победа на вашей стороне");
        }
        else {
            label.setText("Победа не на вашей стороне");
        }
    }
    
    public void BagText( Items[] items, JRadioButton rb1, JRadioButton rb2, JRadioButton rb3){
        rb1.setText(items[0].getName()+", "+items[0].getCount()+" шт");
        rb2.setText(items[1].getName()+", "+items[1].getCount()+" шт");
        rb3.setText(items[2].getName()+", "+items[2].getCount()+" шт");
    }

}
