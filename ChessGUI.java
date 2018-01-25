/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import java.awt.Color;
import static java.lang.Thread.sleep;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class ChessGUI extends javax.swing.JFrame {
    
   JButton[][] b = new JButton[9][9]; // for refering to buttons
   JLabel[] label = new JLabel[32]; // for out icons from the board
   
   int kingCheck[][]=new int[9][9];  // if king will get check in next step on a perticular button then that button dimension will be set ..
                                     // kingCheck[i][j]=1 otherwise 0(zero) , if it is 1 then king cannot move on that button
   
   int [][] bs = new int[9][9]; // for button status i.e if (bs[i][j]=1 means this button is source for movebale icon)
                                // if (bs[i][j]=2 means this button can be destination for moveable icon)
   int iconTurn=1;  // for set the turn of Icon  ..for Black(iconTurn=0) for White(iconTurn=1)
   
   int blackKingCheck=0;   // black king check status   (if black king is in check then blackKingCheck=1 if not then blackKingCheck=0)
   int whiteKingCheck=0;   // white king check status   (if white king is in check then whiteKingCheck=1 if not then whiteKingCheck=0)
   
   Th t = null; // for timer
   
    public ChessGUI() {
        initComponents();
        setResizable(false);
         bArray(); // for creating a button array
         t=new Th();
         t.start();
         
         turnLabel.setText("WHITE");
     
       }
    
    
// class for Timer
    class Th extends Thread {

        public void run() {
            int sec = 0, min = 0;
            while (true) {
                if (sec == 59) {
                    sec = 0;

                    if (min < 9) {
                        jLabelTime.setText("0" + String.valueOf(++min) + ":0" + String.valueOf(sec));
                    } else {
                        jLabelTime.setText(String.valueOf(++min) + ":0" + String.valueOf(sec));
                    }

                } else {

                    if (sec >= 9 && min <= 9) {
                        jLabelTime.setText("0" + String.valueOf(min) + ":" + String.valueOf(++sec));
                    }
                    if (sec >= 9 && min >= 10) {
                        jLabelTime.setText(String.valueOf(min) + ":" + String.valueOf(++sec));
                    }
                    if (sec < 9 && min >= 10) {
                        jLabelTime.setText(String.valueOf(min) + ":0" + String.valueOf(++sec));
                    }

                    if (sec < 9 && min <= 9) {
                        jLabelTime.setText("0" + String.valueOf(min) + ":0" + String.valueOf(++sec));
                    }

                }
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                }

            }

        }
    }
    
