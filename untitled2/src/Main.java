import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Main{


    static JFrame frame = new JFrame("(^ HOUSE OF WISDOM ^)");

    static JLabel name = new JLabel("Name");
    static JTextField name_data = new JTextField();

    static JLabel pass = new JLabel("Password");
    static JPasswordField pass_data = new JPasswordField();

    static JButton display_info = new JButton("OK");
    static JLabel user_info = new JLabel();

    public static void main(String[] args) {
        name.setBounds(40,40,100,30);
        name_data.setBounds(150,40,150,30);

        pass.setBounds(40,100,100,30);
        pass_data.setBounds(150,100,150,30);

        display_info.setBounds(150,160,150,30);
        user_info.setBounds(150,220,300,30);

        frame.add(name);
        frame.add(name_data);
        frame.add(pass);
        frame.add(pass_data);
        frame.add(display_info);
        frame.add(user_info);
        frame.setSize(460,340);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        display_info.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name=name_data.getText();
                String pass=new String(pass_data.getPassword());
                // user_info.setText("Name: "+name +" password");
                if (pass.equals("1234")){
                    System.out.println("OK");
                    System.exit(0);
                }else System.out.println("Error");
                user_info.setText("Wrong Password");
            }
        });
    }}