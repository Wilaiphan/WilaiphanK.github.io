package project;

import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Game extends javax.swing.JFrame {
    public Game() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jbtnNum1 = new javax.swing.JButton();
        jbtnNum9 = new javax.swing.JButton();
        jbtnNum5 = new javax.swing.JButton();
        jbtnNum2 = new javax.swing.JButton();
        jbtnNum6 = new javax.swing.JButton();
        jbtnNum10 = new javax.swing.JButton();
        jbtnNum3 = new javax.swing.JButton();
        jbtnNum11 = new javax.swing.JButton();
        jbtnNum7 = new javax.swing.JButton();
        jbtnNum4 = new javax.swing.JButton();
        jbtnNum8 = new javax.swing.JButton();
        jbtnNum12 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        reset = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        solution = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Numberof = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jButton15.setBackground(new java.awt.Color(204, 204, 204));
        jButton15.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton15.setText("1");

        jButton16.setBackground(new java.awt.Color(204, 204, 204));
        jButton16.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton16.setText("5");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(204, 204, 204));
        jButton17.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton17.setText("9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jLabel1.setText("Puzzle Game");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jbtnNum1.setBackground(new java.awt.Color(204, 204, 204));
        jbtnNum1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnNum1.setText("1");
        jbtnNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum1ActionPerformed(evt);
            }
        });

        jbtnNum9.setBackground(new java.awt.Color(204, 204, 204));
        jbtnNum9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnNum9.setText("9");
        jbtnNum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum9ActionPerformed(evt);
            }
        });

        jbtnNum5.setBackground(new java.awt.Color(204, 204, 204));
        jbtnNum5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnNum5.setText("5");
        jbtnNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum5ActionPerformed(evt);
            }
        });

        jbtnNum2.setBackground(new java.awt.Color(204, 204, 204));
        jbtnNum2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnNum2.setText("2");
        jbtnNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum2ActionPerformed(evt);
            }
        });

        jbtnNum6.setBackground(new java.awt.Color(204, 204, 204));
        jbtnNum6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnNum6.setText("6");
        jbtnNum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum6ActionPerformed(evt);
            }
        });

        jbtnNum10.setBackground(new java.awt.Color(204, 204, 204));
        jbtnNum10.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnNum10.setText("10");
        jbtnNum10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum10ActionPerformed(evt);
            }
        });

        jbtnNum3.setBackground(new java.awt.Color(204, 204, 204));
        jbtnNum3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnNum3.setText("3");
        jbtnNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum3ActionPerformed(evt);
            }
        });

        jbtnNum11.setBackground(new java.awt.Color(204, 204, 204));
        jbtnNum11.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnNum11.setText("11");
        jbtnNum11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum11ActionPerformed(evt);
            }
        });

        jbtnNum7.setBackground(new java.awt.Color(204, 204, 204));
        jbtnNum7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnNum7.setText("7");
        jbtnNum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum7ActionPerformed(evt);
            }
        });

        jbtnNum4.setBackground(new java.awt.Color(204, 204, 204));
        jbtnNum4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnNum4.setText("4");
        jbtnNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum4ActionPerformed(evt);
            }
        });

        jbtnNum8.setBackground(new java.awt.Color(204, 204, 204));
        jbtnNum8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnNum8.setText("8");
        jbtnNum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum8ActionPerformed(evt);
            }
        });

        jbtnNum12.setBackground(new java.awt.Color(204, 204, 204));
        jbtnNum12.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnNum12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnNum10, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnNum11, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnNum12, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jbtnNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnNum12, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jbtnNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbtnNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbtnNum11, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jbtnNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbtnNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbtnNum10, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jbtnNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbtnNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbtnNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        reset.setBackground(new java.awt.Color(204, 204, 204));
        reset.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        Exit.setBackground(new java.awt.Color(204, 204, 204));
        Exit.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        solution.setBackground(new java.awt.Color(204, 204, 204));
        solution.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        solution.setText("Solution");
        solution.setToolTipText("Solution");
        solution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solutionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(solution, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(solution, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel4.setText(" Clicks");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Numberof.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        Numberof.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Numberof.setText("0");
        Numberof.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(Numberof, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(Numberof, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    int counter;
    //===========================================================================
    void EmptySpotChecker(JButton Butt1,JButton Butt2) {
        
        String shuffleNumber = Butt2.getText();
        if(shuffleNumber == "") {
            Butt2.setText(Butt1.getText());
            Butt1.setText("");
        }
            
    }
    //===========================================================================
    public void shuffle() {
        int[] bnum = new int[12];
        int i,j, rowchecker;
        Boolean flag = false;
        i =1;
        
        do {
            Random rnd = new Random();
            rowchecker = rnd.nextInt((11)+1);
            
            for (j=1;j<=i;j++) {
                if(bnum[j] == rowchecker) {
                    flag = true;
                    break;
                }
            }
            if(flag == true) {
                flag = false;
            }
            else {
                bnum[i] = rowchecker;
                i += 1;
            }
        }
        while(i<=11);
        jbtnNum1.setText(Integer.toString(bnum[1]));
        jbtnNum2.setText(Integer.toString(bnum[2]));
        jbtnNum3.setText(Integer.toString(bnum[3]));
        jbtnNum4.setText(Integer.toString(bnum[4]));
        jbtnNum5.setText(Integer.toString(bnum[5]));
        jbtnNum6.setText(Integer.toString(bnum[6]));
        jbtnNum7.setText(Integer.toString(bnum[7]));
        jbtnNum8.setText(Integer.toString(bnum[8]));
        jbtnNum9.setText(Integer.toString(bnum[9]));
        jbtnNum10.setText(Integer.toString(bnum[10]));
        jbtnNum11.setText(Integer.toString(bnum[11]));
        jbtnNum12.setText("");
    }
    //===========================================================================
    
    public void SolotionChecker() {
        String b1 = jbtnNum1.getText();
        String b2 = jbtnNum2.getText();
        String b3 = jbtnNum3.getText();
        String b4 = jbtnNum4.getText();
        String b5 = jbtnNum5.getText();
        String b6 = jbtnNum6.getText();
        String b7 = jbtnNum7.getText();
        String b8 = jbtnNum8.getText();
        String b9 = jbtnNum9.getText();
        String b10 = jbtnNum10.getText();
        String b11 = jbtnNum11.getText();
        
        if(b1 =="1" && b2 == "2" && b3 == "3" && b4 == "4" && 
                b5 =="5" && b6 == "6" && b7 == "7" && b8 == "8" &&
                b9 =="9" && b10 == "10" && b11 == "11") {
                JOptionPane.showMessageDialog(this,"You Win the game","Puzzle Game",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        counter+=1;
        Numberof.setText(Integer.toString(counter));
        
    }
    
    private void jbtnNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum5ActionPerformed
        EmptySpotChecker(jbtnNum5,jbtnNum1);
        EmptySpotChecker(jbtnNum5,jbtnNum6);
        EmptySpotChecker(jbtnNum5,jbtnNum9);
        SolotionChecker();
    }//GEN-LAST:event_jbtnNum5ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jbtnNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum6ActionPerformed
        EmptySpotChecker(jbtnNum6,jbtnNum2);
        EmptySpotChecker(jbtnNum6,jbtnNum5);
        EmptySpotChecker(jbtnNum6,jbtnNum7);
        EmptySpotChecker(jbtnNum6,jbtnNum10);
        SolotionChecker();
    }//GEN-LAST:event_jbtnNum6ActionPerformed

    private void jbtnNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum7ActionPerformed
        EmptySpotChecker(jbtnNum7,jbtnNum3);
        EmptySpotChecker(jbtnNum7,jbtnNum6);
        EmptySpotChecker(jbtnNum7,jbtnNum8);
        EmptySpotChecker(jbtnNum7,jbtnNum11);
        SolotionChecker();
    }//GEN-LAST:event_jbtnNum7ActionPerformed

    private void jbtnNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum8ActionPerformed
        EmptySpotChecker(jbtnNum8,jbtnNum4);
        EmptySpotChecker(jbtnNum8,jbtnNum7);
        EmptySpotChecker(jbtnNum8,jbtnNum12);
        SolotionChecker();
    }//GEN-LAST:event_jbtnNum8ActionPerformed

    private void jbtnNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum2ActionPerformed
        EmptySpotChecker(jbtnNum2,jbtnNum1);
        EmptySpotChecker(jbtnNum2,jbtnNum3);
        EmptySpotChecker(jbtnNum2,jbtnNum6);
        SolotionChecker();
    }//GEN-LAST:event_jbtnNum2ActionPerformed

    private void solutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solutionActionPerformed
        jbtnNum1.setText("1");
        jbtnNum2.setText("2");
        jbtnNum3.setText("3");
        jbtnNum4.setText("4");
        jbtnNum5.setText("5");
        jbtnNum6.setText("6");
        jbtnNum7.setText("7");
        jbtnNum8.setText("8");
        jbtnNum9.setText("9");
        jbtnNum10.setText("10");
        jbtnNum11.setText("11");
        jbtnNum12.setText("12");
    }//GEN-LAST:event_solutionActionPerformed

    private void jbtnNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum1ActionPerformed
        EmptySpotChecker(jbtnNum1,jbtnNum2);
        EmptySpotChecker(jbtnNum1,jbtnNum5);
        SolotionChecker();
    }//GEN-LAST:event_jbtnNum1ActionPerformed

    private void jbtnNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum3ActionPerformed
        EmptySpotChecker(jbtnNum3,jbtnNum2);
        EmptySpotChecker(jbtnNum3,jbtnNum4);
        EmptySpotChecker(jbtnNum3,jbtnNum7);
        SolotionChecker();
    }//GEN-LAST:event_jbtnNum3ActionPerformed

    private void jbtnNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum4ActionPerformed
        EmptySpotChecker(jbtnNum4,jbtnNum3);
        EmptySpotChecker(jbtnNum4,jbtnNum8);
        SolotionChecker();
    }//GEN-LAST:event_jbtnNum4ActionPerformed

    private void jbtnNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum9ActionPerformed
        EmptySpotChecker(jbtnNum9,jbtnNum5);
        EmptySpotChecker(jbtnNum9,jbtnNum10);
        SolotionChecker();
    }//GEN-LAST:event_jbtnNum9ActionPerformed

    private void jbtnNum10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum10ActionPerformed
        EmptySpotChecker(jbtnNum10,jbtnNum6);
        EmptySpotChecker(jbtnNum10,jbtnNum9);
        EmptySpotChecker(jbtnNum10,jbtnNum11);
        SolotionChecker();
    }//GEN-LAST:event_jbtnNum10ActionPerformed

    private void jbtnNum11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum11ActionPerformed
        EmptySpotChecker(jbtnNum11,jbtnNum7);
        EmptySpotChecker(jbtnNum11,jbtnNum10);
        EmptySpotChecker(jbtnNum11,jbtnNum12);
        SolotionChecker();
    }//GEN-LAST:event_jbtnNum11ActionPerformed

    private void jbtnNum12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum12ActionPerformed
        EmptySpotChecker(jbtnNum12,jbtnNum8);
        EmptySpotChecker(jbtnNum12,jbtnNum11);
        SolotionChecker();
    }//GEN-LAST:event_jbtnNum12ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        shuffle();
    }//GEN-LAST:event_formWindowActivated

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        shuffle();
    }//GEN-LAST:event_resetActionPerformed

    private JFrame frame;
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame, "Do you want exit","Puzzle Game",
                JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
            
            System.exit(0);
        }
    }//GEN-LAST:event_ExitActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JLabel Numberof;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbtnNum1;
    private javax.swing.JButton jbtnNum10;
    private javax.swing.JButton jbtnNum11;
    private javax.swing.JButton jbtnNum12;
    private javax.swing.JButton jbtnNum2;
    private javax.swing.JButton jbtnNum3;
    private javax.swing.JButton jbtnNum4;
    private javax.swing.JButton jbtnNum5;
    private javax.swing.JButton jbtnNum6;
    private javax.swing.JButton jbtnNum7;
    private javax.swing.JButton jbtnNum8;
    private javax.swing.JButton jbtnNum9;
    private javax.swing.JButton reset;
    private javax.swing.JButton solution;
    // End of variables declaration//GEN-END:variables
}
