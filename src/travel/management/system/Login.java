package travel.management.system;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener
{
    JButton b1,b2,b3;
    JTextField t1;
    JPasswordField t2;
    Login(){
        setLayout(null);  //BorderLayout, FlowLayout,GridLayout, Grid//
        getContentPane().setBackground(Color.WHITE);


        setSize(580,300);
        setLocation(400,280);
//        setBounds(440,300,530,270);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(131,193,233));
        p1.setBounds(0,0,235,260);
        p1.setLayout(null);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(40,40,150,150);
        p1.add(l1);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(235,5,320,250);
        add(p2);

//        labels Userame
        JLabel l2 = new JLabel("Username");
        l2.setBounds(50,20,100,25);
        l2.setFont(new Font("SAN_SERIF", Font.PLAIN,13));
        p2.add(l2);
//        usernsme text field
        t1 = new JTextField();
        t1.setBounds(50,50,200,25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t1);

//        labels password
        JLabel l3 = new JLabel("Password");
        l3.setBounds(50,90,100,25);
        l3.setFont(new Font("SAN_SERIF", Font.PLAIN,13));
        p2.add(l3);
//        passwoed text field and add password field
        t2 = new JPasswordField();
        t2.setBounds(50,115,200,25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t2);

//        Buttons Login
        b1 = new JButton(("Login"));
        b1.setBounds(50,160,90,30);
        b1.setBackground(new Color(133,193,233));
        b1.setForeground(Color.WHITE);
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.addActionListener(this);
        p2.add(b1);

//        Button signup
        b2 = new JButton(("Signup"));
        b2.setBounds(160,160,90,30);
        b2.setBackground(Color.WHITE);
        b2.setForeground(new Color(133,193,233));
        b2.setBorder(new LineBorder(new Color(133,193,233)));
        b2.addActionListener(this);
        p2.add(b2);

//        Button Forget password
        b3 = new JButton(("Forgot Password"));
        b3.setBounds(85,210,130,30);
        b3.setBackground(Color.WHITE);
        b3.setForeground(new Color(133,193,233));
        b3.setBorder(new LineBorder(new Color(133,193,233)));
        b3.addActionListener(this);
        p2.add(b3);

//        trouble in login
        JLabel l4 =new JLabel("Trouble in Login...");
        l4.setBounds(215,210,150,30);
        p2.add(l4);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1){
            try{
                String username = t1.getText();
                String password = t2.getText();
                String sql = "select * from account where username = '"+username+"' AND password = '" +password+"'";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(sql);
                if (rs.next()){
                    this.setVisible(false);
                    new Loading(username).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null,"Invalid Login");
                }
            }catch (Exception e){

            }

        } else if (ae.getSource() == b2){
            this.setVisible(false);
            new Signup().setVisible(true);
        }else if (ae.getSource() == b3) {
            this.setVisible(false);
            new ForgotPassword().setVisible(true);

        }

    }
}
