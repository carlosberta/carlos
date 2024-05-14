import javax.swing.*;
import java.awt.event.*;
public class libreriaSwing4jbutton extends JFrame implements ActionListener{
    JButton boton1;
    public libreriaSwing4jbutton(){
setLayout(null);
boton1 = new JButton("cerrar");
boton1.setBounds(300,250,100,30);
add(boton1);
boton1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
System.exit(0);
        }
    }
    public static void main(String args[]){
        libreriaSwing4jbutton formulario1 = new libreriaSwing4jbutton();
        formulario1.setBounds(0,0, 400,350);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }
}
