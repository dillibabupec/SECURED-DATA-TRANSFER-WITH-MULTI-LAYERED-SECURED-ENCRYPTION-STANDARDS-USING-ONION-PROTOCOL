import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.util.*;
import javax.swing.table.*;

public class use extends JFrame implements ActionListener,imet
{
	public static JTextField jctm,jicm,jcym,jcxm;
	public static JTextArea jctx;
	public static JTextArea jcty,jcto,jctn,jltx,jlty,jltm,jtime;
	public JLabel nicm,nict,nico,nicx,nicy,nicw,micn,mict,mico,mick,stime;
	public JButton jetm,jetx,jety,jetn,jeto,jetw,jb7,tejm,showb,closeb,ttime,jtxe;
public static String ctime="10";
    public static JComboBox tejx,tejy;
	int flcj,inot=0,fint;
	JPanel jeyo=new JPanel();
	JPanel jeym=new JPanel();
	JPanel jeit=new JPanel();
	JPanel jeyt=new JPanel();
    //JTabbedPane jeit=new JTabbedPane();
	Font flnt = new Font("TimesRoman",Font.PLAIN,20);
	Vector intx;
	public static Vector nect =new Vector();
	static int teco=0,flco=0,flcx=0,tchx=0,tchu=0;
	method necx=new method();
    FileDialog flcy;
	static String flct="",flcw="ok",n7="",ncex="",ncey="",nlct="10";
	static String uinx="",ucet,imeo,ncew,intw,tcem;
	JScrollPane jcot;
	String letx="";
	public use (String ucen,String leox,String leoy,String tchy)throws Exception
	{
		uinx=ucen;
		jeyo.setLayout(null);
		jeym.setLayout(null);
		jeyt.setLayout(null);
		jeit.setLayout(null);
        jctm=new JTextField(20);
		jicm=new JTextField(20);
		jctx=new JTextArea();
		jcty=new JTextArea();
		jcto=new JTextArea();
		jctn=new JTextArea();
		jltx=new JTextArea();//key
		jlty=new JTextArea();
				jltm=new JTextArea();
				jtime=new JTextArea("10");
ncex=leox;
ncey=leoy;
tcem=tchy;
		nicm=new JLabel("Selected:");
		mict=new JLabel("Log");
		nict=new JLabel("Key");
		//
		stime=new JLabel("Time(/sec)");
		ttime=new JButton("Submit");
		showb=new JButton("Show");
		closeb=new JButton("Close");
		//
		jetm=new JButton("send");
		jtxe=new JButton("Bad");
		jety=new JButton("Exit");
		jetn=new JButton("...");
		jeto=new JButton("Nodes");
		 jcxm=new JTextField();
		 jcym=new JTextField("1000");

		Vector nlem=necx.ndetails(uinx);
        tejx=new JComboBox();
        nicw=new JLabel("Capacity");
		System.out.println("nlem:"+nlem);
	    tejx.removeAllItems();
		tejy=new JComboBox();
		//tejy.setSelectedIndex(0);
		//tejy.addItem("All");
		//tejy.addItem("tejy");
		micn=new JLabel("Feedback analysis log");
		mico=new JLabel("Content");
		mick=new JLabel("Welcome");
		tejm=new JButton("Available");
				System.out.println("ndsize:"+nlem.size());

		for(int nldw=0;nldw<nlem.size();nldw++)
			{
             if(!uinx.equals(String.valueOf(nlem.elementAt(nldw))))
				{
			 				tejx.addItem(String.valueOf(nlem.elementAt(nldw)));
									System.out.println("nlem.elementAt(nldw):"+nlem.elementAt(nldw));

				}

			}
             flcy=new FileDialog(this,"Load",FileDialog.LOAD);


	 JScrollPane jcox=new JScrollPane(jctx);
	 JScrollPane jcoy=new JScrollPane(jcty);
	 JScrollPane jcow=new JScrollPane(jltx);
	 JScrollPane jcom=new JScrollPane(jctn);
	JScrollPane jcon=new JScrollPane(jlty);


		jeyo.add(jctm);
		jeyo.add(jicm);
		jeyo.add(nicm);
		jeym.add(nict);
		jeym.add(showb);
		jeym.add(closeb);

		jeyo.add(jetm);
		//jeyo.add(jetx);
		jeyo.add(jety);
		
		
		//jeyo.add(jcox);
		jeyo.add(jcox);
		jeyo.add(mico);
		//jeyo.add(micn);
		jeyo.add(mick);
		//jeyo.add(jcym);
		jeyo.add(jcoy);
        jeyo.add(jcow);
	    jeyo.add(jetn);
		jeyo.add(jeto);
		jeym.add(jcom);
		jeym.add(mict);
		jeym.add(jltx);
		jeym.add(stime);
		jeym.add(jtime);
		jeym.add(ttime);
		
		jltx.setVisible(false);
jltx.append("Enc key:"+leox+"\n");
jltx.append("Sec key:"+leoy+"\n");
jltx.append("Mas key:"+tchy+"\n");

		jeyo.add(tejx);
		//jeit.addTab("Message",jeyo);
		//jeit.addTab("config",jeyt);
		jeyt.setBackground(new Color(95, 255, 77));
		jeyt.add(tejy);
		//jeyt.add(jcym);
		//jeyt.add(micn);
		jeym.add(nicw);
		jeym.add(jeit);
				jeyt.add(jltm);
				//jeit.add(micn);
				//jeit.add(nicw);
				//jeit.add(jcxm);
				//jeit.add(jltm);
				// jeyo.setBackground(new Color(225, 255, 77));
				 jeyo.setBackground(new Color(188, 143, 143));
//tchu=Integer.parseInt(tchy);
JSplitPane jsp=new JSplitPane(1,jeym,jeyo);
		add(jsp);
		jeym.add(jcxm);
		nicm.setBounds(230,30,120,19); 
        jctm.setBounds(319,30,190,19);
	    nict.setBounds(21,363,100,19);
		//
			    showb.setBounds(51,363,100,19);
			    closeb.setBounds(155,363,100,19);
//		
		jetm.setBounds(21,150,100,19);
       // jetx.setBounds(21,190,100,19);
		jety.setBounds(21,230,100,19); 
        mict.setBounds(310,363,100,19);
		mico.setBounds(310,63,150,30); 

        mick.setBounds(21,63,150,30);
		micn.setBounds(300,250,100,19);
		jcox.setBounds(310,90,261,200); 
		jcym.setBounds(400,250,100,30);
		jltx.setBounds(21,390,190,150);
		//stime.setBounds(21,550,100,19);
		//jtime.setBounds(80,550,100,19);
		ttime.setBounds(360,190,90,19);


		jcom.setBounds(310,390,261,150);
		jetn.setBounds(519,30,30,19);
		jeto.setBounds(21,120,100,19); 
		jeit.setBounds(0,0,600,360);
		tejx.setBounds(190,120,100,19);
        micn.setBounds(209,126,120,19);
		jcxm.setBounds(270,190,90,19);
		//micn.setBounds(50,75,100,35);
		nicw.setBounds(100,190,90,19);
        //jcxm.setBounds(50,60,100,15);
		//jcym.setBounds(151,60,100,35);
jltm.setBounds(375,75,100,150);
		jcon.setBounds(150,177,300,300);
		jetm.addActionListener(this);
		//jetx.addActionListener(this);
		jety.addActionListener(this);
		jetn.addActionListener(this);
		jeto.addActionListener(this);
		tejm.addActionListener(this);
		tejx.addActionListener(this);
		tejy.addActionListener(this);
		ttime.addActionListener(this);
		showb.addActionListener(this);
		closeb.addActionListener(this);
		
		setSize(606,660);
		setTitle("Node :"+uinx);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
					  
			  
	}
	

		

