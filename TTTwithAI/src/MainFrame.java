
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mkgaurab
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    private int XWins = 0;
    private int OWins = 0;
    private int Draws = 0;

    private static final long serialVersionUID = 1L;
    private JLabelBox P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16;
    private TicTacToeAI TTT;

    public class JLabelBox extends JLabel {

        private static final long serialVersionUID = 1L;
        public int Field = 0;
    }

    public MainFrame() {
        initComponents();
        TTT = new TicTacToeAI();
        P1 = new JLabelBox();
        P1.Field = 1;
        P1.addMouseListener(new LabelAdapter(P1));
        P1.setFont(new Font("Tahoma", Font.BOLD, 49));
        P1.setForeground(Color.GREEN);
        P1.setBackground(new Color(0, 0, 0));
        P1.setHorizontalAlignment(SwingConstants.CENTER);
        P1.setBounds(10, 10, 64, 64);
        P1.setOpaque(true);
        BoardPanel.add(P1);
        P2 = new JLabelBox();
        P2.Field = 2;
        P2.addMouseListener(new LabelAdapter(P2));
        P2.setOpaque(true);
        P2.setHorizontalAlignment(SwingConstants.CENTER);
        P2.setForeground(Color.GREEN);
        P2.setFont(new Font("Tahoma", Font.BOLD, 49));
        P2.setBackground(Color.BLACK);
        P2.setBounds(76, 10, 64, 64);
        BoardPanel.add(P2);

        P3 = new JLabelBox();
        P3.Field = 3;
        P3.addMouseListener(new LabelAdapter(P3));
        P3.setOpaque(true);
        P3.setHorizontalAlignment(SwingConstants.CENTER);
        P3.setForeground(Color.GREEN);
        P3.setFont(new Font("Tahoma", Font.BOLD, 49));
        P3.setBackground(Color.BLACK);
        P3.setBounds(142, 10, 64, 64);
        BoardPanel.add(P3);

        P4 = new JLabelBox();
        P4.Field = 4;
        P4.addMouseListener(new LabelAdapter(P4));
        P4.setOpaque(true);
        P4.setHorizontalAlignment(SwingConstants.CENTER);
        P4.setForeground(Color.GREEN);
        P4.setFont(new Font("Tahoma", Font.BOLD, 49));
        P4.setBackground(Color.BLACK);
        P4.setBounds(208, 10, 64, 64);
        BoardPanel.add(P4);

        P5 = new JLabelBox();
        P5.Field = 5;
        P5.addMouseListener(new LabelAdapter(P5));
        P5.setOpaque(true);
        P5.setHorizontalAlignment(SwingConstants.CENTER);
        P5.setForeground(Color.GREEN);
        P5.setFont(new Font("Tahoma", Font.BOLD, 49));
        P5.setBackground(Color.BLACK);
        P5.setBounds(10, 76, 64, 64);
        BoardPanel.add(P5);

        P6 = new JLabelBox();
        P6.Field = 6;
        P6.addMouseListener(new LabelAdapter(P6));
        P6.setOpaque(true);
        P6.setHorizontalAlignment(SwingConstants.CENTER);
        P6.setForeground(Color.GREEN);
        P6.setFont(new Font("Tahoma", Font.BOLD, 49));
        P6.setBackground(Color.BLACK);
        P6.setBounds(76, 76, 64, 64);
        BoardPanel.add(P6);

        P7 = new JLabelBox();
        P7.Field = 7;
        P7.addMouseListener(new LabelAdapter(P7));
        P7.setOpaque(true);
        P7.setHorizontalAlignment(SwingConstants.CENTER);
        P7.setForeground(Color.GREEN);
        P7.setFont(new Font("Tahoma", Font.BOLD, 49));
        P7.setBackground(Color.BLACK);
        P7.setBounds(142, 76, 64, 64);
        BoardPanel.add(P7);

        P8 = new JLabelBox();
        P8.Field = 8;
        P8.addMouseListener(new LabelAdapter(P8));
        P8.setOpaque(true);
        P8.setHorizontalAlignment(SwingConstants.CENTER);
        P8.setForeground(Color.GREEN);
        P8.setFont(new Font("Tahoma", Font.BOLD, 49));
        P8.setBackground(Color.BLACK);
        P8.setBounds(208, 76, 64, 64);
        BoardPanel.add(P8);

        P9 = new JLabelBox();
        P9.Field = 9;
        P9.addMouseListener(new LabelAdapter(P9));
        P9.setOpaque(true);
        P9.setHorizontalAlignment(SwingConstants.CENTER);
        P9.setForeground(Color.GREEN);
        P9.setFont(new Font("Tahoma", Font.BOLD, 49));
        P9.setBackground(Color.BLACK);
        P9.setBounds(10, 142, 64, 64);
        BoardPanel.add(P9);

        P10 = new JLabelBox();
        P10.Field = 10;
        P10.addMouseListener(new LabelAdapter(P10));
        P10.setOpaque(true);
        P10.setHorizontalAlignment(SwingConstants.CENTER);
        P10.setForeground(Color.GREEN);
        P10.setFont(new Font("Tahoma", Font.BOLD, 49));
        P10.setBackground(Color.BLACK);
        P10.setBounds(76, 142, 64, 64);
        BoardPanel.add(P10);

        P11 = new JLabelBox();
        P11.Field = 11;
        P11.addMouseListener(new LabelAdapter(P11));
        P11.setOpaque(true);
        P11.setHorizontalAlignment(SwingConstants.CENTER);
        P11.setForeground(Color.GREEN);
        P11.setFont(new Font("Tahoma", Font.BOLD, 49));
        P11.setBackground(Color.BLACK);
        P11.setBounds(142, 142, 64, 64);
        BoardPanel.add(P11);

        P12 = new JLabelBox();
        P12.Field = 12;
        P12.addMouseListener(new LabelAdapter(P12));
        P12.setOpaque(true);
        P12.setHorizontalAlignment(SwingConstants.CENTER);
        P12.setForeground(Color.GREEN);
        P12.setFont(new Font("Tahoma", Font.BOLD, 49));
        P12.setBackground(Color.BLACK);
        P12.setBounds(208, 142, 64, 64);
        BoardPanel.add(P12);

        P13 = new JLabelBox();
        P13.Field = 13;
        P13.addMouseListener(new LabelAdapter(P13));
        P13.setOpaque(true);
        P13.setHorizontalAlignment(SwingConstants.CENTER);
        P13.setForeground(Color.GREEN);
        P13.setFont(new Font("Tahoma", Font.BOLD, 49));
        P13.setBackground(Color.BLACK);
        P13.setBounds(10, 208, 64, 64);
        BoardPanel.add(P13);

        P14 = new JLabelBox();
        P14.Field = 14;
        P14.addMouseListener(new LabelAdapter(P14));
        P14.setOpaque(true);
        P14.setHorizontalAlignment(SwingConstants.CENTER);
        P14.setForeground(Color.GREEN);
        P14.setFont(new Font("Tahoma", Font.BOLD, 49));
        P14.setBackground(Color.BLACK);
        P14.setBounds(76, 208, 64, 64);
        BoardPanel.add(P14);

        P15 = new JLabelBox();
        P15.Field = 15;
        P15.addMouseListener(new LabelAdapter(P15));
        P15.setOpaque(true);
        P15.setHorizontalAlignment(SwingConstants.CENTER);
        P15.setForeground(Color.GREEN);
        P15.setFont(new Font("Tahoma", Font.BOLD, 49));
        P15.setBackground(Color.BLACK);
        P15.setBounds(142, 208, 64, 64);
        BoardPanel.add(P15);

        P16 = new JLabelBox();
        P16.Field = 16;
        P16.addMouseListener(new LabelAdapter(P16));
        P16.setOpaque(true);
        P16.setHorizontalAlignment(SwingConstants.CENTER);
        P16.setForeground(Color.GREEN);
        P16.setFont(new Font("Tahoma", Font.BOLD, 49));
        P16.setBackground(Color.BLACK);
        P16.setBounds(208, 208, 64, 64);
        BoardPanel.add(P16);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BoardPanel = new javax.swing.JPanel();
        NewGame = new javax.swing.JButton();
        LebelDraws = new javax.swing.JLabel();
        LebelXwins = new javax.swing.JLabel();
        LebelOwins = new javax.swing.JLabel();
        BTNReset = new javax.swing.JButton();
        BTNAIvsAI = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(541, 398));

        javax.swing.GroupLayout BoardPanelLayout = new javax.swing.GroupLayout(BoardPanel);
        BoardPanel.setLayout(BoardPanelLayout);
        BoardPanelLayout.setHorizontalGroup(
            BoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
        );
        BoardPanelLayout.setVerticalGroup(
            BoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
        );

        NewGame.setText("New Game");
        NewGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewGameMouseClicked(evt);
            }
        });

        LebelDraws.setText("Draws: ");

        LebelXwins.setText("X wins");

        LebelOwins.setText("O wins");

        BTNReset.setText("Reset");
        BTNReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNResetMouseClicked(evt);
            }
        });

        BTNAIvsAI.setText("AI vs AI");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BoardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LebelDraws, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LebelXwins, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(LebelOwins, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(BTNReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTNAIvsAI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(NewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BoardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(LebelXwins, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(LebelOwins, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LebelDraws, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(BTNReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNAIvsAI)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(NewGame)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewGameMouseClicked
        // TODO add your handling code here:
        P1.setText("");
        P2.setText("");
        P3.setText("");
        P4.setText("");
        P5.setText("");
        P6.setText("");
        P7.setText("");
        P8.setText("");
        P9.setText("");
        P10.setText("");
        P11.setText("");
        P12.setText("");
        P13.setText("");
        P14.setText("");
        P15.setText("");
        P16.setText("");
        TTT.NewGame();
    }//GEN-LAST:event_NewGameMouseClicked

    private void BTNResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNResetMouseClicked
        // TODO add your handling code here:
        SetCounters(0);
    }//GEN-LAST:event_BTNResetMouseClicked

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    public void SetCounters(int Num) {
        switch (Num) {
            case 1:
                XWins++;
                break;
            case -1:
                OWins++;
                break;
            case 2:
                Draws++;
                break;
            case 0:
                XWins = 0;
                OWins = 0;
                Draws = 0;
                break;
        }
        LebelXwins.setText("X wins: " + XWins + "");
        LebelOwins.setText("O wins: " + OWins + "");
        LebelDraws.setText("Draws : " + Draws + "");
    }

    class LabelAdapter extends MouseAdapter {

        JLabelBox sender;

        public LabelAdapter(JLabelBox sender) {
            this.sender = sender;
        }

        public void mouseReleased(MouseEvent me) {
            int GO = TTT.isGameOver();
            if (TTT.Move(sender.Field, 1) && GO == 0) {
                sender.setForeground(Color.GREEN);
                sender.setText("X");
                ComputerMove(-1, Color.RED, 0);
                if ((GO = TTT.isGameOver()) != 0) {
                    SetCounters(GO);
                }
            }
            System.out.println("X board: " + Long.toBinaryString(TTT.getX()));
            System.out.println("O board: " + Long.toBinaryString(TTT.getO()));
            System.out.println("Got Board: "+Long.toBinaryString(TTT.getBoard()));
        }
    }

    private void ComputerMove(int player, Color pcolor, int move) {
        System.out.println("Just in my Thinking!");
        if (move == 0) {
            move = TTT.isGameOver() == 0 ? TTT.GenerateMove(player) : 0;
        }
        String PText = (player == 1) ? "X" : "O";
        System.out.println("Got my move : " + move);
        switch (move) {
            case 1:
                P1.setForeground(pcolor);
                P1.setText(PText);
                TTT.Move(move, player);
                break;
            case 2:
                P2.setForeground(pcolor);
                P2.setText(PText);
                TTT.Move(move, player);
                break;
            case 3:
                P3.setForeground(pcolor);
                P3.setText(PText);
                TTT.Move(move, player);
                break;
            case 4:
                P4.setForeground(pcolor);
                P4.setText(PText);
                TTT.Move(move, player);
                break;
            case 5:
                P5.setForeground(pcolor);
                P5.setText(PText);
                TTT.Move(move, player);
                break;
            case 6:
                P6.setForeground(pcolor);
                P6.setText(PText);
                TTT.Move(move, player);
                break;
            case 7:
                P7.setForeground(pcolor);
                P7.setText(PText);
                TTT.Move(move, player);
                break;
            case 8:
                P8.setForeground(pcolor);
                P8.setText(PText);
                TTT.Move(move, player);
                break;
            case 9:
                P9.setForeground(pcolor);
                P9.setText(PText);
                TTT.Move(move, player);
                break;
            case 10:
                P10.setForeground(pcolor);
                P10.setText(PText);
                TTT.Move(move, player);
                break;
            case 11:
                P11.setForeground(pcolor);
                P11.setText(PText);
                TTT.Move(move, player);
                break;
            case 12:
                P12.setForeground(pcolor);
                P12.setText(PText);
                TTT.Move(move, player);
                break;
            case 13:
                P13.setForeground(pcolor);
                P13.setText(PText);
                TTT.Move(move, player);
                break;
            case 14:
                P14.setForeground(pcolor);
                P14.setText(PText);
                TTT.Move(move, player);
                break;
            case 15:
                P15.setForeground(pcolor);
                P15.setText(PText);
                TTT.Move(move, player);
                break;
            case 16:
                P16.setForeground(pcolor);
                P16.setText(PText);
                TTT.Move(move, player);
                break;
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNAIvsAI;
    private javax.swing.JButton BTNReset;
    private javax.swing.JPanel BoardPanel;
    private javax.swing.JLabel LebelDraws;
    private javax.swing.JLabel LebelOwins;
    private javax.swing.JLabel LebelXwins;
    private javax.swing.JButton NewGame;
    // End of variables declaration//GEN-END:variables
}
