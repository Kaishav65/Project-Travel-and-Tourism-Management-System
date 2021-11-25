package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class UpdateCustomer extends JFrame implements ActionListener
{
    JButton b1,b2;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
    JRadioButton r1,r2;
    JComboBox c1;

    // Constructor
    UpdateCustomer(String username) {
        setBounds(350,200,700,450);  // main frame
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel l11 = new JLabel("UPDATE CUSTOMER DETAILS");
        l11.setBounds(50,0,500,25);
        l11.setFont(new Font("Tahoma",Font.BOLD,15));
        add(l11);

        JLabel l1 = new JLabel("username");
        l1.setBounds(30,30,100,25);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(150,30,200,25);
        add(t1);

        JLabel l2 = new JLabel("ID :");
        l2.setBounds(30,65,100,25);
        add(l2);

        t8 = new JTextField();
        t8.setBounds(150,65,200,25);
        add(t8);

        JLabel l3 = new JLabel("Number");
        l3.setBounds(30,98,100,23);
        add(l3);

        t2 = new JTextField();
        t2.setBounds(150,98,200,23);
        add(t2);

        JLabel l4 = new JLabel("Name");
        l4.setBounds(30,130,100,25);
        add(l4);

        t3 = new JTextField();
        t3.setBounds(150,130,200,25);
        add(t3);

        JLabel l5 = new JLabel("Gander");
        l5.setBounds(30,160,100,25);
        add(l5);

        t9 = new JTextField();
        t9.setBounds(150,160,200,25);
        add(t9);

        JLabel l6 = new JLabel("Country");
        l6.setBounds(30,190,100,25);
        add(l6);

        t4 = new JTextField();
        t4.setBounds(150,190,200,25);
        add(t4);

        JLabel l7 = new JLabel("Address");
        l7.setBounds(30,230,100,25);
        add(l7);

        t5 = new JTextField();
        t5.setBounds(150,230,200,25);
        add(t5);

        JLabel l8 = new JLabel("Phone");
        l8.setBounds(30,270,100,25);
        add(l8);

        t6 = new JTextField();
        t6.setBounds(150,270,200,25);
        add(t6);

        JLabel l9 = new JLabel("Email");
        l9.setBounds(30,310,100,25);
        add(l9);

        t7 = new JTextField();
        t7.setBounds(150,310,200,25);
        add(t7);

        b1 = new JButton("Update");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(100,350,100,25);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Back");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(230,350,100,25);
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/update.png"));
        Image i2 = i1.getImage().getScaledInstance(200,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(330,50,400,300);
        add(l10);
        System.out.println(username);

//        try{
//         Conn c = new Conn();
//         ResultSet rs = c.s.executeQuery("select * from account where username == '"+username+"'");
//         while (rs.next()){
//             t1.setText(rs.getString("username"));
//             t3.setText(rs.getString("name"));
//         }
//        }catch (Exception e)
//        {
//            e.printStackTrace();
//        }

        try{
            Conn c = new Conn();
//            ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"'");
            ResultSet rs = c.s.executeQuery("select * from customer where username = 'kesj__7'");
            while(rs.next()){
                t1.setText(rs.getString("username"));
                t2.setText(rs.getString("number"));
                t3.setText(rs.getString("name"));
                t4.setText(rs.getString("country"));
                t5.setText(rs.getString("address"));
                t6.setText(rs.getString("phone"));
                t7.setText(rs.getString("email"));
                t8.setText(rs.getString("id"));
                t9.setText(rs.getString("gender"));
            }
        }catch(Exception e){ e.printStackTrace();}

    }
    public static void main(String[] args) {
        new UpdateCustomer("").setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1)
        {
            String username = t1.getText();
            String id = (String) c1.getSelectedItem();
            String number = t2.getText();
            String name = t3.getName();
            String radio = null;
            if(r1.isSelected())
            {
                radio = "Male";
            }else if (r2.isSelected()){
                radio = "Female";
            }
            String country = t4.getText();
            String address = t5.getText();
            String phone = t6.getText();
            String email = t7.getText();

            String q = "insert into customer values('"+username+"','"+id+"','"+number+"','"+name+"','"+radio+"','"+country+"','"+address+"','"+phone+"','"+email+"')";

            try{
                Conn c = new Conn();
                c.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Customer Details Added Successfully");
                this.setVisible(false);
            }catch (Exception w){
                System.out.println("error");
                System.out.println(w);
                w.printStackTrace();
            }
        }
        else if(e.getSource()==b2)
        {
            this.setVisible(false);
            new Login().setVisible(true);
        }


    }
}
