package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class ForgotPassword extends JFrame implements ActionListener
{
    // Global Variables
    JButton b1,b2,b3;
    JTextField t1,t2,t3,t4,t5;

    // constructor
    ForgotPassword(){
        // creating a frame
        setBounds(350,200,700,330);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        // Add a Image on right side
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/Icons/forgotpassword.jpg"));
        Image i2 = i1.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel l6 = new JLabel(i3);
        l6.setBounds(500,60,150,150);
        add(l6);

        // Left Panel
        JPanel p = new JPanel();
        p.setBounds(15,10,450,270);
        p.setLayout(null);
        add(p);

        JLabel l1 = new JLabel("username");
        l1.setBounds(25,20,100,25);
        l1.setFont(new Font("Tahoma",Font.BOLD,13));
        p.add(l1);

        t1 = new JTextField();
        t1.setBounds(150,20,180,25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p.add(t1);

        b1 = new JButton("Search");
        b1.setBounds(340,20,100,25);
        b1.setBackground(Color.GRAY);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        p.add(b1);


        JLabel l2 = new JLabel("name");
        l2.setBounds(25,60,100,25);
        l2.setFont(new Font("Tahoma",Font.BOLD,13));
        p.add(l2);

        t2 = new JTextField();
        t2.setBounds(150,60,180,25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p.add(t2);

        JLabel l3 = new JLabel("Security Question");
        l3.setBounds(25,100,120,25);
        l3.setFont(new Font("Tahoma",Font.BOLD,13));
        p.add(l3);

        t3 = new JTextField();
        t3.setBounds(150,100,180,25);
        t3.setBorder(BorderFactory.createEmptyBorder());
        p.add(t3);

        JLabel l4 = new JLabel("Answer");
        l4.setBounds(25,145,120,25);
        l4.setFont(new Font("Tahoma",Font.BOLD,13));
        p.add(l4);

        t4 = new JTextField();
        t4.setBounds(150,145,180,25);
        t4.setBorder(BorderFactory.createEmptyBorder());
        p.add(t4);

        b2 = new JButton("Retrieve");
        b2.setBounds(340,145,100,25);
        b2.setBackground(Color.GRAY);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        p.add(b2);

        JLabel l5 = new JLabel("Password");
        l5.setBounds(25,190,120,25);
        l5.setFont(new Font("Tahoma",Font.BOLD,13));
        p.add(l5);

        t5 = new JTextField();
        t5.setBounds(150,190,180,25);
        t5.setBorder(BorderFactory.createEmptyBorder());
        p.add(t5);

        b3 = new JButton("Back");
        b3.setBounds(160,230,100,25);
        b3.setBackground(Color.GRAY);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this); // perform Action on click
        p.add(b3);

    }

    public static void main(String[] args) {
        new ForgotPassword().setVisible(true);
    }


//    public void actionPerformed(ActionEvent e) {
//        Conn c = new Conn();
//
//        if(e.getSource() == b1)
//        {
//            try{
//                String sql = "select * from account where username == '"+t1.getText()+"'";
//                ResultSet rs = c.s.executeQuery(sql);
//                while(rs.next()){
//                    t2.setText(rs.getString("name"));
//                    t3.setText(rs.getString("security"));
//                }
//            }
//            catch(Exception a){
//                System.out.println("error");
//                System.out.println(a);
//                a.printStackTrace();
//            }
//        } else if (e.getSource() == b2)
//        {
//            try{
//                String sql = "select * from account where username == '"+t1.getText()+"' AND answer == '"+t4.getText()+"'" ;
//                ResultSet rs = c.s.executeQuery(sql);
//                while(rs.next()){
//                    t5.setText(rs.getString("password"));
//                }
//            }
//            catch(Exception b){
//                System.out.println("error");
//                System.out.println(b);
//                b.printStackTrace();
//            }
//
//        }else if(e.getSource() == b3)
//        {
//            this.setVisible(false); // close forgotPassword panel
//            new Login().setVisible(true); // b3 invoke Login frame
//        }
//    }
//}

    @Override
    public void actionPerformed(ActionEvent ae){
        try{
            Conn con = new Conn();
            if(ae.getSource() == b1){
                String sql = "select * from account where username=?";
                PreparedStatement st = con.c.prepareStatement(sql);

                st.setString(1, t1.getText());
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    t2.setText(rs.getString("name"));
                    t3.setText(rs.getString("security"));
                }

            }
            if(ae.getSource() == b2){
                String sql = "select * from account where answer=?";
                PreparedStatement st = con.c.prepareStatement(sql);

                st.setString(1, t4.getText());
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    t5.setText(rs.getString("password"));
                }

            }
            if(ae.getSource() == b3){
                this.setVisible(false);
                new Login().setVisible(true);

            }
        }catch(Exception e){

        }
    }

}