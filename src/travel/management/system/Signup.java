package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class Signup extends JFrame implements ActionListener
{
    JButton b1, b2;
    JTextField t1, t2, t3, t4;
    Choice c1;

//    constructor Frame
    Signup(){
        setBounds(320,200,630,300);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

//        Left Panel
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(133, 193, 233));
        p1.setBounds(0,0,400,300);
        p1.setLayout(null);
        add(p1);

//        Label Username
        JLabel l1 = new JLabel("Username");
        l1.setFont(new Font("TAHOMA",Font.BOLD,13));
        l1.setBounds(30,15,100,20);
        p1.add(l1);
//        Text field for Username
        t1 = new JTextField();
        t1.setBounds(190,15,160,20);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t1);

//        Label Name
        JLabel l2 = new JLabel("Name");
        l2.setFont(new Font("TAHOMA",Font.BOLD,13));
        l2.setBounds(30,50,100,20);
        p1.add(l2);
//        Text field for name
        t2 = new JTextField();
        t2.setBounds(190,50,160,20);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t2);

//       Label Password
        JLabel l3 = new JLabel("Password");
        l3.setFont(new Font("TAHOMA",Font.BOLD,13));
        l3.setBounds(30,85,100,20);
        p1.add(l3);
//        Text field for Password
        t3 = new JTextField();
        t3.setBounds(190,85,160,20);
        t3.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t3);

//        Label  your security Question
        JLabel l4 = new JLabel("Security Question");
        l4.setFont(new Font("TAHOMA",Font.BOLD,13));
        l4.setBounds(30,120,125,20);
        p1.add(l4);
//        Choice field
        c1 = new Choice();
        c1.add("Your childhood nickname");
        c1.add("your school name");
        c1.add("your favorite place");
        c1.add("your favorite video game");
        c1.setBounds(190,120,160,20);
        p1.add(c1);

//       security Answers
        JLabel l5 = new JLabel("Answer");
        l5.setFont(new Font("TAHOMA",Font.BOLD,13));
        l5.setBounds(30,155,100,20);
        p1.add(l5);
//        Text field for Password
        t4 = new JTextField();
        t4.setBounds(190,155,160,20);
        t4.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t4);

        b1 = new JButton("Create");
        b1.setFont(new Font("TAHOMA",Font.BOLD,12));
        b1.setForeground(new Color(133,193,233));
        b1.setBackground(Color.WHITE);
        b1.setBounds(60,200,90,25);
        b1.addActionListener(this);
        p1.add(b1);

        b2 = new JButton("Back");
        b2.setFont(new Font("TAHOMA",Font.BOLD,12));
        b2.setForeground(new Color(133,193,233));
        b2.setBackground(Color.WHITE);
        b2.setBounds(225,200,90,25);
        b2.addActionListener(this);
        p1.add(b2);


//        Right Panel
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/signup.png"));
        Image i2 = i1.getImage().getScaledInstance(60,60,Image.SCALE_DEFAULT);
        JLabel l6 = new JLabel(i1);
        l6.setBounds(400,20,200,200);
        add(l6);

    }



    public static void main(String[] args) {
        new Signup().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1){
            String username = t1.getText();
            String name = t2.getText();
            String password = t3.getText();
            String security = c1.getSelectedItem();
            String answer = t4.getText();

//          String query = "insert into account values('"+username+"','"+name+"','"+password+"','"+security+"','"+answer+"')";
            String query = "insert into account values('"+username+"','"+name+"','"+security+"','"+answer+"','"+password+"')";
            try{
                Conn c = new Conn();
                c.s.executeUpdate(query);    // Execute query
                JOptionPane.showMessageDialog(null,"Account Created Successfully");

                this.setVisible(false);
                new Login().setVisible(true);
            }catch(Exception e1){
                System.out.println("error");
                System.out.println(e1);
            }

        }else if (e.getSource() == b2){
            new Login().setVisible(true);
            this.setVisible(false);
        }
    }
}
