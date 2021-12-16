package travel.management.system;

import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener
{
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
    String username;
//    constructor
    Dashboard(String username){
        this.username = username;
//        this.name = name;
        setExtendedState(JFrame.MAXIMIZED_BOTH);  // set full screen
        setLayout(null);

//         top bar panel
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0,0,1750,40);
        p1.setBackground(new Color(0,0,102));
        add(p1);

//        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/dashboard.png"));
//        Image i5 = i4.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
//        ImageIcon i6 = new ImageIcon(i5);
//        JLabel l2 = new JLabel(i6);
//        l2.setBounds(5,0,70,70);
//        p1.add(l2);

        JLabel l3 = new JLabel("Dashboard");
        l3.setFont(new Font("Tahoma",Font.BOLD,20));
        l3.setForeground(Color.WHITE);
        l3.setBounds(50,7,300,30);
        p1.add(l3);

//        left panel
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(0,40,250,1000);
        p2.setBackground(new Color(0,0,102));
        add(p2);

        b1 = new JButton("Add Personal Details");
        b1.setBackground(new Color(0,0,102));
        b1.setFont(new Font("Railway",Font.PLAIN,15));
        b1.setForeground(Color.WHITE);
        b1.setMargin(new Insets(0,0,0,60));
        b1.setBounds(0,0,250,40);
        b1.addActionListener(this);
        p2.add(b1);

        b2 = new JButton("Update Personal Details");
        b2.setBackground(new Color(0,0,102));
        b2.setFont(new Font("Railway",Font.PLAIN,15));
        b2.setForeground(Color.WHITE);
        b2.setMargin(new Insets(0,0,0,40));
        b2.setBounds(0,40,250,40);
        b2.addActionListener(this);
        p2.add(b2);

        b3 = new JButton("View Details");
        b3.setBackground(new Color(0,0,102));
        b3.setFont(new Font("Railway",Font.PLAIN,15));
        b3.setForeground(Color.WHITE);
        b3.setMargin(new Insets(0,0,0,120));
        b3.setBounds(0,80,250,40);
        b3.addActionListener(this);
        p2.add(b3);

        JButton b4 = new JButton("Delete Personal Details");
        b4.setBackground(new Color(0,0,102));
        b4.setFont(new Font("Railway",Font.PLAIN,15));
        b4.setForeground(Color.WHITE);
        b4.setMargin(new Insets(0,0,0,40));
        b4.setBounds(0,120,250,40);
        p2.add(b4);

        b5 = new JButton("Check Packages");
        b5.setBackground(new Color(0,0,102));
        b5.setFont(new Font("Railway",Font.PLAIN,15));
        b5.setForeground(Color.WHITE);
        b5.setBounds(0,160,250,40);
        b5.setMargin(new Insets(0,0,0,85));
        b5.addActionListener(this);
        p2.add(b5);

        b6 = new JButton("Book Packages");
        b6.setBackground(new Color(0,0,102));
        b6.setFont(new Font("Railway",Font.PLAIN,15));
        b6.setForeground(Color.WHITE);
        b6.setBounds(0,200,250,40);
        b6.setMargin(new Insets(0,0,0,95));
        b6.addActionListener(this);
        p2.add(b6);

        b7 = new JButton("View Packages");
        b7.setBackground(new Color(0,0,102));
        b7.setFont(new Font("Railway",Font.PLAIN,15));
        b7.setForeground(Color.WHITE);
        b7.setBounds(0,240,250,40);
        b7.setMargin(new Insets(0,0,0,95));
        b7.addActionListener(this);
        p2.add(b7);

        b8 = new JButton("View Hotels");
        b8.setBackground(new Color(0,0,102));
        b8.setFont(new Font("Railway",Font.PLAIN,15));
        b8.setForeground(Color.WHITE);
        b8.setBounds(0,280,250,40);
        b8.setMargin(new Insets(0,0,0,120));
        b8.addActionListener(this);
        p2.add(b8);

        b9 = new JButton("Book Hotel");
        b9.setBackground(new Color(0,0,102));
        b9.setFont(new Font("Railway",Font.PLAIN,15));
        b9.setForeground(Color.WHITE);
        b9.setBounds(0,320,250,40);
        b9.setMargin(new Insets(0,0,0,120));
        b9.addActionListener(this);
        p2.add(b9);

        b10 = new JButton("View Book Hotel");
        b10.setBackground(new Color(0,0,102));
        b10.setFont(new Font("Railway",Font.PLAIN,15));
        b10.setForeground(Color.WHITE);
        b10.setBounds(0,360,250,40);
        b10.setMargin(new Insets(0,0,0,85));
        p2.add(b10);

        b11 = new JButton("Destination");
        b11.setBackground(new Color(0,0,102));
        b11.setFont(new Font("Railway",Font.PLAIN,15));
        b11.setForeground(Color.WHITE);
        b11.setBounds(0,400,250,40);
        b11.setMargin(new Insets(0,0,0,115));
        b11.addActionListener(this);
        p2.add(b11);

        b12 = new JButton("Payment");
        b12.setBackground(new Color(0,0,102));
        b12.setFont(new Font("Railway",Font.PLAIN,15));
        b12.setForeground(Color.WHITE);
        b12.setBounds(0,440,250,40);
        b12.setMargin(new Insets(0,0,0,125));
        b12.addActionListener(this);
        p2.add(b12);

        b13 = new JButton("Calculator");
        b13.setBackground(new Color(0,0,102));
        b13.setFont(new Font("Railway",Font.PLAIN,15));
        b13.setForeground(Color.WHITE);
        b13.setBounds(0,480,250,40);
        b13.addActionListener(this);
        b13.setMargin(new Insets(0,0,0,120));
        b13.addActionListener(this);
        p2.add(b13);

        b14 = new JButton("Notepad");
        b14.setBackground(new Color(0,0,102));
        b14.setFont(new Font("Railway",Font.PLAIN,15));
        b14.setForeground(Color.WHITE);
        b14.setBounds(0,520,250,40);
        b14.addActionListener(this);
        b14.setMargin(new Insets(0,0,0,130));
        b14.addActionListener(this);
        p2.add(b14);

        b15 = new JButton("About");
        b15.setBackground(new Color(0,0,102));
        b15.setFont(new Font("Railway",Font.PLAIN,15));
        b15.setForeground(Color.WHITE);
        b15.setBounds(0,560,250,40);
        b15.setMargin(new Insets(0,0,0,140));
        b15.addActionListener(this);
        p2.add(b15);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1750,1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1750,1000);
        add(l1);

        JLabel l4 = new JLabel("Travel and Tourism Management System");
        l4.setBounds(430,100,1000,45);
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("Tahuma",Font.PLAIN,38));
        l1.add(l4);
    }
    public static void main(String[] args) {
        new Dashboard("").setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b13){
            try{
                Runtime.getRuntime().exec("calc.exe");  // Access calculator
            }catch (Exception e1){
                System.out.println("error in accessing Calculator ");
            }

        } else if(e.getSource() == b14) {
            try{
                Runtime.getRuntime().exec("notepad.exe");  // Access notepad
            }catch (Exception e1)
            {
                System.out.println("error in accessing notepad");
            }
        }else if(e.getSource() == b1){
            new AddCustomer(username).setVisible(true);
        }else if(e.getSource() == b2){
            new UpdateCustomer(username).setVisible(true);
        }else if(e.getSource() == b3){
            new ViewCustomer(username).setVisible(true);
        }else if(e.getSource() == b5){
            new CheckPackage().setVisible(true);
        }else if(e.getSource() == b6){
            new BookPackage(username).setVisible(true);
        }else if(e.getSource() == b7){
            new ViewPackage(username).setVisible(true);
        }else if(e.getSource() == b8) {
            new CheckHotels().setVisible(true);
        }else if(e.getSource() == b11) {
            new Destination().setVisible(true);
        }else if(e.getSource() == b9) {
            new BookHotel(username).setVisible(true);
        }else if(e.getSource() == b10) {
            new ViewBookedHotel(username).setVisible(true);
        }else if(e.getSource() == b15) {
            new About().setVisible(true);
        } else if(e.getSource() == b4){
            new DeleteCustomer(username).setVisible(true);
        }else if(e.getSource() == b12){
            new Payment().setVisible(true);
        }
    }
}
