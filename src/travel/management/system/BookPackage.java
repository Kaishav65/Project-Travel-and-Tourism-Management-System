package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class BookPackage extends JFrame implements ActionListener
{
    Choice c1;
    JLabel l11,l12,l13,l14,l15;
    JTextField t1;
    JButton b1,b2,b3;

    // constructor
    BookPackage (){
        setBounds(300,200,800,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/bookpackage.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400,250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l16 = new JLabel(i3);
        l16.setBounds(370,25,400,250);
        add(l16);

        JLabel l1 = new JLabel("BOOK PACKAGE");
        l1.setBounds(50,5,500,25);
        l1.setFont(new Font("Yu Mincho",Font.BOLD,15));
        add(l1);

        JLabel l2 = new JLabel("username");
        l2.setBounds(35,45,100,25);
        l2.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l2);

        l11 = new JLabel();
        l11.setBounds(200,35,100,25);
        l11.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l11);

        JLabel l3 = new JLabel("Select Package");
        l3.setBounds(35,80,110,25);
        l3.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l3);

        c1 = new Choice();
        c1.add("Gold Package");
        c1.add("Silver Package");
        c1.add("Bronze Package");
        c1.setBounds(200,80,150,25);
        add(c1);

        JLabel l4 = new JLabel("Total Person");
        l4.setBounds(35,115,110,25);
        l4.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l4);

        t1 = new JTextField("1");
        t1.setBounds(200,115,150,23);
        add(t1);

        JLabel l5 = new JLabel("ID: ");
        l5.setBounds(35,150,110,25);
        l5.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l5);

        l12 = new JLabel();
        l12.setBounds(200,150,150,23);
        l12.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l12);

        JLabel l6 = new JLabel("Number");
        l6.setBounds(35,185,110,25);
        l6.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l6);

        l13 = new JLabel();
        l13.setBounds(200,185,150,23);
        l13.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l13);

        JLabel l7 = new JLabel("phone");
        l7.setBounds(35,220,110,25);
        l7.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l7);

        l14 = new JLabel();
        l14.setBounds(200,220,150,23);
        l14.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l14);

        JLabel l8 = new JLabel("Total Price");
        l8.setBounds(35,260,110,25);
        l8.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l8);

        l15 = new JLabel();
        l15.setBounds(200,260,150,23);
        l15.setFont(new Font("Tahoma",Font.PLAIN,15));
        l15.setForeground(Color.RED);
        add(l15);
        // DataBase
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer where username = 'kesj__7'");
            while(rs.next()){
                l11.setText(rs.getString("username"));
                l12.setText(rs.getString("id"));
                l13.setText(rs.getString("number"));
                l14.setText(rs.getString("phone"));
            }
        }catch(Exception e){

        }


        b1 = new JButton("Check Price");
        b1.setBounds(40,300,110,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Book Package");
        b2.setBounds(165,300,120,30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("Back");
        b3.setBounds(300,300,110,30);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.white);
        b3.addActionListener(this);
        add(b3);

    }

    public static void main(String[] args) {
        new BookPackage().setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1){
            String p = c1.getSelectedItem();
            int cost = 0;
            if (p.equals("Gold Package")){
                cost += 12000;
            }else if(p.equals("Silver Package")){
                cost += 24000;
            }else if (p.equals("Bronze Package")){
                cost += 32000;
            }
            int persons = Integer.parseInt(t1.getText());
            cost *= persons;
            l15.setText("Rs "+ cost);

        }else if(e.getSource() == b2){
            try{
                Conn c = new Conn();
                c.s.executeUpdate("insert into bookPackage values('"+l11.getText()+"','"+c1.getSelectedItem()+"','"+t1.getText()+"','"+l12.getText()+"','"+l13.getText()+"','"+l14.getText()+"','"+l15.getText()+"')");
                JOptionPane.showMessageDialog(null,"Package Booked Successfully");
                this.setVisible(false);
            }catch (Exception a){

            }

        }else if(e.getSource() == b3){
            this.setVisible(false);

        }
    }
}
