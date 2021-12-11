package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ViewPackage extends JFrame implements ActionListener
{
    JButton b1;
    ViewPackage(String username){
        setBounds(350,200,700,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/bookedDetails.jpg"));
        Image i2 = i1.getImage().getScaledInstance(350,350,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(350,20,350,350);
        add(l10);



        JLabel heading = new JLabel("VIEW PACKAGE DETAILS");
        heading.setBounds(25,10,200,30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(heading);

        JLabel l1 = new JLabel("Username");
        l1.setBounds(30,70,100,30);
        add(l1);

        JLabel l11 = new JLabel();
        l11.setBounds(200,70,200,30);
        add(l11);

        JLabel l2 = new JLabel("Package");
        l2.setBounds(30,100,100,30);
        add(l2);

        JLabel l12 = new JLabel();
        l12.setBounds(200,100,200,30);
        add(l12);

        JLabel l3 = new JLabel("Tolat Persons");
        l3.setBounds(30,130,100,30);
        add(l3);

        JLabel l13 = new JLabel();
        l13.setBounds(200,130,200,30);
        add(l13);

        JLabel l4 = new JLabel("Tolat Persons");
        l4.setBounds(30,160,100,30);
        add(l4);

        JLabel l14 = new JLabel();
        l14.setBounds(200,160,200,30);
        add(l14);

        JLabel l5 = new JLabel("Number");
        l5.setBounds(30,190,100,30);
        add(l5);

        JLabel l15 = new JLabel();
        l15.setBounds(200,190,200,30);
        add(l15);

        JLabel l6 = new JLabel("Phone");
        l6.setBounds(30,220,100,30);
        add(l6);

        JLabel l16 = new JLabel();
        l16.setBounds(200,220,200,30);
        add(l16);

        JLabel l7 = new JLabel("Price");
        l7.setBounds(30,250,100,30);
        add(l7);

        JLabel l17 = new JLabel();
        l17.setBounds(200,250,200,30);
        add(l17);

        b1 = new JButton("Back");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(130,300,150,25);
        b1.addActionListener(this);
        add(b1);

        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"'");
//            ResultSet rs = c.s.executeQuery("select * from bookPackage where username = 'kesj__7'");
            while (rs.next()){
                l11.setText(rs.getString(1));
                l12.setText(rs.getString(2));
                l13.setText(rs.getString(3));
                l14.setText(rs.getString(4));
                l15.setText(rs.getString(5));
                l16.setText(rs.getString(6));
                l17.setText(rs.getString(7));
            }
        }catch(Exception e){
        }
    }


    public static void main(String[] args) {
       new  ViewPackage("").setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.setVisible(false);
    }
}
