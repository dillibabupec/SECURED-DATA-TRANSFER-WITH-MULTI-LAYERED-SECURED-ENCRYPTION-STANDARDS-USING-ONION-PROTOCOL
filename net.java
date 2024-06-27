import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import org.gui.JDirectoryDialog; // External Tool for Jfile Chooser
 import java.sql.*;


class net extends JFrame implements ActionListener
{

	
	
        JButton jButton1;
	//JButton jButton2;
	//JButton jButton3;
	static String estring1="",s="",l1,l2,l3,l4,l5,l6;
	static int f2,ff; 
public JLabel jlabe1,jlabe2,jlabel3;
		JPanel panel=new JPanel();
	 JTextArea text=new JTextArea();
 JScrollPane pane=new JScrollPane(text);
JLabel jlabel;
static byte b[];
static String nname1="",sn="",batchs="";
String desdir="",keystring;
File f5;
public	JDirectoryDialog directoryDialog;
ResultSet rs,rs1;
	Connection cs;
	Statement st,st1;
	public net()throws Exception
	{
		jButton1=new JButton();
	     //   jButton2=new JButton();
		//jButton3=new JButton();
	    jButton1.setText("Clean");
		//jButton2.setText("");
           //     jButton3.setText("");
		panel.setLayout(null);
		
jlabel=new JLabel("Log");
		
		panel.add(pane);
		panel.add(jButton1);
		panel.add(jlabel);
                //panel.add(jButton3);
		pane.setBounds(9,60,470,460);
		jButton1.setBounds(190,10,120,19);
		jlabel.setBounds(9,10,150,19);
               // jButton3.setBounds(330,430,120,25);
				
		
		
		
		add(panel);
		jButton1.addActionListener(this);
		//jButton2.addActionListener(this);
		//jButton3.addActionListener(this);
                
		setSize(600,600);
                setVisible(true);
		setTitle("Server");
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			if(e.getSource()==jButton1)
			{
text.setText("");
				
			}
			
			

		}
		catch (Exception e1)
		{
			e1.printStackTrace();
		}

		
	}
	
}