// Main Method    
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
            java.util.logging.Logger.getLogger(ChessGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChessGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChessGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChessGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChessGUI().setVisible(true);
            }
        });
        
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPanel = new javax.swing.JPanel();
        b16 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b17 = new javax.swing.JButton();
        b18 = new javax.swing.JButton();
        b24 = new javax.swing.JButton();
        b21 = new javax.swing.JButton();
        b22 = new javax.swing.JButton();
        b23 = new javax.swing.JButton();
        b25 = new javax.swing.JButton();
        b26 = new javax.swing.JButton();
        b27 = new javax.swing.JButton();
        b28 = new javax.swing.JButton();
        b31 = new javax.swing.JButton();
        b32 = new javax.swing.JButton();
        b33 = new javax.swing.JButton();
        b34 = new javax.swing.JButton();
        b35 = new javax.swing.JButton();
        b36 = new javax.swing.JButton();
        b37 = new javax.swing.JButton();
        b38 = new javax.swing.JButton();
        b41 = new javax.swing.JButton();
        b42 = new javax.swing.JButton();
        b43 = new javax.swing.JButton();
        b44 = new javax.swing.JButton();
        b45 = new javax.swing.JButton();
        b46 = new javax.swing.JButton();
        b47 = new javax.swing.JButton();
        b48 = new javax.swing.JButton();
        b51 = new javax.swing.JButton();
        b52 = new javax.swing.JButton();
        b53 = new javax.swing.JButton();
        b54 = new javax.swing.JButton();
        b55 = new javax.swing.JButton();
        b56 = new javax.swing.JButton();
        b57 = new javax.swing.JButton();
        b58 = new javax.swing.JButton();
        b61 = new javax.swing.JButton();
        b62 = new javax.swing.JButton();
        b64 = new javax.swing.JButton();
        b63 = new javax.swing.JButton();
        b65 = new javax.swing.JButton();
        b66 = new javax.swing.JButton();
        b67 = new javax.swing.JButton();
        b68 = new javax.swing.JButton();
        b72 = new javax.swing.JButton();
        b71 = new javax.swing.JButton();
        b73 = new javax.swing.JButton();
        b74 = new javax.swing.JButton();
        b75 = new javax.swing.JButton();
        b76 = new javax.swing.JButton();
        b77 = new javax.swing.JButton();
        b78 = new javax.swing.JButton();
        b81 = new javax.swing.JButton();
        b82 = new javax.swing.JButton();
        b83 = new javax.swing.JButton();
        b84 = new javax.swing.JButton();
        b85 = new javax.swing.JButton();
        b86 = new javax.swing.JButton();
        b87 = new javax.swing.JButton();
        b88 = new javax.swing.JButton();
        labelTurn = new javax.swing.JLabel();
        turnLabel = new javax.swing.JLabel();
        helpButtonPanel = new javax.swing.JPanel();
        bwe = new javax.swing.JButton();
        bwh = new javax.swing.JButton();
        bwc = new javax.swing.JButton();
        bwq = new javax.swing.JButton();
        bwk = new javax.swing.JButton();
        bwp = new javax.swing.JButton();
        bnull = new javax.swing.JButton();
        bbe = new javax.swing.JButton();
        bbh = new javax.swing.JButton();
        bbc = new javax.swing.JButton();
        bbq = new javax.swing.JButton();
        bbk = new javax.swing.JButton();
        bbp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jl1 = new javax.swing.JLabel();
        jl2 = new javax.swing.JLabel();
        jl3 = new javax.swing.JLabel();
        jl4 = new javax.swing.JLabel();
        jl5 = new javax.swing.JLabel();
        jl6 = new javax.swing.JLabel();
        jl7 = new javax.swing.JLabel();
        jl8 = new javax.swing.JLabel();
        jl9 = new javax.swing.JLabel();
        jl10 = new javax.swing.JLabel();
        jl11 = new javax.swing.JLabel();
        jl12 = new javax.swing.JLabel();
        jl13 = new javax.swing.JLabel();
        jl14 = new javax.swing.JLabel();
        jl15 = new javax.swing.JLabel();
        jl16 = new javax.swing.JLabel();
        jl17 = new javax.swing.JLabel();
        jl18 = new javax.swing.JLabel();
        jl19 = new javax.swing.JLabel();
        jl20 = new javax.swing.JLabel();
        jl21 = new javax.swing.JLabel();
        jl22 = new javax.swing.JLabel();
        jl23 = new javax.swing.JLabel();
        jl24 = new javax.swing.JLabel();
        jl25 = new javax.swing.JLabel();
        jl26 = new javax.swing.JLabel();
        jl27 = new javax.swing.JLabel();
        jl28 = new javax.swing.JLabel();
        jl29 = new javax.swing.JLabel();
        jl30 = new javax.swing.JLabel();
        outedIcon = new javax.swing.JLabel();
        timerPanel = new javax.swing.JPanel();
        jLabelTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonPanel.setBackground(new java.awt.Color(255, 255, 0));
        buttonPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 5));

        b16.setBackground(new java.awt.Color(0, 0, 0));
        b16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/wcamel.png"))); // NOI18N
        b16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b16MouseReleased(evt);
            }
        });

        b15.setBackground(new java.awt.Color(255, 255, 255));
        b15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/wqueen.png"))); // NOI18N
        b15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b15MouseReleased(evt);
            }
        });

        b14.setBackground(new java.awt.Color(0, 0, 0));
        b14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/wking.png"))); // NOI18N
        b14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b14MouseReleased(evt);
            }
        });

        b13.setBackground(new java.awt.Color(255, 255, 255));
        b13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/wcamel.png"))); // NOI18N
        b13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b13MouseReleased(evt);
            }
        });

        b12.setBackground(new java.awt.Color(0, 0, 0));
        b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/whorse.png"))); // NOI18N
        b12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b12MouseReleased(evt);
            }
        });

        b11.setBackground(new java.awt.Color(255, 255, 255));
        b11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/weleph.png"))); // NOI18N
        b11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b11MouseReleased(evt);
            }
        });

        b17.setBackground(new java.awt.Color(255, 255, 255));
        b17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/whorse.png"))); // NOI18N
        b17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b17MouseReleased(evt);
            }
        });

        b18.setBackground(new java.awt.Color(0, 0, 0));
        b18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/weleph.png"))); // NOI18N
        b18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b18MouseReleased(evt);
            }
        });

        b24.setBackground(new java.awt.Color(255, 255, 255));
        b24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/wpawn.png"))); // NOI18N
        b24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b24MouseReleased(evt);
            }
        });

        b21.setBackground(new java.awt.Color(0, 0, 0));
        b21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/wpawn.png"))); // NOI18N
        b21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b21MouseReleased(evt);
            }
        });

        b22.setBackground(new java.awt.Color(255, 255, 255));
        b22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/wpawn.png"))); // NOI18N
        b22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b22MouseReleased(evt);
            }
        });

        b23.setBackground(new java.awt.Color(0, 0, 0));
        b23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/wpawn.png"))); // NOI18N
        b23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b23MouseReleased(evt);
            }
        });

        b25.setBackground(new java.awt.Color(0, 0, 0));
        b25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/wpawn.png"))); // NOI18N
        b25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b25MouseReleased(evt);
            }
        });

        b26.setBackground(new java.awt.Color(255, 255, 255));
        b26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/wpawn.png"))); // NOI18N
        b26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b26MouseReleased(evt);
            }
        });

        b27.setBackground(new java.awt.Color(0, 0, 0));
        b27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/wpawn.png"))); // NOI18N
        b27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b27MouseReleased(evt);
            }
        });

        b28.setBackground(new java.awt.Color(255, 255, 255));
        b28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/wpawn.png"))); // NOI18N
        b28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b28MouseReleased(evt);
            }
        });

        b31.setBackground(new java.awt.Color(255, 255, 255));
        b31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b31MouseReleased(evt);
            }
        });

        b32.setBackground(new java.awt.Color(0, 0, 0));
        b32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b32MouseReleased(evt);
            }
        });

        b33.setBackground(new java.awt.Color(255, 255, 255));
        b33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b33MouseReleased(evt);
            }
        });

        b34.setBackground(new java.awt.Color(0, 0, 0));
        b34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b34MouseReleased(evt);
            }
        });

        b35.setBackground(new java.awt.Color(255, 255, 255));
        b35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b35MouseReleased(evt);
            }
        });

        b36.setBackground(new java.awt.Color(0, 0, 0));
        b36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b36MouseReleased(evt);
            }
        });

        b37.setBackground(new java.awt.Color(255, 255, 255));
        b37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b37MouseReleased(evt);
            }
        });

        b38.setBackground(new java.awt.Color(0, 0, 0));
        b38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b38MouseReleased(evt);
            }
        });

        b41.setBackground(new java.awt.Color(0, 0, 0));
        b41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b41MouseReleased(evt);
            }
        });

        b42.setBackground(new java.awt.Color(255, 255, 255));
        b42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b42MouseReleased(evt);
            }
        });

        b43.setBackground(new java.awt.Color(0, 0, 0));
        b43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b43MouseReleased(evt);
            }
        });

        b44.setBackground(new java.awt.Color(255, 255, 255));
        b44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b44MouseReleased(evt);
            }
        });

        b45.setBackground(new java.awt.Color(0, 0, 0));
        b45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b45MouseReleased(evt);
            }
        });

        b46.setBackground(new java.awt.Color(255, 255, 255));
        b46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b46MouseReleased(evt);
            }
        });

        b47.setBackground(new java.awt.Color(0, 0, 0));
        b47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b47MouseReleased(evt);
            }
        });

        b48.setBackground(new java.awt.Color(255, 255, 255));
        b48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b48MouseReleased(evt);
            }
        });

        b51.setBackground(new java.awt.Color(255, 255, 255));
        b51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b51MouseReleased(evt);
            }
        });

        b52.setBackground(new java.awt.Color(0, 0, 0));
        b52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b52MouseReleased(evt);
            }
        });

        b53.setBackground(new java.awt.Color(255, 255, 255));
        b53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b53MouseReleased(evt);
            }
        });

        b54.setBackground(new java.awt.Color(0, 0, 0));
        b54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b54MouseReleased(evt);
            }
        });

        b55.setBackground(new java.awt.Color(255, 255, 255));
        b55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b55MouseReleased(evt);
            }
        });

        b56.setBackground(new java.awt.Color(0, 0, 0));
        b56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b56MouseReleased(evt);
            }
        });

        b57.setBackground(new java.awt.Color(255, 255, 255));
        b57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b57MouseReleased(evt);
            }
        });

        b58.setBackground(new java.awt.Color(0, 0, 0));
        b58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b58MouseReleased(evt);
            }
        });

        b61.setBackground(new java.awt.Color(0, 0, 0));
        b61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b61MouseReleased(evt);
            }
        });

        b62.setBackground(new java.awt.Color(255, 255, 255));
        b62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b62MouseReleased(evt);
            }
        });

        b64.setBackground(new java.awt.Color(255, 255, 255));
        b64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b64MouseReleased(evt);
            }
        });

        b63.setBackground(new java.awt.Color(0, 0, 0));
        b63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b63MouseReleased(evt);
            }
        });

        b65.setBackground(new java.awt.Color(0, 0, 0));
        b65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b65MouseReleased(evt);
            }
        });

        b66.setBackground(new java.awt.Color(255, 255, 255));
        b66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b66MouseReleased(evt);
            }
        });

        b67.setBackground(new java.awt.Color(0, 0, 0));
        b67.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b67MouseReleased(evt);
            }
        });

        b68.setBackground(new java.awt.Color(255, 255, 255));
        b68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b68MouseReleased(evt);
            }
        });

        b72.setBackground(new java.awt.Color(0, 0, 0));
        b72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/bpawn.png"))); // NOI18N
        b72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b72MouseReleased(evt);
            }
        });

        b71.setBackground(new java.awt.Color(255, 255, 255));
        b71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/bpawn.png"))); // NOI18N
        b71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b71MouseReleased(evt);
            }
        });

        b73.setBackground(new java.awt.Color(255, 255, 255));
        b73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/bpawn.png"))); // NOI18N
        b73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b73MouseReleased(evt);
            }
        });

        b74.setBackground(new java.awt.Color(0, 0, 0));
        b74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/bpawn.png"))); // NOI18N
        b74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b74MouseReleased(evt);
            }
        });

        b75.setBackground(new java.awt.Color(255, 255, 255));
        b75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/bpawn.png"))); // NOI18N
        b75.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b75MouseReleased(evt);
            }
        });

        b76.setBackground(new java.awt.Color(0, 0, 0));
        b76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/bpawn.png"))); // NOI18N
        b76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b76MouseReleased(evt);
            }
        });

        b77.setBackground(new java.awt.Color(255, 255, 255));
        b77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/bpawn.png"))); // NOI18N
        b77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b77MouseReleased(evt);
            }
        });

        b78.setBackground(new java.awt.Color(0, 0, 0));
        b78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/bpawn.png"))); // NOI18N
        b78.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b78MouseReleased(evt);
            }
        });

        b81.setBackground(new java.awt.Color(0, 0, 0));
        b81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/beleph.png"))); // NOI18N
        b81.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b81MouseReleased(evt);
            }
        });

        b82.setBackground(new java.awt.Color(255, 255, 255));
        b82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/bhorse.png"))); // NOI18N
        b82.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b82MouseReleased(evt);
            }
        });

        b83.setBackground(new java.awt.Color(0, 0, 0));
        b83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/bcamel.png"))); // NOI18N
        b83.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b83MouseReleased(evt);
            }
        });

        b84.setBackground(new java.awt.Color(255, 255, 255));
        b84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/bking.png"))); // NOI18N
        b84.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b84MouseReleased(evt);
            }
        });

        b85.setBackground(new java.awt.Color(0, 0, 0));
        b85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/bqueen.png"))); // NOI18N
        b85.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b85MouseReleased(evt);
            }
        });

        b86.setBackground(new java.awt.Color(255, 255, 255));
        b86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/bcamel.png"))); // NOI18N
        b86.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b86MouseReleased(evt);
            }
        });

        b87.setBackground(new java.awt.Color(0, 0, 0));
        b87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/bhorse.png"))); // NOI18N
        b87.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b87MouseReleased(evt);
            }
        });

        b88.setBackground(new java.awt.Color(255, 255, 255));
        b88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/beleph.png"))); // NOI18N
        b88.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b88MouseReleased(evt);
            }
        });

        labelTurn.setFont(new java.awt.Font("Copperplate Gothic Bold", 3, 24)); // NOI18N
        labelTurn.setForeground(new java.awt.Color(51, 51, 255));
        labelTurn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTurn.setText("Turn :");

        turnLabel.setFont(new java.awt.Font("Copperplate Gothic Bold", 3, 24)); // NOI18N
        turnLabel.setForeground(new java.awt.Color(248, 8, 8));
        turnLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        turnLabel.setText("jLabel3");

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b14, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b15, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b16, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b17, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b18, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addComponent(b21, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b22, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b23, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b24, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b25, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b26, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b27, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b28, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addComponent(b31, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b32, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b33, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b34, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b35, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b36, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b37, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b38, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addComponent(b41, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b42, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b43, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b44, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b45, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b46, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b47, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b48, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addComponent(b51, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b52, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b53, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b54, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b55, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b56, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b57, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b58, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addComponent(b61, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b62, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b63, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b64, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b65, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b66, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b67, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b68, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addComponent(b71, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b72, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b73, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b74, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b75, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b76, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b77, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b78, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addComponent(b81, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b82, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonPanelLayout.createSequentialGroup()
                        .addComponent(b83, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b84, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b85, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b86, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b87, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b88, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buttonPanelLayout.createSequentialGroup()
                        .addComponent(labelTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(turnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b14, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b15, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b16, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b17, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b18, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b21, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b22, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b23, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b24, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b25, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b26, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b27, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b28, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b31, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b32, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b33, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b34, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b35, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b36, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b37, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b38, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b41, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b42, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b43, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b44, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b45, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b46, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b47, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b48, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b51, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b52, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b53, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b54, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b55, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b56, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b57, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b58, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b61, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b62, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b63, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b64, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b65, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b66, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b67, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b68, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b71, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b72, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b73, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b74, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b75, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b76, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b77, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b78, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b81, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b82, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b83, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b84, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b85, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b86, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b87, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b88, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTurn, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(turnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        helpButtonPanel.setBackground(new java.awt.Color(0, 0, 0));

        bwe.setBackground(new java.awt.Color(255, 255, 255));
        bwe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/weleph.png"))); // NOI18N

        bwh.setBackground(new java.awt.Color(255, 255, 255));
        bwh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/whorse.png"))); // NOI18N

        bwc.setBackground(new java.awt.Color(255, 255, 255));
        bwc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/wcamel.png"))); // NOI18N

        bwq.setBackground(new java.awt.Color(255, 255, 255));
        bwq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/wqueen.png"))); // NOI18N

        bwk.setBackground(new java.awt.Color(255, 255, 255));
        bwk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/wking.png"))); // NOI18N

        bwp.setBackground(new java.awt.Color(255, 255, 255));
        bwp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/wpawn.png"))); // NOI18N

        bnull.setBackground(new java.awt.Color(153, 153, 153));

        bbe.setBackground(new java.awt.Color(255, 255, 255));
        bbe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/beleph.png"))); // NOI18N

        bbh.setBackground(new java.awt.Color(255, 255, 255));
        bbh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/bhorse.png"))); // NOI18N

        bbc.setBackground(new java.awt.Color(255, 255, 255));
        bbc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/bcamel.png"))); // NOI18N

        bbq.setBackground(new java.awt.Color(255, 255, 255));
        bbq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/bqueen.png"))); // NOI18N

        bbk.setBackground(new java.awt.Color(255, 255, 255));
        bbk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/bking.png"))); // NOI18N

        bbp.setBackground(new java.awt.Color(255, 255, 255));
        bbp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/bpawn.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Snap ITC", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setText("  Black");

        jLabel2.setFont(new java.awt.Font("Snap ITC", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setText("  White");

        javax.swing.GroupLayout helpButtonPanelLayout = new javax.swing.GroupLayout(helpButtonPanel);
        helpButtonPanel.setLayout(helpButtonPanelLayout);
        helpButtonPanelLayout.setHorizontalGroup(
            helpButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpButtonPanelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(helpButtonPanelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(bwk, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bbk, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(helpButtonPanelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(bwq, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bbq, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(helpButtonPanelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(bwc, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bbc, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(helpButtonPanelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(bwh, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bbh, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(helpButtonPanelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(bwe, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bbe, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(helpButtonPanelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(bwp, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bbp, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(helpButtonPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(bnull, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        helpButtonPanelLayout.setVerticalGroup(
            helpButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpButtonPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(helpButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGroup(helpButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bwk)
                    .addComponent(bbk))
                .addGroup(helpButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bwq)
                    .addComponent(bbq))
                .addGroup(helpButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bwc)
                    .addComponent(bbc))
                .addGroup(helpButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bwh)
                    .addComponent(bbh))
                .addGroup(helpButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bwe)
                    .addComponent(bbe))
                .addGroup(helpButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bwp)
                    .addComponent(bbp))
                .addGap(6, 6, 6)
                .addComponent(bnull, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        outedIcon.setBackground(new java.awt.Color(0, 0, 0));
        outedIcon.setFont(new java.awt.Font("Blackadder ITC", 3, 70)); // NOI18N
        outedIcon.setForeground(new java.awt.Color(255, 0, 255));
        outedIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        outedIcon.setText("Out Icon");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(outedIcon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jl1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jl2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jl3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jl4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jl5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jl6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jl7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jl8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jl9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jl10, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jl11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jl12, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jl13, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jl14, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jl15, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jl16, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jl17, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jl18, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jl19, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jl20, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jl21, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jl22, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jl23, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jl24, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jl25, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jl26, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jl27, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jl28, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jl29, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jl30, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(outedIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl11, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl12, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl13, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl14, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl15, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl16, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl17, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl18, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl19, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl20, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl21, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl22, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl23, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl24, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl25, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl26, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl27, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl28, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl29, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl30, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        timerPanel.setBackground(new java.awt.Color(0, 0, 0));

        jLabelTime.setFont(new java.awt.Font("Engravers MT", 3, 50)); // NOI18N
        jLabelTime.setForeground(new java.awt.Color(0, 255, 0));
        jLabelTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout timerPanelLayout = new javax.swing.GroupLayout(timerPanel);
        timerPanel.setLayout(timerPanelLayout);
        timerPanelLayout.setHorizontalGroup(
            timerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        timerPanelLayout.setVerticalGroup(
            timerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTime, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(helpButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(helpButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(timerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1319, 704));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b71MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b71MouseReleased
     
        
                Icon buttonIcon = b71.getIcon();
                 if(buttonIcon!=null && bs[7][1]==0){
                        
                       if(turn(buttonIcon)){
                             setChessBoxesColor();
                             iconMatching(buttonIcon,7,1); 
                       }    
                    }
        
        if(bs[7][1]==2){    //check if b71 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[7][1]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                      // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                       if( b[7][1].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[7][1].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[7][1].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[7][1].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[7][1].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[7][1].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[7][1].getIcon(),7,1);
                        }
                         // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[7][1].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[7][1].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[7][1].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[7][1].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[7][1].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[7][1].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[7][1].getIcon(),7,1);
                        }
                        break;
                    }
                }
        }
      
    }//GEN-LAST:event_b71MouseReleased

    private void b72MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b72MouseReleased
        
        
                Icon buttonIcon = b72.getIcon();
             
                        if(buttonIcon!=null && bs[7][2]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,7,2); 
                                }    
                         }
                    
        
        if(bs[7][2]==2){    //check if b72 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source (from where icon will move)
                       move(b[i][j],b[7][2]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                      // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[7][2].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[7][2].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[7][2].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[7][2].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[7][2].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[7][2].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[7][2].getIcon(),7,2);
                        }
                          // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[7][2].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[7][2].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[7][2].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[7][2].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[7][2].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[7][2].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[7][2].getIcon(),7,2);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b72MouseReleased

    private void b73MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b73MouseReleased
        
        
                Icon buttonIcon = b73.getIcon();
                 
                       if(buttonIcon!=null && bs[7][3]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,7,3); 
                                }    
                         }
                    
        
         if(bs[7][3]==2){    //check if b73 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[7][3]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                     // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[7][3].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[7][3].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[7][3].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[7][3].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[7][3].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[7][3].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[7][3].getIcon(),7,3);
                        }
                          // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[7][3].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[7][3].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[7][3].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[7][3].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[7][3].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[7][3].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[7][3].getIcon(),7,3);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b73MouseReleased

    private void b74MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b74MouseReleased
        
        
                Icon buttonIcon = b74.getIcon();
                
                        if(buttonIcon!=null && bs[7][4]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,7,4); 
                                }    
                         }
                    
        
        if(bs[7][4]==2){    //check if b74 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[7][4]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                     // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[7][4].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[7][4].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[7][4].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[7][4].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[7][4].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[7][4].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[7][4].getIcon(),7,4);
                        }
                        
                          // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[7][4].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[7][4].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[7][4].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[7][4].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[7][4].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[7][4].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[7][4].getIcon(),7,4);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b74MouseReleased

    private void b75MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b75MouseReleased
        
        
                Icon buttonIcon = b75.getIcon();
                
                        if(buttonIcon!=null && bs[7][5]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,7,5); 
                                }    
                         }
                    
        
         if(bs[7][5]==2){    //check if b75 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[7][5]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                     // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[7][5].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[7][5].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[7][5].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[7][5].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[7][5].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[7][5].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[7][5].getIcon(),7,5);
                        }
                          // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[7][5].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[7][5].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[7][5].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[7][5].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[7][5].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[7][5].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[7][5].getIcon(),7,5);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b75MouseReleased

    private void b76MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b76MouseReleased
        
        
                Icon buttonIcon = b76.getIcon();
                 if(buttonIcon!=null && bs[7][6]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,7,6); 
                                }    
                         }
        
        if(bs[7][6]==2){    //check if b76 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[7][6]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                     // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[7][6].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[7][6].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[7][6].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[7][6].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[7][6].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[7][6].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[7][6].getIcon(),7,6);
                        }
                          // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[7][6].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[7][6].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[7][6].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[7][6].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[7][6].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[7][6].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[7][6].getIcon(),7,6);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b76MouseReleased

    private void b77MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b77MouseReleased
        
        
                Icon buttonIcon = b77.getIcon();
                 if(buttonIcon!=null && bs[7][7]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,7,7); 
                                }    
                         }
        
        if(bs[7][7]==2){    //check if b77 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[7][7]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                      // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[7][7].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[7][7].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[7][7].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[7][7].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[7][7].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[7][7].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[7][7].getIcon(),7,7);
                        }
                          // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[7][7].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[7][7].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[7][7].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[7][7].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[7][7].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[7][7].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[7][7].getIcon(),7,7);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b77MouseReleased

    private void b78MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b78MouseReleased
     
        
                Icon buttonIcon = b78.getIcon();
                if(buttonIcon!=null && bs[7][8]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,7,8); 
                                }    
                         }
        
        if(bs[7][8]==2){    //check if b78 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[7][8]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                     // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[7][8].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[7][8].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[7][8].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[7][8].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[7][8].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[7][8].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[7][8].getIcon(),7,8);
                        }
                          // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[7][8].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[7][8].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[7][8].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[7][8].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[7][8].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[7][8].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[7][8].getIcon(),7,8);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b78MouseReleased

    private void b61MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b61MouseReleased
         
        
                Icon buttonIcon = b61.getIcon();
                 if(buttonIcon!=null && bs[6][1]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,6,1); 
                                }    
                         }
        
        if(bs[6][1]==2){    //check if b61 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[6][1]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                      // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[6][1].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[6][1].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[6][1].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[6][1].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[6][1].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[6][1].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[6][1].getIcon(),6,1);
                        }
                          // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[6][1].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[6][1].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[6][1].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[6][1].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[6][1].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[6][1].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[6][1].getIcon(),6,1);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b61MouseReleased

    private void b55MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b55MouseReleased
           
        
                Icon buttonIcon = b55.getIcon();
                 if(buttonIcon!=null && bs[5][5]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,5,5); 
                                }    
                         }
        
        if(bs[5][5]==2){    //check if b55 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[5][5]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                     // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[5][5].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[5][5].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[5][5].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[5][5].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[5][5].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[5][5].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[5][5].getIcon(),5,5);
                        }
                           // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[5][5].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[5][5].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[5][5].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[5][5].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[5][5].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[5][5].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[5][5].getIcon(),5,5);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b55MouseReleased

    private void b62MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b62MouseReleased
       
        
                Icon buttonIcon = b62.getIcon();
                 if(buttonIcon!=null && bs[6][2]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,6,2); 
                                }    
                         }
        
        if(bs[6][2]==2){    //check if b62 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[6][2]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                    // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[6][2].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[6][2].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[6][2].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[6][2].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[6][2].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[6][2].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[6][2].getIcon(),6,2);
                        }
                        
                           // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[6][2].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[6][2].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[6][2].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[6][2].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[6][2].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[6][2].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[6][2].getIcon(),6,2);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b62MouseReleased

    private void b63MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b63MouseReleased
         
        
                Icon buttonIcon = b63.getIcon();
                 if(buttonIcon!=null && bs[6][3]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,6,3); 
                                }    
                         }
        
         if(bs[6][3]==2){    //check if b63 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[6][3]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                    // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[6][3].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[6][3].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[6][3].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[6][3].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[6][3].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[6][3].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[6][3].getIcon(),6,3);
                        }
                        
                           // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[6][3].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[6][3].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[6][3].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[6][3].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[6][3].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[6][3].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[6][3].getIcon(),6,3);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b63MouseReleased

    private void b64MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b64MouseReleased
     
        
                Icon buttonIcon = b64.getIcon();
                 if(buttonIcon!=null && bs[6][4]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,6,4); 
                                }    
                         }
        
         if(bs[6][4]==2){    //check if b64 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[6][4]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                    // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[6][4].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[6][4].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[6][4].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[6][4].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[6][4].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[6][4].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[6][4].getIcon(),6,4);
                        }
                        
                           // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[6][4].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[6][4].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[6][4].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[6][4].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[6][4].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[6][4].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[6][4].getIcon(),6,4);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b64MouseReleased

    private void b65MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b65MouseReleased
        
        
                Icon buttonIcon = b65.getIcon();
                 if(buttonIcon!=null && bs[6][5]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,6,5); 
                                }    
                         }
        
         if(bs[6][5]==2){    //check if b65 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[6][5]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                   // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[6][5].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[6][5].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[6][5].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[6][5].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[6][5].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[6][5].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[6][5].getIcon(),6,5);
                        }
                           // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[6][5].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[6][5].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[6][5].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[6][5].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[6][5].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[6][5].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[6][5].getIcon(),6,5);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b65MouseReleased

    private void b66MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b66MouseReleased
         
        
                Icon buttonIcon = b66.getIcon();
                 if(buttonIcon!=null && bs[6][6]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,6,6); 
                                }    
                         }
        
        if(bs[6][6]==2){    //check if b66 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[6][6]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                    // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[6][6].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[6][6].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[6][6].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[6][6].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[6][6].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[6][6].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[6][6].getIcon(),6,6);
                        }
                           // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[6][6].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[6][6].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[6][6].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[6][6].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[6][6].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[6][6].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[6][6].getIcon(),6,6);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b66MouseReleased

    private void b67MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b67MouseReleased
         
        
                Icon buttonIcon = b67.getIcon();
                 if(buttonIcon!=null && bs[6][7]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,6,7); 
                                }    
                         }
        
        if(bs[6][7]==2){    //check if b67 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[6][7]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                     // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[6][7].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[6][7].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[6][7].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[6][7].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[6][7].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[6][7].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[6][7].getIcon(),6,7);
                        }
                        
                           // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[6][7].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[6][7].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[6][7].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[6][7].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[6][7].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[6][7].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[6][7].getIcon(),6,7);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b67MouseReleased

    private void b68MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b68MouseReleased
        
        
                Icon buttonIcon = b68.getIcon();
                 if(buttonIcon!=null && bs[6][8]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,6,8); 
                                }    
                         }
        
         if(bs[6][8]==2){    //check if b68 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[6][8]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                     // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[6][8].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[6][8].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[6][8].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[6][8].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[6][8].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[6][8].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[6][8].getIcon(),6,8);
                        }
                        
                           // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[6][8].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[6][8].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[6][8].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[6][8].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[6][8].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[6][8].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[6][8].getIcon(),6,8);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b68MouseReleased

    private void b51MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b51MouseReleased
           
        
                Icon buttonIcon = b51.getIcon();
                 if(buttonIcon!=null && bs[5][1]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,5,1); 
                                }    
                         }
        
         if(bs[5][1]==2){    //check if b51 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[5][1]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                     // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[5][1].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[5][1].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[5][1].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[5][1].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[5][1].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[5][1].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[5][1].getIcon(),5,1);
                        }
                        
                           // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[5][1].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[5][1].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[5][1].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[5][1].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[5][1].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[5][1].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[5][1].getIcon(),5,1);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b51MouseReleased

    private void b52MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b52MouseReleased
          
        
                Icon buttonIcon = b52.getIcon();
                if(buttonIcon!=null && bs[5][2]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,5,2); 
                                }    
                         }
        
         if(bs[5][2]==2){    //check if b52 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[5][2]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                    // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[5][2].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[5][2].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[5][2].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[5][2].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[5][2].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[5][2].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[5][2].getIcon(),5,2);
                        }
                        
                          // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[5][2].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[5][2].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[5][2].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[5][2].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[5][2].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[5][2].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[5][2].getIcon(),5,2);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b52MouseReleased

    private void b53MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b53MouseReleased
         
        
                Icon buttonIcon = b53.getIcon();
                 if(buttonIcon!=null && bs[5][3]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,5,3); 
                                }    
                         }
        
         if(bs[5][3]==2){    //check if b53 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[5][3]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                     // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[5][3].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[5][3].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[5][3].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[5][3].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[5][3].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[5][3].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                  
                                 isWhiteKingCheck(b[5][3].getIcon(),5,3);
                        }
                        
                         // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[5][3].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[5][3].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[5][3].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[5][3].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[5][3].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[5][3].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[5][3].getIcon(),5,3);
                        }
                        break;
                       
                    }
                }
        }
    }//GEN-LAST:event_b53MouseReleased

    private void b54MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b54MouseReleased
         
        
                Icon buttonIcon = b54.getIcon();
                 if(buttonIcon!=null && bs[5][4]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,5,4); 
                                }    
                         }
        
         if(bs[5][4]==2){    //check if b54 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[5][4]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                       
                     // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[5][4].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[5][4].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[5][4].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[5][4].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[5][4].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[5][4].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[5][4].getIcon(),5,4);
                        }
                          // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[5][4].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[5][4].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[5][4].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[5][4].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[5][4].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[5][4].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[5][4].getIcon(),5,4);
                        }
                        break;
                    }
                }
        }
        
    }//GEN-LAST:event_b54MouseReleased

    private void b56MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b56MouseReleased
          
        
                Icon buttonIcon = b56.getIcon();
                 if(buttonIcon!=null && bs[5][6]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,5,6); 
                                }    
                         }
        
         if(bs[5][6]==2){    //check if b56 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[5][6]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                     // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[5][6].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[5][6].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[5][6].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[5][6].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[5][6].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[5][6].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[5][6].getIcon(),5,6);
                        }
                        
                          // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[5][6].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[5][6].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[5][6].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[5][6].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[5][6].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[5][6].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[5][6].getIcon(),5,6);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b56MouseReleased

    private void b57MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b57MouseReleased
         
        
                Icon buttonIcon = b57.getIcon();
                 if(buttonIcon!=null && bs[5][7]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,5,7); 
                                }    
                         }
        
         if(bs[5][7]==2){    //check if b57 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[5][7]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                      // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[5][7].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[5][7].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[5][7].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[5][7].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[5][7].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[5][7].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[5][7].getIcon(),5,7);
                        }
                        
                          // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[5][7].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[5][7].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[5][7].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[5][7].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[5][7].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[5][7].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[5][7].getIcon(),5,7);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b57MouseReleased

    private void b58MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b58MouseReleased
           
        
                Icon buttonIcon = b58.getIcon();
                if(buttonIcon!=null && bs[5][8]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,5,8); 
                                }    
                         }
        
        if(bs[5][8]==2){    //check if b58 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[5][8]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                    // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[5][8].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[5][8].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[5][8].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[5][8].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[5][8].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[5][8].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[5][8].getIcon(),5,8);
                        }
                        
                          // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[5][8].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[5][8].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[5][8].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[5][8].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[5][8].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[5][8].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[5][8].getIcon(),5,8);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b58MouseReleased

    private void b41MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b41MouseReleased
          
        
                Icon buttonIcon = b41.getIcon();
                 if(buttonIcon!=null && bs[4][1]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,4,1); 
                                }    
                         }
        
         if(bs[4][1]==2){    //check if b41 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[4][1]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                   // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[4][1].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[4][1].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[4][1].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[4][1].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[4][1].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[4][1].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[4][1].getIcon(),4,1);
                        }
                          // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[4][1].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[4][1].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[4][1].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[4][1].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[4][1].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[4][1].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[4][1].getIcon(),4,1);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b41MouseReleased

    private void b42MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b42MouseReleased
          
        
                Icon buttonIcon = b42.getIcon();
                 if(buttonIcon!=null && bs[4][2]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,4,2); 
                                }    
                         }
        
         if(bs[4][2]==2){    //check if b42 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[4][2]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                     // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[4][2].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[4][2].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[4][2].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[4][2].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[4][2].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[4][2].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[4][2].getIcon(),4,2);
                        }
                        
                          // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[4][2].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[4][2].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[4][2].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[4][2].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[4][2].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[4][2].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[4][2].getIcon(),4,2);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b42MouseReleased

    private void b43MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b43MouseReleased
          
        
                Icon buttonIcon = b43.getIcon();
                 if(buttonIcon!=null && bs[4][3]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,4,3); 
                                }    
                         }
        
         if(bs[4][3]==2){    //check if b43 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[4][3]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                    // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[4][3].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[4][3].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[4][3].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[4][3].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[4][3].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[4][3].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[4][3].getIcon(),4,3);
                        }
                          // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[4][3].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[4][3].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[4][3].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[4][3].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[4][3].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[4][3].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[4][3].getIcon(),4,3);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b43MouseReleased

    private void b44MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b44MouseReleased
       
        
                Icon buttonIcon = b44.getIcon();
                 if(buttonIcon!=null && bs[4][4]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,4,4); 
                                }    
                         }
        
        if(bs[4][4]==2){    //check if b44 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[4][4]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                     // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[4][4].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[4][4].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[4][4].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[4][4].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[4][4].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[4][4].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[4][4].getIcon(),4,4);
                        }
                          // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[4][4].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[4][4].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[4][4].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[4][4].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[4][4].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[4][4].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[4][4].getIcon(),4,4);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b44MouseReleased

    private void b45MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b45MouseReleased
          
        
                Icon buttonIcon = b45.getIcon();
                if(buttonIcon!=null && bs[4][5]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,4,5); 
                                }    
                         }
        
        if(bs[4][5]==2){    //check if b45 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[4][5]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                     // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[4][5].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[4][5].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[4][5].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[4][5].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[4][5].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[4][5].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[4][5].getIcon(),4,5);
                        }
                          // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[4][5].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[4][5].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[4][5].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[4][5].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[4][5].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[4][5].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[4][5].getIcon(),4,5);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b45MouseReleased

    private void b46MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b46MouseReleased
         
        
                Icon buttonIcon = b46.getIcon();
                 if(buttonIcon!=null && bs[4][6]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,4,6); 
                                }    
                         }
        
         if(bs[4][6]==2){    //check if b46 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[4][6]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                     // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[4][6].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[4][6].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[4][6].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[4][6].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[4][6].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[4][6].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[4][6].getIcon(),4,6);
                        }
                          // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[4][6].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[4][6].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[4][6].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[4][6].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[4][6].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[4][6].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[4][6].getIcon(),4,6);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b46MouseReleased

    private void b47MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b47MouseReleased
          
        
                Icon buttonIcon = b47.getIcon();
                 if(buttonIcon!=null && bs[4][7]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,4,7); 
                                }    
                         }
        
        if(bs[4][7]==2){    //check if b47 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[4][7]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                     // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[4][7].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[4][7].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[4][7].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[4][7].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[4][7].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[4][7].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[4][7].getIcon(),4,7);
                        }
                          // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[4][7].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[4][7].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[4][7].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[4][7].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[4][7].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[4][7].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[4][7].getIcon(),4,7);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b47MouseReleased

    private void b48MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b48MouseReleased
         
        
                Icon buttonIcon = b48.getIcon();
                 if(buttonIcon!=null && bs[4][8]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,4,8); 
                                }    
                         }
        
          if(bs[4][8]==2){    //check if b48 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[4][8]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                      // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[4][8].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[4][8].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[4][8].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[4][8].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[4][8].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[4][8].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[4][8].getIcon(),4,8);
                        }
                        
                          // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[4][8].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[4][8].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[4][8].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[4][8].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[4][8].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[4][8].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[4][8].getIcon(),4,8);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b48MouseReleased

    private void b31MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b31MouseReleased
        
        
        
                Icon buttonIcon = b31.getIcon();
                if(buttonIcon!=null && bs[3][1]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,3,1); 
                                }    
                         }
        
         if(bs[3][1]==2){    //check if b31 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[3][1]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                     // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[3][1].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[3][1].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[3][1].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[3][1].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[3][1].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[3][1].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[3][1].getIcon(),3,1);
                        }
                          // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[3][1].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[3][1].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[3][1].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[3][1].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[3][1].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[3][1].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[3][1].getIcon(),3,1);
                        }
                        break;
                    }
                }
        }
        
        
    }//GEN-LAST:event_b31MouseReleased

    private void b32MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b32MouseReleased
         
        
                Icon buttonIcon = b32.getIcon();
                if(buttonIcon!=null && bs[3][2]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,3,2); 
                                }    
                         }
        
         if(bs[3][2]==2){    //check if b32 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[3][2]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                    // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[3][2].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[3][2].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[3][2].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[3][2].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[3][2].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[3][2].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[3][2].getIcon(),3,2);
                        }
                        
                          // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[3][2].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[3][2].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[3][2].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[3][2].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[3][2].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[3][2].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[3][2].getIcon(),3,2);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b32MouseReleased

    private void b33MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b33MouseReleased
        
        
                Icon buttonIcon = b33.getIcon();
                 if(buttonIcon!=null && bs[3][3]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,3,3); 
                                }    
                         }
        
         if(bs[3][3]==2){    //check if b33 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[3][3]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                    // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[3][3].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[3][3].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[3][3].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[3][3].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[3][3].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[3][3].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[3][3].getIcon(),3,3);
                        }
                        
                        // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[3][3].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[3][3].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[3][3].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[3][3].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[3][3].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[3][3].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[3][3].getIcon(),3,3);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b33MouseReleased

    private void b34MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b34MouseReleased
      
        
                Icon buttonIcon = b34.getIcon();
                 if(buttonIcon!=null && bs[3][4]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,3,4); 
                                }    
                         }
        
         if(bs[3][4]==2){    //check if b34 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[3][4]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                   // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[3][4].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[3][4].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[3][4].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[3][4].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[3][4].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[3][4].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[3][4].getIcon(),3,4);
                        }
                        // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[3][4].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[3][4].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[3][4].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[3][4].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[3][4].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[3][4].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[3][4].getIcon(),3,4);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b34MouseReleased

    private void b35MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b35MouseReleased
       
        
                Icon buttonIcon = b35.getIcon();
                 if(buttonIcon!=null && bs[3][5]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,3,5); 
                                }    
                         }
        
        if(bs[3][5]==2){    //check if b35 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[3][5]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                     // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[3][5].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[3][5].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[3][5].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[3][5].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[3][5].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[3][5].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[3][5].getIcon(),3,5);
                        }
                        // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[3][5].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[3][5].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[3][5].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[3][5].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[3][5].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[3][5].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[3][5].getIcon(),3,5);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b35MouseReleased

    private void b36MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b36MouseReleased
       
        
                Icon buttonIcon = b36.getIcon();
                 if(buttonIcon!=null && bs[3][6]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,3,6); 
                                }    
                         }
        
        if(bs[3][6]==2){    //check if b36 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[3][6]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                     // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[3][6].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[3][6].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[3][6].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[3][6].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[3][6].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[3][6].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[3][6].getIcon(),3,6);
                        }
                        // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[3][6].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[3][6].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[3][6].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[3][6].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[3][6].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[3][6].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[3][6].getIcon(),3,6);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b36MouseReleased

    private void b37MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b37MouseReleased
       
        
                Icon buttonIcon = b37.getIcon();
                 if(buttonIcon!=null && bs[3][7]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,3,7); 
                                }    
                         }
        
        if(bs[3][7]==2){    //check if b37 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[3][7]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                    // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[3][7].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[3][7].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[3][7].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[3][7].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[3][7].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[3][7].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[3][7].getIcon(),3,7);
                        }
                        
                        // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[3][7].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[3][7].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[3][7].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[3][7].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[3][7].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[3][7].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[3][7].getIcon(),3,7);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b37MouseReleased

    private void b38MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b38MouseReleased
       
        
                Icon buttonIcon = b38.getIcon();
                 if(buttonIcon!=null && bs[3][8]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,3,8); 
                                }    
                         }
        
         if(bs[3][8]==2){    //check if b38 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[3][8]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                     // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[3][8].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[3][8].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[3][8].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[3][8].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[3][8].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[3][8].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[3][8].getIcon(),3,8);
                        }
                        
                        // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[3][8].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[3][8].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[3][8].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[3][8].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[3][8].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[3][8].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[3][8].getIcon(),3,8);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b38MouseReleased

    private void b21MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b21MouseReleased
        
       
                Icon buttonIcon = b21.getIcon();
                 if(buttonIcon!=null && bs[2][1]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,2,1); 
                                }    
                         }
        
        if(bs[2][1]==2){    //check if b21 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[2][1]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                   // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[2][1].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[2][1].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[2][1].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[2][1].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[2][1].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[2][1].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[2][1].getIcon(),2,1);
                        }
                        
                        // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[2][1].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[2][1].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[2][1].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[2][1].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[2][1].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[2][1].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[2][1].getIcon(),2,1);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b21MouseReleased

    private void b22MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b22MouseReleased
         
        
                Icon buttonIcon = b22.getIcon();
                if(buttonIcon!=null && bs[2][2]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,2,2); 
                                }    
                         }
        
         if(bs[2][2]==2){    //check if b22 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[2][2]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                    // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[2][2].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[2][2].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[2][2].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[2][2].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[2][2].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[2][2].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[2][2].getIcon(),2,2);
                        }
                        
                        // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[2][2].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[2][2].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[2][2].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[2][2].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[2][2].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[2][2].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[2][2].getIcon(),2,2);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b22MouseReleased

    private void b23MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b23MouseReleased
        
        
                Icon buttonIcon = b23.getIcon();
                 if(buttonIcon!=null && bs[2][3]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,2,3); 
                                }    
                         }
        
        if(bs[2][3]==2){    //check if b23 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[2][3]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                      // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[2][3].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[2][3].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[2][3].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[2][3].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[2][3].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[2][3].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[2][3].getIcon(),2,3);
                        }
                        
                         // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[2][3].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[2][3].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[2][3].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[2][3].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[2][3].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[2][3].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[2][3].getIcon(),2,3);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b23MouseReleased

    private void b24MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b24MouseReleased
        
        
                Icon buttonIcon = b24.getIcon();
                if(buttonIcon!=null && bs[2][4]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,2,4); 
                                }    
                         }
        
         if(bs[2][4]==2){    //check if b24 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[2][4]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                      // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[2][4].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[2][4].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[2][4].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[2][4].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[2][4].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[2][4].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[2][4].getIcon(),2,4);
                        }
                         // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[2][4].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[2][4].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[2][4].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[2][4].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[2][4].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[2][4].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[2][4].getIcon(),2,4);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b24MouseReleased

    private void b25MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b25MouseReleased
         
        
                Icon buttonIcon = b25.getIcon();
                if(buttonIcon!=null && bs[2][5]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,2,5); 
                                }    
                         }
        
        if(bs[2][5]==2){    //check if b25 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[2][5]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                     // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[2][5].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[2][5].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[2][5].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[2][5].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[2][5].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[2][5].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[2][5].getIcon(),2,5);
                        }
                        
                         // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[2][5].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[2][5].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[2][5].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[2][5].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[2][5].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[2][5].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[2][5].getIcon(),2,5);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b25MouseReleased

    private void b26MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b26MouseReleased
        
        
                Icon buttonIcon = b26.getIcon();
                 if(buttonIcon!=null && bs[2][6]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,2,6); 
                                }    
                         }
        
         if(bs[2][6]==2){    //check if b26 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[2][6]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                    // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[2][6].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[2][6].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[2][6].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[2][6].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[2][6].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[2][6].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[2][6].getIcon(),2,6);
                        }
                        
                         // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[2][6].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[2][6].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[2][6].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[2][6].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[2][6].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[2][6].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[2][6].getIcon(),2,6);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b26MouseReleased

    private void b27MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b27MouseReleased
         
        
                Icon buttonIcon = b27.getIcon();
                if(buttonIcon!=null && bs[2][7]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,2,7); 
                                }    
                         }
        
         if(bs[2][7]==2){    //check if b27 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[2][7]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                      // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[2][7].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[2][7].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[2][7].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[2][7].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[2][7].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[2][7].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[2][7].getIcon(),2,7);
                        }
                         // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[2][7].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[2][7].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[2][7].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[2][7].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[2][7].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[2][7].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[2][7].getIcon(),2,7);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b27MouseReleased

    private void b28MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b28MouseReleased
       
        
                Icon buttonIcon = b28.getIcon();
                if(buttonIcon!=null && bs[2][8]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,2,8); 
                                }    
                         }
        
         if(bs[2][8]==2){    //check if b28 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[2][8]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                     // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[2][8].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[2][8].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[2][8].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[2][8].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[2][8].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[2][8].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[2][8].getIcon(),2,8);
                        }
                        
                         // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[2][8].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[2][8].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[2][8].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[2][8].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[2][8].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[2][8].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[2][8].getIcon(),2,8);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b28MouseReleased

    private void b11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b11MouseReleased
         
        
                Icon buttonIcon = b11.getIcon();
                 if(buttonIcon!=null && bs[1][1]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,1,1); 
                                }    
                         }
        
         if(bs[1][1]==2){    //check if b11 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[1][1]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                     // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[1][1].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[1][1].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[1][1].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[1][1].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[1][1].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[1][1].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[1][1].getIcon(),1,1);
                        }
                        
                         // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[1][1].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[1][1].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[1][1].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[1][1].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[1][1].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[1][1].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[1][1].getIcon(),1,1);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b11MouseReleased

    private void b12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b12MouseReleased
           
        
                Icon buttonIcon = b12.getIcon();
                if(buttonIcon!=null && bs[1][2]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,1,2); 
                                }    
                         }
        
        if(bs[1][2]==2){    //check if b12 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[1][2]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                     // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[1][2].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[1][2].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[1][2].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[1][2].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[1][2].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[1][2].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[1][2].getIcon(),1,2);
                        }
                        
                         // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[1][2].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[1][2].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[1][2].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[1][2].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[1][2].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[1][2].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[1][2].getIcon(),1,2);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b12MouseReleased

    private void b13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b13MouseReleased

          
        
                Icon buttonIcon = b13.getIcon();
                 if(buttonIcon!=null && bs[1][3]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,1,3); 
                                }    
                         }
        
         if(bs[1][3]==2){    //check if b13 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[1][3]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                   // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[1][3].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[1][3].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[1][3].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[1][3].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[1][3].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[1][3].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[1][3].getIcon(),1,3);
                        }
                        
                         // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[1][3].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[1][3].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[1][3].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[1][3].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[1][3].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[1][3].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[1][3].getIcon(),1,3);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b13MouseReleased

    private void b14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b14MouseReleased
           
        
                Icon buttonIcon = b14.getIcon();
                 if(buttonIcon!=null && bs[1][4]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,1,4); 
                                }    
                         }
        
         if(bs[1][4]==2){    //check if b14 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[1][4]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                     // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[1][4].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[1][4].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[1][4].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[1][4].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[1][4].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[1][4].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[1][4].getIcon(),1,4);
                        }
                        
                         // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[1][4].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[1][4].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[1][4].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[1][4].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[1][4].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[1][4].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[1][4].getIcon(),1,4);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b14MouseReleased

    private void b15MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b15MouseReleased
          
       
                Icon buttonIcon = b15.getIcon();
                 if(buttonIcon!=null && bs[1][5]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,1,5); 
                                }    
                         }
        
        if(bs[1][5]==2){    //check if b15 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[1][5]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                    // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[1][5].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[1][5].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[1][5].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[1][5].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[1][5].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[1][5].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[1][5].getIcon(),1,5);
                        }
                        
                         // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[1][5].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[1][5].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[1][5].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[1][5].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[1][5].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[1][5].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[1][5].getIcon(),1,5);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b15MouseReleased

    private void b16MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b16MouseReleased
           
       
                Icon buttonIcon = b16.getIcon();
                 if(buttonIcon!=null && bs[1][6]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,1,6); 
                                }    
                         }
     
         if(bs[1][6]==2){    //check if b16 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[1][6]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                     // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[1][6].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[1][6].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[1][6].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[1][6].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[1][6].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[1][6].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[1][6].getIcon(),1,6);
                        }
                        
                         // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[1][6].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[1][6].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[1][6].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[1][6].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[1][6].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[1][6].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[1][6].getIcon(),1,6);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b16MouseReleased

    private void b17MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b17MouseReleased
           
        
                Icon buttonIcon = b17.getIcon();
                 if(buttonIcon!=null && bs[1][7]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,1,7); 
                                }    
                         }
         if(bs[1][7]==2){    //check if b17 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[1][7]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                    // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[1][7].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[1][7].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[1][7].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[1][7].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[1][7].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[1][7].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[1][7].getIcon(),1,7);
                        }
                        
                         // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[1][7].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[1][7].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[1][7].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[1][7].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[1][7].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[1][7].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[1][7].getIcon(),1,7);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b17MouseReleased

    private void b18MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b18MouseReleased
          
        
                Icon buttonIcon = b18.getIcon();
                 if(buttonIcon!=null && bs[1][8]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,1,8); 
                                }    
                         }
    
        if(bs[1][8]==2){    //check if b18 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[1][8]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                   // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[1][8].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[1][8].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[1][8].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[1][8].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[1][8].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[1][8].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[1][8].getIcon(),1,8);
                        }
                        
                         // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[1][8].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[1][8].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[1][8].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[1][8].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[1][8].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[1][8].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[1][8].getIcon(),1,8);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b18MouseReleased

    private void b81MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b81MouseReleased
            
        
                Icon buttonIcon = b81.getIcon();
                if(buttonIcon!=null && bs[8][1]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,8,1); 
                                }    
                         }
        
         if(bs[8][1]==2){    //check if b81 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[8][1]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                   // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[8][1].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[8][1].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[8][1].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[8][1].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[8][1].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[8][1].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[8][1].getIcon(),8,1);
                        }
                         // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[8][1].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[8][1].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[8][1].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[8][1].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[8][1].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[8][1].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[8][1].getIcon(),8,1);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b81MouseReleased

    private void b82MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b82MouseReleased
           
        
                Icon buttonIcon = b82.getIcon();
                 if(buttonIcon!=null && bs[8][2]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,8,2); 
                                }    
                         }
        
          if(bs[8][2]==2){    //check if b82 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[8][2]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                   // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[8][2].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[8][2].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[8][2].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[8][2].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[8][2].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[8][2].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[8][2].getIcon(),8,2);
                        }
                        
                         // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[8][2].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[8][2].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[8][2].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[8][2].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[8][2].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[8][2].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[8][2].getIcon(),8,2);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b82MouseReleased

    private void b83MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b83MouseReleased
         
        
                Icon buttonIcon = b83.getIcon();
                 if(buttonIcon!=null && bs[8][2]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,8,3); 
                                }    
                         }
        
         if(bs[8][3]==2){    //check if b83 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[8][3]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                    // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[8][3].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[8][3].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[8][3].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[8][3].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[8][3].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[8][3].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[8][3].getIcon(),8,3);
                        }
                         // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[8][3].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[8][3].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[8][3].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[8][3].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[8][3].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[8][3].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[8][3].getIcon(),8,3);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b83MouseReleased

    private void b84MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b84MouseReleased
       
        
                Icon buttonIcon = b84.getIcon();
                if(buttonIcon!=null && bs[8][4]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,8,4); 
                                }    
                         }
        
        if(bs[8][4]==2){    //check if b84 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[8][4]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                    // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[8][4].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[8][4].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[8][4].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[8][4].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[8][4].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[8][4].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[8][4].getIcon(),8,4);
                        }
                        
                         // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[8][4].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[8][4].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[8][4].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[8][4].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[8][4].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[8][4].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[8][4].getIcon(),8,4);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b84MouseReleased

    private void b85MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b85MouseReleased
         
        
                Icon buttonIcon = b85.getIcon();
                 if(buttonIcon!=null && bs[8][5]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,8,5); 
                                }    
                         }
        
        if(bs[8][5]==2){    //check if b85 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[8][5]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                      // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[8][5].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[8][5].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[8][5].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[8][5].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[8][5].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[8][5].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[8][5].getIcon(),8,5);
                        }
                        
                         // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[8][5].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[8][5].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[8][5].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[8][5].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[8][5].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[8][5].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[8][5].getIcon(),8,5);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b85MouseReleased

    private void b86MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b86MouseReleased
         
        
                Icon buttonIcon = b86.getIcon();
                  if(buttonIcon!=null && bs[8][6]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,8,6); 
                                }    
                         }
         if(bs[8][6]==2){    //check if b86 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[8][6]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                       // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[8][6].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[8][6].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[8][6].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[8][6].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[8][6].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[8][6].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[8][6].getIcon(),8,6);
                        }
                        
                         // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[8][6].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[8][6].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[8][6].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[8][6].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[8][6].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[8][6].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[8][6].getIcon(),8,6);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b86MouseReleased

    private void b87MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b87MouseReleased
         
        
                Icon buttonIcon = b87.getIcon();
                 if(buttonIcon!=null && bs[8][7]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,8,7); 
                                }    
                         }
        
        if(bs[8][7]==2){    //check if b87 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[8][7]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                      // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[8][7].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[8][7].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[8][7].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[8][7].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[8][7].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[8][7].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[8][7].getIcon(),8,7);
                        }
                        
                         // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[8][7].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[8][7].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[8][7].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[8][7].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[8][7].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[8][7].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[8][7].getIcon(),8,7);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b87MouseReleased

    private void b88MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b88MouseReleased
         
        
                Icon buttonIcon = b88.getIcon();
                 if(buttonIcon!=null && bs[8][8]==0){
                                if(turn(buttonIcon)){
                                      setChessBoxesColor();
                                      iconMatching(buttonIcon,8,8); 
                                }    
                         }
        
        if(bs[8][8]==2){    //check if b88 is destination for any movable icon
            for(int i=1;i<9;i++)
                for(int j=1;j<9;j++){
                    if(bs[i][j]==1){  //checking source from where icon will move
                       move(b[i][j],b[8][8]);
                        setChessBoxesColor();
                        if(iconTurn==1){
                            iconTurn--;
                            turnLabel.setText("BLACK");
                        }
                        else{
                            iconTurn++;
                            turnLabel.setText("WHITE");
                        }
                      // for checking that is whiteKing has check from any black icon due to its current move which has moved by it   
                        if( b[8][8].getIcon().toString().equals(bbp.getIcon().toString()) ||
                            b[8][8].getIcon().toString().equals(bbe.getIcon().toString()) || 
                            b[8][8].getIcon().toString().equals(bbh.getIcon().toString()) ||
                            b[8][8].getIcon().toString().equals(bbc.getIcon().toString()) ||
                            b[8][8].getIcon().toString().equals(bbq.getIcon().toString()) ||
                            b[8][8].getIcon().toString().equals(bbk.getIcon().toString()) ){
                            
                                 isWhiteKingCheck(b[8][8].getIcon(),8,8);
                        }
                        
                         // for checking that is blackKing has check from any black icon due to its current move which has moved by it   
                        if( b[8][8].getIcon().toString().equals(bwp.getIcon().toString()) ||
                            b[8][8].getIcon().toString().equals(bwe.getIcon().toString()) || 
                            b[8][8].getIcon().toString().equals(bwh.getIcon().toString()) ||
                            b[8][8].getIcon().toString().equals(bwc.getIcon().toString()) ||
                            b[8][8].getIcon().toString().equals(bwq.getIcon().toString()) ||
                            b[8][8].getIcon().toString().equals(bwk.getIcon().toString()) ){
                            
                                  
                                 isBlackKingCheck(b[8][8].getIcon(),8,8);
                        }
                        break;
                    }
                }
        }
    }//GEN-LAST:event_b88MouseReleased

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b17;
    private javax.swing.JButton b18;
    private javax.swing.JButton b21;
    private javax.swing.JButton b22;
    private javax.swing.JButton b23;
    private javax.swing.JButton b24;
    private javax.swing.JButton b25;
    private javax.swing.JButton b26;
    private javax.swing.JButton b27;
    private javax.swing.JButton b28;
    private javax.swing.JButton b31;
    private javax.swing.JButton b32;
    private javax.swing.JButton b33;
    private javax.swing.JButton b34;
    private javax.swing.JButton b35;
    private javax.swing.JButton b36;
    private javax.swing.JButton b37;
    private javax.swing.JButton b38;
    private javax.swing.JButton b41;
    private javax.swing.JButton b42;
    private javax.swing.JButton b43;
    private javax.swing.JButton b44;
    private javax.swing.JButton b45;
    private javax.swing.JButton b46;
    private javax.swing.JButton b47;
    private javax.swing.JButton b48;
    private javax.swing.JButton b51;
    private javax.swing.JButton b52;
    private javax.swing.JButton b53;
    private javax.swing.JButton b54;
    private javax.swing.JButton b55;
    private javax.swing.JButton b56;
    private javax.swing.JButton b57;
    private javax.swing.JButton b58;
    private javax.swing.JButton b61;
    private javax.swing.JButton b62;
    private javax.swing.JButton b63;
    private javax.swing.JButton b64;
    private javax.swing.JButton b65;
    private javax.swing.JButton b66;
    private javax.swing.JButton b67;
    private javax.swing.JButton b68;
    private javax.swing.JButton b71;
    private javax.swing.JButton b72;
    private javax.swing.JButton b73;
    private javax.swing.JButton b74;
    private javax.swing.JButton b75;
    private javax.swing.JButton b76;
    private javax.swing.JButton b77;
    private javax.swing.JButton b78;
    private javax.swing.JButton b81;
    private javax.swing.JButton b82;
    private javax.swing.JButton b83;
    private javax.swing.JButton b84;
    private javax.swing.JButton b85;
    private javax.swing.JButton b86;
    private javax.swing.JButton b87;
    private javax.swing.JButton b88;
    private javax.swing.JButton bbc;
    private javax.swing.JButton bbe;
    private javax.swing.JButton bbh;
    private javax.swing.JButton bbk;
    private javax.swing.JButton bbp;
    private javax.swing.JButton bbq;
    private javax.swing.JButton bnull;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton bwc;
    private javax.swing.JButton bwe;
    private javax.swing.JButton bwh;
    private javax.swing.JButton bwk;
    private javax.swing.JButton bwp;
    private javax.swing.JButton bwq;
    private javax.swing.JPanel helpButtonPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jl1;
    private javax.swing.JLabel jl10;
    private javax.swing.JLabel jl11;
    private javax.swing.JLabel jl12;
    private javax.swing.JLabel jl13;
    private javax.swing.JLabel jl14;
    private javax.swing.JLabel jl15;
    private javax.swing.JLabel jl16;
    private javax.swing.JLabel jl17;
    private javax.swing.JLabel jl18;
    private javax.swing.JLabel jl19;
    private javax.swing.JLabel jl2;
    private javax.swing.JLabel jl20;
    private javax.swing.JLabel jl21;
    private javax.swing.JLabel jl22;
    private javax.swing.JLabel jl23;
    private javax.swing.JLabel jl24;
    private javax.swing.JLabel jl25;
    private javax.swing.JLabel jl26;
    private javax.swing.JLabel jl27;
    private javax.swing.JLabel jl28;
    private javax.swing.JLabel jl29;
    private javax.swing.JLabel jl3;
    private javax.swing.JLabel jl30;
    private javax.swing.JLabel jl4;
    private javax.swing.JLabel jl5;
    private javax.swing.JLabel jl6;
    private javax.swing.JLabel jl7;
    private javax.swing.JLabel jl8;
    private javax.swing.JLabel jl9;
    private javax.swing.JLabel labelTurn;
    private javax.swing.JLabel outedIcon;
    private javax.swing.JPanel timerPanel;
    private javax.swing.JLabel turnLabel;
    // End of variables declaration//GEN-END:variables

    
    
    void bArray()
    {
        b[1][1]=b11;
        b[1][2]=b12;
        b[1][3]=b13;
        b[1][4]=b14;
        b[1][5]=b15;
        b[1][6]=b16;
        b[1][7]=b17;
        b[1][8]=b18;
        
        b[2][1]=b21;
        b[2][2]=b22;
        b[2][3]=b23;
        b[2][4]=b24;
        b[2][5]=b25;
        b[2][6]=b26;
        b[2][7]=b27;
        b[2][8]=b28;
        
        b[3][1]=b31;
        b[3][2]=b32;
        b[3][3]=b33;
        b[3][4]=b34;
        b[3][5]=b35;
        b[3][6]=b36;
        b[3][7]=b37;
        b[3][8]=b38;
        
        b[4][1]=b41;
        b[4][2]=b42;
        b[4][3]=b43;
        b[4][4]=b44;
        b[4][5]=b45;
        b[4][6]=b46;
        b[4][7]=b47;
        b[4][8]=b48;
        
        b[5][1]=b51;
        b[5][2]=b52;
        b[5][3]=b53;
        b[5][4]=b54;
        b[5][5]=b55;
        b[5][6]=b56;
        b[5][7]=b57;
        b[5][8]=b58;
        
        b[6][1]=b61;
        b[6][2]=b62;
        b[6][3]=b63;
        b[6][4]=b64;
        b[6][5]=b65;
        b[6][6]=b66;
        b[6][7]=b67;
        b[6][8]=b68;
        
        b[7][1]=b71;
        b[7][2]=b72;
        b[7][3]=b73;
        b[7][4]=b74;
        b[7][5]=b75;
        b[7][6]=b76;
        b[7][7]=b77;
        b[7][8]=b78;
        
        b[8][1]=b81;
        b[8][2]=b82;
        b[8][3]=b83;
        b[8][4]=b84;
        b[8][5]=b85;
        b[8][6]=b86;
        b[8][7]=b87;
        b[8][8]=b88;
        
        //Label for outed Icons
        
        label[1]=jl1;
        label[2]=jl2;
        label[3]=jl3;
        label[4]=jl4;
        label[5]=jl5;
        
        label[6]=jl6;
        label[7]=jl7;
        label[8]=jl8;
        label[9]=jl9;
        label[10]=jl10;
        
        label[11]=jl11;
        label[12]=jl12;
        label[13]=jl13;
        label[14]=jl14;
        label[15]=jl15;
        
        label[16]=jl16;
        label[17]=jl17;
        label[18]=jl18;
        label[19]=jl19;
        label[20]=jl20;
        
        label[21]=jl21;
        label[22]=jl22;
        label[23]=jl23;
        label[24]=jl24;
        label[25]=jl25;
        
        label[26]=jl26;
        label[27]=jl27;
        label[28]=jl28;
        label[29]=jl29;
        label[30]=jl30;
        
     
        for(int i=0;i<9;i++)  // button status for  movement
            for(int j=0;j<9;j++)
                bs[i][j]=0;
        
        for(int i=0;i<9;i++)  // for set the king move i.e. can king move to the next step?
            for(int j=1;j<9;j++){
                kingCheck[i][j]=0;
            }
    }
    
    void move(JButton b1,JButton b2){
         Icon buttonIcon = b1.getIcon();
         
         if(b2.getIcon()!=null){
             Icon buttonIcon2 = b2.getIcon();
                
                for(int i=1;i<31;i++){
                    if(label[i].getIcon()==null){
                        label[i].setIcon(buttonIcon2);
                        b2.setIcon(buttonIcon);
                        b1.setIcon(null);
                        
                        if(buttonIcon.toString().equals(bwk.getIcon().toString())){ //if checked king(the king which already have check) move from its place
                            if(whiteKingCheck==1)
                                 whiteKingCheck--;
                        }
                         if(buttonIcon.toString().equals(bbk.getIcon().toString())){ //if checked king(the king which already have check) move from its place
                            if(blackKingCheck==1)
                                 blackKingCheck--;
                        }
                        break;
                    }
                }
             
         }
         else{
            b2.setIcon(buttonIcon);
            b1.setIcon(null);
             if(buttonIcon.toString().equals(bwk.getIcon().toString())){//if checked king(the king which already have check) move from its place
                      if(whiteKingCheck==1)
                         whiteKingCheck--;
                }
             if(buttonIcon.toString().equals(bbk.getIcon().toString())){ //if checked king(the king which already have check) move from its place
                            if(blackKingCheck==1)
                                 blackKingCheck--;
                        }
         }
    }
      
           
 //for set chess boxes color after each move   
    void setChessBoxesColor(){
        
        int i,j;
        
        for(i=1;i<9;i++)
            for(j=1;j<9;j++){
                if((i%2==0&&j%2==0)||(i%2!=0&&j%2!=0)){
                    b[i][j].setBackground(Color.white);
                }
                else{
                    b[i][j].setBackground(Color.black);
                }
            }
        
          for(i=0;i<9;i++)  // button status 
            for(j=0;j<9;j++)
                bs[i][j]=0;
          
           for( i=0;i<9;i++)  // for set the king move i.e. can king move to the next step?
            for( j=1;j<9;j++){
                kingCheck[i][j]=0;
            }
    }
    
  
    
    void isWhiteKingCheck( Icon buttonIcon ,int i,int j){
        int wKingHelper[][] = new int[9][9]; // for detecting button that on which button king have check
        
        for(int k=1;k<9;k++)
            for(int l=1;l<9;l++)
                wKingHelper[k][l]=0;
        
        iconMatching(buttonIcon,i,j);
 ////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////    
        for(i=1;i<9;i++)
            for(j=1;j<9;j++){
                
               if(b[i][j].getIcon()!=null){ 
                        if(  bwk.getIcon().toString().equals(b[i][j].getIcon().toString()) ) {
                               if(bs[i][j]==2 ){
                                wKingHelper[i][j]=1;   // asign "1" to button position on which king have check
                            }
                        }
               }   
            }
////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////
      for(i=1;i<9;i++)
            for(j=1;j<9;j++){
                
               if(b[i][j].getIcon()!=null){ 
                        if(  bwk.getIcon().toString().equals(b[i][j].getIcon().toString()) ) {
                            if(wKingHelper[i][j]==1 ){
                                    setChessBoxesColor();
                                    b[i][j].setBackground(Color.red);
                                    whiteKingCheck=1;
                                    break;
                            }
                        }

                      else{
                            setChessBoxesColor();
                        }
               }       
            }
    }
    
    void isBlackKingCheck( Icon buttonIcon ,int i,int j){
                int bKingHelper[][] = new int[9][9]; // for detecting button that on which button king have check

                for(int k=1;k<9;k++)
                    for(int l=1;l<9;l++)
                        bKingHelper[k][l]=0;

                iconMatching(buttonIcon,i,j);
             ////////////////////////////////////////////////////////////////////////////////////////
            ////////////////////////////////////////////////////////////////////////////////////////////    
                for(i=1;i<9;i++)
                    for(j=1;j<9;j++){

                       if(b[i][j].getIcon()!=null){ 
                                if(  bbk.getIcon().toString().equals(b[i][j].getIcon().toString()) ) {
                                       if(bs[i][j]==2 ){
                                        bKingHelper[i][j]=1;   // asign "1" to button position on which king have check
                                    }
                                }
                       }   
                    }
             ////////////////////////////////////////////////////////////////////////////////////////////////////
             ///////////////////////////////////////////////////////////////////////////////////////////////////
              for(i=1;i<9;i++)
                    for(j=1;j<9;j++){

                       if(b[i][j].getIcon()!=null){ 
                                if(  bbk.getIcon().toString().equals(b[i][j].getIcon().toString()) ) {
                                    if(bKingHelper[i][j]==1 ){
                                            setChessBoxesColor();
                                            b[i][j].setBackground(Color.red);
                                            blackKingCheck=1;
                                            break;
                                    }
                                }

                              else{
                                    setChessBoxesColor();
                                }
                       }       
                    }
    }
    
    boolean turn(Icon buttonIcon){   //to detect which one has turn now
        
                if(    (  ( buttonIcon.toString().equals(bbp.getIcon().toString()) ) ||
                          ( buttonIcon.toString().equals(bbe.getIcon().toString()) ) || 
                          ( buttonIcon.toString().equals(bbh.getIcon().toString()) ) ||
                          ( buttonIcon.toString().equals(bbc.getIcon().toString()) ) ||
                          ( buttonIcon.toString().equals(bbq.getIcon().toString()) ) ||
                          ( buttonIcon.toString().equals(bbk.getIcon().toString()) )     )&&(iconTurn==0) // iconTurn=0 for Black
                 ){
                    
                    return true;
                }

                if(    (  ( buttonIcon.toString().equals(bwp.getIcon().toString()) ) ||
                          ( buttonIcon.toString().equals(bwe.getIcon().toString()) ) || 
                          ( buttonIcon.toString().equals(bwh.getIcon().toString()) ) ||
                          ( buttonIcon.toString().equals(bwc.getIcon().toString()) ) ||
                          ( buttonIcon.toString().equals(bwq.getIcon().toString()) ) ||
                          ( buttonIcon.toString().equals(bwk.getIcon().toString()) )     )&&(iconTurn==1) // iconTurn=0 for Black
                 ){
                    
                    return true;
                }
                
                if(      ( buttonIcon.toString().equals(bbp.getIcon().toString()) ) ||
                          ( buttonIcon.toString().equals(bbe.getIcon().toString()) ) || 
                          ( buttonIcon.toString().equals(bbh.getIcon().toString()) ) ||
                          ( buttonIcon.toString().equals(bbc.getIcon().toString()) ) ||
                          ( buttonIcon.toString().equals(bbq.getIcon().toString()) ) ||
                          ( buttonIcon.toString().equals(bbk.getIcon().toString()) )   
                 ){
                    JOptionPane.showMessageDialog(null, "this is WHITE's turn");
                }
                 if( (( buttonIcon.toString().equals(bwp.getIcon().toString()) ) ||
                          ( buttonIcon.toString().equals(bwe.getIcon().toString()) ) || 
                          ( buttonIcon.toString().equals(bwh.getIcon().toString()) ) ||
                          ( buttonIcon.toString().equals(bwc.getIcon().toString()) ) ||
                          ( buttonIcon.toString().equals(bwq.getIcon().toString()) ) ||
                          ( buttonIcon.toString().equals(bwk.getIcon().toString()) )  )
                 ){
                   JOptionPane.showMessageDialog(null, "this is BLACK's turn");
                }
        return false;                                         
    }
    
    void iconMatching( Icon bi,int i,int j){
        int whiteKingVisited=0;
        int blackKingVisited=0;
                
        bs[i][j]=1; //button status i.e. this button is sourse for movable button
        
        /*######################################################################################################*/
        /*                                     BLACK ICON MOVEMENT                                              */                      
        /*######################################################################################################*/
        
        
        
        
                    /*************************************************************************/        
                                         //for black KING movement
                    /*************************************************************************/
                      
                    if(bi.toString().equals( bbk.getIcon().toString() ) ){
                        blackKingVisited=1;
                        int canMove=0;
                        blackKingNextMoveCheck();
                           /******************************/
                            //north direction movement
                         /*****************************/
                                    int north=i-1;
                                    if(north>=1){
                                        
                                             if(b[north][j].getIcon()==null && kingCheck[north][j]==0){
                                                 b[north][j].setBackground(Color.red);
                                                 bs[north][j]=2;
                                                 canMove=1;
                                             }
                                             if(b[north][j].getIcon()!=null && kingCheck[north][j]==0){ //kill white icon
                                                            if(    ( b[north][j].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                   ( b[north][j].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                   ( b[north][j].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                   ( b[north][j].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                   ( b[north][j].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                   ( b[north][j].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                    ){
                                                                  b[north][j].setBackground(Color.red);
                                                                  bs[north][j]=2;
                                                                  canMove=1;
                                                                  
                                                            }
                                             }
                                    }
                                    
                             /**************************/
                                    //south direction move
                                /*************************/
                                    int south=i+1;
                                    if(south<=8){
                                        
                                             if(b[south][j].getIcon()==null && kingCheck[south][j]==0){
                                                 b[south][j].setBackground(Color.red);
                                                 bs[south][j]=2;
                                                 canMove=1;
                                             }
                                             if(b[south][j].getIcon()!=null && kingCheck[south][j]==0){ //kill white icon
                                                            if(    ( b[south][j].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                   ( b[south][j].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                   ( b[south][j].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                   ( b[south][j].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                   ( b[south][j].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                   ( b[south][j].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                    ){
                                                                  b[south][j].setBackground(Color.red);
                                                                  bs[south][j]=2;
                                                                  canMove=1;
                                                                  
                                                            }
                                             }
                                    }
                                    
                                    /***********************/    
                                  //Left direction movement
                                /***********************/
                                    int left=j-1;
                                    if(left>=1){
                                        
                                             if(b[i][left].getIcon()==null && kingCheck[i][left]==0){
                                                 b[i][left].setBackground(Color.red);
                                                 bs[i][left]=2;
                                                 canMove=1;
                                             }
                                             if(b[i][left].getIcon()!=null && kingCheck[i][left]==0){ //kill white icon
                                                            if(    ( b[i][left].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                   ( b[i][left].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                   ( b[i][left].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                   ( b[i][left].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                   ( b[i][left].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                   ( b[i][left].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                    ){
                                                                  b[i][left].setBackground(Color.red);
                                                                  bs[i][left]=2;
                                                                  canMove=1;
                                                                 
                                                            }
                                             }
                                    }    
                                    
                                 /************************/   
                                     //Right direction movement
                                 /************************/
                                    int right=j+1;
                                    if(right<=8){
                                        
                                             if(b[i][right].getIcon()==null && kingCheck[i][right]==0){
                                                 b[i][right].setBackground(Color.red);
                                                 bs[i][right]=2;
                                                 canMove=1;
                                             }
                                             if(b[i][right].getIcon()!=null && kingCheck[i][right]==0){ //kill white icon
                                                            if(    ( b[i][right].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                   ( b[i][right].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                   ( b[i][right].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                   ( b[i][right].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                   ( b[i][right].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                   ( b[i][right].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                    ){
                                                                  b[i][right].setBackground(Color.red);
                                                                  bs[i][right]=2;
                                                                  canMove=1;
                                                                  
                                                            }
                                             }
                                    }
                                    
                                    /**********************/
                                        //north-Left-move
                                    /**********************/
                                         north=j-1;
                                        left=i-1;
                                        if(left>=1&&north>=1){

                                                      if(b[left][north].getIcon()==null && kingCheck[left][north]==0){
                                                           b[left][north].setBackground(Color.red);
                                                           bs[left][north]=2;
                                                           canMove=1;
                                                      }

                                                       if(b[left][north].getIcon()!=null && kingCheck[left][north]==0){ //kill white icon
                                                                                  if(    ( b[left][north].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                         ( b[left][north].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                         ( b[left][north].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                         ( b[left][north].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                         ( b[left][north].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                                         ( b[left][north].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                          ){
                                                                                        b[left][north].setBackground(Color.red);
                                                                                        bs[left][north]=2;
                                                                                        canMove=1;
                                                                                        
                                                                                  }
                                                                   }
                                        } 
                                        
                                        /***********************/
                                          //north-Right-move
                                        /***********************/
                                        north=i-1;
                                        right=j+1;
                                        if(north>=1&&right<=8){

                                                      if(b[north][right].getIcon()==null && kingCheck[north][right]==0){
                                                           b[north][right].setBackground(Color.red);
                                                           bs[north][right]=2;
                                                           canMove=1;
                                                      }

                                                       if(b[north][right].getIcon()!=null && kingCheck[north][right]==0){ //kill white icon
                                                                                  if(    ( b[north][right].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                         ( b[north][right].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                         ( b[north][right].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                         ( b[north][right].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                         ( b[north][right].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                                         ( b[north][right].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                          ){
                                                                                        b[north][right].setBackground(Color.red);
                                                                                        bs[north][right]=2;
                                                                                        canMove=1;
                                                                                        
                                                                                  }
                                                                   }
                                        }
                                        
                                         /**********************/
                                         //south-Left-move
                                        /*********************/
                                        south=j-1;
                                        left=i+1;
                                        if(left<=8&&south>=1){

                                                      if(b[left][south].getIcon()==null && kingCheck[left][south]==0){
                                                           b[left][south].setBackground(Color.red);
                                                           bs[left][south]=2;
                                                           canMove=1;
                                                      }

                                                       if(b[left][south].getIcon()!=null && kingCheck[left][south]==0){ //kill white icon
                                                                                  if(    ( b[left][south].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                         ( b[left][south].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                         ( b[left][south].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                         ( b[left][south].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                         ( b[left][south].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                                         ( b[left][south].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                          ){
                                                                                        b[left][south].setBackground(Color.red);
                                                                                        bs[left][south]=2;
                                                                                        canMove=1;
                                                                                        
                                                                                  }
                                                                   }
                                        }
                                        
                                         /************************/
                                            //south-Right-move
                                        /*************************/
                                        south=i+1;
                                        right=j+1;
                                        if(south<=8&&right<=8){

                                                      if(b[south][right].getIcon()==null && kingCheck[south][right]==0){
                                                           b[south][right].setBackground(Color.red);
                                                           bs[south][right]=2;
                                                           canMove=1;
                                                      }

                                                       if(b[south][right].getIcon()!=null && kingCheck[south][right]==0){ //kill white icon
                                                                                  if(    ( b[south][right].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                         ( b[south][right].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                         ( b[south][right].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                         ( b[south][right].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                         ( b[south][right].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                                         ( b[south][right].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                          ){
                                                                                        b[south][right].setBackground(Color.red);
                                                                                        bs[south][right]=2;
                                                                                        canMove=1;
                                                                                        
                                                                                  }
                                                                   }
                                        }
                                        
                                         if(canMove==0 && blackKingCheck==1){
                                            JOptionPane.showMessageDialog(null, "Check&Mate");
                                            String time = jLabelTime.getText();
                                            WhiteWinFrame WWF=new WhiteWinFrame(time);
                                            WWF.setVisible(true);
                                             
                                            this.setVisible(false);
                                            
                                        }
                                    
                                    
                       }
        
        if(blackKingCheck==0){
        /**************************************************************************/       
                                         //for black pawn movement
        /**************************************************************************/
                       if(bi.toString().equals( bbp.getIcon().toString() ) ){   
                           if(i>1){
                               
                                        if(i==7){//pawn can move two stap if yet it not move even once
                                            if(b[i-1][j].getIcon()==null && b[i-2][j].getIcon()==null){
                                                 b[i-1][j].setBackground(Color.red);
                                                  b[i-2][j].setBackground(Color.red);
                                                  bs[i-1][j]=2; //destination button for movable icon
                                                  bs[i-2][j]=2;
                                            }
                                        }
                                        
                        //if destination button contain null i.e. nothing on it
                                        if(b[i-1][j].getIcon()==null){
                                            b[i-1][j].setBackground(Color.red);
                                            bs[i-1][j]=2; //destination button for movable icon
                                        }  

                        //if destination button contain white icon then black pawn can kill white icon (right ahead diagonal destination button)                
                                        if(j<8){
                                                if(b[i-1][j+1].getIcon()!=null){
                                                        if( ( b[i-1][j+1].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                               ( b[i-1][j+1].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                               ( b[i-1][j+1].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                              ( b[i-1][j+1].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                               ( b[i-1][j+1].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                               ( b[i-1][j+1].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                ){
                                                              b[i-1][j+1].setBackground(Color.red);
                                                              bs[i-1][j+1]=2;
                                                        }
                                                }                                        
                                        }
                        //if destination button contain white icon then black pawn can kill white icon (leftt ahead diagonal destination button)                                
                                         if(j>1){
                                                        if(b[i-1][j-1].getIcon()!=null){
                                                            if( ( b[i-1][j-1].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                   ( b[i-1][j-1].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                   ( b[i-1][j-1].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                  ( b[i-1][j-1].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                   ( b[i-1][j-1].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                   ( b[i-1][j-1].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                    ){
                                                                  b[i-1][j-1].setBackground(Color.red);
                                                                  bs[i-1][j-1]=2;
                                                            }
                                                        }
                                                }                                       
                                  }                                
                       }
                       

                       
        /*****************************************************************************/        
                                         //for black elephant movement
        /*****************************************************************************/
                       if(bi.toString().equals( bbe.getIcon().toString() ) ){
                           
                                /********************************/
                                    //north direction movement
                                /******************************/
                                    int north=i-1;
                                    for(;north>=1;north--){
                                        
                                             if(b[north][j].getIcon()==null){
                                                 b[north][j].setBackground(Color.red);
                                                 bs[north][j]=2;
                                             }
                                             if(b[north][j].getIcon()!=null){ //kill white icon
                                                            if(    ( b[north][j].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                   ( b[north][j].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                   ( b[north][j].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                   ( b[north][j].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                   ( b[north][j].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                   ( b[north][j].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                    ){
                                                                  b[north][j].setBackground(Color.red);
                                                                  bs[north][j]=2;
                                                                  
                                                                  break;
                                                            }
                                             }
                                             
                                             if(b[north][j].getIcon()!=null){  //stop when black icon in the path
                                                            if(    ( b[north][j].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                   ( b[north][j].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                   ( b[north][j].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                   ( b[north][j].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                   ( b[north][j].getIcon().toString().equals(bbq.getIcon().toString()) ) ||
                                                                   ( b[north][j].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                    ){
                                                                
                                                                  break;
                                                            }
                                             }
                                    }
                                
                                /**************************/
                                    //south direction move
                                /*************************/
                                    int south=i+1;
                                    for(;south<=8;south++){
                                        
                                             if(b[south][j].getIcon()==null){
                                                 b[south][j].setBackground(Color.red);
                                                 bs[south][j]=2;
                                             }
                                             if(b[south][j].getIcon()!=null){ //kill white icon
                                                            if(    ( b[south][j].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                   ( b[south][j].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                   ( b[south][j].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                   ( b[south][j].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                   ( b[south][j].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                   ( b[south][j].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                    ){
                                                                  b[south][j].setBackground(Color.red);
                                                                  bs[south][j]=2;
                                                                  
                                                                  break;
                                                            }
                                             }
                                             
                                             if(b[south][j].getIcon()!=null){//if button contain black icon
                                                            if(    ( b[south][j].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                   ( b[south][j].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                   ( b[south][j].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                   ( b[south][j].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                   ( b[south][j].getIcon().toString().equals(bbq.getIcon().toString()) ) ||
                                                                   ( b[south][j].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                    ){
                                                                
                                                                  break;
                                                            }
                                             }
                                    }
                                    
                                /***********************/    
                                 //Left direction movement
                                /***********************/
                                    int left=j-1;
                                    for(;left>=1;left--){
                                        
                                             if(b[i][left].getIcon()==null){
                                                 b[i][left].setBackground(Color.red);
                                                 bs[i][left]=2;
                                             }
                                             if(b[i][left].getIcon()!=null){ //kill white icon
                                                            if(    ( b[i][left].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                   ( b[i][left].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                   ( b[i][left].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                   ( b[i][left].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                   ( b[i][left].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                   ( b[i][left].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                    ){
                                                                  b[i][left].setBackground(Color.red);
                                                                  bs[i][left]=2;
                                                                  
                                                                  break;
                                                            }
                                             }
                                             
                                             if(b[i][left].getIcon()!=null){//if button contain black icon
                                                            if(    ( b[i][left].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                   ( b[i][left].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                   ( b[i][left].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                   ( b[i][left].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                   ( b[i][left].getIcon().toString().equals(bbq.getIcon().toString()) ) ||
                                                                   ( b[i][left].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                    ){
                                                                
                                                                  break;
                                                            }
                                             }
                                    }
                                 /************************/   
                                     //Right direction movement
                                 /************************/
                                    int right=j+1;
                                    for(;right<=8;right++){
                                        
                                             if(b[i][right].getIcon()==null){
                                                 b[i][right].setBackground(Color.red);
                                                 bs[i][right]=2;
                                             }
                                             if(b[i][right].getIcon()!=null){ //kill white icon
                                                            if(    ( b[i][right].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                   ( b[i][right].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                   ( b[i][right].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                   ( b[i][right].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                   ( b[i][right].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                   ( b[i][right].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                    ){
                                                                  b[i][right].setBackground(Color.red);
                                                                  bs[i][right]=2;
                                                                  
                                                                  break;
                                                            }
                                             }
                                             
                                             if(b[i][right].getIcon()!=null){//if button contain black icon
                                                            if(    ( b[i][right].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                   ( b[i][right].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                   ( b[i][right].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                   ( b[i][right].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                   ( b[i][right].getIcon().toString().equals(bbq.getIcon().toString()) ) ||
                                                                   ( b[i][right].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                    ){
                                                                
                                                                  break;
                                                            }
                                             }
                                    }
                           }
                       
                       
        /**************************************************************************/        
                                         //for black horse movement
        /**************************************************************************/ 
                      if(bi.toString().equals( bbh.getIcon().toString() ) ){
                          
                                //north move
                                int north=i-2;
                                
                                if(north>=1){

                                            int northRight=j+1;
                                            /*************************/
                                                //north Right move
                                             /***********************/
                                            if(northRight<=8){ 
                                                
                                                    if(b[north][northRight].getIcon()==null){
                                                        b[north][northRight].setBackground(Color.red);
                                                         bs[north][northRight]=2;
                                                    }

                                                    if(b[north][northRight].getIcon()!=null){ //kill white icon
                                                                    if(    ( b[north][northRight].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                           ( b[north][northRight].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                           ( b[north][northRight].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                           ( b[north][northRight].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                           ( b[north][northRight].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                           ( b[north][northRight].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                            ){
                                                                          b[north][northRight].setBackground(Color.red);
                                                                          bs[north][northRight]=2;

                                                                    }
                                                     }

                                            }
                                        
                                        /*************************/
                                            //north Left move
                                        /***********************/
                                            int northLeft=j-1;
                                            if(northLeft>=1){
                                                 if(b[north][northLeft].getIcon()==null){
                                                        b[north][northLeft].setBackground(Color.red);
                                                         bs[north][northLeft]=2;
                                                    }

                                                  if(b[north][northLeft].getIcon()!=null){ //kill white icon
                                                                    if(    ( b[north][northLeft].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                           ( b[north][northLeft].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                           ( b[north][northLeft].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                           ( b[north][northLeft].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                           ( b[north][northLeft].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                           ( b[north][northLeft].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                            ){
                                                                          b[north][northLeft].setBackground(Color.red);
                                                                          bs[north][northLeft]=2;

                                                                    }
                                                     }

                                            }
                                    
                                }
                                
                                 //south move
                                int south=i+2;
                                
                                if(south<=8){

                                            int southRight=j+1;
                                            /*************************/
                                                //south Right move
                                             /***********************/
                                            if(southRight<=8){ 
                                                
                                                    if(b[south][southRight].getIcon()==null){
                                                        b[south][southRight].setBackground(Color.red);
                                                         bs[south][southRight]=2;
                                                    }

                                                    if(b[south][southRight].getIcon()!=null){ //kill white icon
                                                                    if(    ( b[south][southRight].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                           ( b[south][southRight].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                           ( b[south][southRight].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                           ( b[south][southRight].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                           ( b[south][southRight].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                           ( b[south][southRight].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                            ){
                                                                          b[south][southRight].setBackground(Color.red);
                                                                          bs[south][southRight]=2;

                                                                    }
                                                     }

                                            }
                                            
                                        /*************************/
                                           //south Left move
                                        /***********************/
                                            int southLeft=j-1;
                                            if(southLeft>=1){
                                                 if(b[south][southLeft].getIcon()==null){
                                                        b[south][southLeft].setBackground(Color.red);
                                                         bs[south][southLeft]=2;
                                                    }

                                                  if(b[south][southLeft].getIcon()!=null){ //kill white icon
                                                                    if(    ( b[south][southLeft].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                           ( b[south][southLeft].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                           ( b[south][southLeft].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                           ( b[south][southLeft].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                           ( b[south][southLeft].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                           ( b[south][southLeft].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                            ){
                                                                          b[south][southLeft].setBackground(Color.red);
                                                                          bs[south][southLeft]=2;

                                                                    }
                                                     }

                                            }
                                    
                                }
                                
                                 //Left move
                                int left=j-2;
                                
                                if(left>=1){

                                            int leftUp=i-1;
                                            /*************************/
                                                //Left Up move
                                             /***********************/
                                            if(leftUp>=1){ 
                                               
                                                    if(b[leftUp][left].getIcon()==null){
                                                        b[leftUp][left].setBackground(Color.red);
                                                         bs[leftUp][left]=2;
                                                    }

                                                    if(b[leftUp][left].getIcon()!=null){ //kill white icon
                                                                    if(    ( b[leftUp][left].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                           ( b[leftUp][left].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                           ( b[leftUp][left].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                           ( b[leftUp][left].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                           ( b[leftUp][left].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                           ( b[leftUp][left].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                            ){
                                                                          b[leftUp][left].setBackground(Color.red);
                                                                          bs[leftUp][left]=2;
                                                                         
                                                                    }
                                                     }

                                            }

                                         /*************************/
                                                //Left down move
                                         /***********************/
                                            int leftDown=i+1;
                                            if(leftDown<=8){
                                                 if(b[leftDown][left].getIcon()==null){
                                                        b[leftDown][left].setBackground(Color.red);
                                                         bs[leftDown][left]=2;
                                                    }

                                                  if(b[leftDown][left].getIcon()!=null){ //kill white icon
                                                                    if(    ( b[leftDown][left].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                           ( b[leftDown][left].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                           ( b[leftDown][left].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                           ( b[leftDown][left].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                           ( b[leftDown][left].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                           ( b[leftDown][left].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                            ){
                                                                          b[leftDown][left].setBackground(Color.red);
                                                                          bs[leftDown][left]=2;

                                                                    }
                                                     }

                                            }
                                    
                                }
                                
                                //right move
                                int right=j+2;
                                
                                if(right<=8){

                                            int rightUp=i-1;
                                             /*************************/
                                                //Right Up move
                                             /***********************/
                                            if(rightUp>=1){ 
                                                 
                                                    if(b[rightUp][right].getIcon()==null){
                                                        b[rightUp][right].setBackground(Color.red);
                                                         bs[rightUp][right]=2;
                                                    }

                                                    if(b[rightUp][right].getIcon()!=null){ //kill white icon
                                                                    if(    ( b[rightUp][right].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                           ( b[rightUp][right].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                           ( b[rightUp][right].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                           ( b[rightUp][right].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                           ( b[rightUp][right].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                           ( b[rightUp][right].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                            ){
                                                                          b[rightUp][right].setBackground(Color.red);
                                                                          bs[rightUp][right]=2;
                                                                          
                                                                    }
                                                     }

                                            }

                                         /*************************/
                                                //Right down move
                                          /***********************/
                                            int rightDown=i+1;
                                            if(rightDown<=8){
                                                 if(b[rightDown][right].getIcon()==null){
                                                        b[rightDown][right].setBackground(Color.red);
                                                         bs[rightDown][right]=2;
                                                    }

                                                  if(b[rightDown][right].getIcon()!=null){ //kill white icon
                                                                    if(    ( b[rightDown][right].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                           ( b[rightDown][right].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                           ( b[rightDown][right].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                           ( b[rightDown][right].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                           ( b[rightDown][right].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                           ( b[rightDown][right].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                            ){
                                                                          b[rightDown][right].setBackground(Color.red);
                                                                          bs[rightDown][right]=2;

                                                                    }
                                                     }

                                            }
                                    
                                }

                       }
                     
                      
        /*************************************************************************/        
                                         //for black camel movement
        /*************************************************************************/ 
                      if(bi.toString().equals( bbc.getIcon().toString() ) ){
                                        //there will be 4 direction move
                                        // northLeftMove,northRightMove,southLeftMove,southRightMove

                                    /**********************/
                                        //north-Left-move
                                    /**********************/
                                        int north=j-1;
                                        int left=i-1;
                                        while(left>=1&&north>=1){

                                                      if(b[left][north].getIcon()==null){
                                                           b[left][north].setBackground(Color.red);
                                                           bs[left][north]=2;
                                                      }

                                                       if(b[left][north].getIcon()!=null){ //kill white icon
                                                                                  if(    ( b[left][north].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                         ( b[left][north].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                         ( b[left][north].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                         ( b[left][north].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                         ( b[left][north].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                                         ( b[left][north].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                          ){
                                                                                        b[left][north].setBackground(Color.red);
                                                                                        bs[left][north]=2;

                                                                                        break;
                                                                                  }
                                                                   }

                                                                   if(b[left][north].getIcon()!=null){  //stop when black icon in the path
                                                                                  if(    ( b[left][north].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                         ( b[left][north].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                         ( b[left][north].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                         ( b[left][north].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                         ( b[left][north].getIcon().toString().equals(bbq.getIcon().toString()) ) ||
                                                                                         ( b[left][north].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                          ){

                                                                                        break;
                                                                                  }
                                                                   }

                                                      north--;
                                                      left--;
                                        }
                                        
                                        /***********************/
                                          //north-Right-move
                                        /***********************/
                                        north=i-1;
                                        int right=j+1;
                                        while(north>=1&&right<=8){

                                                      if(b[north][right].getIcon()==null){
                                                           b[north][right].setBackground(Color.red);
                                                           bs[north][right]=2;
                                                      }

                                                       if(b[north][right].getIcon()!=null){ //kill white icon
                                                                                  if(    ( b[north][right].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                         ( b[north][right].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                         ( b[north][right].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                         ( b[north][right].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                         ( b[north][right].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                                         ( b[north][right].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                          ){
                                                                                        b[north][right].setBackground(Color.red);
                                                                                        bs[north][right]=2;

                                                                                        break;
                                                                                  }
                                                                   }

                                                                   if(b[north][right].getIcon()!=null){  //stop when black icon in the path
                                                                                  if(    ( b[north][right].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                         ( b[north][right].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                         ( b[north][right].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                         ( b[north][right].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                         ( b[north][right].getIcon().toString().equals(bbq.getIcon().toString()) ) ||
                                                                                         ( b[north][right].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                          ){

                                                                                        break;
                                                                                  }
                                                                   }

                                                      north--;
                                                      right++;
                                        }
                                        
                                        /**********************/
                                         //south-Left-move
                                        /*********************/
                                        int south=j-1;
                                        left=i+1;
                                        while(left<=8&&south>=1){

                                                      if(b[left][south].getIcon()==null){
                                                           b[left][south].setBackground(Color.red);
                                                           bs[left][south]=2;
                                                      }

                                                       if(b[left][south].getIcon()!=null){ //kill white icon
                                                                                  if(    ( b[left][south].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                         ( b[left][south].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                         ( b[left][south].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                         ( b[left][south].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                         ( b[left][south].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                                         ( b[left][south].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                          ){
                                                                                        b[left][south].setBackground(Color.red);
                                                                                        bs[left][south]=2;

                                                                                        break;
                                                                                  }
                                                                   }

                                                                   if(b[left][south].getIcon()!=null){  //stop when black icon in the path
                                                                                  if(    ( b[left][south].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                         ( b[left][south].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                         ( b[left][south].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                         ( b[left][south].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                         ( b[left][south].getIcon().toString().equals(bbq.getIcon().toString()) ) ||
                                                                                         ( b[left][south].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                          ){

                                                                                        break;
                                                                                  }
                                                                   }

                                                      south--;
                                                      left++;
                                        }
                                        /************************/
                                            //south-Rightt-move
                                        /*************************/
                                        south=i+1;
                                        right=j+1;
                                        while(south<=8&&right<=8){

                                                      if(b[south][right].getIcon()==null){
                                                           b[south][right].setBackground(Color.red);
                                                           bs[south][right]=2;
                                                      }

                                                       if(b[south][right].getIcon()!=null){ //kill white icon
                                                                                  if(    ( b[south][right].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                         ( b[south][right].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                         ( b[south][right].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                         ( b[south][right].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                         ( b[south][right].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                                         ( b[south][right].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                          ){
                                                                                        b[south][right].setBackground(Color.red);
                                                                                        bs[south][right]=2;

                                                                                        break;
                                                                                  }
                                                                   }

                                                                   if(b[south][right].getIcon()!=null){  //stop when black icon in the path
                                                                                  if(    ( b[south][right].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                         ( b[south][right].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                         ( b[south][right].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                         ( b[south][right].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                         ( b[south][right].getIcon().toString().equals(bbq.getIcon().toString()) ) ||
                                                                                         ( b[south][right].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                          ){

                                                                                        break;
                                                                                  }
                                                                   }

                                                      south++;
                                                      right++;
                                        }
                      }
                      
                      
        /*************************************************************************/        
                                         //for black queen movement
        /*************************************************************************/ 
                      
                     if(bi.toString().equals( bbq.getIcon().toString() ) ){
                       
                         //There will be 8 direction monements
                         
                         //north,south,left,right
                         //north-left,north-right,south-left,south-right
                         
                         /******************************/
                            //north direction movement
                         /*****************************/
                                    int north=i-1;
                                    for(;north>=1;north--){
                                        
                                             if(b[north][j].getIcon()==null){
                                                 b[north][j].setBackground(Color.red);
                                                 bs[north][j]=2;
                                             }
                                             if(b[north][j].getIcon()!=null){ //kill white icon
                                                            if(    ( b[north][j].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                   ( b[north][j].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                   ( b[north][j].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                   ( b[north][j].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                   ( b[north][j].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                   ( b[north][j].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                    ){
                                                                  b[north][j].setBackground(Color.red);
                                                                  bs[north][j]=2;
                                                                  
                                                                  break;
                                                            }
                                             }
                                             
                                             if(b[north][j].getIcon()!=null){  //stop when black icon in the path
                                                            if(    ( b[north][j].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                   ( b[north][j].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                   ( b[north][j].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                   ( b[north][j].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                   ( b[north][j].getIcon().toString().equals(bbq.getIcon().toString()) ) ||
                                                                   ( b[north][j].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                    ){
                                                                
                                                                  break;
                                                            }
                                             }
                                    }
                                    
                                /**************************/
                                    //south direction move
                                /*************************/
                                    int south=i+1;
                                    for(;south<=8;south++){
                                        
                                             if(b[south][j].getIcon()==null){
                                                 b[south][j].setBackground(Color.red);
                                                 bs[south][j]=2;
                                             }
                                             if(b[south][j].getIcon()!=null){ //kill white icon
                                                            if(    ( b[south][j].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                   ( b[south][j].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                   ( b[south][j].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                   ( b[south][j].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                   ( b[south][j].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                   ( b[south][j].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                    ){
                                                                  b[south][j].setBackground(Color.red);
                                                                  bs[south][j]=2;
                                                                  
                                                                  break;
                                                            }
                                             }
                                             
                                             if(b[south][j].getIcon()!=null){//if button contain black icon
                                                            if(    ( b[south][j].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                   ( b[south][j].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                   ( b[south][j].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                   ( b[south][j].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                   ( b[south][j].getIcon().toString().equals(bbq.getIcon().toString()) ) ||
                                                                   ( b[south][j].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                    ){
                                                                
                                                                  break;
                                                            }
                                             }
                                    }
                                    
                                /***********************/    
                                  //Left direction movement
                                /***********************/
                                    int left=j-1;
                                    for(;left>=1;left--){
                                        
                                             if(b[i][left].getIcon()==null){
                                                 b[i][left].setBackground(Color.red);
                                                 bs[i][left]=2;
                                             }
                                             if(b[i][left].getIcon()!=null){ //kill white icon
                                                            if(    ( b[i][left].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                   ( b[i][left].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                   ( b[i][left].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                   ( b[i][left].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                   ( b[i][left].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                   ( b[i][left].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                    ){
                                                                  b[i][left].setBackground(Color.red);
                                                                  bs[i][left]=2;
                                                                  
                                                                  break;
                                                            }
                                             }
                                             
                                             if(b[i][left].getIcon()!=null){//if button contain black icon
                                                            if(    ( b[i][left].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                   ( b[i][left].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                   ( b[i][left].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                   ( b[i][left].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                   ( b[i][left].getIcon().toString().equals(bbq.getIcon().toString()) ) ||
                                                                   ( b[i][left].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                    ){
                                                                
                                                                  break;
                                                            }
                                             }
                                    }
                                    
                                 /************************/   
                                     //Right direction movement
                                 /************************/
                                    int right=j+1;
                                    for(;right<=8;right++){
                                        
                                             if(b[i][right].getIcon()==null){
                                                 b[i][right].setBackground(Color.red);
                                                 bs[i][right]=2;
                                             }
                                             if(b[i][right].getIcon()!=null){ //kill white icon
                                                            if(    ( b[i][right].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                   ( b[i][right].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                   ( b[i][right].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                   ( b[i][right].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                   ( b[i][right].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                   ( b[i][right].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                    ){
                                                                  b[i][right].setBackground(Color.red);
                                                                  bs[i][right]=2;
                                                                  
                                                                  break;
                                                            }
                                             }
                                             
                                             if(b[i][right].getIcon()!=null){//if button contain black icon
                                                            if(    ( b[i][right].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                   ( b[i][right].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                   ( b[i][right].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                   ( b[i][right].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                   ( b[i][right].getIcon().toString().equals(bbq.getIcon().toString()) ) ||
                                                                   ( b[i][right].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                    ){
                                                                
                                                                  break;
                                                            }
                                             }
                                    }
                                    
                                    /**********************/
                                        //north-Left-move
                                    /**********************/
                                         north=j-1;
                                        left=i-1;
                                        while(left>=1&&north>=1){

                                                      if(b[left][north].getIcon()==null){
                                                           b[left][north].setBackground(Color.red);
                                                           bs[left][north]=2;
                                                      }

                                                       if(b[left][north].getIcon()!=null){ //kill white icon
                                                                                  if(    ( b[left][north].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                         ( b[left][north].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                         ( b[left][north].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                         ( b[left][north].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                         ( b[left][north].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                                         ( b[left][north].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                          ){
                                                                                        b[left][north].setBackground(Color.red);
                                                                                        bs[left][north]=2;

                                                                                        break;
                                                                                  }
                                                                   }

                                                                   if(b[left][north].getIcon()!=null){  //stop when black icon in the path
                                                                                  if(    ( b[left][north].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                         ( b[left][north].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                         ( b[left][north].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                         ( b[left][north].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                         ( b[left][north].getIcon().toString().equals(bbq.getIcon().toString()) ) ||
                                                                                         ( b[left][north].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                          ){

                                                                                        break;
                                                                                  }
                                                                   }

                                                      north--;
                                                      left--;
                                        }
                                        
                                        /***********************/
                                          //north-Right-move
                                        /***********************/
                                        north=i-1;
                                        right=j+1;
                                        while(north>=1&&right<=8){

                                                      if(b[north][right].getIcon()==null){
                                                           b[north][right].setBackground(Color.red);
                                                           bs[north][right]=2;
                                                      }

                                                       if(b[north][right].getIcon()!=null){ //kill white icon
                                                                                  if(    ( b[north][right].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                         ( b[north][right].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                         ( b[north][right].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                         ( b[north][right].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                         ( b[north][right].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                                         ( b[north][right].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                          ){
                                                                                        b[north][right].setBackground(Color.red);
                                                                                        bs[north][right]=2;

                                                                                        break;
                                                                                  }
                                                                   }

                                                                   if(b[north][right].getIcon()!=null){  //stop when black icon in the path
                                                                                  if(    ( b[north][right].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                         ( b[north][right].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                         ( b[north][right].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                         ( b[north][right].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                         ( b[north][right].getIcon().toString().equals(bbq.getIcon().toString()) ) ||
                                                                                         ( b[north][right].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                          ){

                                                                                        break;
                                                                                  }
                                                                   }

                                                      north--;
                                                      right++;
                                        }
                                        
                                        /**********************/
                                         //south-Left-move
                                        /*********************/
                                        south=j-1;
                                        left=i+1;
                                        while(left<=8&&south>=1){

                                                      if(b[left][south].getIcon()==null){
                                                           b[left][south].setBackground(Color.red);
                                                           bs[left][south]=2;
                                                      }

                                                       if(b[left][south].getIcon()!=null){ //kill white icon
                                                                                  if(    ( b[left][south].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                         ( b[left][south].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                         ( b[left][south].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                         ( b[left][south].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                         ( b[left][south].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                                         ( b[left][south].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                          ){
                                                                                        b[left][south].setBackground(Color.red);
                                                                                        bs[left][south]=2;

                                                                                        break;
                                                                                  }
                                                                   }

                                                                   if(b[left][south].getIcon()!=null){  //stop when black icon in the path
                                                                                  if(    ( b[left][south].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                         ( b[left][south].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                         ( b[left][south].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                         ( b[left][south].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                         ( b[left][south].getIcon().toString().equals(bbq.getIcon().toString()) ) ||
                                                                                         ( b[left][south].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                          ){

                                                                                        break;
                                                                                  }
                                                                   }

                                                      south--;
                                                      left++;
                                        }
                                        /************************/
                                            //south-Rightt-move
                                        /*************************/
                                        south=i+1;
                                        right=j+1;
                                        while(south<=8&&right<=8){

                                                      if(b[south][right].getIcon()==null){
                                                           b[south][right].setBackground(Color.red);
                                                           bs[south][right]=2;
                                                      }

                                                       if(b[south][right].getIcon()!=null){ //kill white icon
                                                                                  if(    ( b[south][right].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                         ( b[south][right].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                         ( b[south][right].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                         ( b[south][right].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                         ( b[south][right].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                                         ( b[south][right].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                          ){
                                                                                        b[south][right].setBackground(Color.red);
                                                                                        bs[south][right]=2;

                                                                                        break;
                                                                                  }
                                                                   }

                                                                   if(b[south][right].getIcon()!=null){  //stop when black icon in the path
                                                                                  if(    ( b[south][right].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                         ( b[south][right].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                         ( b[south][right].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                         ( b[south][right].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                         ( b[south][right].getIcon().toString().equals(bbq.getIcon().toString()) ) ||
                                                                                         ( b[south][right].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                          ){

                                                                                        break;
                                                                                  }
                                                                   }

                                                      south++;
                                                      right++;
                                        }
                         
                       }
        }
        
        
                     
                     
                       
                       
                     
                     
        /*######################################################################################################*/
        /*                                     WHITE ICON MOVEMENT                                              */                      
        /*######################################################################################################*/                    
                     
        
              /*************************************************************************/        
                                         //for white KING movement
                /*************************************************************************/
                       
                     if(bi.toString().equals( bwk.getIcon().toString() ) ){
                         int canMove=0;
                         
                         whiteKingVisited=1;
                         
                        whiteKingNextMoveCheck();   //for keep safe from next move check
                         
                            /****************************/
                                // north movement
                            /***************************/
                                int north=i-1;
                                if(north>=1){
                                    
                                    if(b[north][j].getIcon()==null  && kingCheck[north][j]==0){
                                                 b[north][j].setBackground(Color.red);
                                                 bs[north][j]=2;
                                                 
                                                 canMove=1;
                                             }
                                             if(b[north][j].getIcon()!=null && kingCheck[north][j]==0){ //kill black icon
                                                            if(    ( b[north][j].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                   ( b[north][j].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                   ( b[north][j].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                   ( b[north][j].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                   ( b[north][j].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                   ( b[north][j].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                    ){
                                                                  b[north][j].setBackground(Color.red);
                                                                  bs[north][j]=2;
                                                                  canMove=1;
                                                                  
                                                            }
                                             }
                                    
                                }
                                
                            /****************************/
                                // south movement
                            /***************************/
                                
                                int south=i+1;
                                if(south<=8){
                                    
                                    if(b[south][j].getIcon()==null && kingCheck[south][j]==0){
                                                 b[south][j].setBackground(Color.red);
                                                 bs[south][j]=2;
                                                 canMove=1;
                                             }
                                             if(b[south][j].getIcon()!=null && kingCheck[south][j]==0){ //kill black icon
                                                            if(    ( b[south][j].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                   ( b[south][j].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                   ( b[south][j].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                   ( b[south][j].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                   ( b[south][j].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                   ( b[south][j].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                    ){
                                                                  b[south][j].setBackground(Color.red);
                                                                  bs[south][j]=2;
                                                                  canMove=1;
                                                                  
                                                            }
                                             }
                                }
                                
                            /****************************/
                                // Left movement
                            /***************************/
                            
                            int left=j-1;
                            if(left>=1){
                                
                                if(b[i][left].getIcon()==null && kingCheck[i][left]==0){
                                                 b[i][left].setBackground(Color.red);
                                                 bs[i][left]=2;
                                                 canMove=1;
                                             }
                                             if(b[i][left].getIcon()!=null && kingCheck[i][left]==0){ //kill black icon
                                                            if(    ( b[i][left].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                   ( b[i][left].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                   ( b[i][left].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                   ( b[i][left].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                   ( b[i][left].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                   ( b[i][left].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                    ){
                                                                  b[i][left].setBackground(Color.red);
                                                                  bs[i][left]=2;
                                                                  
                                                                  canMove=1;
                                                            }
                                             }
                            }
                            
                             /****************************/
                                // Right movement
                            /***************************/
                            
                            int right=j+1;
                            
                            if(right<=8){
                                
                                if(b[i][right].getIcon()==null && kingCheck[i][right]==0){
                                                 b[i][right].setBackground(Color.red);
                                                 bs[i][right]=2;
                                                 canMove=1;
                                             }
                                             if(b[i][right].getIcon()!=null && kingCheck[i][right]==0){ //kill black icon
                                                            if(    ( b[i][right].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                   ( b[i][right].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                   ( b[i][right].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                   ( b[i][right].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                   ( b[i][right].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                   ( b[i][right].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                    ){
                                                                  b[i][right].setBackground(Color.red);
                                                                  bs[i][right]=2;
                                                                  canMove=1;
                                                                  
                                                            }
                                             }
                            }
                            
                                    /**********************/
                                        //north-Left-move
                                    /**********************/
                                        north=j-1;
                                         left=i-1;
                                        if(left>=1&&north>=1){

                                                      if(b[left][north].getIcon()==null && kingCheck[left][north]==0){
                                                           b[left][north].setBackground(Color.red);
                                                           bs[left][north]=2;
                                                           canMove=1;
                                                      }

                                                       if(b[left][north].getIcon()!=null && kingCheck[left][north]==0){ //kill black icon
                                                                                  if(    ( b[left][north].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                         ( b[left][north].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                         ( b[left][north].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                         ( b[left][north].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                         ( b[left][north].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                                         ( b[left][north].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                          ){
                                                                                        b[left][north].setBackground(Color.red);
                                                                                        bs[left][north]=2;

                                                                                        canMove=1;
                                                                                  }
                                                                   }
                                        }
                                        
                                        /***********************/
                                          //north-Right-move
                                        /***********************/
                                        north=i-1;
                                        right=j+1;
                                        if(north>=1&&right<=8){

                                                      if(b[north][right].getIcon()==null && kingCheck[north][right]==0){
                                                           b[north][right].setBackground(Color.red);
                                                           bs[north][right]=2;
                                                           canMove=1;
                                                      }

                                                       if(b[north][right].getIcon()!=null && kingCheck[north][right]==0){ //kill black icon
                                                                                  if(    ( b[north][right].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                         ( b[north][right].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                         ( b[north][right].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                         ( b[north][right].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                         ( b[north][right].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                                         ( b[north][right].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                          ){
                                                                                        b[north][right].setBackground(Color.red);
                                                                                        bs[north][right]=2;
                                                                                        canMove=1;
                                                                                        
                                                                                  }
                                                                   }
                                        }      
                                        
                                        /**********************/
                                         //south-Left-move
                                        /*********************/
                                        south=j-1;
                                        left=i+1;
                                        if(left<=8&&south>=1){

                                                      if(b[left][south].getIcon()==null && kingCheck[left][south]==0){
                                                           b[left][south].setBackground(Color.red);
                                                           bs[left][south]=2;
                                                           canMove=1;
                                                      }

                                                       if(b[left][south].getIcon()!=null && kingCheck[left][south]==0){ //kill black icon
                                                                                  if(    ( b[left][south].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                         ( b[left][south].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                         ( b[left][south].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                         ( b[left][south].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                         ( b[left][south].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                                         ( b[left][south].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                          ){
                                                                                        b[left][south].setBackground(Color.red);
                                                                                        bs[left][south]=2;
                                                                                        canMove=1;
                                                                                        
                                                                                  }
                                                                   }
                                        }    
                                        
                                        /************************/
                                            //south-Right-move
                                        /*************************/
                                        south=i+1;
                                        right=j+1;
                                        if(south<=8&&right<=8){

                                                      if(b[south][right].getIcon()==null && kingCheck[south][right]==0){
                                                           b[south][right].setBackground(Color.red);
                                                           bs[south][right]=2;
                                                           canMove=1;
                                                      }

                                                       if(b[south][right].getIcon()!=null && kingCheck[south][right]==0){ //kill black icon
                                                                                  if(    ( b[south][right].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                         ( b[south][right].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                         ( b[south][right].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                         ( b[south][right].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                         ( b[south][right].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                                         ( b[south][right].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                          ){
                                                                                        b[south][right].setBackground(Color.red);
                                                                                        bs[south][right]=2;
                                                                                        canMove=1;
                                                                                       
                                                                                  }
                                                                   }
                                        }
                                        
                                        
                                        if(canMove==0 && whiteKingCheck==1){
                                            JOptionPane.showMessageDialog(null, "Check&Mate");
                                            String time = jLabelTime.getText();
                                            BlackWinFram BWF=new BlackWinFram(time);
                                            BWF.setVisible(true);
                                             
                                            this.setVisible(false);
                                            
                                        }
                                
                       }
                     
    if(whiteKingCheck==0){        // if white king have check then  no-one white icon will able to move         
        /*************************************************************************/        
                                         //for white pawn movement
        /*************************************************************************/
                       if(bi.toString().equals( bwp.getIcon().toString() ) ){   
                           if(i<8){
                               
                                         if(i==2){//pawn can move two stap if yet it not move even once
                                            if(b[i+1][j].getIcon()==null && b[i+2][j].getIcon()==null){
                                                 b[i+1][j].setBackground(Color.red);
                                                  b[i+2][j].setBackground(Color.red);
                                                  bs[i+1][j]=2; //destination button for movable icon
                                                  bs[i+2][j]=2;
                                            }
                                        }
                                //if destination button contain null i.e. nothing on it
                                        if(b[i+1][j].getIcon()==null){
                                            b[i+1][j].setBackground(Color.red);
                                            bs[i+1][j]=2; //destination button for movable icon
                                        }  
                                        
                                 //if destination button contain black icon then white pawn can kill black icon (left ahead diagonal destination button)                
                                        if(j<8){
                                                if(b[i+1][j+1].getIcon()!=null){
                                                        if( ( b[i+1][j+1].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                               ( b[i+1][j+1].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                               ( b[i+1][j+1].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                              ( b[i+1][j+1].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                               ( b[i+1][j+1].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                               ( b[i+1][j+1].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                ){
                                                              b[i+1][j+1].setBackground(Color.red);
                                                              bs[i+1][j+1]=2;
                                                        }
                                                }                                        
                                        }
                                        
                                //if destination button contain black icon then white pawn can kill black icon (right ahead diagonal destination button)                                        
                                         if(j>1){
                                                        if(b[i+1][j-1].getIcon()!=null){
                                                            if( ( b[i+1][j-1].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                   ( b[i+1][j-1].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                   ( b[i+1][j-1].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                   ( b[i+1][j-1].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                   ( b[i+1][j-1].getIcon().toString().equals(bbq.getIcon().toString()) ) ||
                                                                   ( b[i+1][j-1].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                    ){
                                                                  b[i+1][j-1].setBackground(Color.red);
                                                                  bs[i+1][j-1]=2;
                                                            }
                                                        }
                                                }                                       
                                  }                                
                       }
                       
                     
         /*************************************************************************/        
                                         //for white elephant movement
        /*************************************************************************/                      
                       if(bi.toString().equals( bwe.getIcon().toString() ) ){
                           
                                /********************************/
                                    //north direction movement
                                /******************************/
                                    int north=i-1;
                                    for(;north>=1;north--){
                                        
                                             if(b[north][j].getIcon()==null){
                                                 b[north][j].setBackground(Color.red);
                                                 bs[north][j]=2;
                                             }
                                             if(b[north][j].getIcon()!=null){ //kill black icon
                                                            if(    ( b[north][j].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                   ( b[north][j].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                   ( b[north][j].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                   ( b[north][j].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                   ( b[north][j].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                   ( b[north][j].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                    ){
                                                                  b[north][j].setBackground(Color.red);
                                                                  bs[north][j]=2;
                                                                  
                                                                  break;
                                                            }
                                             }
                                             
                                             if(b[north][j].getIcon()!=null){  //stop when white icon in the path
                                                            if(    ( b[north][j].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                   ( b[north][j].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                   ( b[north][j].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                   ( b[north][j].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                   ( b[north][j].getIcon().toString().equals(bwq.getIcon().toString()) ) ||
                                                                   ( b[north][j].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                    ){
                                                                
                                                                  break;
                                                            }
                                             }
                                    }  
                                    
                                /**************************/
                                    //south direction move
                                /*************************/
                                    int south=i+1;
                                    for(;south<=8;south++){
                                        
                                             if(b[south][j].getIcon()==null){
                                                 b[south][j].setBackground(Color.red);
                                                 bs[south][j]=2;
                                             }
                                             if(b[south][j].getIcon()!=null){ //kill black icon
                                                            if(    ( b[south][j].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                   ( b[south][j].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                   ( b[south][j].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                   ( b[south][j].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                   ( b[south][j].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                   ( b[south][j].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                    ){
                                                                  b[south][j].setBackground(Color.red);
                                                                  bs[south][j]=2;
                                                                  
                                                                  break;
                                                            }
                                             }
                                             
                                             if(b[south][j].getIcon()!=null){//if button contain white icon
                                                            if(    ( b[south][j].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                   ( b[south][j].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                   ( b[south][j].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                   ( b[south][j].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                   ( b[south][j].getIcon().toString().equals(bwq.getIcon().toString()) ) ||
                                                                   ( b[south][j].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                    ){
                                                                
                                                                  break;
                                                            }
                                             }
                                    }
                                    
                                /***********************/    
                                 //Left direction movement
                                /***********************/
                                    int left=j-1;
                                    for(;left>=1;left--){
                                        
                                             if(b[i][left].getIcon()==null){
                                                 b[i][left].setBackground(Color.red);
                                                 bs[i][left]=2;
                                             }
                                             if(b[i][left].getIcon()!=null){ //kill black icon
                                                            if(    ( b[i][left].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                   ( b[i][left].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                   ( b[i][left].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                   ( b[i][left].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                   ( b[i][left].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                   ( b[i][left].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                    ){
                                                                  b[i][left].setBackground(Color.red);
                                                                  bs[i][left]=2;
                                                                  
                                                                  break;
                                                            }
                                             }
                                             
                                             if(b[i][left].getIcon()!=null){//if button contain white icon
                                                            if(    ( b[i][left].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                   ( b[i][left].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                   ( b[i][left].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                   ( b[i][left].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                   ( b[i][left].getIcon().toString().equals(bwq.getIcon().toString()) ) ||
                                                                   ( b[i][left].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                    ){
                                                                
                                                                  break;
                                                            }
                                             }
                                    }
                                 /************************/   
                                     //Right direction movement
                                 /************************/
                                    int right=j+1;
                                    for(;right<=8;right++){
                                        
                                             if(b[i][right].getIcon()==null){
                                                 b[i][right].setBackground(Color.red);
                                                 bs[i][right]=2;
                                             }
                                             if(b[i][right].getIcon()!=null){ //kill black icon
                                                            if(    ( b[i][right].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                   ( b[i][right].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                   ( b[i][right].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                   ( b[i][right].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                   ( b[i][right].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                   ( b[i][right].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                    ){
                                                                  b[i][right].setBackground(Color.red);
                                                                  bs[i][right]=2;
                                                                  
                                                                  break;
                                                            }
                                             }
                                             
                                             if(b[i][right].getIcon()!=null){//if button contain white icon
                                                            if(    ( b[i][right].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                   ( b[i][right].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                   ( b[i][right].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                   ( b[i][right].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                   ( b[i][right].getIcon().toString().equals(bwq.getIcon().toString()) ) ||
                                                                   ( b[i][right].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                    ){
                                                                
                                                                  break;
                                                            }
                                             }
                                    }                                   
                       }
                        
                       
                                   
         /*************************************************************************/        
                                         //for white horse movement
        /*************************************************************************/ 
                       if(bi.toString().equals( bwh.getIcon().toString() ) ){
                                //north move
                                int north=i-2;
                                
                                if(north>=1){

                                            int northRight=j+1;
                                            /*************************/
                                                //north Right move
                                             /***********************/
                                            if(northRight<=8){ 
                                                
                                                    if(b[north][northRight].getIcon()==null){
                                                        b[north][northRight].setBackground(Color.red);
                                                         bs[north][northRight]=2;
                                                    }

                                                    if(b[north][northRight].getIcon()!=null){ //kill black icon
                                                                    if(    ( b[north][northRight].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                           ( b[north][northRight].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                           ( b[north][northRight].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                           ( b[north][northRight].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                           ( b[north][northRight].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                           ( b[north][northRight].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                            ){
                                                                          b[north][northRight].setBackground(Color.red);
                                                                          bs[north][northRight]=2;

                                                                    }
                                                     }

                                            }
                                        
                                        /*************************/
                                            //north Left move
                                        /***********************/
                                            int northLeft=j-1;
                                            if(northLeft>=1){
                                                 if(b[north][northLeft].getIcon()==null){
                                                        b[north][northLeft].setBackground(Color.red);
                                                         bs[north][northLeft]=2;
                                                    }

                                                  if(b[north][northLeft].getIcon()!=null){ //kill black icon
                                                                    if(    ( b[north][northLeft].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                           ( b[north][northLeft].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                           ( b[north][northLeft].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                           ( b[north][northLeft].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                           ( b[north][northLeft].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                           ( b[north][northLeft].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                            ){
                                                                          b[north][northLeft].setBackground(Color.red);
                                                                          bs[north][northLeft]=2;

                                                                    }
                                                     }

                                            }
                                    
                                } 
                                
                                 //south move
                                int south=i+2;
                                
                                if(south<=8){

                                            int southRight=j+1;
                                            /*************************/
                                                //south Right move
                                             /***********************/
                                            if(southRight<=8){ 
                                                
                                                    if(b[south][southRight].getIcon()==null){
                                                        b[south][southRight].setBackground(Color.red);
                                                         bs[south][southRight]=2;
                                                    }

                                                    if(b[south][southRight].getIcon()!=null){ //kill black icon
                                                                    if(    ( b[south][southRight].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                           ( b[south][southRight].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                           ( b[south][southRight].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                           ( b[south][southRight].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                           ( b[south][southRight].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                           ( b[south][southRight].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                            ){
                                                                          b[south][southRight].setBackground(Color.red);
                                                                          bs[south][southRight]=2;

                                                                    }
                                                     }

                                            }
                                            
                                        /*************************/
                                           //south Left move
                                        /***********************/
                                            int southLeft=j-1;
                                            if(southLeft>=1){
                                                 if(b[south][southLeft].getIcon()==null){
                                                        b[south][southLeft].setBackground(Color.red);
                                                         bs[south][southLeft]=2;
                                                    }

                                                  if(b[south][southLeft].getIcon()!=null){ //kill black icon
                                                                    if(    ( b[south][southLeft].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                           ( b[south][southLeft].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                           ( b[south][southLeft].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                           ( b[south][southLeft].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                           ( b[south][southLeft].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                           ( b[south][southLeft].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                            ){
                                                                          b[south][southLeft].setBackground(Color.red);
                                                                          bs[south][southLeft]=2;

                                                                    }
                                                     }

                                            }
                                    
                                }
                                
                                 //Left move
                                int left=j-2;
                                
                                if(left>=1){

                                            int leftUp=i-1;
                                            /*************************/
                                                //Left Up move
                                             /***********************/
                                            if(leftUp>=1){ 
                                                
                                                    if(b[leftUp][left].getIcon()==null){
                                                        b[leftUp][left].setBackground(Color.red);
                                                         bs[leftUp][left]=2;
                                                    }

                                                    if(b[leftUp][left].getIcon()!=null){ //kill black icon
                                                                    if(    ( b[leftUp][left].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                           ( b[leftUp][left].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                           ( b[leftUp][left].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                           ( b[leftUp][left].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                           ( b[leftUp][left].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                           ( b[leftUp][left].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                            ){
                                                                          b[leftUp][left].setBackground(Color.red);
                                                                          bs[leftUp][left]=2;

                                                                    }
                                                     }

                                            }

                                         /*************************/
                                                //Left down move
                                         /***********************/
                                            int leftDown=i+1;
                                            if(leftDown<=8){
                                                 if(b[leftDown][left].getIcon()==null){
                                                        b[leftDown][left].setBackground(Color.red);
                                                         bs[leftDown][left]=2;
                                                    }

                                                  if(b[leftDown][left].getIcon()!=null){ //kill black icon
                                                                    if(    ( b[leftDown][left].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                           ( b[leftDown][left].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                           ( b[leftDown][left].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                           ( b[leftDown][left].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                           ( b[leftDown][left].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                           ( b[leftDown][left].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                            ){
                                                                          b[leftDown][left].setBackground(Color.red);
                                                                          bs[leftDown][left]=2;

                                                                    }
                                                     }

                                            }
                                    
                                }
                                
                                //right move
                                int right=j+2;
                                
                                if(right<=8){

                                            int rightUp=i-1;
                                             /*************************/
                                                //Right Up move
                                             /***********************/
                                            if(rightUp>=1){ 
                                                
                                                    if(b[rightUp][right].getIcon()==null){
                                                        b[rightUp][right].setBackground(Color.red);
                                                         bs[rightUp][right]=2;
                                                    }

                                                    if(b[rightUp][right].getIcon()!=null){ //kill black icon
                                                                    if(    ( b[rightUp][right].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                           ( b[rightUp][right].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                           ( b[rightUp][right].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                           ( b[rightUp][right].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                           ( b[rightUp][right].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                           ( b[rightUp][right].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                            ){
                                                                          b[rightUp][right].setBackground(Color.red);
                                                                          bs[rightUp][right]=2;

                                                                    }
                                                     }

                                            }

                                         /*************************/
                                                //Right down move
                                          /***********************/
                                            int rightDown=i+1;
                                            if(rightDown<=8){
                                                 if(b[rightDown][right].getIcon()==null){
                                                        b[rightDown][right].setBackground(Color.red);
                                                         bs[rightDown][right]=2;
                                                    }

                                                  if(b[rightDown][right].getIcon()!=null){ //kill black icon
                                                                    if(    ( b[rightDown][right].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                           ( b[rightDown][right].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                           ( b[rightDown][right].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                           ( b[rightDown][right].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                           ( b[rightDown][right].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                           ( b[rightDown][right].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                            ){
                                                                          b[rightDown][right].setBackground(Color.red);
                                                                          bs[rightDown][right]=2;

                                                                    }
                                                     }

                                            }
                                    
                                }                                
                           
                       }
                      
         /*************************************************************************/        
                                         //for white camel movement
        /*************************************************************************/                        
                       if(bi.toString().equals( bwc.getIcon().toString() ) ){
                           
                                        //there will be 4 direction move
                                        // northLeftMove,northRightMove,southLeftMove,southRightMove

                                    /**********************/
                                        //north-Left-move
                                    /**********************/
                                        int north=j-1;
                                        int left=i-1;
                                        while(left>=1&&north>=1){

                                                      if(b[left][north].getIcon()==null){
                                                           b[left][north].setBackground(Color.red);
                                                           bs[left][north]=2;
                                                      }

                                                       if(b[left][north].getIcon()!=null){ //kill black icon
                                                                                  if(    ( b[left][north].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                         ( b[left][north].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                         ( b[left][north].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                         ( b[left][north].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                         ( b[left][north].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                                         ( b[left][north].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                          ){
                                                                                        b[left][north].setBackground(Color.red);
                                                                                        bs[left][north]=2;

                                                                                        break;
                                                                                  }
                                                                   }

                                                                   if(b[left][north].getIcon()!=null){  //stop when white icon in the path
                                                                                  if(    ( b[left][north].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                         ( b[left][north].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                         ( b[left][north].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                         ( b[left][north].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                         ( b[left][north].getIcon().toString().equals(bwq.getIcon().toString()) ) ||
                                                                                         ( b[left][north].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                          ){

                                                                                        break;
                                                                                  }
                                                                   }

                                                      north--;
                                                      left--;
                                        }
                                        
                                        /***********************/
                                          //north-Right-move
                                        /***********************/
                                        north=i-1;
                                        int right=j+1;
                                        while(north>=1&&right<=8){

                                                      if(b[north][right].getIcon()==null){
                                                           b[north][right].setBackground(Color.red);
                                                           bs[north][right]=2;
                                                      }

                                                       if(b[north][right].getIcon()!=null){ //kill black icon
                                                                                  if(    ( b[north][right].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                         ( b[north][right].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                         ( b[north][right].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                         ( b[north][right].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                         ( b[north][right].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                                         ( b[north][right].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                          ){
                                                                                        b[north][right].setBackground(Color.red);
                                                                                        bs[north][right]=2;

                                                                                        break;
                                                                                  }
                                                                   }

                                                                   if(b[north][right].getIcon()!=null){  //stop when white icon in the path
                                                                                  if(    ( b[north][right].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                         ( b[north][right].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                         ( b[north][right].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                         ( b[north][right].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                         ( b[north][right].getIcon().toString().equals(bwq.getIcon().toString()) ) ||
                                                                                         ( b[north][right].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                          ){

                                                                                        break;
                                                                                  }
                                                                   }

                                                      north--;
                                                      right++;
                                        }
                                        
                                        /**********************/
                                         //south-Left-move
                                        /*********************/
                                        int south=j-1;
                                        left=i+1;
                                        while(left<=8&&south>=1){

                                                      if(b[left][south].getIcon()==null){
                                                           b[left][south].setBackground(Color.red);
                                                           bs[left][south]=2;
                                                      }

                                                       if(b[left][south].getIcon()!=null){ //kill black icon
                                                                                  if(    ( b[left][south].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                         ( b[left][south].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                         ( b[left][south].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                         ( b[left][south].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                         ( b[left][south].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                                         ( b[left][south].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                          ){
                                                                                        b[left][south].setBackground(Color.red);
                                                                                        bs[left][south]=2;

                                                                                        break;
                                                                                  }
                                                                   }

                                                                   if(b[left][south].getIcon()!=null){  //stop when white icon in the path
                                                                                  if(    ( b[left][south].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                         ( b[left][south].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                         ( b[left][south].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                         ( b[left][south].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                         ( b[left][south].getIcon().toString().equals(bwq.getIcon().toString()) ) ||
                                                                                         ( b[left][south].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                          ){

                                                                                        break;
                                                                                  }
                                                                   }

                                                      south--;
                                                      left++;
                                        }
                                        /************************/
                                            //south-Rightt-move
                                        /*************************/
                                        south=i+1;
                                        right=j+1;
                                        while(south<=8&&right<=8){

                                                      if(b[south][right].getIcon()==null){
                                                           b[south][right].setBackground(Color.red);
                                                           bs[south][right]=2;
                                                      }

                                                       if(b[south][right].getIcon()!=null){ //kill black icon
                                                                                  if(    ( b[south][right].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                         ( b[south][right].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                         ( b[south][right].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                         ( b[south][right].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                         ( b[south][right].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                                         ( b[south][right].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                          ){
                                                                                        b[south][right].setBackground(Color.red);
                                                                                        bs[south][right]=2;

                                                                                        break;
                                                                                  }
                                                                   }

                                                                   if(b[south][right].getIcon()!=null){  //stop when white icon in the path
                                                                                  if(    ( b[south][right].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                         ( b[south][right].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                         ( b[south][right].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                         ( b[south][right].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                         ( b[south][right].getIcon().toString().equals(bwq.getIcon().toString()) ) ||
                                                                                         ( b[south][right].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                          ){

                                                                                        break;
                                                                                  }
                                                                   }

                                                      south++;
                                                      right++;
                                        }
                                        
                                        
                       }
                      
        /*************************************************************************/        
                                         //for white queen movement
        /*************************************************************************/ 
                      
                     if(bi.toString().equals( bwq.getIcon().toString() ) ){
                       
                         //There will be 8 direction monements
                         
                         //north,south,left,right
                         //north-left,north-right,south-left,south-right
                                
                                /********************************/
                                    //north direction movement
                                /******************************/
                                    int north=i-1;
                                    for(;north>=1;north--){
                                        
                                             if(b[north][j].getIcon()==null){
                                                 b[north][j].setBackground(Color.red);
                                                 bs[north][j]=2;
                                             }
                                             if(b[north][j].getIcon()!=null){ //kill black icon
                                                            if(    ( b[north][j].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                   ( b[north][j].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                   ( b[north][j].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                   ( b[north][j].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                   ( b[north][j].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                   ( b[north][j].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                    ){
                                                                  b[north][j].setBackground(Color.red);
                                                                  bs[north][j]=2;
                                                                  
                                                                  break;
                                                            }
                                             }
                                             
                                             if(b[north][j].getIcon()!=null){  //stop when white icon in the path
                                                            if(    ( b[north][j].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                   ( b[north][j].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                   ( b[north][j].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                   ( b[north][j].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                   ( b[north][j].getIcon().toString().equals(bwq.getIcon().toString()) ) ||
                                                                   ( b[north][j].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                    ){
                                                                
                                                                  break;
                                                            }
                                             }
                                    }
                        
                                /**************************/
                                    //south direction move
                                /*************************/
                                    int south=i+1;
                                    for(;south<=8;south++){
                                        
                                             if(b[south][j].getIcon()==null){
                                                 b[south][j].setBackground(Color.red);
                                                 bs[south][j]=2;
                                             }
                                             if(b[south][j].getIcon()!=null){ //kill black icon
                                                            if(    ( b[south][j].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                   ( b[south][j].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                   ( b[south][j].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                   ( b[south][j].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                   ( b[south][j].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                   ( b[south][j].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                    ){
                                                                  b[south][j].setBackground(Color.red);
                                                                  bs[south][j]=2;
                                                                  
                                                                  break;
                                                            }
                                             }
                                             
                                             if(b[south][j].getIcon()!=null){//if button contain white icon
                                                            if(    ( b[south][j].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                   ( b[south][j].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                   ( b[south][j].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                   ( b[south][j].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                   ( b[south][j].getIcon().toString().equals(bwq.getIcon().toString()) ) ||
                                                                   ( b[south][j].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                    ){
                                                                
                                                                  break;
                                                            }
                                             }
                                    }
                                    
                                 /***********************/    
                                 //Left direction movement
                                /***********************/
                                    int left=j-1;
                                    for(;left>=1;left--){
                                        
                                             if(b[i][left].getIcon()==null){
                                                 b[i][left].setBackground(Color.red);
                                                 bs[i][left]=2;
                                             }
                                             if(b[i][left].getIcon()!=null){ //kill black icon
                                                            if(    ( b[i][left].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                   ( b[i][left].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                   ( b[i][left].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                   ( b[i][left].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                   ( b[i][left].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                   ( b[i][left].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                    ){
                                                                  b[i][left].setBackground(Color.red);
                                                                  bs[i][left]=2;
                                                                  
                                                                  break;
                                                            }
                                             }
                                             
                                             if(b[i][left].getIcon()!=null){//if button contain white icon
                                                            if(    ( b[i][left].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                   ( b[i][left].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                   ( b[i][left].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                   ( b[i][left].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                   ( b[i][left].getIcon().toString().equals(bwq.getIcon().toString()) ) ||
                                                                   ( b[i][left].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                    ){
                                                                
                                                                  break;
                                                            }
                                             }
                                    }
                                 /************************/   
                                     //Right direction movement
                                 /************************/
                                    int right=j+1;
                                    for(;right<=8;right++){
                                        
                                             if(b[i][right].getIcon()==null){
                                                 b[i][right].setBackground(Color.red);
                                                 bs[i][right]=2;
                                             }
                                             if(b[i][right].getIcon()!=null){ //kill black icon
                                                            if(    ( b[i][right].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                   ( b[i][right].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                   ( b[i][right].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                   ( b[i][right].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                   ( b[i][right].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                   ( b[i][right].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                    ){
                                                                  b[i][right].setBackground(Color.red);
                                                                  bs[i][right]=2;
                                                                  
                                                                  break;
                                                            }
                                             }
                                             
                                             if(b[i][right].getIcon()!=null){//if button contain white icon
                                                            if(    ( b[i][right].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                   ( b[i][right].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                   ( b[i][right].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                   ( b[i][right].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                   ( b[i][right].getIcon().toString().equals(bwq.getIcon().toString()) ) ||
                                                                   ( b[i][right].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                    ){
                                                                
                                                                  break;
                                                            }
                                             }
                                    }
                                    
                                    /**********************/
                                        //north-Left-move
                                    /**********************/
                                        north=j-1;
                                         left=i-1;
                                        while(left>=1&&north>=1){

                                                      if(b[left][north].getIcon()==null){
                                                           b[left][north].setBackground(Color.red);
                                                           bs[left][north]=2;
                                                      }

                                                       if(b[left][north].getIcon()!=null){ //kill black icon
                                                                                  if(    ( b[left][north].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                         ( b[left][north].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                         ( b[left][north].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                         ( b[left][north].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                         ( b[left][north].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                                         ( b[left][north].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                          ){
                                                                                        b[left][north].setBackground(Color.red);
                                                                                        bs[left][north]=2;

                                                                                        break;
                                                                                  }
                                                                   }

                                                                   if(b[left][north].getIcon()!=null){  //stop when white icon in the path
                                                                                  if(    ( b[left][north].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                         ( b[left][north].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                         ( b[left][north].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                         ( b[left][north].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                         ( b[left][north].getIcon().toString().equals(bwq.getIcon().toString()) ) ||
                                                                                         ( b[left][north].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                          ){

                                                                                        break;
                                                                                  }
                                                                   }

                                                      north--;
                                                      left--;
                                        }
                                        
                                        /***********************/
                                          //north-Right-move
                                        /***********************/
                                        north=i-1;
                                        right=j+1;
                                        while(north>=1&&right<=8){

                                                      if(b[north][right].getIcon()==null){
                                                           b[north][right].setBackground(Color.red);
                                                           bs[north][right]=2;
                                                      }

                                                       if(b[north][right].getIcon()!=null){ //kill black icon
                                                                                  if(    ( b[north][right].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                         ( b[north][right].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                         ( b[north][right].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                         ( b[north][right].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                         ( b[north][right].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                                         ( b[north][right].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                          ){
                                                                                        b[north][right].setBackground(Color.red);
                                                                                        bs[north][right]=2;

                                                                                        break;
                                                                                  }
                                                                   }

                                                                   if(b[north][right].getIcon()!=null){  //stop when white icon in the path
                                                                                  if(    ( b[north][right].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                         ( b[north][right].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                         ( b[north][right].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                         ( b[north][right].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                         ( b[north][right].getIcon().toString().equals(bwq.getIcon().toString()) ) ||
                                                                                         ( b[north][right].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                          ){

                                                                                        break;
                                                                                  }
                                                                   }

                                                      north--;
                                                      right++;
                                        }
                                        
                                        /**********************/
                                         //south-Left-move
                                        /*********************/
                                        south=j-1;
                                        left=i+1;
                                        while(left<=8&&south>=1){

                                                      if(b[left][south].getIcon()==null){
                                                           b[left][south].setBackground(Color.red);
                                                           bs[left][south]=2;
                                                      }

                                                       if(b[left][south].getIcon()!=null){ //kill black icon
                                                                                  if(    ( b[left][south].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                         ( b[left][south].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                         ( b[left][south].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                         ( b[left][south].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                         ( b[left][south].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                                         ( b[left][south].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                          ){
                                                                                        b[left][south].setBackground(Color.red);
                                                                                        bs[left][south]=2;

                                                                                        break;
                                                                                  }
                                                                   }

                                                                   if(b[left][south].getIcon()!=null){  //stop when white icon in the path
                                                                                  if(    ( b[left][south].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                         ( b[left][south].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                         ( b[left][south].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                         ( b[left][south].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                         ( b[left][south].getIcon().toString().equals(bwq.getIcon().toString()) ) ||
                                                                                         ( b[left][south].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                          ){

                                                                                        break;
                                                                                  }
                                                                   }

                                                      south--;
                                                      left++;
                                        }
                                        /************************/
                                            //south-Right-move
                                        /*************************/
                                        south=i+1;
                                        right=j+1;
                                        while(south<=8&&right<=8){

                                                      if(b[south][right].getIcon()==null){
                                                           b[south][right].setBackground(Color.red);
                                                           bs[south][right]=2;
                                                      }

                                                       if(b[south][right].getIcon()!=null){ //kill black icon
                                                                                  if(    ( b[south][right].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                         ( b[south][right].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                         ( b[south][right].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                         ( b[south][right].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                         ( b[south][right].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                                         ( b[south][right].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                          ){
                                                                                        b[south][right].setBackground(Color.red);
                                                                                        bs[south][right]=2;

                                                                                        break;
                                                                                  }
                                                                   }

                                                                   if(b[south][right].getIcon()!=null){  //stop when white icon in the path
                                                                                  if(    ( b[south][right].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                         ( b[south][right].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                         ( b[south][right].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                         ( b[south][right].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                         ( b[south][right].getIcon().toString().equals(bwq.getIcon().toString()) ) ||
                                                                                         ( b[south][right].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                          ){

                                                                                        break;
                                                                                  }
                                                                   }

                                                      south++;
                                                      right++;
                                        }
                     }
                     
        }
        
     if(whiteKingCheck==1 && whiteKingVisited==0){    //if another white icon is trying to move during white king check then only this will pop-up
         JOptionPane.showMessageDialog(null, "WhiteKing has check,only king will be moveable untill remove check");
     }
    
      if(blackKingCheck==1 && blackKingVisited==0){    //if another black icon is trying to move during black king check then only this will pop-up
         JOptionPane.showMessageDialog(null, "BlackKing has check,only king will be moveable untill remove check");
     }
    }
    
  
    
  //detecting the next move place of king where king can have check,specifing that place using assign (kingCheck[i][j]=1) and restrict to king for dont move there   
  void whiteKingNextMoveCheck(){ 
        
                  for(int i=1;i<9;i++)
                      for(int j=1;j<9;j++){
                          
                            if(b[i][j].getIcon()!=null){
                                       
                                    // detect check from blackPawn from next move of king,so that we can not allow that move of king
                                              if(b[i][j].getIcon().toString().equals(bbp.getIcon().toString())){ 

                                                   if(i>1){

                                                       if(j<8){
                                                              kingCheck[i-1][j+1]=1;                                      
                                                            }
                                                       if(j>1){
                                                              kingCheck[i-1][j-1]=1;   
                                                       }
                                                   }
                                              }

                                    // detect check from blackElephant from next move of king,so that we can not allow that move of king
                                              if(b[i][j].getIcon().toString().equals(bbe.getIcon().toString())){ 

                                                           /********************************/
                                                              //north direction movement
                                                          /******************************/
                                                              int north=i-1;
                                                              for(;north>=1;north--){

                                                                       if(b[north][j].getIcon()==null){
                                                                          kingCheck[north][j]=1;
                                                                       }
                                                                       if(b[north][j].getIcon()!=null){ //move out when white icon break the path
                                                                                      if(    ( b[north][j].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                             ( b[north][j].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                             ( b[north][j].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                             ( b[north][j].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                             ( b[north][j].getIcon().toString().equals(bwq.getIcon().toString()) ) 
                                                                                              ){
                                                                                              break;
                                                                                      }
                                                                       }

                                                                       if(b[north][j].getIcon()!=null){  //mark black icon and move out because white king can kill the black
                                                                                      if(    ( b[north][j].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                             ( b[north][j].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                             ( b[north][j].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                             ( b[north][j].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                             ( b[north][j].getIcon().toString().equals(bbq.getIcon().toString()) ) ||
                                                                                             ( b[north][j].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                              ){
                                                                                              kingCheck[north][j]=1;
                                                                                            break;
                                                                                      }
                                                                       }
                                                              }

                                                       /**************************/
                                                          //south direction move
                                                      /*************************/
                                                          int south=i+1;
                                                          for(;south<=8;south++){

                                                                   if(b[south][j].getIcon()==null){
                                                                       kingCheck[south][j]=1;
                                                                   }
                                                                   if(b[south][j].getIcon()!=null){ //move out when white icon break the path
                                                                                  if(    ( b[south][j].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                         ( b[south][j].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                         ( b[south][j].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                         ( b[south][j].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                         ( b[south][j].getIcon().toString().equals(bwq.getIcon().toString()) )
                                                                                          ){
                                                                                            break;
                                                                                  }
                                                                   }

                                                                   if(b[south][j].getIcon()!=null){//mark black icon and move out because white king can kill the black
                                                                                  if(    ( b[south][j].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                         ( b[south][j].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                         ( b[south][j].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                         ( b[south][j].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                         ( b[south][j].getIcon().toString().equals(bbq.getIcon().toString()) ) ||
                                                                                         ( b[south][j].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                          ){
                                                                                          kingCheck[south][j]=1;
                                                                                        break;
                                                                                  }
                                                                   }
                                                          }

                                                     /***********************/    
                                                     //Left direction movement
                                                    /***********************/
                                                        int left=j-1;
                                                        for(;left>=1;left--){

                                                                 if(b[i][left].getIcon()==null){
                                                                    kingCheck[i][left]=1;
                                                                 }
                                                                 if(b[i][left].getIcon()!=null){  //move out when white icon break the path
                                                                                if(    ( b[i][left].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                       ( b[i][left].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                       ( b[i][left].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                       ( b[i][left].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                       ( b[i][left].getIcon().toString().equals(bwq.getIcon().toString()) )
                                                                                        ){
                                                                                         break;
                                                                                }
                                                                 }

                                                                 if(b[i][left].getIcon()!=null){//mark black icon and move out because white king can kill the black
                                                                                if(    ( b[i][left].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                       ( b[i][left].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                       ( b[i][left].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                       ( b[i][left].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                       ( b[i][left].getIcon().toString().equals(bbq.getIcon().toString()) ) ||
                                                                                       ( b[i][left].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                        ){
                                                                                            kingCheck[i][left]=1;
                                                                                      break;
                                                                                }
                                                                 }
                                                        }
                                                     /************************/   
                                                         //Right direction movement
                                                     /************************/
                                                        int right=j+1;
                                                        for(;right<=8;right++){

                                                                 if(b[i][right].getIcon()==null){
                                                                    kingCheck[i][right]=1;
                                                                 }
                                                                 if(b[i][right].getIcon()!=null){ //move out when white icon break the path
                                                                                if(    ( b[i][right].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                       ( b[i][right].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                       ( b[i][right].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                       ( b[i][right].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                       ( b[i][right].getIcon().toString().equals(bwq.getIcon().toString()) )
                                                                                        ){
                                                                                        break;
                                                                                }
                                                                 }

                                                                 if(b[i][right].getIcon()!=null){//mark black icon and move out because white king can kill the black
                                                                                if(    ( b[i][right].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                       ( b[i][right].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                       ( b[i][right].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                       ( b[i][right].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                       ( b[i][right].getIcon().toString().equals(bbq.getIcon().toString()) ) ||
                                                                                       ( b[i][right].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                        ){
                                                                                            kingCheck[i][right]=1;
                                                                                      break;
                                                                                }
                                                                 }
                                                        }  

                                              }
                                              
                                              
                                    // detect check from blackhorse from next move of king,so that we can not allow that move of king
                                              if(b[i][j].getIcon().toString().equals(bbh.getIcon().toString())){
                                                  
                                                            //north move
                                                                int north=i-2;

                                                                if(north>=1){

                                                                            int northRight=j+1;
                                                                            /*************************/
                                                                                //north Right move
                                                                             /***********************/
                                                                            if(northRight<=8){ 

                                                                                    if(b[north][northRight].getIcon()==null){
                                                                                       kingCheck[north][northRight]=1;
                                                                                    }

                                                                                    if(b[north][northRight].getIcon()!=null){ //mark black icon and move out because white king can kill the black
                                                                                                    if(    ( b[north][northRight].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                                           ( b[north][northRight].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                                           ( b[north][northRight].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                                           ( b[north][northRight].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                                           ( b[north][northRight].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                                                           ( b[north][northRight].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                                            ){
                                                                                                          kingCheck[north][northRight]=1;

                                                                                                    }
                                                                                     }

                                                                            }

                                                                            /*************************/
                                                                                //north Left move
                                                                            /***********************/
                                                                                int northLeft=j-1;
                                                                                if(northLeft>=1){
                                                                                     if(b[north][northLeft].getIcon()==null){
                                                                                            kingCheck[north][northLeft]=1;
                                                                                        }

                                                                                      if(b[north][northLeft].getIcon()!=null){ //mark black icon and move out because white king can kill the black
                                                                                                        if(    ( b[north][northLeft].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                                               ( b[north][northLeft].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                                               ( b[north][northLeft].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                                               ( b[north][northLeft].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                                               ( b[north][northLeft].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                                                               ( b[north][northLeft].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                                                ){
                                                                                                              kingCheck[north][northRight]=1;
                                                                                                        }
                                                                                         }

                                                                                }

                                                                }
                                                                
                                                                
                                                                 //south move
                                                                        int south=i+2;

                                                                        if(south<=8){

                                                                                    int southRight=j+1;
                                                                                    /*************************/
                                                                                        //south Right move
                                                                                     /***********************/
                                                                                    if(southRight<=8){ 

                                                                                            if(b[south][southRight].getIcon()==null){
                                                                                                kingCheck[south][southRight]=1;
                                                                                            }

                                                                                            if(b[south][southRight].getIcon()!=null){ //mark black icon and move out because white king can kill the black
                                                                                                            if(    ( b[south][southRight].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                                                   ( b[south][southRight].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                                                   ( b[south][southRight].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                                                   ( b[south][southRight].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                                                   ( b[south][southRight].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                                                                   ( b[south][southRight].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                                                    ){
                                                                                                                 kingCheck[south][southRight]=1;

                                                                                                            }
                                                                                             }

                                                                                    }

                                                                                /*************************/
                                                                                   //south Left move
                                                                                /***********************/
                                                                                    int southLeft=j-1;
                                                                                    if(southLeft>=1){
                                                                                         if(b[south][southLeft].getIcon()==null){
                                                                                               kingCheck[south][southLeft]=1;
                                                                                            }

                                                                                          if(b[south][southLeft].getIcon()!=null){ //mark black icon and move out because white king can kill the black
                                                                                                            if(    ( b[south][southLeft].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                                                   ( b[south][southLeft].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                                                   ( b[south][southLeft].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                                                   ( b[south][southLeft].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                                                   ( b[south][southLeft].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                                                                   ( b[south][southLeft].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                                                    ){
                                                                                                                 kingCheck[south][southLeft]=1;

                                                                                                            }
                                                                                             }

                                                                                    }

                                                                        }
                                                                        
                                                                        
                                                                        //Left move
                                                                       int left=j-2;

                                                                       if(left>=1){

                                                                                   int leftUp=i-1;
                                                                                   /*************************/
                                                                                       //Left Up move
                                                                                    /***********************/
                                                                                   if(leftUp>=1){ 

                                                                                           if(b[leftUp][left].getIcon()==null){
                                                                                               kingCheck[leftUp][left]=1;
                                                                                           }

                                                                                           if(b[leftUp][left].getIcon()!=null){ //mark black icon and move out because white king can kill the black
                                                                                                           if(    ( b[leftUp][left].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                                                  ( b[leftUp][left].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                                                  ( b[leftUp][left].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                                                  ( b[leftUp][left].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                                                  ( b[leftUp][left].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                                                                  ( b[leftUp][left].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                                                   ){
                                                                                                                 kingCheck[leftUp][left]=1;

                                                                                                           }
                                                                                            }

                                                                                   }

                                                                                /*************************/
                                                                                       //Left down move
                                                                                /***********************/
                                                                                   int leftDown=i+1;
                                                                                   if(leftDown<=8){
                                                                                        if(b[leftDown][left].getIcon()==null){
                                                                                               kingCheck[leftDown][left]=1;
                                                                                           }

                                                                                         if(b[leftDown][left].getIcon()!=null){ //mark black icon and move out because white king can kill the black
                                                                                                           if(    ( b[leftDown][left].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                                                  ( b[leftDown][left].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                                                  ( b[leftDown][left].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                                                  ( b[leftDown][left].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                                                  ( b[leftDown][left].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                                                                  ( b[leftDown][left].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                                                   ){
                                                                                                                 kingCheck[leftDown][left]=1;

                                                                                                           }
                                                                                            }

                                                                                   }

                                                                       }

                                                                       //right move
                                                                       int right=j+2;

                                                                       if(right<=8){

                                                                                   int rightUp=i-1;
                                                                                    /*************************/
                                                                                       //Right Up move
                                                                                    /***********************/
                                                                                   if(rightUp>=1){ 

                                                                                           if(b[rightUp][right].getIcon()==null){
                                                                                               kingCheck[rightUp][right]=1;
                                                                                           }

                                                                                           if(b[rightUp][right].getIcon()!=null){ //mark black icon and move out because white king can kill the black
                                                                                                           if(    ( b[rightUp][right].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                                                  ( b[rightUp][right].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                                                  ( b[rightUp][right].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                                                  ( b[rightUp][right].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                                                  ( b[rightUp][right].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                                                                  ( b[rightUp][right].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                                                   ){
                                                                                                                kingCheck[rightUp][right]=1;

                                                                                                           }
                                                                                            }

                                                                                   }

                                                                                /*************************/
                                                                                       //Right down move
                                                                                 /***********************/
                                                                                   int rightDown=i+1;
                                                                                   if(rightDown<=8){
                                                                                        if(b[rightDown][right].getIcon()==null){
                                                                                              kingCheck[rightDown][right]=1;
                                                                                           }

                                                                                         if(b[rightDown][right].getIcon()!=null){ //mark black icon and move out because white king can kill the black
                                                                                                           if(    ( b[rightDown][right].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                                                  ( b[rightDown][right].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                                                  ( b[rightDown][right].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                                                  ( b[rightDown][right].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                                                  ( b[rightDown][right].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                                                                  ( b[rightDown][right].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                                                   ){
                                                                                                            kingCheck[rightDown][right]=1;

                                                                                                           }
                                                                                            }

                                                                                   }

                                                                       }                                                                        
                                                                
                                              }
                                              
                   // detect check from blackcamel from next move of king,so that we can not allow that move of king
                                              if(b[i][j].getIcon().toString().equals(bbc.getIcon().toString())){
                                                  
                                                           /**********************/
                                                               //north-Left-move
                                                           /**********************/
                                                               int north=j-1;
                                                               int left=i-1;
                                                               while(left>=1&&north>=1){

                                                                             if(b[left][north].getIcon()==null){
                                                                                   kingCheck[left][north]=1;
                                                                             }

                                                                              if(b[left][north].getIcon()!=null){ //move out when white icon break the path
                                                                                                         if(    ( b[left][north].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                                                ( b[left][north].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                                                ( b[left][north].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                                                ( b[left][north].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                                                ( b[left][north].getIcon().toString().equals(bwq.getIcon().toString()) )
                                                                                                                 ){
                                                                                                                break;
                                                                                                         }
                                                                                          }

                                                                                          if(b[left][north].getIcon()!=null){  //mark black icon and move out because white king can kill the black
                                                                                                         if(    ( b[left][north].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                                                ( b[left][north].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                                                ( b[left][north].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                                                ( b[left][north].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                                                ( b[left][north].getIcon().toString().equals(bbq.getIcon().toString()) ) ||
                                                                                                                ( b[left][north].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                                                 ){
                                                                                                                 kingCheck[left][north]=1;
                                                                                                               break;
                                                                                                         }
                                                                                          }

                                                                             north--;
                                                                             left--;
                                                               }

                                                               /***********************/
                                                                 //north-Right-move
                                                               /***********************/
                                                               north=i-1;
                                                               int right=j+1;
                                                               while(north>=1&&right<=8){

                                                                             if(b[north][right].getIcon()==null){
                                                                                  kingCheck[north][right]=1;
                                                                             }

                                                                              if(b[north][right].getIcon()!=null){ //move out when white icon break the path
                                                                                                         if(    ( b[north][right].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                                                ( b[north][right].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                                                ( b[north][right].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                                                ( b[north][right].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                                                ( b[north][right].getIcon().toString().equals(bwq.getIcon().toString()) )
                                                                                                                 ){
                                                                                                                break;
                                                                                                         }
                                                                                          }

                                                                                          if(b[north][right].getIcon()!=null){  //mark black icon and move out because white king can kill the black
                                                                                                         if(    ( b[north][right].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                                                ( b[north][right].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                                                ( b[north][right].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                                                ( b[north][right].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                                                ( b[north][right].getIcon().toString().equals(bbq.getIcon().toString()) ) ||
                                                                                                                ( b[north][right].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                                                 ){
                                                                                                                 kingCheck[north][right]=1;
                                                                                                               break;
                                                                                                         }
                                                                                          }

                                                                             north--;
                                                                             right++;
                                                               }

                                                               /**********************/
                                                                //south-Left-move
                                                               /*********************/
                                                               int south=j-1;
                                                               left=i+1;
                                                               while(left<=8&&south>=1){

                                                                             if(b[left][south].getIcon()==null){
                                                                                     kingCheck[left][south]=1;
                                                                             }

                                                                              if(b[left][south].getIcon()!=null){ //move out when white icon break the path
                                                                                                         if(    ( b[left][south].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                                                ( b[left][south].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                                                ( b[left][south].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                                                ( b[left][south].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                                                ( b[left][south].getIcon().toString().equals(bwq.getIcon().toString()) )
                                                                                                                 ){
                                                                                                                 break;
                                                                                                         }
                                                                                          }

                                                                                          if(b[left][south].getIcon()!=null){  //mark black icon and move out because white king can kill the black
                                                                                                         if(    ( b[left][south].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                                                ( b[left][south].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                                                ( b[left][south].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                                                ( b[left][south].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                                                ( b[left][south].getIcon().toString().equals(bbq.getIcon().toString()) ) ||
                                                                                                                ( b[left][south].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                                                 ){
                                                                                                                    kingCheck[left][south]=1;
                                                                                                               break;
                                                                                                         }
                                                                                          }

                                                                             south--;
                                                                             left++;
                                                               }
                                                               /************************/
                                                                   //south-Right-move
                                                               /*************************/
                                                               south=i+1;
                                                               right=j+1;
                                                               while(south<=8&&right<=8){

                                                                             if(b[south][right].getIcon()==null){
                                                                                  kingCheck[south][right]=1;
                                                                             }

                                                                              if(b[south][right].getIcon()!=null){ //move out when white icon break the path
                                                                                                         if(    ( b[south][right].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                                                ( b[south][right].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                                                ( b[south][right].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                                                ( b[south][right].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                                                ( b[south][right].getIcon().toString().equals(bwq.getIcon().toString()) )
                                                                                                                 ){
                                                                                                               break;
                                                                                                         }
                                                                                          }

                                                                                          if(b[south][right].getIcon()!=null){  //mark black icon and move out because white king can kill the black
                                                                                                         if(    ( b[south][right].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                                                ( b[south][right].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                                                ( b[south][right].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                                                ( b[south][right].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                                                ( b[south][right].getIcon().toString().equals(bbq.getIcon().toString()) ) ||
                                                                                                                ( b[south][right].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                                                 ){
                                                                                                                 kingCheck[south][right]=1;
                                                                                                               break;
                                                                                                         }
                                                                                          }

                                                                             south++;
                                                                             right++;
                                                               }                                     
                                                  
                                              }
                                              
                                // detect check from blackqueen from next move of king,so that we can not allow that move of king
                                              if(b[i][j].getIcon().toString().equals(bbq.getIcon().toString())){
                                                  
                                                                     /******************************/
                                                                        //north direction movement
                                                                     /*****************************/
                                                                                int north=i-1;
                                                                                for(;north>=1;north--){

                                                                                         if(b[north][j].getIcon()==null){
                                                                                             kingCheck[north][j]=1;
                                                                                         }
                                                                                         if(b[north][j].getIcon()!=null){ //move out when white icon break the path
                                                                                                        if(    ( b[north][j].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                                               ( b[north][j].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                                               ( b[north][j].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                                               ( b[north][j].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                                               ( b[north][j].getIcon().toString().equals(bwq.getIcon().toString()) )
                                                                                                                ){
                                                                                                             break;
                                                                                                        }
                                                                                         }

                                                                                         if(b[north][j].getIcon()!=null){  //mark black icon and move out because white king can kill the black
                                                                                                        if(    ( b[north][j].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                                               ( b[north][j].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                                               ( b[north][j].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                                               ( b[north][j].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                                               ( b[north][j].getIcon().toString().equals(bbq.getIcon().toString()) ) ||
                                                                                                               ( b[north][j].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                                                ){
                                                                                                                kingCheck[north][j]=1;
                                                                                                              break;
                                                                                                        }
                                                                                         }
                                                                                }

                                                                            /**************************/
                                                                                //south direction move
                                                                            /*************************/
                                                                                int south=i+1;
                                                                                for(;south<=8;south++){

                                                                                         if(b[south][j].getIcon()==null){
                                                                                             kingCheck[south][j]=1;
                                                                                         }
                                                                                         if(b[south][j].getIcon()!=null){ //move out when white icon break the path
                                                                                                        if(    ( b[south][j].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                                               ( b[south][j].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                                               ( b[south][j].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                                               ( b[south][j].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                                               ( b[south][j].getIcon().toString().equals(bwq.getIcon().toString()) )
                                                                                                                ){
                                                                                                              break;
                                                                                                        }
                                                                                         }

                                                                                         if(b[south][j].getIcon()!=null){//mark black icon and move out because white king can kill the black
                                                                                                        if(    ( b[south][j].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                                               ( b[south][j].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                                               ( b[south][j].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                                               ( b[south][j].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                                               ( b[south][j].getIcon().toString().equals(bbq.getIcon().toString()) ) ||
                                                                                                               ( b[south][j].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                                                ){
                                                                                                                kingCheck[south][j]=1;
                                                                                                              break;
                                                                                                        }
                                                                                         }
                                                                                }

                                                                            /***********************/    
                                                                              //Left direction movement
                                                                            /***********************/
                                                                                int left=j-1;
                                                                                for(;left>=1;left--){

                                                                                         if(b[i][left].getIcon()==null){
                                                                                            kingCheck[i][left]=1;
                                                                                         }
                                                                                         if(b[i][left].getIcon()!=null){ //move out when white icon break the path
                                                                                                        if(    ( b[i][left].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                                               ( b[i][left].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                                               ( b[i][left].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                                               ( b[i][left].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                                               ( b[i][left].getIcon().toString().equals(bwq.getIcon().toString()) )
                                                                                                                ){
                                                                                                             break;
                                                                                                        }
                                                                                         }

                                                                                         if(b[i][left].getIcon()!=null){//mark black icon and move out because white king can kill the black
                                                                                                        if(    ( b[i][left].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                                               ( b[i][left].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                                               ( b[i][left].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                                               ( b[i][left].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                                               ( b[i][left].getIcon().toString().equals(bbq.getIcon().toString()) ) ||
                                                                                                               ( b[i][left].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                                                ){
                                                                                                                    kingCheck[i][left]=1;
                                                                                                              break;
                                                                                                        }
                                                                                         }
                                                                                }

                                                                             /************************/   
                                                                                 //Right direction movement
                                                                             /************************/
                                                                                int right=j+1;
                                                                                for(;right<=8;right++){

                                                                                         if(b[i][right].getIcon()==null){
                                                                                             kingCheck[i][right]=1;
                                                                                         }
                                                                                         if(b[i][right].getIcon()!=null){ //move out when white icon break the path
                                                                                                        if(    ( b[i][right].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                                               ( b[i][right].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                                               ( b[i][right].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                                               ( b[i][right].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                                               ( b[i][right].getIcon().toString().equals(bwq.getIcon().toString()) )
                                                                                                                ){
                                                                                                              break;
                                                                                                        }
                                                                                         }

                                                                                         if(b[i][right].getIcon()!=null){//mark black icon and move out because white king can kill the black
                                                                                                        if(    ( b[i][right].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                                               ( b[i][right].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                                               ( b[i][right].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                                               ( b[i][right].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                                               ( b[i][right].getIcon().toString().equals(bbq.getIcon().toString()) ) ||
                                                                                                               ( b[i][right].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                                                ){
                                                                                                                kingCheck[i][right]=1;
                                                                                                              break;
                                                                                                        }
                                                                                         }
                                                                                }
                                                                                
                                                            /**********************/
                                                                //north-Left-move
                                                            /**********************/
                                                                 north=j-1;
                                                                left=i-1;
                                                                while(left>=1&&north>=1){

                                                                              if(b[left][north].getIcon()==null){
                                                                                   kingCheck[left][north]=1;
                                                                              }

                                                                               if(b[left][north].getIcon()!=null){ //move out when white icon break the path
                                                                                                          if(    ( b[left][north].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                                                 ( b[left][north].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                                                 ( b[left][north].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                                                 ( b[left][north].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                                                 ( b[left][north].getIcon().toString().equals(bwq.getIcon().toString()) )
                                                                                                                  ){
                                                                                                                break;
                                                                                                          }
                                                                                           }

                                                                                           if(b[left][north].getIcon()!=null){  //mark black icon and move out because white king can kill the black
                                                                                                          if(    ( b[left][north].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                                                 ( b[left][north].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                                                 ( b[left][north].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                                                 ( b[left][north].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                                                 ( b[left][north].getIcon().toString().equals(bbq.getIcon().toString()) ) ||
                                                                                                                 ( b[left][north].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                                                  ){
                                                                                                                    kingCheck[left][north]=1;
                                                                                                                break;
                                                                                                          }
                                                                                           }

                                                                              north--;
                                                                              left--;
                                                                }

                                                                /***********************/
                                                                  //north-Right-move
                                                                /***********************/
                                                                north=i-1;
                                                                right=j+1;
                                                                while(north>=1&&right<=8){

                                                                              if(b[north][right].getIcon()==null){
                                                                                   kingCheck[north][right]=1;
                                                                              }

                                                                               if(b[north][right].getIcon()!=null){ //move out when white icon break the path
                                                                                                          if(    ( b[north][right].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                                                 ( b[north][right].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                                                 ( b[north][right].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                                                 ( b[north][right].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                                                 ( b[north][right].getIcon().toString().equals(bwq.getIcon().toString()) )
                                                                                                                  ){
                                                                                                                 break;
                                                                                                          }
                                                                                           }

                                                                                           if(b[north][right].getIcon()!=null){  //mark black icon and move out because white king can kill the black
                                                                                                          if(    ( b[north][right].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                                                 ( b[north][right].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                                                 ( b[north][right].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                                                 ( b[north][right].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                                                 ( b[north][right].getIcon().toString().equals(bbq.getIcon().toString()) ) ||
                                                                                                                 ( b[north][right].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                                                  ){
                                                                                                                     kingCheck[north][right]=1;
                                                                                                                break;
                                                                                                          }
                                                                                           }

                                                                              north--;
                                                                              right++;
                                                                }

                                                                /**********************/
                                                                 //south-Left-move
                                                                /*********************/
                                                                south=j-1;
                                                                left=i+1;
                                                                while(left<=8&&south>=1){

                                                                              if(b[left][south].getIcon()==null){
                                                                                   kingCheck[left][south]=1;
                                                                              }

                                                                               if(b[left][south].getIcon()!=null){ //move out when white icon break the path
                                                                                                          if(    ( b[left][south].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                                                 ( b[left][south].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                                                 ( b[left][south].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                                                 ( b[left][south].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                                                 ( b[left][south].getIcon().toString().equals(bwq.getIcon().toString()) )
                                                                                                                  ){
                                                                                                                break;
                                                                                                          }
                                                                                           }

                                                                                           if(b[left][south].getIcon()!=null){  //mark black icon and move out because white king can kill the black
                                                                                                          if(    ( b[left][south].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                                                 ( b[left][south].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                                                 ( b[left][south].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                                                 ( b[left][south].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                                                 ( b[left][south].getIcon().toString().equals(bbq.getIcon().toString()) ) ||
                                                                                                                 ( b[left][south].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                                                  ){
                                                                                                                   kingCheck[left][south]=1;
                                                                                                                break;
                                                                                                          }
                                                                                           }

                                                                              south--;
                                                                              left++;
                                                                }
                                                                /************************/
                                                                    //south-Rightt-move
                                                                /*************************/
                                                                south=i+1;
                                                                right=j+1;
                                                                while(south<=8&&right<=8){

                                                                              if(b[south][right].getIcon()==null){
                                                                                  kingCheck[south][right]=1;
                                                                              }

                                                                               if(b[south][right].getIcon()!=null){ //move out when white icon break the path
                                                                                                          if(    ( b[south][right].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                                                 ( b[south][right].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                                                 ( b[south][right].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                                                 ( b[south][right].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                                                 ( b[south][right].getIcon().toString().equals(bwq.getIcon().toString()) )
                                                                                                                  ){
                                                                                                                break;
                                                                                                          }
                                                                                           }

                                                                                           if(b[south][right].getIcon()!=null){  //mark black icon and move out because white king can kill the black
                                                                                                          if(    ( b[south][right].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                                                 ( b[south][right].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                                                 ( b[south][right].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                                                 ( b[south][right].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                                                 ( b[south][right].getIcon().toString().equals(bbq.getIcon().toString()) ) ||
                                                                                                                 ( b[south][right].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                                                  ){
                                                                                                                    kingCheck[south][right]=1;
                                                                                                                break;
                                                                                                          }
                                                                                           }

                                                                              south++;
                                                                              right++;
                                                                }                        
                                                                                
                                                  
                                              }
                                              
                                         // detect check from blackqueen from next move of king,so that we can not allow that move of king
                                              if(b[i][j].getIcon().toString().equals(bbk.getIcon().toString())){
                                                            /******************************/
                                                             //north direction movement
                                                          /*****************************/
                                                                     int north=i-1;
                                                                     if(north>=1){

                                                                              if(b[north][j].getIcon()==null){
                                                                                   kingCheck[north][j]=1;
                                                                              }
                                                                              if(b[north][j].getIcon()!=null){ //mark black icon and move out because white king can kill the black
                                                                                             if(    ( b[north][j].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                                    ( b[north][j].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                                    ( b[north][j].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                                    ( b[north][j].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                                    ( b[north][j].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                                                    ( b[north][j].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                                     ){
                                                                                                   kingCheck[north][j]=1;
                                                                                             }
                                                                              }
                                                                     }

                                                              /**************************/
                                                                     //south direction move
                                                                 /*************************/
                                                                     int south=i+1;
                                                                     if(south<=8){

                                                                              if(b[south][j].getIcon()==null){
                                                                                  kingCheck[south][j]=1;
                                                                              }
                                                                              if(b[south][j].getIcon()!=null){ //mark black icon and move out because white king can kill the black
                                                                                             if(    ( b[south][j].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                                    ( b[south][j].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                                    ( b[south][j].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                                    ( b[south][j].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                                    ( b[south][j].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                                                    ( b[south][j].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                                     ){
                                                                                                  kingCheck[south][j]=1;
                                                                                             }
                                                                              }
                                                                     }

                                                                     /***********************/    
                                                                   //Left direction movement
                                                                 /***********************/
                                                                     int left=j-1;
                                                                     if(left>=1){

                                                                              if(b[i][left].getIcon()==null){
                                                                                  kingCheck[i][left]=1;
                                                                              }
                                                                              if(b[i][left].getIcon()!=null){ //mark black icon and move out because white king can kill the black
                                                                                             if(    ( b[i][left].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                                    ( b[i][left].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                                    ( b[i][left].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                                    ( b[i][left].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                                    ( b[i][left].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                                                    ( b[i][left].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                                     ){
                                                                                                   kingCheck[i][left]=1;

                                                                                             }
                                                                              }
                                                                     }    

                                                                  /************************/   
                                                                      //Right direction movement
                                                                  /************************/
                                                                     int right=j+1;
                                                                     if(right<=8){

                                                                              if(b[i][right].getIcon()==null){
                                                                                  kingCheck[i][right]=1;
                                                                              }
                                                                              if(b[i][right].getIcon()!=null){ //mark black icon and move out because white king can kill the black
                                                                                             if(    ( b[i][right].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                                    ( b[i][right].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                                    ( b[i][right].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                                    ( b[i][right].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                                    ( b[i][right].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                                                    ( b[i][right].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                                     ){
                                                                                                    kingCheck[i][right]=1;

                                                                                             }
                                                                              }
                                                                     }

                                                                     /**********************/
                                                                         //north-Left-move
                                                                     /**********************/
                                                                          north=j-1;
                                                                         left=i-1;
                                                                         if(left>=1&&north>=1){

                                                                                       if(b[left][north].getIcon()==null){
                                                                                             kingCheck[left][north]=1;
                                                                                       }

                                                                                        if(b[left][north].getIcon()!=null){ //mark black icon and move out because white king can kill the black
                                                                                                                   if(    ( b[left][north].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                                                          ( b[left][north].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                                                          ( b[left][north].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                                                          ( b[left][north].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                                                          ( b[left][north].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                                                                          ( b[left][north].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                                                           ){
                                                                                                                         kingCheck[left][north]=1;

                                                                                                                   }
                                                                                                    }
                                                                         } 

                                                                         /***********************/
                                                                           //north-Right-move
                                                                         /***********************/
                                                                         north=i-1;
                                                                         right=j+1;
                                                                         if(north>=1&&right<=8){

                                                                                       if(b[north][right].getIcon()==null){
                                                                                            kingCheck[north][right]=1;
                                                                                       }

                                                                                        if(b[north][right].getIcon()!=null){ //mark black icon and move out because white king can kill the black
                                                                                                                   if(    ( b[north][right].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                                                          ( b[north][right].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                                                          ( b[north][right].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                                                          ( b[north][right].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                                                          ( b[north][right].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                                                                          ( b[north][right].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                                                           ){
                                                                                                                         kingCheck[north][right]=1;


                                                                                                                   }
                                                                                                    }
                                                                         }

                                                                          /**********************/
                                                                          //south-Left-move
                                                                         /*********************/
                                                                         south=j-1;
                                                                         left=i+1;
                                                                         if(left<=8&&south>=1){

                                                                                       if(b[left][south].getIcon()==null){
                                                                                            kingCheck[left][south]=2;
                                                                                       }

                                                                                        if(b[left][south].getIcon()!=null){ //mark black icon and move out because white king can kill the black
                                                                                                                   if(    ( b[left][south].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                                                          ( b[left][south].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                                                          ( b[left][south].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                                                          ( b[left][south].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                                                          ( b[left][south].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                                                                          ( b[left][south].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                                                           ){
                                                                                                                          kingCheck[left][south]=2;
                                                                                                                       }
                                                                                                    }
                                                                         }

                                                                          /************************/
                                                                             //south-Right-move
                                                                         /*************************/
                                                                         south=i+1;
                                                                         right=j+1;
                                                                         if(south<=8&&right<=8){

                                                                                       if(b[south][right].getIcon()==null){
                                                                                             kingCheck[south][right]=1;
                                                                                       }

                                                                                        if(b[south][right].getIcon()!=null){ //mark black icon and move out because white king can kill the black
                                                                                                                   if(    ( b[south][right].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                                                          ( b[south][right].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                                                          ( b[south][right].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                                                          ( b[south][right].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                                                          ( b[south][right].getIcon().toString().equals(bbq.getIcon().toString()) )||
                                                                                                                          ( b[south][right].getIcon().toString().equals(bbk.getIcon().toString()) )
                                                                                                                           ){
                                                                                                                           kingCheck[south][right]=1;
                                                                                                                   }
                                                                                                    }
                                                                         }


                                            }              
                                              
                            }        
                      }
                  
    }  
  
  void blackKingNextMoveCheck(){
      
      
               for(int i=1;i<9;i++)
                      for(int j=1;j<9;j++){
                          
                            if(b[i][j].getIcon()!=null){
                                       
                                    // detect check from whitePawn from next move of king,so that we can not allow that move of king
                                              if(b[i][j].getIcon().toString().equals(bwp.getIcon().toString())){ 

                                                   if(i<8){

                                                       if(j<8){
                                                              kingCheck[i+1][j+1]=1;                                      
                                                            }
                                                       if(j>1){
                                                              kingCheck[i+1][j-1]=1;   
                                                       }
                                                   }
                                              }
                                              
                                     // detect check from whiteElephant from next move of king,so that we can not allow that move of king
                                              if(b[i][j].getIcon().toString().equals(bwe.getIcon().toString())){
                                                  
                                                  /********************************/
                                                    //north direction movement
                                                 /******************************/
                                                    int north=i-1;
                                                    for(;north>=1;north--){

                                                             if(b[north][j].getIcon()==null){
                                                                  kingCheck[north][j]=1;
                                                             }
                                                             if(b[north][j].getIcon()!=null){ //move out from the loop when black icon in the path(because black king will not kill the black icon)
                                                                            if(    ( b[north][j].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                   ( b[north][j].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                   ( b[north][j].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                   ( b[north][j].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                   ( b[north][j].getIcon().toString().equals(bbq.getIcon().toString()) )
                                                                                    ){
                                                                                   break;
                                                                            }
                                                             }

                                                             if(b[north][j].getIcon()!=null){  //stop when white icon in the path and mark the white icon (because black king can kill the white icon)
                                                                            if(    ( b[north][j].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                   ( b[north][j].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                   ( b[north][j].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                   ( b[north][j].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                   ( b[north][j].getIcon().toString().equals(bwq.getIcon().toString()) ) ||
                                                                                   ( b[north][j].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                    ){
                                                                                        kingCheck[north][j]=1;
                                                                                  break;
                                                                            }
                                                             }
                                                    }  

                                                /**************************/
                                                    //south direction move
                                                /*************************/
                                                    int south=i+1;
                                                    for(;south<=8;south++){

                                                             if(b[south][j].getIcon()==null){
                                                                 kingCheck[south][j]=1;
                                                             }
                                                             if(b[south][j].getIcon()!=null){ //move out from the loop when black icon in the path(because black king will not kill the black icon)
                                                                            if(    ( b[south][j].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                   ( b[south][j].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                   ( b[south][j].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                   ( b[south][j].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                   ( b[south][j].getIcon().toString().equals(bbq.getIcon().toString()) )
                                                                                    ){
                                                                                  break;
                                                                            }
                                                             }

                                                             if(b[south][j].getIcon()!=null){ //stop when white icon in the path and mark the white icon (because black king can kill the white icon)
                                                                            if(    ( b[south][j].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                   ( b[south][j].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                   ( b[south][j].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                   ( b[south][j].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                   ( b[south][j].getIcon().toString().equals(bwq.getIcon().toString()) ) ||
                                                                                   ( b[south][j].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                    ){
                                                                                    kingCheck[south][j]=1;
                                                                                  break;
                                                                            }
                                                             }
                                                    }

                                                /***********************/    
                                                 //Left direction movement
                                                /***********************/
                                                    int left=j-1;
                                                    for(;left>=1;left--){

                                                             if(b[i][left].getIcon()==null){
                                                                 kingCheck[i][left]=1;
                                                             }
                                                             if(b[i][left].getIcon()!=null){ //move out from the loop when black icon in the path(because black king will not kill the black icon)
                                                                            if(    ( b[i][left].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                   ( b[i][left].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                   ( b[i][left].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                   ( b[i][left].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                   ( b[i][left].getIcon().toString().equals(bbq.getIcon().toString()) )
                                                                                    ){
                                                                                  break;
                                                                            }
                                                             }

                                                             if(b[i][left].getIcon()!=null){ //stop when white icon in the path and mark the white icon (because black king can kill the white icon)
                                                                            if(    ( b[i][left].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                   ( b[i][left].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                   ( b[i][left].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                   ( b[i][left].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                   ( b[i][left].getIcon().toString().equals(bwq.getIcon().toString()) ) ||
                                                                                   ( b[i][left].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                    ){
                                                                                     kingCheck[i][left]=1;
                                                                                  break;
                                                                            }
                                                             }
                                                    }
                                                 /************************/   
                                                     //Right direction movement
                                                 /************************/
                                                    int right=j+1;
                                                    for(;right<=8;right++){

                                                             if(b[i][right].getIcon()==null){
                                                                  kingCheck[i][right]=1;
                                                             }
                                                             if(b[i][right].getIcon()!=null){ //move out from the loop when black icon in the path(because black king will not kill the black icon)
                                                                            if(    ( b[i][right].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                   ( b[i][right].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                   ( b[i][right].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                   ( b[i][right].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                   ( b[i][right].getIcon().toString().equals(bbq.getIcon().toString()) )
                                                                                    ){
                                                                                  break;
                                                                            }
                                                             }

                                                             if(b[i][right].getIcon()!=null){ //stop when white icon in the path and mark the white icon (because black king can kill the white icon)
                                                                            if(    ( b[i][right].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                   ( b[i][right].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                   ( b[i][right].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                   ( b[i][right].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                   ( b[i][right].getIcon().toString().equals(bwq.getIcon().toString()) ) ||
                                                                                   ( b[i][right].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                    ){
                                                                                     kingCheck[i][right]=1;
                                                                                  break;
                                                                            }
                                                             }
                                                    }
                                              }
                                              
                                              
                                     // detect check from whitehorse from next move of king,so that we can not allow that move of king
                                              if(b[i][j].getIcon().toString().equals(bwh.getIcon().toString())){
                                                  
                                                          //north move
                                                            int north=i-2;

                                                            if(north>=1){

                                                                        int northRight=j+1;
                                                                        /*************************/
                                                                            //north Right move
                                                                         /***********************/
                                                                        if(northRight<=8){ 

                                                                                if(b[north][northRight].getIcon()==null){
                                                                                     kingCheck[north][northRight]=1;
                                                                                }

                                                                                if(b[north][northRight].getIcon()!=null){ //mark the white icon (because black king can kill the white icon)
                                                                                                if(    ( b[north][northRight].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                                       ( b[north][northRight].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                                       ( b[north][northRight].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                                       ( b[north][northRight].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                                       ( b[north][northRight].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                                                       ( b[north][northRight].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                                        ){
                                                                                                      kingCheck[north][northRight]=1;

                                                                                                }
                                                                                 }

                                                                        }

                                                                    /*************************/
                                                                        //north Left move
                                                                    /***********************/
                                                                        int northLeft=j-1;
                                                                        if(northLeft>=1){
                                                                             if(b[north][northLeft].getIcon()==null){
                                                                                     kingCheck[north][northLeft]=1;
                                                                                }

                                                                              if(b[north][northLeft].getIcon()!=null){ //mark the white icon (because black king can kill the white icon)
                                                                                                if(    ( b[north][northLeft].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                                       ( b[north][northLeft].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                                       ( b[north][northLeft].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                                       ( b[north][northLeft].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                                       ( b[north][northLeft].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                                                       ( b[north][northLeft].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                                        ){
                                                                                                      kingCheck[north][northLeft]=1;

                                                                                                }
                                                                                 }

                                                                        }

                                                            } 

                                                             //south move
                                                            int south=i+2;

                                                            if(south<=8){

                                                                        int southRight=j+1;
                                                                        /*************************/
                                                                            //south Right move
                                                                         /***********************/
                                                                        if(southRight<=8){ 

                                                                                if(b[south][southRight].getIcon()==null){
                                                                                    kingCheck[south][southRight]=1;
                                                                                }

                                                                                if(b[south][southRight].getIcon()!=null){ //mark the white icon (because black king can kill the white icon)
                                                                                                if(    ( b[south][southRight].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                                       ( b[south][southRight].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                                       ( b[south][southRight].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                                       ( b[south][southRight].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                                       ( b[south][southRight].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                                                       ( b[south][southRight].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                                        ){
                                                                                                       kingCheck[south][southRight]=1;

                                                                                                }
                                                                                 }

                                                                        }

                                                                    /*************************/
                                                                       //south Left move
                                                                    /***********************/
                                                                        int southLeft=j-1;
                                                                        if(southLeft>=1){
                                                                             if(b[south][southLeft].getIcon()==null){
                                                                                     kingCheck[south][southLeft]=1;
                                                                                }

                                                                              if(b[south][southLeft].getIcon()!=null){ //mark the white icon (because black king can kill the white icon)
                                                                                                if(    ( b[south][southLeft].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                                       ( b[south][southLeft].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                                       ( b[south][southLeft].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                                       ( b[south][southLeft].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                                       ( b[south][southLeft].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                                                       ( b[south][southLeft].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                                        ){
                                                                                                      kingCheck[south][southLeft]=1;

                                                                                                }
                                                                                 }

                                                                        }

                                                            }

                                                             //Left move
                                                            int left=j-2;

                                                            if(left>=1){

                                                                        int leftUp=i-1;
                                                                        /*************************/
                                                                            //Left Up move
                                                                         /***********************/
                                                                        if(leftUp>=1){ 

                                                                                if(b[leftUp][left].getIcon()==null){
                                                                                     kingCheck[leftUp][left]=1;
                                                                                }

                                                                                if(b[leftUp][left].getIcon()!=null){ //mark the white icon (because black king can kill the white icon)
                                                                                                if(    ( b[leftUp][left].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                                       ( b[leftUp][left].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                                       ( b[leftUp][left].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                                       ( b[leftUp][left].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                                       ( b[leftUp][left].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                                                       ( b[leftUp][left].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                                        ){
                                                                                                       kingCheck[leftUp][left]=1;

                                                                                                }
                                                                                 }

                                                                        }

                                                                     /*************************/
                                                                            //Left down move
                                                                     /***********************/
                                                                        int leftDown=i+1;
                                                                        if(leftDown<=8){
                                                                             if(b[leftDown][left].getIcon()==null){
                                                                                     kingCheck[leftDown][left]=1;
                                                                                }

                                                                              if(b[leftDown][left].getIcon()!=null){ //mark the white icon (because black king can kill the white icon)
                                                                                                if(    ( b[leftDown][left].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                                       ( b[leftDown][left].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                                       ( b[leftDown][left].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                                       ( b[leftDown][left].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                                       ( b[leftDown][left].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                                                       ( b[leftDown][left].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                                        ){
                                                                                                     kingCheck[leftDown][left]=1;

                                                                                                }
                                                                                 }

                                                                        }

                                                            }

                                                            //right move
                                                            int right=j+2;

                                                            if(right<=8){

                                                                        int rightUp=i-1;
                                                                         /*************************/
                                                                            //Right Up move
                                                                         /***********************/
                                                                        if(rightUp>=1){ 

                                                                                if(b[rightUp][right].getIcon()==null){
                                                                                     kingCheck[rightUp][right]=1;
                                                                                }

                                                                                if(b[rightUp][right].getIcon()!=null){ //mark the white icon (because black king can kill the white icon)
                                                                                                if(    ( b[rightUp][right].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                                       ( b[rightUp][right].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                                       ( b[rightUp][right].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                                       ( b[rightUp][right].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                                       ( b[rightUp][right].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                                                       ( b[rightUp][right].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                                        ){
                                                                                                     kingCheck[rightUp][right]=1;

                                                                                                }
                                                                                 }

                                                                        }

                                                                     /*************************/
                                                                            //Right down move
                                                                      /***********************/
                                                                        int rightDown=i+1;
                                                                        if(rightDown<=8){
                                                                             if(b[rightDown][right].getIcon()==null){
                                                                                     kingCheck[rightDown][right]=1;
                                                                                }

                                                                              if(b[rightDown][right].getIcon()!=null){ //mark the white icon (because black king can kill the white icon)
                                                                                                if(    ( b[rightDown][right].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                                       ( b[rightDown][right].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                                       ( b[rightDown][right].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                                       ( b[rightDown][right].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                                       ( b[rightDown][right].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                                                       ( b[rightDown][right].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                                        ){
                                                                                                       kingCheck[rightDown][right]=1;

                                                                                                }
                                                                                 }

                                                                        }

                                                            }                                

                                                   }
                                              
                                           
                                              
                                            // detect check from whitecamel from next move of king,so that we can not allow that move of king
                                                 if(b[i][j].getIcon().toString().equals(bwc.getIcon().toString())){
                                                     
                                                     /**********************/
                                                        //north-Left-move
                                                    /**********************/
                                                        int north=j-1;
                                                        int left=i-1;
                                                        while(left>=1&&north>=1){

                                                                      if(b[left][north].getIcon()==null){
                                                                           kingCheck[left][north]=1;
                                                                      }

                                                                       if(b[left][north].getIcon()!=null){ //move out from the loop when black icon in the path(because black king will not kill the black icon)
                                                                                                  if(    ( b[left][north].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                                         ( b[left][north].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                                         ( b[left][north].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                                         ( b[left][north].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                                         ( b[left][north].getIcon().toString().equals(bbq.getIcon().toString()) )
                                                                                                          ){
                                                                                                       break;
                                                                                                  }
                                                                                   }

                                                                                   if(b[left][north].getIcon()!=null){  //stop when white icon in the path and mark the white icon (because black king can kill the white icon)
                                                                                                  if(    ( b[left][north].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                                         ( b[left][north].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                                         ( b[left][north].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                                         ( b[left][north].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                                         ( b[left][north].getIcon().toString().equals(bwq.getIcon().toString()) ) ||
                                                                                                         ( b[left][north].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                                          ){
                                                                                                          kingCheck[left][north]=1;
                                                                                                        break;
                                                                                                  }
                                                                                   }

                                                                      north--;
                                                                      left--;
                                                        }

                                                        /***********************/
                                                          //north-Right-move
                                                        /***********************/
                                                        north=i-1;
                                                        int right=j+1;
                                                        while(north>=1&&right<=8){

                                                                      if(b[north][right].getIcon()==null){
                                                                           kingCheck[north][right]=1;
                                                                      }

                                                                       if(b[north][right].getIcon()!=null){ //move out from the loop when black icon in the path(because black king will not kill the black icon)
                                                                                                  if(    ( b[north][right].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                                         ( b[north][right].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                                         ( b[north][right].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                                         ( b[north][right].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                                         ( b[north][right].getIcon().toString().equals(bbq.getIcon().toString()) )
                                                                                                          ){
                                                                                                         break;
                                                                                                  }
                                                                                   }

                                                                                   if(b[north][right].getIcon()!=null){  //stop when white icon in the path and mark the white icon (because black king can kill the white icon)
                                                                                                  if(    ( b[north][right].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                                         ( b[north][right].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                                         ( b[north][right].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                                         ( b[north][right].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                                         ( b[north][right].getIcon().toString().equals(bwq.getIcon().toString()) ) ||
                                                                                                         ( b[north][right].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                                          ){
                                                                                                           kingCheck[north][right]=1;
                                                                                                        break;
                                                                                                  }
                                                                                   }

                                                                      north--;
                                                                      right++;
                                                        }

                                                        /**********************/
                                                         //south-Left-move
                                                        /*********************/
                                                        int south=j-1;
                                                        left=i+1;
                                                        while(left<=8&&south>=1){

                                                                      if(b[left][south].getIcon()==null){
                                                                           kingCheck[left][south]=1;
                                                                      }

                                                                       if(b[left][south].getIcon()!=null){ //move out from the loop when black icon in the path(because black king will not kill the black icon)
                                                                                                  if(    ( b[left][south].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                                         ( b[left][south].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                                         ( b[left][south].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                                         ( b[left][south].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                                         ( b[left][south].getIcon().toString().equals(bbq.getIcon().toString()) )
                                                                                                          ){
                                                                                                        break;
                                                                                                  }
                                                                                   }

                                                                                   if(b[left][south].getIcon()!=null){  //stop when white icon in the path and mark the white icon (because black king can kill the white icon)
                                                                                                  if(    ( b[left][south].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                                         ( b[left][south].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                                         ( b[left][south].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                                         ( b[left][south].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                                         ( b[left][south].getIcon().toString().equals(bwq.getIcon().toString()) ) ||
                                                                                                         ( b[left][south].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                                          ){
                                                                                                            kingCheck[left][south]=1;
                                                                                                        break;
                                                                                                  }
                                                                                   }

                                                                      south--;
                                                                      left++;
                                                        }
                                                        /************************/
                                                            //south-Rightt-move
                                                        /*************************/
                                                        south=i+1;
                                                        right=j+1;
                                                        while(south<=8&&right<=8){

                                                                      if(b[south][right].getIcon()==null){
                                                                           kingCheck[south][right]=1;
                                                                      }

                                                                       if(b[south][right].getIcon()!=null){ //move out from the loop when black icon in the path(because black king will not kill the black icon)
                                                                                                  if(    ( b[south][right].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                                         ( b[south][right].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                                         ( b[south][right].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                                         ( b[south][right].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                                         ( b[south][right].getIcon().toString().equals(bbq.getIcon().toString()) )
                                                                                                          ){
                                                                                                        break;
                                                                                                  }
                                                                                   }

                                                                                   if(b[south][right].getIcon()!=null){ //stop when white icon in the path and mark the white icon (because black king can kill the white icon)
                                                                                                  if(    ( b[south][right].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                                         ( b[south][right].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                                         ( b[south][right].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                                         ( b[south][right].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                                         ( b[south][right].getIcon().toString().equals(bwq.getIcon().toString()) ) ||
                                                                                                         ( b[south][right].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                                          ){
                                                                                                          kingCheck[south][right]=1;
                                                                                                        break;
                                                                                                  }
                                                                                   }

                                                                      south++;
                                                                      right++;
                                                        }
                                                 } 
                                                 
                                  // detect check from whiteQueen from next move of king,so that we can not allow that move of king
                                                 if(b[i][j].getIcon().toString().equals(bwq.getIcon().toString())){
                                                     
                                                        /********************************/
                                                            //north direction movement
                                                        /******************************/
                                                            int north=i-1;
                                                            for(;north>=1;north--){

                                                                     if(b[north][j].getIcon()==null){
                                                                         kingCheck[north][j]=1;
                                                                     }
                                                                     if(b[north][j].getIcon()!=null){ //move out from the loop when black icon in the path(because black king will not kill the black icon)
                                                                                    if(    ( b[north][j].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                           ( b[north][j].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                           ( b[north][j].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                           ( b[north][j].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                           ( b[north][j].getIcon().toString().equals(bbq.getIcon().toString()) )
                                                                                            ){
                                                                                          break;
                                                                                    }
                                                                     }

                                                                     if(b[north][j].getIcon()!=null){  //stop when white icon in the path and mark the white icon (because black king can kill the white icon)
                                                                                    if(    ( b[north][j].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                           ( b[north][j].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                           ( b[north][j].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                           ( b[north][j].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                           ( b[north][j].getIcon().toString().equals(bwq.getIcon().toString()) ) ||
                                                                                           ( b[north][j].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                            ){
                                                                                                 kingCheck[north][j]=1;
                                                                                          break;
                                                                                    }
                                                                     }
                                                            }

                                                        /**************************/
                                                            //south direction move
                                                        /*************************/
                                                            int south=i+1;
                                                            for(;south<=8;south++){

                                                                     if(b[south][j].getIcon()==null){
                                                                          kingCheck[south][j]=1;
                                                                     }
                                                                     if(b[south][j].getIcon()!=null){ //move out from the loop when black icon in the path(because black king will not kill the black icon)
                                                                                    if(    ( b[south][j].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                           ( b[south][j].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                           ( b[south][j].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                           ( b[south][j].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                           ( b[south][j].getIcon().toString().equals(bbq.getIcon().toString()) )
                                                                                            ){
                                                                                          break;
                                                                                    }
                                                                     }

                                                                     if(b[south][j].getIcon()!=null){  //stop when white icon in the path and mark the white icon (because black king can kill the white icon)
                                                                                    if(    ( b[south][j].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                           ( b[south][j].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                           ( b[south][j].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                           ( b[south][j].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                           ( b[south][j].getIcon().toString().equals(bwq.getIcon().toString()) ) ||
                                                                                           ( b[south][j].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                            ){
                                                                                             kingCheck[south][j]=1;
                                                                                          break;
                                                                                    }
                                                                     }
                                                            }

                                                         /***********************/    
                                                         //Left direction movement
                                                        /***********************/
                                                            int left=j-1;
                                                            for(;left>=1;left--){

                                                                     if(b[i][left].getIcon()==null){
                                                                         kingCheck[i][left]=1;
                                                                     }
                                                                     if(b[i][left].getIcon()!=null){ //move out from the loop when black icon in the path(because black king will not kill the black icon)
                                                                                    if(    ( b[i][left].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                           ( b[i][left].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                           ( b[i][left].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                           ( b[i][left].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                           ( b[i][left].getIcon().toString().equals(bbq.getIcon().toString()) )
                                                                                            ){
                                                                                           break;
                                                                                    }
                                                                     }

                                                                     if(b[i][left].getIcon()!=null){  //stop when white icon in the path and mark the white icon (because black king can kill the white icon)
                                                                                    if(    ( b[i][left].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                           ( b[i][left].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                           ( b[i][left].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                           ( b[i][left].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                           ( b[i][left].getIcon().toString().equals(bwq.getIcon().toString()) ) ||
                                                                                           ( b[i][left].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                            ){
                                                                                             kingCheck[i][left]=1;
                                                                                          break;
                                                                                    }
                                                                     }
                                                            }
                                                         /************************/   
                                                             //Right direction movement
                                                         /************************/
                                                            int right=j+1;
                                                            for(;right<=8;right++){

                                                                     if(b[i][right].getIcon()==null){
                                                                         kingCheck[i][right]=1;
                                                                     }
                                                                     if(b[i][right].getIcon()!=null){ //move out from the loop when black icon in the path(because black king will not kill the black icon)
                                                                                    if(    ( b[i][right].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                           ( b[i][right].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                           ( b[i][right].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                           ( b[i][right].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                           ( b[i][right].getIcon().toString().equals(bbq.getIcon().toString()) )
                                                                                            ){
                                                                                          break;
                                                                                    }
                                                                     }

                                                                     if(b[i][right].getIcon()!=null){ //stop when white icon in the path and mark the white icon (because black king can kill the white icon)
                                                                                    if(    ( b[i][right].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                           ( b[i][right].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                           ( b[i][right].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                           ( b[i][right].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                           ( b[i][right].getIcon().toString().equals(bwq.getIcon().toString()) ) ||
                                                                                           ( b[i][right].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                            ){
                                                                                                 kingCheck[i][right]=1;
                                                                                          break;
                                                                                    }
                                                                     }
                                                            }
                                                            
                                                            /**********************/
                                                                //north-Left-move
                                                            /**********************/
                                                                north=j-1;
                                                                 left=i-1;
                                                                while(left>=1&&north>=1){

                                                                              if(b[left][north].getIcon()==null){
                                                                                   kingCheck[left][north]=1;
                                                                              }

                                                                               if(b[left][north].getIcon()!=null){ //move out from the loop when black icon in the path(because black king will not kill the black icon)
                                                                                                          if(    ( b[left][north].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                                                 ( b[left][north].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                                                 ( b[left][north].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                                                 ( b[left][north].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                                                 ( b[left][north].getIcon().toString().equals(bbq.getIcon().toString()) )
                                                                                                                  ){
                                                                                                                 break;
                                                                                                          }
                                                                                           }

                                                                                           if(b[left][north].getIcon()!=null){  //stop when white icon in the path and mark the white icon (because black king can kill the white icon)
                                                                                                          if(    ( b[left][north].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                                                 ( b[left][north].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                                                 ( b[left][north].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                                                 ( b[left][north].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                                                 ( b[left][north].getIcon().toString().equals(bwq.getIcon().toString()) ) ||
                                                                                                                 ( b[left][north].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                                                  ){
                                                                                                                     kingCheck[left][north]=1;
                                                                                                                break;
                                                                                                          }
                                                                                           }

                                                                              north--;
                                                                              left--;
                                                                }

                                                                /***********************/
                                                                  //north-Right-move
                                                                /***********************/
                                                                north=i-1;
                                                                right=j+1;
                                                                while(north>=1&&right<=8){

                                                                              if(b[north][right].getIcon()==null){
                                                                                   kingCheck[north][right]=1;
                                                                              }

                                                                               if(b[north][right].getIcon()!=null){ //move out from the loop when black icon in the path(because black king will not kill the black icon)
                                                                                                          if(    ( b[north][right].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                                                 ( b[north][right].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                                                 ( b[north][right].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                                                 ( b[north][right].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                                                 ( b[north][right].getIcon().toString().equals(bbq.getIcon().toString()) )
                                                                                                                  ){
                                                                                                                break;
                                                                                                          }
                                                                                           }

                                                                                           if(b[north][right].getIcon()!=null){  //stop when white icon in the path and mark the white icon (because black king can kill the white icon)
                                                                                                          if(    ( b[north][right].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                                                 ( b[north][right].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                                                 ( b[north][right].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                                                 ( b[north][right].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                                                 ( b[north][right].getIcon().toString().equals(bwq.getIcon().toString()) ) ||
                                                                                                                 ( b[north][right].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                                                  ){
                                                                                                                   kingCheck[north][right]=1;
                                                                                                                break;
                                                                                                          }
                                                                                           }

                                                                              north--;
                                                                              right++;
                                                                }

                                                                /**********************/
                                                                 //south-Left-move
                                                                /*********************/
                                                                south=j-1;
                                                                left=i+1;
                                                                while(left<=8&&south>=1){

                                                                              if(b[left][south].getIcon()==null){
                                                                                   kingCheck[left][south]=1;
                                                                              }

                                                                               if(b[left][south].getIcon()!=null){ //move out from the loop when black icon in the path(because black king will not kill the black icon)
                                                                                                          if(    ( b[left][south].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                                                 ( b[left][south].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                                                 ( b[left][south].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                                                 ( b[left][south].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                                                 ( b[left][south].getIcon().toString().equals(bbq.getIcon().toString()) )
                                                                                                                  ){
                                                                                                                break;
                                                                                                          }
                                                                                           }

                                                                                           if(b[left][south].getIcon()!=null){  //stop when white icon in the path and mark the white icon (because black king can kill the white icon)
                                                                                                          if(    ( b[left][south].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                                                 ( b[left][south].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                                                 ( b[left][south].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                                                 ( b[left][south].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                                                 ( b[left][south].getIcon().toString().equals(bwq.getIcon().toString()) ) ||
                                                                                                                 ( b[left][south].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                                                  ){
                                                                                                                     kingCheck[left][south]=1;
                                                                                                                break;
                                                                                                          }
                                                                                           }

                                                                              south--;
                                                                              left++;
                                                                }
                                                                /************************/
                                                                    //south-Right-move
                                                                /*************************/
                                                                south=i+1;
                                                                right=j+1;
                                                                while(south<=8&&right<=8){

                                                                              if(b[south][right].getIcon()==null){
                                                                                   kingCheck[south][right]=1;
                                                                              }

                                                                               if(b[south][right].getIcon()!=null){ //move out from the loop when black icon in the path(because black king will not kill the black icon)
                                                                                                          if(    ( b[south][right].getIcon().toString().equals(bbp.getIcon().toString()) ) ||
                                                                                                                 ( b[south][right].getIcon().toString().equals(bbe.getIcon().toString()) ) || 
                                                                                                                 ( b[south][right].getIcon().toString().equals(bbh.getIcon().toString()) ) ||
                                                                                                                 ( b[south][right].getIcon().toString().equals(bbc.getIcon().toString()) ) ||
                                                                                                                 ( b[south][right].getIcon().toString().equals(bbq.getIcon().toString()) )
                                                                                                                  ){
                                                                                                                 break;
                                                                                                          }
                                                                                           }

                                                                                           if(b[south][right].getIcon()!=null){  //stop when white icon in the path and mark the white icon (because black king can kill the white icon)
                                                                                                          if(    ( b[south][right].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                                                 ( b[south][right].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                                                 ( b[south][right].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                                                 ( b[south][right].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                                                 ( b[south][right].getIcon().toString().equals(bwq.getIcon().toString()) ) ||
                                                                                                                 ( b[south][right].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                                                  ){
                                                                                                                   kingCheck[south][right]=1;
                                                                                                                break;
                                                                                                          }
                                                                                           }

                                                                              south++;
                                                                              right++;
                                                                }
                                                 }               
                                                 
                                                 
                                          // detect check from whiteKing from next move of king,so that we can not allow that move of king
                                                 if(b[i][j].getIcon().toString().equals(bwk.getIcon().toString())){
                                                     
                                                         /****************************/
                                                            // north movement
                                                        /***************************/
                                                            int north=i-1;
                                                            if(north>=1){

                                                                if(b[north][j].getIcon()==null){
                                                                             kingCheck[north][j]=1;
                                                                         }
                                                                         if(b[north][j].getIcon()!=null){ // mark the white icon (because black king can kill the white icon)
                                                                                        if(    ( b[north][j].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                               ( b[north][j].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                               ( b[north][j].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                               ( b[north][j].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                               ( b[north][j].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                                               ( b[north][j].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                                ){
                                                                                             kingCheck[north][j]=1;
                                                                                         }
                                                                         }

                                                            }

                                                        /****************************/
                                                            // south movement
                                                        /***************************/

                                                            int south=i+1;
                                                            if(south<=8){

                                                                if(b[south][j].getIcon()==null){
                                                                             kingCheck[south][j]=1;
                                                                         }
                                                                         if(b[south][j].getIcon()!=null){ // mark the white icon (because black king can kill the white icon)
                                                                                        if(    ( b[south][j].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                               ( b[south][j].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                               ( b[south][j].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                               ( b[south][j].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                               ( b[south][j].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                                               ( b[south][j].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                                ){
                                                                                              kingCheck[south][j]=1;
                                                                                            }
                                                                         }
                                                            }

                                                        /****************************/
                                                            // Left movement
                                                        /***************************/

                                                        int left=j-1;
                                                        if(left>=1){

                                                            if(b[i][left].getIcon()==null){
                                                                             kingCheck[i][left]=1;
                                                                         }
                                                                         if(b[i][left].getIcon()!=null){ // mark the white icon (because black king can kill the white icon)
                                                                                        if(    ( b[i][left].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                               ( b[i][left].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                               ( b[i][left].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                               ( b[i][left].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                               ( b[i][left].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                                               ( b[i][left].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                                ){
                                                                                              kingCheck[i][left]=1;
                                                                                              }
                                                                         }
                                                        }

                                                         /****************************/
                                                            // Right movement
                                                        /***************************/

                                                        int right=j+1;

                                                        if(right<=8){

                                                            if(b[i][right].getIcon()==null){
                                                                             kingCheck[i][right]=1;
                                                                         }
                                                                         if(b[i][right].getIcon()!=null){ // mark the white icon (because black king can kill the white icon)
                                                                                        if(    ( b[i][right].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                               ( b[i][right].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                               ( b[i][right].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                               ( b[i][right].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                               ( b[i][right].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                                               ( b[i][right].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                                ){
                                                                                             kingCheck[i][right]=1;
                                                                                        }
                                                                         }
                                                        }

                                                                /**********************/
                                                                    //north-Left-move
                                                                /**********************/
                                                                    north=j-1;
                                                                     left=i-1;
                                                                    if(left>=1&&north>=1){

                                                                                  if(b[left][north].getIcon()==null ){
                                                                                      kingCheck[left][north]=1;
                                                                                  }

                                                                                   if(b[left][north].getIcon()!=null){ // mark the white icon (because black king can kill the white icon)
                                                                                                              if(    ( b[left][north].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                                                     ( b[left][north].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                                                     ( b[left][north].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                                                     ( b[left][north].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                                                     ( b[left][north].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                                                                     ( b[left][north].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                                                      ){
                                                                                                                   kingCheck[left][north]=1;
                                                                                                                 }
                                                                                               }
                                                                    }

                                                                    /***********************/
                                                                      //north-Right-move
                                                                    /***********************/
                                                                    north=i-1;
                                                                    right=j+1;
                                                                    if(north>=1&&right<=8){

                                                                                  if(b[north][right].getIcon()==null){
                                                                                      kingCheck[north][right]=1;
                                                                                  }

                                                                                   if(b[north][right].getIcon()!=null ){ // mark the white icon (because black king can kill the white icon)
                                                                                                              if(    ( b[north][right].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                                                     ( b[north][right].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                                                     ( b[north][right].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                                                     ( b[north][right].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                                                     ( b[north][right].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                                                                     ( b[north][right].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                                                      ){
                                                                                                                   kingCheck[north][right]=1;


                                                                                                              }
                                                                                               }
                                                                    }      

                                                                    /**********************/
                                                                     //south-Left-move
                                                                    /*********************/
                                                                    south=j-1;
                                                                    left=i+1;
                                                                    if(left<=8&&south>=1){

                                                                                  if(b[left][south].getIcon()==null){
                                                                                       kingCheck[left][south]=1;
                                                                                  }

                                                                                   if(b[left][south].getIcon()!=null ){ // mark the white icon (because black king can kill the white icon)
                                                                                                              if(    ( b[left][south].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                                                     ( b[left][south].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                                                     ( b[left][south].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                                                     ( b[left][south].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                                                     ( b[left][south].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                                                                     ( b[left][south].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                                                      ){
                                                                                                                    kingCheck[left][south]=1;

                                                                                                              }
                                                                                               }
                                                                    }    

                                                                    /************************/
                                                                        //south-Right-move
                                                                    /*************************/
                                                                    south=i+1;
                                                                    right=j+1;
                                                                    if(south<=8&&right<=8){

                                                                                  if(b[south][right].getIcon()==null ){
                                                                                       kingCheck[south][right]=1;
                                                                                  }

                                                                                   if(b[south][right].getIcon()!=null ){ // mark the white icon (because black king can kill the white icon)
                                                                                                              if(    ( b[south][right].getIcon().toString().equals(bwp.getIcon().toString()) ) ||
                                                                                                                     ( b[south][right].getIcon().toString().equals(bwe.getIcon().toString()) ) || 
                                                                                                                     ( b[south][right].getIcon().toString().equals(bwh.getIcon().toString()) ) ||
                                                                                                                     ( b[south][right].getIcon().toString().equals(bwc.getIcon().toString()) ) ||
                                                                                                                     ( b[south][right].getIcon().toString().equals(bwq.getIcon().toString()) )||
                                                                                                                     ( b[south][right].getIcon().toString().equals(bwk.getIcon().toString()) )
                                                                                                                      ){
                                                                                                                  kingCheck[south][right]=1;

                                                                                                              }
                                                                                               }
                                                                    }
                                                 }        
                                                 
                                              
                                    }
                                                            
                            } 
                   }    
      
  }

