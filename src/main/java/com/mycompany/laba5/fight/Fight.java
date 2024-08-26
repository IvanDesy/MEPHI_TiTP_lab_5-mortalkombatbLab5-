/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laba5.fight;


import com.mycompany.laba5.Result;
import com.mycompany.laba5.enemys.*;
import com.mycompany.laba5.enemy_fabrics.EnemyFabric;
import com.mycompany.laba5.player.Human;
import com.mycompany.laba5.player.Items;
import com.mycompany.laba5.player.Player;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;

/**
 *
 * @author Мария
 */
public class Fight {

    private Player human;
    private Player enemy;
    private ChangeTexts change = new ChangeTexts();
    private int kind_attack[] = {0};
    private int experiences[] = {40, 90, 180, 260, 410};
    private EnemyFabric fabric = new EnemyFabric();
    public int i = 1;
    private int k = -1;
    private int stun = 0;
    private double v = 0.0;
    
    private int locationsCount;
    private int currentLocationsCount = 0;
    private int levelCount;
    private int currentLevelCount;

    public void Move(Player p1, Player p2, JLabel l, JLabel l2) {
        if (stun == 1) {
            p1.setAttack(-1);
        }
        System.out.println(p1.getAttack() + " || " + p2.getAttack());
        switch (Integer.toString(p1.getAttack()) + Integer.toString(p2.getAttack())) {
            case "10":
                v = Math.random();
                if (p1 instanceof ShaoKahn & v < 0.15) {
                    p2.setHealth(-(int) (p1.getDamage() * 0.5));
                    l2.setText("Your block is broken");

                } else {
                    p1.setHealth(-(int) (p2.getDamage() * 0.5));
                    l2.setText(p2.getName() + " counterattacked");
                }
                break;
            case "11":
                p2.setHealth(-p1.getDamage());
                l2.setText(p1.getName() + " attacked");
                break;
            case "00":
                v = Math.random();
                if (v <= 0.5) {
                    stun = 1;
                }
                l2.setText("Both defended themselves");
                break;
            case "01":
                l2.setText(p1.getName() + " didn't attacked");
                break;
            case "-10":
                l.setText(p1.getName() + " was stunned");
                stun = 0;
                l2.setText(p2.getName() + " didn't attacked");
                break;
            case "-11":
                p1.setHealth(-p2.getDamage());
                l.setText(p1.getName() + " was stunned");
                stun = 0;
                l2.setText(p2.getName() + " attacked");
                break;
            case "20":
            case  "2-1":
                    if (Math.random() < 0.75){
                            p2.setWeakness(p2.getLevel());
                            l.setText(p1.getName() + "used Weakness");
                            l2.setText(p2.getName() + " are weakened");}
                    break;
            case "02" :
            case "-12":
                 if (Math.random() < 0.75){
                        p1.setWeakness(p1.getLevel());
                        l2.setText(p2.getName() + "used Weakness");
                        l.setText(p1.getName() + " are weakened"); }
                 break;
            case "12":
                       p2.setHealth(-p1.getDamage() * 1.15);
                        l.setText(p1.getName() + " attacked");
                        l2.setText("Failed to weak oppponent");
                    break;
            case "21":
                     p1.setHealth(-p2.getDamage() * 1.15);
                        l.setText(p1.getName() + " attacked");
                        l.setText("Failed to weak oppponent");
                     break;
            case  "30" :
            case  "3-1":
              p1.setHealth((p1.getMaxHealth()-p1.getHealth())*0.5);
                l.setText( p1.getName() + " regenerated");
                break;
           case  "03" :
           case  "-13":     
                p2.setHealth((p2.getMaxHealth()-p2.getHealth())* 0.5);
                l2.setText( p2.getName() + " regenerated");
                break;
           case "13":
               p2.setHealth(-p1.getDamage() * 2);
                l.setText(p1.getName() + " attacked");
                l2.setText("Failed to regenerate");
                break;
           case "31":
                p1.setHealth(-p2.getDamage() * 2);
                l2.setText(p2.getName() + " attacked");
                l.setText("Failed to regenerate");
                break;
           case "23":
               p2.setWeakness(p1.getLevel());
              p2.setHealth((p2.getMaxHealth()-p2.getHealth())* 0.5);
               l.setText(p1.getName() + " used Weakness");
               l2.setText(p2.getName() + " regenerated");
               break;
           case  "32":
               p1.setWeakness(p2.getLevel());
               p1.setHealth((p1.getMaxHealth()-p1.getHealth())*0.5);
               l2.setText(p2.getName() + " used Weakness");
               l.setText(p1.getName() + "regenerated");
               break;
        }
        
    }

