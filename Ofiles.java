import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ofiles {
   private JFrame mF;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;

   public Ofiles(){
      prepareGUI();
   }
   public static void main(String[] args){
      Ofiles  swingListenerDemo = new Ofiles();
      swingListenerDemo.showActionListenerDemo();

   }
   private void prepareGUI(){
      mF = new JFrame("Java SWING Examples");
      mF.setSize(400,400);
      mF.setLayout(new GridLayout(3, 1));
              mF.setBackground(Color.red);
      headerLabel = new JLabel("",JLabel.CENTER );
      statusLabel = new JLabel("",JLabel.CENTER);
      statusLabel.setSize(350,100);
      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());
      mF.add(headerLabel);
      mF.add(controlPanel);
      mF.add(statusLabel);
      mF.setVisible(true);
   }
   public void showActionListenerDemo(){
      headerLabel.setText("All the softwares");
      JButton okButton = new JButton("chrome");
      JButton oButton = new JButton("back");
      JButton Button1 = new JButton("firefox");
      JButton Button2 = new JButton("hotspot Shield");
      JButton Button3 = new JButton("BitTorrent");
      JButton Button4 = new JButton("Discord");
      JButton Button5 = new JButton("IDM");
      JButton Button6 = new JButton("steam");
      okButton.setActionCommand("chrome");
      oButton.setActionCommand("back");
      Button1.setActionCommand("firefox");
      Button2.setActionCommand("shield");
      Button3.setActionCommand("bit");
      Button4.setActionCommand("discord");
      Button5.setActionCommand("idm");
      Button6.setActionCommand("steam");
      okButton.addActionListener(new CustomActionListener());
      Button1.addActionListener(new CustomActionListener());
      Button2.addActionListener(new CustomActionListener());
      Button3.addActionListener(new CustomActionListener());
      Button4.addActionListener(new CustomActionListener());
      Button5.addActionListener(new CustomActionListener());
      Button6.addActionListener(new CustomActionListener());
      oButton.addActionListener(new CustomActionListener());
      controlPanel.add(okButton);
      controlPanel.add(Button1);
      controlPanel.add(Button2);
      controlPanel.add(Button3);
      controlPanel.add(Button4);
      controlPanel.add(Button5);
      controlPanel.add(Button6);
      controlPanel.add(oButton);
      mF.setVisible(true);
   }
class CustomActionListener implements ActionListener{
      public void actionPerformed(ActionEvent e) {
        String s=e.getActionCommand();
        if (s.equals("chrome"))
			  {
          File file = new File("C:/Program Files (x86)/Google/Chrome/Application/chrome.exe");
          Desktop desktop = Desktop.getDesktop();
          if(file.exists()) 
            try 
              {
                desktop.open(file);
              } 
            catch (IOException ex) 
              {
                Logger.getLogger(files.class.getName()).log(Level.SEVERE, null, ex);
              }
        }
        else if(s.equals("firefox"))
          { 
            File file = new File("C:/Program Files/Nightly/firefox.exe");
            Desktop desktop = Desktop.getDesktop();
            if(file.exists()) 
              try 
                {
                  desktop.open(file);
                }  
                catch (IOException ex) 
                {
                  Logger.getLogger(files.class.getName()).log(Level.SEVERE, null, ex);
                } 
          }
          else if(s.equals("shield"))
          { 
            File file = new File("C:/Program Files (x86)/Hotspot Shield/bin/hsscp.exe");
            Desktop desktop = Desktop.getDesktop();
            if(file.exists()) 
              try 
                {
                  desktop.open(file);
                }  
                catch (IOException ex) 
                {
                  Logger.getLogger(files.class.getName()).log(Level.SEVERE, null, ex);
                } 
          }
          else if(s.equals("bit"))
          { 
            File file = new File("C:/Users/Ayush Bhatt/AppData/Roaming/BitTorrent/BitTorrent.exe");
            Desktop desktop = Desktop.getDesktop();
            if(file.exists()) 
              try 
                {
                  desktop.open(file);
                }  
                catch (IOException ex) 
                {
                  Logger.getLogger(files.class.getName()).log(Level.SEVERE, null, ex);
                } 
          }
          else if(s.equals("discord"))
          { 
            File file = new File("C:/Users/Ayush Bhatt/AppData/Local/Discord/app-0.0.298/Discord.exe");
            Desktop desktop = Desktop.getDesktop();
            if(file.exists()) 
              try 
                {
                  desktop.open(file);
                }  
                catch (IOException ex) 
                {
                  Logger.getLogger(files.class.getName()).log(Level.SEVERE, null, ex);
                } 
          }
          else if(s.equals("idm"))
          { 
            File file = new File("C:/Program Files (x86)/Internet Download Manager/IDMan.exe");
            Desktop desktop = Desktop.getDesktop();
            if(file.exists()) 
              try 
                {
                  desktop.open(file);
                }  
                catch (IOException ex) 
                {
                  Logger.getLogger(files.class.getName()).log(Level.SEVERE, null, ex);
                } 
          }
          else if(s.equals("steam"))
          { 
            File file = new File("F:/steam/Steam.exe");
            Desktop desktop = Desktop.getDesktop();
            if(file.exists()) 
              try 
                {
                  desktop.open(file);
                }  
                catch (IOException ex) 
                {
                  Logger.getLogger(files.class.getName()).log(Level.SEVERE, null, ex);
                } 
          }
        else 
          {
            mF.setVisible(false);
	         }
      }
   }
}