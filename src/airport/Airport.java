/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport;

/**
 *
 * @author moneem
 */
public class Airport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        //Set GTK+ as the Look and feel
try{
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
    if ("com.sun.java.swing.plaf.gtk.GTKLookAndFeel".equals(info.getClassName())) {   
       javax.swing.UIManager.setLookAndFeel(info.getClassName());
       break;
     } 
}
}catch(Exception e){e.printStackTrace();}
        //create a new splash class object
        Splash s = new Splash();
        //make the jframe non-resizable
        s.setResizable(false);
        //Set the intial position of the frame
        s.setLocation(500,200);
        //show the frame
        s.setVisible(true);
    }
    
}