    public void Hit(Player human, Player enemy, int a, JLabel label,
            JLabel label2, JDialog dialog, JLabel label3, CharacterAction action,
            JProgressBar pr1, JProgressBar pr2, JDialog dialog1,
            JDialog dialog2, JFrame frame, ArrayList<Result> results,
            JLabel label4, JLabel label5, JLabel label6, JLabel label7,
            JLabel label8, Items[] items, JRadioButton rb,  JComboBox optionBox, JLabel newLevelLabel ) {
        label7.setText("");
        human.setAttack(a);

        if (k < kind_attack.length - 1) {
            k++;
        } else {
            kind_attack = action.ChooseBehavior(enemy, action);
            k = 0;
        }
        
        if (enemy.isWizard() && Math.random() < 0.15){
            enemy.setAttack(2); // 2 - ОСЛАБЛЕНИЕ
        }
        else if (enemy.getName().equals("Shao Kahn") && Math.random() < 0.2) {
            enemy.setAttack(3); // 3 - РЕГЕНЕРАЦИЯ
        }
        else{
            enemy.setAttack(kind_attack[k]);
        }
        human.removeWeakness();
        enemy.removeWeakness();
        if (i % 2 == 1) {
            Move(human, enemy, label7, label8);
        } else {
            Move(enemy, human, label7, label8);
        }
        i++;
        change.RoundTexts(human, enemy, label, label2, i, label6);
        action.HP(human, pr1);
        action.HP(enemy, pr2);
        if (human.getHealth() <= 0 & items[2].getCount() > 0) {
            human.setNewHealth((int) (human.getMaxHealth() * 0.05));
            items[2].setCount(-1);
            action.HP(human, pr1);
            label2.setText(human.getHealth() + "/" + human.getMaxHealth());
            rb.setText(items[2].getName() + ", " + items[2].getCount() + " шт");
            label7.setText("Вы воскресли");
        }
       
        
        if (human.getHealth() <= 0 | enemy.getHealth() <= 0) {
            if (levelCount == 0 || human.getHealth()<=0) {
                EndFinalRound(((Human) human), action, results, dialog1, dialog2,
                        frame, label4, label5, items);
                
            } else {
                EndRound(human, enemy, dialog, label3, action, items,  optionBox, newLevelLabel );
            }
        }
    }

    public void EndRound(Player human, Player enemy, JDialog dialog, JLabel label,
            CharacterAction action, Items[] items, JComboBox optionBox, JLabel newLevelLabel ) {

        dialog.setVisible(true);
        dialog.setBounds(300, 150, 700, 600);
        if (human.getHealth() > 0) {
            
            label.setText("You win");
            ((Human) human).setWin();

            if (enemy instanceof ShaoKahn) {
                action.AddItems(38, 23, 8, items);
                action.AddPointsBoss(((Human) human), action.getEnemyes());
                
            } else {
                action.AddItems(25, 15, 5, items);
                Boolean isLevelUp = action.AddPoints(((Human) human), action.getEnemyes());
                if (isLevelUp) {
                    optionBox.setSelectedIndex(0);
                    optionBox.setVisible(true);
                    newLevelLabel.setVisible(true);
                    
                }
                
            }
        } else {
            label.setText(enemy.getName() + " win");
        }

        i = 1;
        k = -1;
        kind_attack = ResetAttack();
        

    }

    public void EndFinalRound(Human human, CharacterAction action,
            ArrayList<Result> results, JDialog dialog1, JDialog dialog2, JFrame frame,
            JLabel label1, JLabel label2, Items[] items) {
        String text = "Победа не на вашей стороне";
         
        if (human.getHealth() > 0) {
            human.setWin();
            action.AddPoints(human, action.getEnemyes());
            text = "Победа на вашей стороне";
        }
         boolean top = false;
        if (results == null) {
            top = true;
        } else {
            int i = 0;
            for (int j = 0; j < results.size(); j++) {
                if (human.getPoints() < results.get(j).getPoints()) {
                    i++;
                }
            }
            if (i < 10) {
                top = true;
            }
        }
        
      
            if (top) {
            dialog1.setVisible(true);
            dialog1.setBounds(150, 150, 600, 500);
            label1.setText(text);
        } else {
            dialog2.setVisible(true);
            dialog2.setBounds(150, 150, 470, 360);
            label2.setText(text);
        }
        frame.dispose();
        }
        
            
        
        
       
        
    

    public int[] ResetAttack() {
        int a[] = {0};
        return a;
    }

    public Player NewRound(Player human, JLabel label, JProgressBar pr1,
            JProgressBar pr2, JLabel label2, JLabel text, JLabel label3, CharacterAction action) {
        this.human = human;
        
        Player enemy1 = null;
        if (levelCount == 1) {
            enemy = action.ChooseBoss(label, label2, text, label3, human.getLevel(), human);
        } else if (levelCount > 1) {
            
            enemy = action.ChooseEnemy(label, label2, text, label3);
            
        }
        levelCount--;
        pr1.setMaximum(human.getMaxHealth());
        pr2.setMaximum(enemy.getMaxHealth());
        human.setNewHealth(human.getMaxHealth());
        enemy.setNewHealth(enemy.getMaxHealth());
        action.HP(human, pr1);
        action.HP(enemy, pr2);
        
        if(levelCount == 0) prepareLocationAndRounds();
        
        
        
        
        return enemy;
    }
    
    

    public void prepareLocationAndRounds() {
        if (currentLocationsCount < locationsCount) {
            
            currentLocationsCount++;
            levelCount = (int) (Math.random()*3) + human.getLevel() + 1;
           
             
        }

    }

    public int getCurrentLocationsCount() {
        return currentLocationsCount;
    }
    public void resetCurrentLocationsCount(){
        this.currentLocationsCount = 0;
    }
    
    
    public void setLocationsCount(int locationsCount) {
        this.locationsCount = locationsCount;
    }
    
    public void setHuman(Human human) {
        this.human = human;
    }
    
    public void setEnemy(Player enemy) {
        this.enemy = enemy;
    }
}
