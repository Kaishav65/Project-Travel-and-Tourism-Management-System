package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Payment1 extends JFrame implements ActionListener {
    JButton b1,b2;
    JTextField t1,t2,t3,t4,t5,t6;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    Payment1(){
        setBounds(350,200,700,450);  // main frame
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        l1=new JLabel("CHOOSE YOUR PAYMENT METHOD");
        l1.setBounds(250,10,500,50);
        l1.setForeground(Color.red);
        add(l1);

        l2=new JLabel("Enter Your Card Details");
        l2.setBounds(40,40,500,50);
        add(l2);

        l3=new JLabel("Enter Your username");
        l3.setBounds(40,80,200,50);
        add(l3);

        t1=new JTextField();
        t1.setBounds(300,96,150,20);
        add(t1);

        l4=new JLabel("Enter Your Card Number");
        l4.setBounds(40,120,200,50);
        add(l4);

        t2=new JTextField();
        t2.setBounds(300,136,150,20);
        add(t2);

        l5=new JLabel("Enter Name On Card");
        l5.setBounds(40,160,200,50);
        add(l5);

        t3=new JTextField();
        t3.setBounds(300,176,150,20);
        add(t3);

        l6=new JLabel("Enter Expiry Date");
        l6.setBounds(40,200,200,50);
        add(l6);

        t4=new JTextField();
        t4.setBounds(300,216,150,20);
        add(t4);

        l7=new JLabel("Enter CVV");
        l7.setBounds(40,240,200,50);
        add(l7);

        t5=new JPasswordField();
        t5.setBounds(300,256,150,20);
        add(t5);

        l8=new JLabel("Remarks");
        l8.setBounds(40,280,200,50);
        add(l8);

        t6=new JTextField();
        t6.setBounds(300,296,150,20);
        add(t6);

        b1=new JButton("Pay");
        b1.setBounds(200,350,80,40);
        b1.addActionListener(this);
        add(b1);

        b2=new JButton("Back");
        b2.setBounds(400,350,80,40);
        b2.addActionListener(this);
        add(b2);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            String EnterYourusername = t1.getText();
            String EnterYourCardNumber = t2.getText();
            String EnterNameOnCard = t3.getText();
            String EnterExpiryDate = t4.getText();
            String EnterCVV = t5.getText();
            String Remarks = t6.getText();
            String q = "insert into Paytm values('"+EnterYourusername+"','"+EnterYourCardNumber+"','"+EnterNameOnCard+"','"+EnterExpiryDate+"','"+EnterCVV+"','"+Remarks+"')";
            try{
                Conn c = new Conn();
                c.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Paid Successfully");
                this.setVisible(false);
            }catch (Exception w){
                System.out.println("error");
                System.out.println(w);
                w.printStackTrace();
            }

        }
        else if (e.getSource()==b2){
            this.setVisible(false);
        }
    }
    public static void main (String[] args){

        new Payment1().setVisible(true);
    }
}
