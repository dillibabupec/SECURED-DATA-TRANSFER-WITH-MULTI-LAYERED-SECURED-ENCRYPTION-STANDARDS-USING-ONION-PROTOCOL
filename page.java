 import java.awt.*; 
 import java.awt.event.*; 
 import javax.swing.*; 
 import java.net.*;
import java.util.*;

 public class page
 { 
	public static ServerSocket nect;
    public static Socket clim,fint;
    static   method dint;
    public static String unot="";
    static int inet;
 	public page() throws Exception
 	{ 
 		super();

 	} 
 public static void main(String[] intx) 
 	{ 
 		JFrame.setDefaultLookAndFeelDecorated(true); 
 		JDialog.setDefaultLookAndFeelDecorated(true); 
 		try 
 		{ 
        //UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
        dint=new method();
		inet=dint.login();
		
 		new ine(inet);

        nect=new ServerSocket(inet);

		while(true)
		{
		fint=nect.accept();
		dint.listen();
		}
		
		
		

		}	
	
 		catch (Exception eint) 
 		{ 
 			System.out.println("Failed loading L&F: "); 
 			System.out.println(eint); 
			//System.out.println("eprint stack trace: "+eint.printStackTrace(blank));
 		} 
 		
		
		
		
		
		
		} 
 
  
  
 } 
  
 