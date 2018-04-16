import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class files {
   private JFrame mF;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;

   public files(){
      prepareGUI();
   }
   public static void main(String[] args){
      files  swingListenerDemo = new files();
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
      JButton okButton = new JButton("paint");
      JButton oButton = new JButton("back");
      JButton Button1 = new JButton("notepad");
      JButton Button2 = new JButton("sublime text");
      JButton Button3 = new JButton("word");
      JButton Button4 = new JButton("pdf reader");
      JButton Button5 = new JButton("power point");
      JButton Button6 = new JButton("netbeans");
      JButton Button7 = new JButton("powershell");
      JButton Button8 = new JButton("command prompt");
      JButton Button9 = new JButton("writer");
      okButton.setActionCommand("paint");
      oButton.setActionCommand("back");
      Button1.setActionCommand("notepad");
      Button2.setActionCommand("sublime");
      Button3.setActionCommand("word");
      Button4.setActionCommand("reader");
      Button5.setActionCommand("power");
      Button6.setActionCommand("netbeans");
      Button7.setActionCommand("shell");
      Button8.setActionCommand("cmd");
      Button9.setActionCommand("wordpad");
      okButton.addActionListener(new CustomActionListener());
      Button1.addActionListener(new CustomActionListener());
      Button2.addActionListener(new CustomActionListener());
      Button3.addActionListener(new CustomActionListener());
      Button4.addActionListener(new CustomActionListener());
      Button5.addActionListener(new CustomActionListener());
      Button6.addActionListener(new CustomActionListener());
      Button7.addActionListener(new CustomActionListener());
      Button8.addActionListener(new CustomActionListener());
      Button9.addActionListener(new CustomActionListener());
      oButton.addActionListener(new CustomActionListener()); 
      controlPanel.add(okButton);
      controlPanel.add(Button1);
      controlPanel.add(Button2);
      controlPanel.add(Button3);
      controlPanel.add(Button4);
      controlPanel.add(Button5);
      controlPanel.add(Button6);
      controlPanel.add(Button7);
      controlPanel.add(Button8);
      controlPanel.add(Button9);
      controlPanel.add(oButton);
      mF.setVisible(true);
   }
  class CustomActionListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
      String s=e.getActionCommand();
      if (s.equals("paint"))
			{
        File file = new File("C:/WINDOWS/system32/mspaint.exe");
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
      else if(s.equals("notepad"))
      {
        File file = new File("C:/WINDOWS/system32/notepad.exe");
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
      else if(s.equals("sublime"))
      {
        File file = new File("D:/Sublime Text 3/sublime_text.exe");
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
        else if(s.equals("word"))
      {
        File file = new File("C:/Program Files (x86)/Microsoft Office/root/Office16/WINWORD.exe");
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
        else if(s.equals("reader"))
      {
        File file = new File("C:/Program Files (x86)/Adobe/Acrobat Reader DC/Reader/AcroRd32.exe");
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
        else if(s.equals("power"))
      {
        File file = new File("C:/Program Files (x86)/Microsoft Office/root/Office16/POWERPNT.exe");
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
        else if(s.equals("netbeans"))
      {
        File file = new File("D:/netbeans/NetBeans 8.2/bin/netbeans64.exe");
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
        else if(s.equals("shell"))
      {
        File file = new File("C:/Windows/System32/WindowsPowerShell/v1.0/powershell.exe");
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
        else if(s.equals("cmd"))
      {
        File file = new File("C:/WINDOWS/system32/cmd.exe");
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
        else if(s.equals("wordpad"))
      {
        File file = new File("C:/Program Files/Windows NT/Accessories/wordpad.exe");
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