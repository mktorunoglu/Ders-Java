import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
 
public class Game extends JFrame implements ActionListener{
    JButton b1 = new JButton();
    JButton b2 = new JButton();
    JButton b3 = new JButton();
    JButton b4 = new JButton();
    JButton b5 = new JButton();
    JButton b6 = new JButton();
    JButton b7 = new JButton();
    JButton b8 = new JButton();
    JButton b9 = new JButton();
    JLabel t1 = new JLabel("YOU WIN");
    JLabel t2 = new JLabel("YOU LOSE");

    int s1; int s2; int s3; int s4; int s5; int s6; int s7; int s8; int s9;
 
    public static void main(String[] args){
        Game window = new Game();
        window.setTitle("XOX the Game");
        window.setSize(225,225);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new GridLayout(3, 3));
    }

    public Game() {
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
    }

    public void winScreen(){
        remove(b1);
        remove(b2);
        remove(b3);
        remove(b4);
        remove(b5);
        remove(b6);
        remove(b7);
        remove(b8);
        remove(b9);
        add(t1);
    }

    public void loseScreen(){
        remove(b1);
        remove(b2);
        remove(b3);
        remove(b4);
        remove(b5);
        remove(b6);
        remove(b7);
        remove(b8);
        remove(b9);
        add(t2);
    }

    public void playerControl(){
        if(s1==1 & s2==1 & s3==1)
            winScreen();
        else if(s1==1 & s5==1 & s9==1)
            winScreen();
        else if(s1==1 & s4==1 & s7==1)
            winScreen();
        else if(s2==1 & s5==1 & s8==1)
            winScreen();
        else if(s3==1 & s6==1 & s9==1)
            winScreen();
        else if(s3==1 & s5==1 & s7==1)
            winScreen();
        else if(s4==1 & s5==1 & s6==1)
            winScreen();
        else if(s7==1 & s8==1 & s9==1)
            winScreen();
    }

    public void pcControl(){
        if(s1==2 & s2==2 & s3==2)
            loseScreen();
        else if(s1==2 & s5==2 & s9==2)
            loseScreen();
        else if(s1==2 & s4==2 & s7==2)
            loseScreen();
        else if(s2==2 & s5==2 & s8==2)
            loseScreen();
        else if(s3==2 & s6==2 & s9==2)
            loseScreen();
        else if(s3==2 & s5==2 & s7==2)
            loseScreen();
        else if(s4==2 & s5==2 & s6==2)
            loseScreen();
        else if(s7==2 & s8==2 & s9==2)
            loseScreen();
    }

    public void pcMove(){
        playerControl();
        for(int i=0; i<1; i++){
            Random rand = new Random();
            int n = rand.nextInt(9);
            if(n==0 & b1.isEnabled()==true){
                b1.setText("O");
                b1.setEnabled(false);
                s1=2;
            }
            else if(n==1 & b2.isEnabled()==true){
                b2.setText("O");
                b2.setEnabled(false);
                s2=2;
            }
            else if(n==2 & b3.isEnabled()==true){
                b3.setText("O");
                b3.setEnabled(false);
                s3=2;
            }
            else if(n==3 & b4.isEnabled()==true){
                b4.setText("O");
                b4.setEnabled(false);
                s4=2;
            }
            else if(n==4 & b5.isEnabled()==true){
                b5.setText("O");
                b5.setEnabled(false);
                s5=2;
            }
            else if(n==5 & b6.isEnabled()==true){
                b6.setText("O");
                b6.setEnabled(false);
                s6=2;
            }
            else if(n==6 & b7.isEnabled()==true){
                b7.setText("O");
                b7.setEnabled(false);
                s7=2;
            }
            else if(n==7 & b8.isEnabled()==true){
                b8.setText("O");
                b8.setEnabled(false);
                s8=2;
            }
            else if(n==8 & b9.isEnabled()==true){
                b9.setText("O");
                b9.setEnabled(false);
                s9=2;
            }
            else
            i--;
        }
        pcControl();
    }
 
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            b1.setText("X");
            b1.setEnabled(false);
            s1=1;
        }
        else if(e.getSource()==b2){
            b2.setText("X");
            b2.setEnabled(false);
            s2=1;
        }
        else if(e.getSource()==b3){
            b3.setText("X");
            b3.setEnabled(false);
            s3=1;
        }
        else if(e.getSource()==b4){
            b4.setText("X");
            b4.setEnabled(false);
            s4=1;
        }
        else if(e.getSource()==b5){
            b5.setText("X");
            b5.setEnabled(false);
            s5=1;
        }
        else if(e.getSource()==b6){
            b6.setText("X");
            b6.setEnabled(false);
            s6=1;
        }
        else if(e.getSource()==b7){
            b7.setText("X");
            b7.setEnabled(false);
            s7=1;
        }
        else if(e.getSource()==b8){
            b8.setText("X");
            b8.setEnabled(false);
            s8=1;
        }
        else if(e.getSource()==b9){
            b9.setText("X");
            b9.setEnabled(false);
            s9=1;
        }
        pcMove();
    }
}

