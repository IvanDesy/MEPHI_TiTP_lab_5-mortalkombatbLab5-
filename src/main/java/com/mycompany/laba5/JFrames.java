package com.mycompany.laba5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import com.mycompany.laba5.player.Human;
import com.mycompany.laba5.player.Items;
import com.mycompany.laba5.player.Player;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Мария
 */
public class JFrames extends javax.swing.JFrame {
    
    Game game = new Game();
    Human human = null;
    Player enemy = null;
    Items[] items = new Items[3];
    String nameButton = "";

    
    /**
     * Creates new form JFrame
     */
    public JFrames() {
        initComponents();
        prepareDialogs();
       try {
            game.ReadFromExcel();
        } catch (IOException ex) {
            
        }
           jFrame1.setSize(930, 740);
           this.setLocationRelativeTo(null);
           jFrame1.setLocationRelativeTo(null);
     
       
        
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        buttonGroup1.add(jRadioButton3);
        
        items[0]=new Items("Малое зелье лечение",0);
        items[1]=new Items("Большое зелье лечение",0);
        items[2]=new Items("Крест возрождения",0);

    }
    

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        playerPicture = new javax.swing.JLabel();
        weakBtn = new javax.swing.JButton();
        attackBtn = new javax.swing.JButton();
        defendBtn = new javax.swing.JButton();
        playerHPProgressBar = new javax.swing.JProgressBar();
        enemyPicture = new javax.swing.JLabel();
        enemyHPProgressBar = new javax.swing.JProgressBar();
        enemyName = new javax.swing.JLabel();
        enemyDamageLabel = new javax.swing.JLabel();
        damageLabel = new javax.swing.JLabel();
        damageCountLabel = new javax.swing.JLabel();
        enemyDamageCount = new javax.swing.JLabel();
        playerLevel = new javax.swing.JLabel();
        fightLabel = new javax.swing.JLabel();
        hpPoints = new javax.swing.JLabel();
        enemyHPPoints = new javax.swing.JLabel();
        experienceLabel = new javax.swing.JLabel();
        pointsLabel = new javax.swing.JLabel();
        expCountLabel = new javax.swing.JLabel();
        pointCountLabe = new javax.swing.JLabel();
        enemyLevel = new javax.swing.JLabel();
        effectLabel = new javax.swing.JLabel();
        informationLabel = new javax.swing.JLabel();
        playerName = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        itemsBtn = new javax.swing.JButton();
        locationLable = new javax.swing.JLabel();
        jDialog1 = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        chooseOptionBox = new javax.swing.JComboBox<>();
        newLevelLabel = new javax.swing.JLabel();
        jDialog2 = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jDialog3 = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jDialog4 = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jDialog5 = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton9 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jDialog6 = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        inputLocationsDialog = new javax.swing.JDialog();
        inputLocNumber = new javax.swing.JTextField();
        locationsDialogTitle = new javax.swing.JLabel();
        confirmCountButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        playerPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Player.jpg"))); // NOI18N
        playerPicture.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(playerPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 259, 245, 250));

        weakBtn.setBackground(new java.awt.Color(0, 204, 255));
        weakBtn.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        weakBtn.setForeground(new java.awt.Color(0, 0, 0));
        weakBtn.setText("Ослабить");
        weakBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weakBtnActionPerformed(evt);
            }
        });
        jPanel2.add(weakBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 600, 110, 44));

        attackBtn.setBackground(new java.awt.Color(255, 0, 0));
        attackBtn.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        attackBtn.setForeground(new java.awt.Color(0, 0, 0));
        attackBtn.setText("Атаковать");
        attackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attackBtnActionPerformed(evt);
            }
        });
        jPanel2.add(attackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 600, 110, 44));

        defendBtn.setBackground(new java.awt.Color(255, 204, 0));
        defendBtn.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        defendBtn.setForeground(new java.awt.Color(0, 0, 0));
        defendBtn.setText("Защититься");
        defendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defendBtnActionPerformed(evt);
            }
        });
        jPanel2.add(defendBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 600, 109, 44));

        playerHPProgressBar.setBackground(new java.awt.Color(204, 204, 204));
        playerHPProgressBar.setForeground(new java.awt.Color(51, 255, 51));
        playerHPProgressBar.setMaximum(80);
        playerHPProgressBar.setMinimum(-1);
        jPanel2.add(playerHPProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 133, 177, 32));

        enemyPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enemyPicture.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(enemyPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 219, 189, 275));

        enemyHPProgressBar.setBackground(new java.awt.Color(204, 204, 204));
        enemyHPProgressBar.setForeground(new java.awt.Color(0, 255, 0));
        enemyHPProgressBar.setMinimum(-1);
        jPanel2.add(enemyHPProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 133, 162, 32));

        enemyName.setBackground(new java.awt.Color(0, 0, 0));
        enemyName.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jPanel2.add(enemyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 162, 29));

        enemyDamageLabel.setBackground(new java.awt.Color(255, 255, 255));
        enemyDamageLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        enemyDamageLabel.setForeground(new java.awt.Color(0, 0, 0));
        enemyDamageLabel.setText("Damage");
        jPanel2.add(enemyDamageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 171, 62, -1));

        damageLabel.setBackground(new java.awt.Color(255, 255, 255));
        damageLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        damageLabel.setForeground(new java.awt.Color(0, 0, 0));
        damageLabel.setText("Damage");
        jPanel2.add(damageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 171, 62, -1));

        damageCountLabel.setBackground(new java.awt.Color(255, 255, 255));
        damageCountLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        damageCountLabel.setForeground(new java.awt.Color(255, 0, 0));
        damageCountLabel.setText("16");
        jPanel2.add(damageCountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 171, 40, -1));

        enemyDamageCount.setBackground(new java.awt.Color(255, 255, 255));
        enemyDamageCount.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        enemyDamageCount.setForeground(new java.awt.Color(255, 0, 0));
        enemyDamageCount.setText("16");
        jPanel2.add(enemyDamageCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 171, 40, -1));

        playerLevel.setBackground(new java.awt.Color(255, 255, 255));
        playerLevel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        playerLevel.setForeground(new java.awt.Color(0, 0, 0));
        playerLevel.setText("0 уровень");
        jPanel2.add(playerLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(842, 235, -1, -1));

        fightLabel.setBackground(new java.awt.Color(255, 255, 255));
        fightLabel.setFont(new java.awt.Font("Comic Sans MS", 3, 36)); // NOI18N
        fightLabel.setForeground(new java.awt.Color(0, 0, 153));
        fightLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fightLabel.setText("FIGHT");
        fightLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(fightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 6, 205, 64));

        hpPoints.setBackground(new java.awt.Color(255, 255, 255));
        hpPoints.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        hpPoints.setForeground(new java.awt.Color(102, 102, 102));
        hpPoints.setText("80/80");
        jPanel2.add(hpPoints, new org.netbeans.lib.awtextra.AbsoluteConstraints(835, 141, -1, -1));

        enemyHPPoints.setBackground(new java.awt.Color(255, 255, 255));
        enemyHPPoints.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        enemyHPPoints.setForeground(new java.awt.Color(102, 102, 102));
        enemyHPPoints.setText("80/80");
        jPanel2.add(enemyHPPoints, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 144, -1, -1));

        experienceLabel.setBackground(new java.awt.Color(255, 255, 255));
        experienceLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        experienceLabel.setForeground(new java.awt.Color(128, 92, 31));
        experienceLabel.setText("experience");
        jPanel2.add(experienceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 110, -1, -1));

        pointsLabel.setBackground(new java.awt.Color(255, 255, 255));
        pointsLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        pointsLabel.setForeground(new java.awt.Color(128, 92, 31));
        pointsLabel.setText("points");
        jPanel2.add(pointsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 110, -1, -1));

        expCountLabel.setBackground(new java.awt.Color(255, 255, 255));
        expCountLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        expCountLabel.setForeground(new java.awt.Color(113, 90, 16));
        expCountLabel.setText("0/40");
        jPanel2.add(expCountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 144, -1, -1));

        pointCountLabe.setBackground(new java.awt.Color(255, 255, 255));
        pointCountLabe.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        pointCountLabe.setForeground(new java.awt.Color(113, 90, 16));
        pointCountLabe.setText("00");
        jPanel2.add(pointCountLabe, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 144, -1, -1));

        enemyLevel.setBackground(new java.awt.Color(255, 255, 255));
        enemyLevel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        enemyLevel.setForeground(new java.awt.Color(0, 0, 0));
        enemyLevel.setText("1 уровень");
        jPanel2.add(enemyLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 229, -1, -1));

        effectLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        effectLabel.setForeground(new java.awt.Color(0, 0, 0));
        effectLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(effectLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 535, 164, 43));

        informationLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        informationLabel.setForeground(new java.awt.Color(204, 0, 0));
        informationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(informationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 259, 237, 35));

        playerName.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        playerName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerName.setText("Игрок");
        jPanel2.add(playerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 540, 118, 24));

        jLabel29.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 227, 38));

        itemsBtn.setBackground(new java.awt.Color(174, 183, 106));
        itemsBtn.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        itemsBtn.setForeground(new java.awt.Color(0, 0, 0));
        itemsBtn.setText("Предметы");
        itemsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemsBtnActionPerformed(evt);
            }
        });
        jPanel2.add(itemsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 600, 110, 44));

        locationLable.setText("jLabel2");
        jPanel2.add(locationLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, 20));

        jFrame1.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 740));

        jDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(179, 226, 217));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setBackground(new java.awt.Color(204, 204, 204));
        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 1, 42)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("jLabel18");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 89, 467, 143));

        jButton5.setBackground(new java.awt.Color(114, 218, 142));
        jButton5.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("Дальше");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 341, 369, 139));

        chooseOptionBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chooseOptionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Выбрать усиление", "Увеличить урон", "Увеличить общее количество здоровья" }));
        jPanel3.add(chooseOptionBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 274, -1, 41));

        newLevelLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        newLevelLabel.setForeground(new java.awt.Color(0, 0, 0));
        newLevelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newLevelLabel.setText("У ВАС НОВЫЙ УРОВЕНЬ!!!");
        jPanel3.add(newLevelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 240, 369, 28));

        jDialog1.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 677, 551));

        jPanel4.setBackground(new java.awt.Color(255, 204, 255));

        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Победа на вашей стороне");

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("Введите имя своего персонажа для добавления");

        jLabel22.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("результата в таблицу рекордов");

        jButton6.setBackground(new java.awt.Color(153, 153, 255));
        jButton6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(51, 51, 51));
        jButton6.setText("Закончить игру");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(14, 14, 14))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel22))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        jLabel23.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Таблица рекордов");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Имя", "Количество баллов"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton7.setBackground(new java.awt.Color(255, 255, 153));
        jButton7.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(51, 51, 51));
        jButton7.setText("Закрыть");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(160, 160, 160)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 204, 255));

        jLabel24.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Победа на вашей стороне");

        jLabel25.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("К сожалению, Ваш результат не попал в топ 10");

        jButton8.setBackground(new java.awt.Color(153, 153, 255));
        jButton8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(51, 51, 51));
        jButton8.setText("Закончить игру");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog4Layout = new javax.swing.GroupLayout(jDialog4.getContentPane());
        jDialog4.getContentPane().setLayout(jDialog4Layout);
        jDialog4Layout.setHorizontalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog4Layout.setVerticalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(190, 182, 135));

        jLabel30.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 51, 51));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Мешок предметов");

        jRadioButton1.setBackground(new java.awt.Color(190, 182, 135));
        jRadioButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton1.setText("Малое зелье лечение, 0 шт");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(190, 182, 135));
        jRadioButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton2.setText("Большое зелье лечение, 0 шт");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setBackground(new java.awt.Color(190, 182, 135));
        jRadioButton3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton3.setText("Крест возрождения, 0 шт");

        jButton9.setBackground(new java.awt.Color(239, 237, 14));
        jButton9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 0, 0));
        jButton9.setText("Использовать");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jButton9)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addGap(50, 50, 50)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog5Layout = new javax.swing.GroupLayout(jDialog5.getContentPane());
        jDialog5.getContentPane().setLayout(jDialog5Layout);
        jDialog5Layout.setHorizontalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog5Layout.setVerticalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(243, 120, 120));

        jLabel31.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 51, 51));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Вы не можете использовать ");

        jLabel32.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 51, 51));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("этот предмет");

        jButton11.setBackground(new java.awt.Color(204, 204, 204));
        jButton11.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(51, 51, 51));
        jButton11.setText("ОК");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135))))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout jDialog6Layout = new javax.swing.GroupLayout(jDialog6.getContentPane());
        jDialog6.getContentPane().setLayout(jDialog6Layout);
        jDialog6Layout.setHorizontalGroup(
            jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog6Layout.setVerticalGroup(
            jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        inputLocationsDialog.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputLocNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputLocNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputLocNumberActionPerformed(evt);
            }
        });
        inputLocationsDialog.getContentPane().add(inputLocNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 170, 20));

        locationsDialogTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        locationsDialogTitle.setText("Ввведите количество локаций");
        inputLocationsDialog.getContentPane().add(locationsDialogTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 40));

        confirmCountButton.setText("Подтвердить");
        confirmCountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmCountButtonActionPerformed(evt);
            }
        });
        inputLocationsDialog.getContentPane().add(confirmCountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mortal Kombat");

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton1.setText("Начать новую игру");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton2.setText("Посмотреть таблицу \nрезультатов");
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prepareDialogs() {
        inputLocationsDialog.setSize(418, 148);
        inputLocationsDialog.setLocationRelativeTo(null);
        inputLocationsDialog.setTitle("Введите количество локаций");
        chooseOptionBox.setVisible(false);
        newLevelLabel.setVisible(false);
        
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        inputLocationsDialog.setVisible(true);
        attackBtn.setEnabled(true);
         defendBtn.setEnabled(true);
         itemsBtn.setEnabled(true);
         weakBtn.setEnabled(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void attackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attackBtnActionPerformed
        game.fight.Hit( human, enemy, 1,enemyHPPoints, hpPoints, jDialog1, 
                jLabel18, game.action, playerHPProgressBar, enemyHPProgressBar, jDialog2, 
                jDialog4, jFrame1, game.getResults(), jLabel20, jLabel24, 
                effectLabel, jLabel29, informationLabel, items, jRadioButton3, chooseOptionBox, newLevelLabel);
        
        checkAndDisableButtons() ;
        
    }//GEN-LAST:event_attackBtnActionPerformed

    private void defendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defendBtnActionPerformed
        game.fight.Hit( human, enemy, 0,enemyHPPoints, hpPoints, jDialog1, 
                jLabel18, game.action, playerHPProgressBar, enemyHPProgressBar, jDialog2, 
                jDialog4, jFrame1, game.getResults(), jLabel20, jLabel24, 
                effectLabel, jLabel29, informationLabel, items, jRadioButton3,chooseOptionBox, newLevelLabel);
        
        checkAndDisableButtons() ;
    }//GEN-LAST:event_defendBtnActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            switch(chooseOptionBox.getSelectedItem().toString()) {
                case "Увеличить урон":
                    human.setDamage(10 + human.getLevel());
                    break;
                case "Увиличить общее количество здоровья":
                    human.setMaxHealth(human.getLevel() * 10);
                    break;
                case "Выбрать усиление":
                    if (chooseOptionBox.isVisible())
                        throw new IllegalArgumentException();
                    
            }
                chooseOptionBox.setVisible(false);
                newLevelLabel.setVisible(false);
                chooseOptionBox.setSelectedIndex(0);    
                enemy = game.fight.NewRound(human, enemyPicture, playerHPProgressBar, enemyHPProgressBar, 
                enemyName, enemyDamageCount,enemyHPPoints, game.action);

        
                game.change.NewRoundTexts(human, enemy, playerHPProgressBar, enemyHPProgressBar, 
                pointCountLabe, expCountLabel, playerLevel, enemyLevel, hpPoints,enemyHPPoints, damageCountLabel,
                effectLabel, informationLabel, game.fight.i, items, jRadioButton1, jRadioButton2, jRadioButton3);
        
                checkAndDisableButtons() ;
                locationLable.setText("Локация №"+game.getFight().getCurrentLocationsCount());

                jDialog1.dispose();

            
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(jDialog1, "Необходимо выбрать усиление.", "Ошибка",  JOptionPane.ERROR_MESSAGE);
        }    
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void checkAndDisableButtons() {
        if (playerHPProgressBar.getValue() == 0 || enemyHPProgressBar.getValue() == 0) {
            attackBtn.setEnabled(false);
            defendBtn.setEnabled(false);
            itemsBtn.setEnabled(false);
            weakBtn.setEnabled(false);
        } else {
            attackBtn.setEnabled(true);
            defendBtn.setEnabled(true);
            itemsBtn.setEnabled(true);
            weakBtn.setEnabled(true);
        }
    }
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            game.EndGameTop(human, jTextField1, jTable1);
        } catch (IOException ex) {
            Logger.getLogger(JFrames.class.getName()).log(Level.SEVERE, null, ex);
        }
        jDialog2.dispose();
        jTextField1.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jDialog3.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        game.WriteToTable(jTable1);
        jDialog3.setVisible(true);
        jDialog3.setBounds(100, 100, 580, 450);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jDialog4.dispose();
        jDialog5.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(jRadioButton1.isSelected()){
            nameButton="jRadioButton1";
        }
        if(jRadioButton2.isSelected()){
            nameButton="jRadioButton2";
        }
        if(jRadioButton3.isSelected()){
            nameButton="jRadioButton3";
        }
        game.action.UseItem(human, items, nameButton, jDialog6, jDialog5);
        game.action.HP(human, playerHPProgressBar);
        hpPoints.setText(human.getHealth() + "/" + human.getMaxHealth());
        game.change.BagText(items, jRadioButton1, jRadioButton2, jRadioButton3);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void itemsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemsBtnActionPerformed
        jDialog5.setVisible(true);
        jDialog5.setBounds(300, 200, 430, 350);
    }//GEN-LAST:event_itemsBtnActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        jDialog6.dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void confirmCountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmCountButtonActionPerformed
       try {
           
           int locationsCount = Integer.parseInt(inputLocNumber.getText());
           if (locationsCount <= 0) {
               throw new IllegalArgumentException();
           }
           inputLocationsDialog.setVisible(false);
           jFrame1.setVisible(rootPaneCheckingEnabled);
            jFrame1.setSize(1000,700);
            
            

            human = game.NewHuman(playerHPProgressBar);
            game.getFight().setLocationsCount(locationsCount);
            game.getFight().prepareLocationAndRounds();
            locationLable.setText("Локация №"+game.getFight().getCurrentLocationsCount());
            enemy = game.NewEnemy(enemyPicture, enemyName, enemyDamageCount,enemyHPPoints, enemyHPProgressBar);
            game.change.NewRoundTexts(human, enemy, playerHPProgressBar, enemyHPProgressBar, 
                    pointCountLabe, expCountLabel, playerLevel, enemyLevel, hpPoints,enemyHPPoints, damageCountLabel,
                    effectLabel, informationLabel, game.fight.i, items, jRadioButton1, jRadioButton2, jRadioButton3);
           
           
           
           
           
       } catch (NumberFormatException ex) {
           JOptionPane.showMessageDialog(rootPane, "Необходимо ввести целое положительное число - количество локаций.", "Ошибка",  JOptionPane.ERROR_MESSAGE);
       } catch (IllegalArgumentException exc) {
           JOptionPane.showMessageDialog(rootPane, "Вы ввели отрицательное число. Число локаций должно быть целым положительным", "Ошибка",  JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_confirmCountButtonActionPerformed

    private void inputLocNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputLocNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputLocNumberActionPerformed

    private void weakBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weakBtnActionPerformed
        game.fight.Hit( human, enemy, 2,enemyHPPoints, hpPoints, jDialog1, 
                jLabel18, game.action, playerHPProgressBar, enemyHPProgressBar, jDialog2, 
                jDialog4, jFrame1, game.getResults(), jLabel20, jLabel24, 
                effectLabel, jLabel29, informationLabel, items, jRadioButton3, chooseOptionBox, newLevelLabel);
        
        checkAndDisableButtons() ;
    }//GEN-LAST:event_weakBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrames().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attackBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> chooseOptionBox;
    private javax.swing.JButton confirmCountButton;
    private javax.swing.JLabel damageCountLabel;
    private javax.swing.JLabel damageLabel;
    private javax.swing.JButton defendBtn;
    private javax.swing.JLabel effectLabel;
    private javax.swing.JLabel enemyDamageCount;
    private javax.swing.JLabel enemyDamageLabel;
    private javax.swing.JLabel enemyHPPoints;
    private javax.swing.JProgressBar enemyHPProgressBar;
    private javax.swing.JLabel enemyLevel;
    private javax.swing.JLabel enemyName;
    private javax.swing.JLabel enemyPicture;
    private javax.swing.JLabel expCountLabel;
    private javax.swing.JLabel experienceLabel;
    private javax.swing.JLabel fightLabel;
    private javax.swing.JLabel hpPoints;
    private javax.swing.JLabel informationLabel;
    private javax.swing.JTextField inputLocNumber;
    private javax.swing.JDialog inputLocationsDialog;
    private javax.swing.JButton itemsBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JDialog jDialog5;
    private javax.swing.JDialog jDialog6;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel locationLable;
    private javax.swing.JLabel locationsDialogTitle;
    private javax.swing.JLabel newLevelLabel;
    private javax.swing.JProgressBar playerHPProgressBar;
    private javax.swing.JLabel playerLevel;
    private javax.swing.JLabel playerName;
    private javax.swing.JLabel playerPicture;
    private javax.swing.JLabel pointCountLabe;
    private javax.swing.JLabel pointsLabel;
    private javax.swing.JButton weakBtn;
    // End of variables declaration//GEN-END:variables
}