	public void actionPerformed(ActionEvent einx)
	{
		try

		{
			

			if(einx.getSource()==showb)
		{
			jltx.setVisible(true);
//			System.out.println("time event: "+ctime);
		}

		if(einx.getSource()==closeb)
		{
			jltx.setVisible(false);
//			System.out.println("time event: "+ctime);
		}
		if(einx.getSource()==ttime)
		{
			ctime=jcxm.getText().trim();
			System.out.println("TIME EVENT: "+ctime);
			necx.connectio(uinx,ctime);
			//if(ctime.matches("\\d+")) 
				//{
				//}
				//else 
				//{
				//jtime.setText("");
			    //}
		}

		if(einx.getSource()==jetm)
		{
			intx=new Vector();
			
			String uint=jctm.getText().trim();
			
			
			String dict=jicm.getText().trim();
			jctx.setText("");
			jcty.setText("");
			jcto.setText("");
			if(uint.equals("") && letx.equals(""))
			{
           JOptionPane.showMessageDialog(null,"Select File & DestIP");
			}
			  

           else if(uint.equals("") || letx.equals("") )
			{
				
             if( uint.equals(""))
				{
				 JOptionPane.showMessageDialog(null,"select File ");
			  
				}
			  if(letx.equals(""))
				{
				   JOptionPane.showMessageDialog(null," Ente DestIP");
			  	}
				uint="";
			  jctm.setText("");
				letx="";
			  jicm.setText("");
				
			}
			else
				{
				
				System.out.println("uinx:"+uinx);
		
				
necx.select(flct,uinx,letx);			
					
			 letx="";

			 
               
			   
				 
			 
				jctm.setText("");
				jctx.setText("");


			 
				
				
					
				}
		
				
			jctm.setText("");
		}
	//	if(einx.getSource()==jetx)
		//{
		//	jctm.setText("");
		//	jicm.setText("");
		//}
		
		if(einx.getSource()==jety)
		{
			necx.exit(uinx);
			System.exit(0);
			
		}
	if(einx.getSource()==jetn)
		   {
			// jcom.setVisible(true);

				flcy.setVisible(true);
				
		flct=flcy.getFile();
		String line=flcy.getDirectory();
        String file=line+flct;
		System.out.println("file:"+file);
		jctm.setText(file);
necx.bwse(file);
			}
			
		if(einx.getSource()==jeto)
		{
			
				Vector nlex=necx.ndetails(uinx);
				System.out.println("nlex:"+nlex);
	            tejx.removeAllItems();
					           // tejy.removeAllItems();

				for(int nldw=0;nldw<nlex.size();nldw++)
			{
if(!uinx.equals(String.valueOf(nlex.elementAt(nldw))))
				{
				tejx.addItem(String.valueOf(nlex.elementAt(nldw)));
							//	tejy.addItem(String.valueOf(nlex.elementAt(nldw)));

				}
			}
		}
		if(einx.getSource()==tejx)
			{
			String name="";
			
System.out.println("\njComboBox1_actionPerformed(ActionEvent eint) called.................");
		
		Object o = tejx.getSelectedItem();
		System.out.println(">>" + ((o==null)? "null" : o.toString()) + " is selected.");
		// TODO: Add any handling code here for the particular object being selected
		name=o.toString();
if(!name.equals("select"))
{
		letx=name;
		jcty.setText(name);
}
			}
		
if(einx.getSource()==tejy)
			{
			String name="";
			
System.out.println("\njComboBox1_actionPerformed(ActionEvent eint) called.................");
		
		Object o = tejy.getSelectedItem();
		System.out.println(">>" + ((o==null)? "null" : o.toString()) + " is selected.");
		// TODO: Add any handling code here for the particular object being selected
		name=o.toString();
if(name.equals("select"))
{
		jltm.setText("");
				jltm.setVisible(false);

		nect=new Vector();
}
else
{
					jltm.setVisible(true);

	int nflag=0;
		for(int n=0;n<nect.size();n++)
	{
			if(name.equals(String.valueOf(nect.elementAt(n))))
				nflag=1;
	}
	if(nflag==0)
	{
nect.add(name);
jltm.setText(name+"\n");
	
			}
}
			}
		if(einx.getSource()==tejm)
			{
			nlct=jcxm.getText();
			if(Integer.parseInt(nlct)>10 || Integer.parseInt(nlct)==0)
			{
			jcxm.setText("10");
		nlct="10";
		}
		if(nlct.equals("10"))
		{
		necx.nodes(uinx);
		}
		System.out.println("nlct:"+nlct);
}


		}
		
	catch(Exception eint)
		{
		}
	}
	

	
}
