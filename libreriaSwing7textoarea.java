import javax.swing.*;
public class libreriaSwing7textoarea extends JFrame {
    private JTextField textfield1;
    private JTextArea textarea1;

    public libreriaSwing7textoarea(){
        setLayout(null);
        textfield1 = new JTextField();
        textfield1.setBounds(10,10,200,30);
        add(textfield1);

        textarea1 = new JTextArea();
        textarea1.setBounds(10,50,400,300);
        add(textarea1);
    }
    public static void main(String args[]){
        libreriaSwing7textoarea formulario1 = new libreriaSwing7textoarea();
        formulario1.setBounds(0,0,540,400);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }
}
