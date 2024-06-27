import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import org.gui.JDirectoryDialog; // External Tool for Jfile Chooser


class show extends JFrame implements ActionListener
{

	
	
    JButton jcut;
	JButton jcux;
	JButton jcuy;
	static String eint="",fint="";
	static int mint,xint; 
	dec necx=new dec();

		JPanel nect=new JPanel();
	static JTextArea texm=new JTextArea();
JScrollPane nimx=new JScrollPane(texm);
JLabel yint=new JLabel();
static byte ncot[];
static String kint="",dint="",wint="",ecny="";
String dlcn="";
File timx;
public	JDirectoryDialog dict;
	public show(int finx,byte ncox[],String uint,String finw,String ncme,String ecoy)throws Exception
	{
		jcut=new JButton();
	    jcux=new JButton();
		jcuy=new JButton();
		jcut.setText("Save");
		jcux.setText("Cancel");
				jcuy.setText("Dec");

		        nect.setLayout(null);
		ncot=ncox;
		kint=ncme;
mint=finx;
fint=finw;
dint=uint;
xint=finx;
ecny=ecoy;
		if(finx==1)
		{
		nect.add(nimx);
		nect.add(jcut);
		nect.add(jcux);
				nect.add(jcuy);

		nimx.setBounds(5,5,390,350);
		jcut.setBounds(75,400,100,25);
		jcux.setBounds(200,400,100,25);
	    jcuy.setBounds(75,400,100,25);

texm.setText(necx.Dec(new String(ncot)));
				}
		else
		{
			nect.add(yint);
		nect.add(jcut);
		nect.add(jcux);
				nect.add(jcuy);

		yint.setBounds(5,5,390,25);
		jcut.setBounds(75,400,100,25);
		jcux.setBounds(200,400,100,25);
		jcuy.setBounds(75,400,100,25);

yint.setText(necx.Dec(new String(ncot)));
		}
		add(nect);
		jcut.addActionListener(this);
		jcux.addActionListener(this);
		jcuy.addActionListener(this);
			        jcut.setVisible(false);


		setSize(500,500);
        setVisible(true);
		setTitle("Node : "+uint+"Received");
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent einy)
	{
		try
		{
			if(einy.getSource()==jcut)
			{

				
					if(dict == null)
				{
					dict = new JDirectoryDialog(show.this);
				}
				if(dict.showDirectoryDialog())
				{
					File dect = dict.getSelectedFolder();
					dlcn=dect.getAbsolutePath();
					
				}
				 timx=new File(dlcn,kint); 


 
				 if(timx.exists())
					 JOptionPane.showMessageDialog(null,"File Already Exist");

				else
				{
				FileOutputStream finy=new FileOutputStream(timx,true);
				finy.write(ncot);
				finy.close();
				}
				dispose();
			
			 
				
				
			}
			if(einy.getSource()==jcux)
			{
		     dispose();
			}
if(einy.getSource()==jcuy)
			{
				 			System.out.println("Dec"); 

				String ecnw=JOptionPane.showInputDialog("Please give key");
				System.out.println("ecnw user entered key: "+ecnw);
				System.out.println("ecny user entered key: "+ecny);
			if(ecnw.equals(ecny))
				{
				JOptionPane.showMessageDialog(null,"Key matched");
				texm.setText(new String(ncot));
					jcut.setVisible(true);

				        jcuy.setVisible(false);

				}
			
		}
		}
		catch (Exception einx)
		{
			einx.printStackTrace();
		}

		
	}
	
}
