import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class libreriaSwing13menubar extends JFrame implements ActionListener{
    private JMenuBar menubar;
    private JMenu menu1;
    private JMenuItem menuitem1, menuiten2, menuitem3;

    public libreriaSwing13menubar(){
        setLayout(null);
        menubar = new JMenuBar();
        setJMenuBar(menubar);

        menu1 = new JMenu("opciones");
        menubar.add(menu1);

        menuitem1 = new JMenuItem("rojo");
        menuitem1.addActionListener(this);
        menu1.add(menuitem1);

        menuiten2 = new JMenuItem("verde");
        menuiten2.addActionListener(this);
        menu1.add(menuiten2);

        menuitem3 = new JMenuItem("azul");
        menuitem3.addActionListener(this);
        menu1.add(menuitem3);
    }
    public void actionPerformed(ActionEvent e){
        Container fondo = this.getContentPane();

        if(e.getSource() == menuitem1){
            fondo.setBackground(new Color(255,0,0));
        }
        if(e.getSource()== menuiten2){
            fondo.setBackground(new Color(0,255,0));
        }
        if(e.getSource()==menuitem3){
            fondo.setBackground(new Color(0,0,255));
        }
    }
    public static void main(String args[]){
        libreriaSwing13menubar formulario1 = new libreriaSwing13menubar();
        formulario1.setBounds(0,0,400,300);
        formulario1.setVisible(true);
        formulario1.setLocationRelativeTo(null);
    }
}