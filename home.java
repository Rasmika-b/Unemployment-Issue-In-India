package nosqplpj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static java.awt.image.ImageObserver.ABORT;

public class Home extends JFrame implements ActionListener{
private JPanel contentPane;
 private JButton b1,b2,b3,b4,b5,b6,b7;
public static void main(String[] args) {
 new Home().setVisible(true);
}
 
 public Home() {
 setBounds(430, 150, 1030, 700);
 contentPane = new JPanel();
 setContentPane(contentPane);
 contentPane.setLayout(null);
 
 JMenuBar menuBar = new JMenuBar();
 menuBar.setBackground(new Color(23, 181, 72));
 menuBar.setBounds(0, 0, 1200, 35);
 contentPane.add(menuBar);
 JMenu mnExit = new JMenu("Come out");
 mnExit.setFont(new Font("TimesNewRoman", Font.BOLD |Font.ITALIC, 16));
 
 
 JMenuItem mntmLogout = new JMenuItem("Logout");
 mntmLogout.setBackground(new Color(211, 211, 211));
 mntmLogout.setForeground(new Color(105, 105, 105));
 mntmLogout.addActionListener(this);

 mnExit.add(mntmLogout);
 
 JMenuItem mntmExit = new JMenuItem("Exit");
 mntmExit.setForeground(new Color(105, 105, 105));
 mntmExit.setBackground(new Color(211, 211, 211));
 mntmExit.addActionListener(this);
 mnExit.add(mntmExit);
 menuBar.add(mnExit);
 
 JLabel l1 = new JLabel("Job Availibility");
 l1.setForeground(new Color(204, 0, 0));
 l1.setFont(new Font("TimesNewRoman", Font.BOLD|Font.ITALIC, 30));
 l1.setBounds(350, 30, 701, 80);
 contentPane.add(l1);
 
 b1 = new JButton("Register company");
 b1.addActionListener(this);
 b1.setBackground(new Color(23, 181, 72));
 b1.setFont(new Font("TimesNewRoman", Font.PLAIN | Font.BOLD, 14));
 b1.setForeground(Color.WHITE);
 b1.setBounds(60, 280, 159, 44);
 contentPane.add(b1);
   
 b4 = new JButton("View Jobs");
 b4.addActionListener(this);
 b4.setBackground(new Color(23, 181, 72));
 b4.setFont(new Font("TimesNewRoman", Font.PLAIN | Font.BOLD, 14));
 b4.setForeground(Color.WHITE);
 b4.setBounds(360, 280, 159, 44);
 contentPane.add(b4);
   
 b6 = new JButton("Edit Companies");
 b6.addActionListener(this);
 b6.setBackground(new Color(23, 181, 72));
 b6.setFont(new Font("TimesNewRoman", Font.PLAIN | Font.BOLD, 14));
 b6.setForeground(Color.WHITE);
 b6.setBounds(660, 280, 159, 44);
 contentPane.add(b6);

 contentPane.setBackground(Color.WHITE);
}
 
 public void actionPerformed(ActionEvent ae){
 String msg = ae.getActionCommand();
 if(msg.equals("Logout")){
 setVisible(false);
 new Login().setVisible(true);
 }else if(msg.equals("Exit")){
 System.exit(ABORT);
 }
 
 if(ae.getSource() == b1){
 this.setVisible(false);
 new AddCompany().setVisible(true);
 }
 
 
 if(ae.getSource() == b4){
 this.setVisible(false);
 new CompanyDetails().setVisible(true);
 }
 
 
 if(ae.getSource() == b6){
 this.setVisible(false);
 new edit_form().setVisible(true);
 }
 
 }
}
