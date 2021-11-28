package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ViewCustomer extends JFrame implements ActionListener
{
    JButton b2;
    String username;

    // Constructor
    ViewCustomer(String username) {
        setBounds(350,200,700,450);  // main frame
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel l1 = new JLabel("username :");
        l1.setBounds(60,30,100,25);
        add(l1);

        JLabel l11 = new JLabel();
        l11.setBounds(180,30,200,25);
        add(l11);


        JLabel l2 = new JLabel("ID :");
        l2.setBounds(60,70,100,25);
        add(l2);

        JLabel l12 = new JLabel();
        l12.setBounds(180,70,200,25);
        add(l12);

        JLabel l3 = new JLabel("Number :");
        l3.setBounds(60,108,100,23);
        add(l3);

        JLabel l13 = new JLabel();
        l13.setBounds(180,108,200,23);
        add(l13);

        JLabel l4 = new JLabel("Name :");
        l4.setBounds(60,140,100,25);
        add(l4);

        JLabel l14 = new JLabel();
        l14.setBounds(180,140,200,25);
        add(l14);

        JLabel l5 = new JLabel("Gender :");
        l5.setBounds(60,175,100,25);
        add(l5);

        JLabel l15 = new JLabel();
        l15.setBounds(180,175,200,25);
        add(l15);

        JLabel l6 = new JLabel("Country :");
        l6.setBounds(370,30,100,25);
        add(l6);

        JLabel l16 = new JLabel();
        l16.setBounds(500,30,100,25);
        add(l16);

        JLabel l7 = new JLabel("Address :");
        l7.setBounds(370,70,100,25);
        add(l7);

        JLabel l17 = new JLabel();
        l17.setBounds(500,70,100,25);
        add(l17);

        JLabel l8 = new JLabel("Phone :");
        l8.setBounds(370,108,100,25);
        add(l8);

        JLabel l18 = new JLabel();
        l18.setBounds(500,108,100,25);
        add(l18);

        JLabel l9 = new JLabel("Email :");
        l9.setBounds(370,140,100,25);
        add(l9);

        JLabel l19 = new JLabel();
        l19.setBounds(500,140,100,25);
        add(l19);

        b2 = new JButton("Back");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(230,230,100,25);
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/viewall.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(35,250,600,200);
        add(l10);
        System.out.println(username);

        try{
            Conn c = new Conn();
//            ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"'");
            ResultSet rs = c.s.executeQuery("select * from customer where username = 'kesj__7'");
            while(rs.next()){
                l11.setText(rs.getString("username"));
                l12.setText(rs.getString("id"));
                l13.setText(rs.getString("number"));
                l14.setText(rs.getString("name"));
                l15.setText(rs.getString("gender"));
                l16.setText(rs.getString("country"));
                l17.setText(rs.getString("address"));
                l18.setText(rs.getString("phone"));
                l19.setText(rs.getString("email"));
            }
        }catch(Exception e){ e.printStackTrace();}

    }
    public static void main(String[] args) {
        new ViewCustomer("").setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b2)
        {
            this.setVisible(false);
        }


    }
}
