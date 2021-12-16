package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;


public class DeleteCustomer extends JFrame implements ActionListener {
    JButton b1,b2;
    String username;
    DeleteCustomer(String user){
        this.username=user;
      setBounds(300,120,850,550);
      setLayout(null);
      getContentPane().setBackground(Color.white);

      JLabel l1=new JLabel("DELETE CUSTOMER DETAILS");
      l1.setFont(new Font("Tahoma",Font.PLAIN,20));
      l1.setBounds(300,20,300,50);
      l1.setForeground(Color.GREEN);
      add(l1);

        JLabel l2=new JLabel("Username");
        l2.setBounds(50,60,100,80);
        add(l2);

        JLabel l12=new JLabel();
        l12.setBounds(200,60,100,80);
        add(l12);

        JLabel l3=new JLabel("Name");
        l3.setBounds(50,100,100,80);
        add(l3);

        JLabel l13=new JLabel();
        l13.setBounds(200,100,100,80);
        add(l13);

        JLabel l4=new JLabel("Id");
        l4.setBounds(50,140,100,80);
        add(l4);

        JLabel l14=new JLabel();
        l14.setBounds(200,140,100,80);
        add(l14);

        JLabel l5=new JLabel("Number");
        l5.setBounds(50,180,100,80);
        add(l5);

        JLabel l15=new JLabel();
        l15.setBounds(200,180,100,80);
        add(l15);

        JLabel l6=new JLabel("Gender");
        l6.setBounds(50,220,100,80);
        add(l6);

        JLabel l16=new JLabel();
        l16.setBounds(200,220,100,80);
        add(l16);

        JLabel l7=new JLabel("Country");
        l7.setBounds(50,260,100,80);
        add(l7);

        JLabel l17=new JLabel();
        l17.setBounds(200,260,100,80);
        add(l17);

        JLabel l8=new JLabel("Address");
        l8.setBounds(50,300,100,80);
        add(l8);

        JLabel l18=new JLabel();
        l18.setBounds(200,300,100,80);
        add(l18);

        JLabel l9=new JLabel("Phone");
        l9.setBounds(50,340,100,80);
        add(l9);

        JLabel l19=new JLabel();
        l19.setBounds(200,340,100,80);
        add(l19);

        JLabel l10=new JLabel("Email");
        l10.setBounds(50,380,100,80);
        add(l10);

        JLabel l20=new JLabel();
        l20.setBounds(200,380,100,80);
        add(l20);

        try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("Select * from customer where username ='"+username+"'");
            while(rs.next()){
                l12.setText(rs.getString("username"));
                l13.setText(rs.getString("name"));
                l14.setText(rs.getString("id"));
                l15.setText(rs.getString("number"));
                l16.setText(rs.getString("gender"));
                l17.setText(rs.getString("country"));
                l18.setText(rs.getString("address"));
                l19.setText(rs.getString("phone"));
                l20.setText(rs.getString("email"));

            }
        }
        catch(Exception e){}

        b1=new JButton("Delete");
        b1.setBackground(Color.black);
        b1.setForeground(Color.yellow);
        b1.setBounds(100,450,100,40);
        b1.addActionListener(this);
        add(b1);

        b2=new JButton("Back");
        b2.setBackground(Color.black);
        b2.setForeground(Color.yellow);
        b2.setBounds(300,450,100,40);
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/delete.png"));
        Image i2=i1.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel l21=new JLabel(i3);
        l21.setBounds(500,100,300,300);
        add(l21);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            try{
                Conn c=new Conn();
                c.s.executeUpdate("delete from account where username='"+username+"'");
                c.s.executeUpdate("delete from bookhotel where username='"+username+"'");
                c.s.executeUpdate("delete from bookpackage where username='"+username+"'");
                c.s.executeUpdate("delete from customer where username='"+username+"'");

                JOptionPane.showMessageDialog(null,"Customer Details Deleted Sucessfully");
                System.exit(0);
            }catch(Exception e){}

        }
        else if(ae.getSource()==b1){
            this.setVisible(false);
        }
    }
    public static void main(String[] args){
        new DeleteCustomer("").setVisible(true);
    }
}
