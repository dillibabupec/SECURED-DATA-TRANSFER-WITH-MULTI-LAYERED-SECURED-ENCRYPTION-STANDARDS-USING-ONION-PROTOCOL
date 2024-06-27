 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;
 import java.net.*;
 import java.util.*;
 
 public class ine extends JFrame
 {

	String intf=null,lemt=null;
   public JButton neck;

   public JLabel intl;
   public JLabel clon;
   public JTextField inte;
   public JTextField fldm;
   public JTextField asount;
   public JLabel ulem;
 	public JLabel clem;
 	public JPasswordField lcom;
 	public JButton lotm;
 	public JButton clef;
	public JButton cent;
	public JTextField lety;
    public JPanel lint;
    public JPanel jlem;
    public JLabel ulex;
 	public JLabel nlex;
 	public JLabel cldm;
 	public JLabel maot;
	public JTextField letw;
  	public JPasswordField letm;
	
	boolean xint=false,yint=true;
	public JComboBox neoy;
    public JButton lcox;
 	public JButton clex;
	public JButton nimx;
    Font letj = new Font("TimesRoman",Font.PLAIN,20);
    Vector neox;
    public static ServerSocket clim;
    public static Socket mint;
    static   method fint;
    public static String uinx="",ncot="",neow="Select",newx="",newo="",ncox="",xval="",yval="",cost="",inof="";
    static int inet;
 	public ine(int ineo) throws Exception
 	{
 		super();
		fint=new method();
		ndetail();
		fint.imet(String.valueOf(ineo));
 		initializeComponent();
        this.setVisible(true);
 	}


 	public void initializeComponent()
 	{

      intl=new JLabel("Email");
	  clon=new JLabel("Mobile");

	  inte=new JTextField();
	  fldm=new JTextField();

	  neck=new JButton("Back");
	
 		ulem = new JLabel("Name");
		ulem.setForeground(Color.blue);
 		clem = new JLabel("Passcode");
clem.setForeground(Color.blue);
 		lety = new JTextField("");
 		lcom = new JPasswordField();
 		lotm = new JButton("Login");
 		clef = new JButton("Sign");
		cent=new JButton("exit");
 		lint = (JPanel)this.getContentPane();
 		jlem = new JPanel();
        lcox = new JButton("Submit");
 		clex = new JButton("Clean");
		nimx = new JButton("Connection");
        ulex = new JLabel("Name");
 		nlex = new JLabel("Link");
		nlex.setForeground(Color.blue);
 		cldm = new JLabel("Passcode");
		maot=new JLabel("Capacity");
		maot.setForeground(Color.blue);
		asount=new JTextField();
        letw = new JTextField();
 		letm = new JPasswordField();
		ulex.setForeground(Color.blue);
		cldm.setForeground(Color.blue);
		intl.setForeground(Color.blue);
		clon.setForeground(Color.blue);

       neoy=new JComboBox(neox);
	    
 		
 		lotm.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent eint)
 			{
 				logm_actionPerformed(eint);
 			}

 		});

 		neck.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent eint)
 			{
/*ulem.setVisible(inty);
					clem.setVisible(inty);
					lety.setVisible(inty);
					lcom.setVisible(inty);
					lotm.setVisible(inty);
					clef.setVisible(inty);
					cent.setVisible(inty);*/
					ulem.setVisible(yint);
					clem.setVisible(yint);
					lety.setVisible(yint);
					lcom.setVisible(yint);
					lotm.setVisible(yint);
					clef.setVisible(yint);
					cent.setVisible(yint);
					
lcox.setVisible(xint);
intl.setVisible(xint);
clon.setVisible(xint);
inte.setVisible(xint);
fldm.setVisible(xint);
ulex.setVisible(xint);
cldm.setVisible(xint);
nlex.setVisible(xint);
letw.setVisible(xint);
letm.setVisible(xint);
neoy.setVisible(xint);
lcox.setVisible(xint);
clex.setVisible(xint);
nimx.setVisible(xint);
neck.setVisible(xint);
maot.setVisible(xint);
asount.setVisible(xint);
		}

 		});
 		
 		clef.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent eint)
 			{
				try
				{
					ulem.setVisible(xint);
					clem.setVisible(xint);
					lety.setVisible(xint);
					lcom.setVisible(xint);
					lotm.setVisible(xint);
					clef.setVisible(xint);
					cent.setVisible(xint);
					
					
lcox.setVisible(yint);
intl.setVisible(yint);
clon.setVisible(yint);
inte.setVisible(yint);
fldm.setVisible(yint);
ulex.setVisible(yint);
cldm.setVisible(yint);
nlex.setVisible(yint);
letw.setVisible(yint);
letm.setVisible(yint);
neoy.setVisible(yint);
lcox.setVisible(yint);
clex.setVisible(yint);
nimx.setVisible(yint);
neck.setVisible(yint);
maot.setVisible(yint);
asount.setVisible(yint);

				}
				catch(Exception einx)
				{
				}
 			}

 		});

					ulem.setVisible(yint);
					clem.setVisible(yint);
					lety.setVisible(yint);
					lcom.setVisible(yint);
					lotm.setVisible(yint);
					clef.setVisible(yint);
					cent.setVisible(yint);
					maot.setVisible(xint);
					asount.setVisible(xint);
					
