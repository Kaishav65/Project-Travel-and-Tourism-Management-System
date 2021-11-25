package travel.management.system;
import javax.swing.*;
import java.awt.*;
public class Splash
{
    public static void main(String[] args) {

        SplashFrame frame =  new SplashFrame();
        frame.setVisible(true);
        int x = 400;

        for (int i = 0; i <= 600; i++){
           frame.setLocation(140,100);
           frame.setSize(1000,600);
//           frame.setLocation(600,280);
//            frame.setLocation(600,280);
//            frame.setSize(x+i,i);
//            frame.setSize(x+i,i);
           try{
               Thread.sleep(1);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
        }

       frame.setVisible(true);
    }
}

class SplashFrame extends JFrame implements Runnable
{
//    JFrame f = new JFrame();

    Thread t1;
    SplashFrame()
    { ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/splash.jpg"));
       Image i2 = i1.getImage().getScaledInstance(1000,600,Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        add(l1);
//        setBounds(140,100,1000,600);  // splash.jpg image

        t1 = new Thread(this);
        t1.start();
    }

    @Override
    public void run() {
        try{
            Thread.sleep(7000);
            this.setVisible(false);
            new Login().setVisible(true);
        }catch(Exception e){

        }
    }
}
//{
//        int x = 400;
//        for (int i = 0; i <= 600; i++){
////           frame.setLocation(140,100);
////           frame.setSize(1000,600);
////           frame.setLocation(600,280);
//        frame.setLocation(600,280);
//        frame.setSize(x+i,i);
//        }