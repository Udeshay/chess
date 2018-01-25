/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

/**
 *
 * @author udeshay
 */
public class BlackWinFram extends javax.swing.JFrame {

    /**
     * Creates new form BlackWinFram
     */
    public BlackWinFram(String time) {
        initComponents();
        timeLabel.setText(time);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        blackWinPanel = new javax.swing.JPanel();
        congratulationLabel = new javax.swing.JLabel();
        blackWinnerLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        kingLabel2 = new javax.swing.JLabel();
        kingLabel3 = new javax.swing.JLabel();
        kingLabel1 = new javax.swing.JLabel();
        kingLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        blackWinPanel.setBackground(new java.awt.Color(0, 0, 0));
        blackWinPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 5));

        congratulationLabel.setFont(new java.awt.Font("Brush Script MT", 3, 60)); // NOI18N
        congratulationLabel.setForeground(new java.awt.Color(51, 255, 0));
        congratulationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        congratulationLabel.setText("Congratulation");

        blackWinnerLabel.setFont(new java.awt.Font("Brush Script MT", 3, 60)); // NOI18N
        blackWinnerLabel.setForeground(new java.awt.Color(51, 255, 0));
        blackWinnerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blackWinnerLabel.setText("Black is the winner");

        timeLabel.setFont(new java.awt.Font("Brush Script MT", 3, 60)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(51, 255, 0));
        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel.setText("00:00");

        kingLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kingLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/bking.png"))); // NOI18N

        kingLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kingLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/bking.png"))); // NOI18N

        kingLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kingLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/bking.png"))); // NOI18N

        kingLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kingLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/bking.png"))); // NOI18N

        javax.swing.GroupLayout blackWinPanelLayout = new javax.swing.GroupLayout(blackWinPanel);
        blackWinPanel.setLayout(blackWinPanelLayout);
        blackWinPanelLayout.setHorizontalGroup(
            blackWinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blackWinPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blackWinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, blackWinPanelLayout.createSequentialGroup()
                        .addComponent(kingLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(blackWinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(blackWinnerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                            .addComponent(congratulationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(3, 3, 3)
                        .addComponent(kingLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, blackWinPanelLayout.createSequentialGroup()
                        .addComponent(kingLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(kingLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        blackWinPanelLayout.setVerticalGroup(
            blackWinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blackWinPanelLayout.createSequentialGroup()
                .addGroup(blackWinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(blackWinPanelLayout.createSequentialGroup()
                        .addGroup(blackWinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(blackWinPanelLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(congratulationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(blackWinPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(blackWinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kingLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kingLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(blackWinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(blackWinPanelLayout.createSequentialGroup()
                                .addComponent(blackWinnerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 49, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, blackWinPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(kingLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(blackWinPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(kingLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(blackWinPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(blackWinPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(778, 469));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel blackWinPanel;
    private javax.swing.JLabel blackWinnerLabel;
    private javax.swing.JLabel congratulationLabel;
    private javax.swing.JLabel kingLabel1;
    private javax.swing.JLabel kingLabel2;
    private javax.swing.JLabel kingLabel3;
    private javax.swing.JLabel kingLabel4;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables
}