lcox.setVisible(xint);
intl.setVisible(xint);
clon.setVisible(xint);
inte.setVisible(xint);
fldm.setVisible(xint);
ulex.setVisible(xint);
cldm.setVisible(xint);
nlex.setVisible(xint);
letw.setVisible(xint);
letm.setVisible(xint);
neoy.setVisible(xint);
lcox.setVisible(xint);
clex.setVisible(xint);
nimx.setVisible(xint);

neck.setVisible(xint);

 		cent.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent eint)
 			{
 				try
				{
					fint.exit("");
					//new page();
System.exit(0);
				}
				catch (Exception einw)
				{
					einw.printStackTrace();
				}

 			}



 		});

 		lcox.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent eint)
 			{
 				lcox_actionPerformed(eint);
 			}

 		});
 		
 		clex.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent eint)
 			{
 				clex_actionPerformed(eint);
 			}

 		});
 		
 		nimx.addActionListener(new ActionListener() { 
 			public void actionPerformed(ActionEvent eint) 
 			{ 
 				try
				{
					fint.connection(uinx,neow);

				}
				catch (Exception einw)
				{
					einw.printStackTrace();
				}
				
 			} 
 			
  
 		}); 

 		lint.setLayout(null);
		jlem.setLayout(null);
		
	     addComponent(lint,jlem , 9,30,600,300);
                      addComponent(jlem, ulem, 90,30,100,19);//l
 	     addComponent(jlem, clem, 90,63,100,19);
                      addComponent(jlem, lety, 190,30,100,19);
                      addComponent(jlem, lcom, 190,63,100,19); 
                      addComponent(jlem, lotm, 300,30,90,19);//l
                     // addComponent(jlem, clef, 111,30,100,28);//l
					 addComponent(jlem, clef, 300,63,90,19);
	    addComponent(jlem, cent, 300,93,90,19);
                     //jlem.setBackground(new Color(174,237, 154));
					 jlem.setBackground(new Color(255,255,255));
					 					// lint.setBackground(new Color(30,60,90));

	   addComponent(jlem, ulex, 90,30,100,19);
                   // addComponent(jlem, intl, 100,105,70,18);
 	   addComponent(jlem, cldm, 90,63,100,19);
	   //addComponent(jlem, clon, 100,150,70,18);
        addComponent(jlem, letw, 190,30,100,19);//l
        //addComponent(jlem, inte, 200,105,100,25);
        //addComponent(jlem, fldm, 200,150,100,25);
		addComponent(jlem, letm, 190,63,100,19); 
		addComponent(jlem, nlex, 90,123,100,19);
       addComponent(jlem, neoy, 190,123,100,19);
	//
	addComponent(jlem, maot, 90,93,100,19);
	addComponent(jlem, asount, 190,93,100,19);
		addComponent(jlem, neck, 390,220,100,19);//name
 		addComponent(jlem,clex, 300,63,100,19);
		addComponent(jlem,nimx,300,123,100,28);
		addComponent(jlem,lcox,300,30,100,19);
//		addComponent(jlem,neck,300,150,100,28);
        


neoy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eint)
			{
				node_actionPerformed(eint);
			}

		});


 		
 		this.setTitle("Login");
 		this.setSize(new Dimension(600,390));
 		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
 		this.setResizable(xint);
 	}

 	/** Add Component Without a Layout Manager (Absolute Positioning) */
 	private void addComponent(Container mcot,Component cint,int intx,int inty,int widx,int heim)
 	{
 		cint.setBounds(intx,inty,widx,heim);
 		mcot.add(cint);
 	}


 

 	private void logm_actionPerformed(ActionEvent eint)
 	{
		try
		{
			

			uinx=lety.getText();
		    ncot=lcom.getText();
			intf=inte.getText();
			cost="10";//asount.getText();//change
if(!uinx.equals("") || !ncot.equals(""))
			{
			fint.valid(uinx,ncot,intf,cost);
	        dispose();
			}
			else
			{
JOptionPane.showMessageDialog(null,"Please give details");

			}
      }
		catch (Exception einx)
		{
		}

 		System.out.println("\nlogin_actionPerformed(ActionEvent eint) called.");
 		// TODO: Add any handling ncot here

 	}



	







private void lcox_actionPerformed(ActionEvent eint)
 	{
		try
		{
			
lcox.setEnabled(false);

			uinx=letw.getText();
			newx=letm.getText();
			 inof=inte.getText();
			 lemt=asount.getText();
			 


			if(!uinx.equals("") && !newx.equals("")  )
			{
				xval="x";
				yval="y";
fint.ulogin(uinx,newx,inof,lemt,xval,yval);

}
else
			{
JOptionPane.showMessageDialog(null,"give all details ");

		}
      }
		catch (Exception einx)
		{

		}

 		System.out.println("\nlogin_actionPerformed(ActionEvent eint) called.");
 		// TODO: Add any handling ncot here

 	}

 	private void clex_actionPerformed(ActionEvent eint)
 	{
 		System.out.println("\nclean_actionPerformed(ActionEvent eint) called.");

  letw.setText("");
  letm.setText("");
  neoy.setSelectedItem("Select");
 	}



private void node_actionPerformed(ActionEvent eint)
	{
		System.out.println("\njComboBox1_actionPerformed(ActionEvent eint) called.");
		
	Object o = neoy.getSelectedItem();
	System.out.println(">>" + ((o==null)? "null" : o.toString()) + " is selected.");
		// TODO: Add any handling ncot here for the particular object being selected
neow=o.toString();
	}

  public void ndetail()throws Exception
	 {
	  neox=new Vector();
	 neox=fint.ndetails("");
	 }

 }

