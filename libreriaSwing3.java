import javax.swing.*;
public class libreriaSwing3 extends JFrame {
private JLabel label1;
private JLabel label2;
public libreriaSwing3(){
    setLayout(null);
    label1 = new JLabel("interfaz grafica");
    label1.setBounds(10,20,300,30);
    add(label1);
    label2 = new JLabel("version 1.0");
    label2.setBounds(10, 100, 100, 30);
    add(label2);
}
public static void main(String args[]){
    libreriaSwing3 libreriaswing3 = new libreriaSwing3();
    libreriaswing3.setBounds(0,0,300,200);
    libreriaswing3.setResizable(false);
    libreriaswing3.setVisible(true);
    libreriaswing3.setLocationRelativeTo(null);

}
}
