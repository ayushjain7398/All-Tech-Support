import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
public class SwingListenerDemo {
   private JFrame mF;
   private static JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;

   public SwingListenerDemo(){
      prepareGUI();

   }
    public static void main(String[] args){
          SwingListenerDemo  swingListenerDemo = new SwingListenerDemo();
      swingListenerDemo.showActionListenerDemo();
           
   }
   private void prepareGUI(){

      mF = new JFrame("ATS");
      mF.setSize(400,400);
      mF.setLayout(new GridLayout(3, 1));
              mF.setBackground(Color.red);
      headerLabel = new JLabel("",JLabel.CENTER );
      statusLabel = new JLabel("",JLabel.CENTER);
      statusLabel.setSize(350,100);
      mF.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }
      });
      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());
      mF.add(headerLabel);
      mF.add(controlPanel);
      mF.add(statusLabel);
      mF.setResizable(false);
      mF.setVisible(true);
   }
   public void showActionListenerDemo(){
      headerLabel.setText("All TECH SUPPORT");
      controlPanel.setLayout(new GridLayout(3,1));
      JButton ooButton = new JButton("shutdown");
      JButton okButton = new JButton("files");
      JButton Button1 = new JButton("software");
      okButton.setActionCommand("files");
      ooButton.setActionCommand("shutdown");
      Button1.setActionCommand("software");
      ooButton.addActionListener(new CustomActionListener());
      okButton.addActionListener(new CustomActionListener());
      Button1.addActionListener(new CustomActionListener());
      controlPanel.add(okButton);
      controlPanel.add(Button1);
      controlPanel.add(ooButton);
      mF.setVisible(true);
   }
class CustomActionListener implements ActionListener{
      public void actionPerformed(ActionEvent e) {
      String s=e.getActionCommand();
      if (s.equals("files"))
			{ 
        files obj = new files();
			  obj.showActionListenerDemo();
      }
      else if(s.equals("software"))
      {
        Ofiles obj1 = new Ofiles();
			  obj1.showActionListenerDemo();
      }
      else
      {   
        try
		      { 
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to shutdown", "Confirmation box", dialogButton);
            if(dialogResult == 0) 
            {
              Runtime runtime = Runtime.getRuntime();
              Process proc = runtime.exec("shutdown -s -t 0");
              System.exit(0);
            } 
          }
        catch(Exception ex)
		      {
			     System.out.println("Error: "+ex);
			    }
	    }
    }
  }
}
