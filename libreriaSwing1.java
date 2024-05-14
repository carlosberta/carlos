import javax.swing.*;
public class libreriaSwing1 extends JFrame{
    private JLabel label1;

    public libreriaSwing1(){
        setLayout(null);
        label1 = new JLabel("la geepedia de ernesto");
        label1.setBounds(10, 20, 200, 300);
        add(label1);
    }
    public static void main(String args[]){
        libreriaSwing1 libreriaswing = new libreriaSwing1();
        libreriaswing.setBounds(0,0,400, 300);
        libreriaswing.setVisible(true);
        libreriaswing.setLocationRelativeTo(null);
    }
}
