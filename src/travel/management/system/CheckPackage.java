package travel.management.system;

import javax.swing.*;
import java.awt.*;

public class CheckPackage extends JFrame
{
//    constructor
    CheckPackage(){
        setBounds(300,180,700,450);     //frame

        String[] package1 = new String[]{"GOLD PACKAGE","6 Days and 7 Nights","Airport Assistance","Half Day City Tour","Daily Buffet","Welcome Drinks on Arrival","Full Days 3 Island Cruise","English Speaking Guide","BOOK NOW","Summer Holiday","Price Rs 12000/-","package1.jpg"};
        String[] package2 = new String[]{"SILVER PACKAGE","5 DAYS AND 6 NIGHTS","Toll Free and Entrance Free Tickets","Meet and Greet at Airport","Night safari","Full 3 days Cruise","Cruise with Dinner","English Speaking Guide","BOOK NOW","WINTER SPECIAL","Price Rs 24000/-","package2.jpg"};

        JTabbedPane pane = new JTabbedPane();
        JPanel p1 = createPanel(package1);
        pane.addTab("Package 1",null,p1);
        JPanel p2 = createPanel(package2);
        pane.addTab("Package 2",null,p2);
        pane.addTab("Package 3",null,new JPanel());
        add(pane, BorderLayout.CENTER);
    }

    // create plane for first tab
    public JPanel createPanel(String [] pack){
        JPanel p1 = new JPanel();p1.setLayout(null);
        p1.setBackground(Color.WHITE);

        JLabel l1 = new JLabel(pack[0]);
        l1.setBounds(50,5,300,30);
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l1);

        JLabel l2 = new JLabel(pack[1]);
        l2.setBounds(30,40,300,30);
        l2.setForeground(Color.RED);
        l2.setFont(new Font("Tahoma",Font.PLAIN,15));
        p1.add(l2);

        JLabel l3 = new JLabel(pack[2]);
        l3.setBounds(30,70,300,30);
        l3.setForeground(Color.BLUE);
        l3.setFont(new Font("Tahoma",Font.PLAIN,15));
        p1.add(l3);

        JLabel l4 = new JLabel(pack[3]);
        l4.setBounds(30,100,300,30);
        l4.setForeground(Color.RED);
        l4.setFont(new Font("Tahoma",Font.PLAIN,15));
        p1.add(l4);

        JLabel l5 = new JLabel(pack[4]);
        l5.setBounds(30,130,300,30);
        l5.setForeground(Color.BLUE);
        l5.setFont(new Font("Tahoma",Font.PLAIN,15));
        p1.add(l5);

        JLabel l6 = new JLabel(pack[5]);
        l6.setBounds(30,160,300,30);
        l6.setForeground(Color.RED);
        l6.setFont(new Font("Tahoma",Font.PLAIN,15));
        p1.add(l6);

        JLabel l7 = new JLabel(pack[6]);
        l7.setBounds(30,190,300,30);
        l7.setForeground(Color.BLUE);
        l7.setFont(new Font("Tahoma",Font.PLAIN,15));
        p1.add(l7);

        JLabel l8 = new JLabel(pack[7]);
        l8.setBounds(30,220,300,30);
        l8.setForeground(Color.RED);
        l8.setFont(new Font("Tahoma",Font.PLAIN,15));
        p1.add(l8);

        JLabel l9 = new JLabel(pack[8]);
        l9.setBounds(30,250,300,30);
        l9.setForeground(Color.BLUE);
        l9.setFont(new Font("Tahoma",Font.BOLD,15));
        p1.add(l9);

        JLabel l10 = new JLabel(pack[9]);
        l10.setBounds(200,280,300,30);
        l10.setForeground(Color.RED);
        l10.setFont(new Font("Tahoma",Font.PLAIN,15));
        p1.add(l10);

        JLabel l11 = new JLabel(pack[10]);
        l11.setBounds(500,280,300,30);
        l11.setForeground(Color.BLUE);
        l11.setFont(new Font("Tahoma",Font.BOLD,15));
        p1.add(l11);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/"+pack[11]));
        Image i2 = i1.getImage().getScaledInstance(350,250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l12 = new JLabel(i3);
        l12.setBounds(300,30,350,250);
        add(l12);


        return p1;
    }
    public static void main(String[] args) {
        new CheckPackage().setVisible(true);
    }
}
