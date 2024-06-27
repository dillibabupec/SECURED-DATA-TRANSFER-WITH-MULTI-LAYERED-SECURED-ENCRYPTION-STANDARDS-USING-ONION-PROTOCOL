import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
class method implements imet
{
	public static Socket nect,clim,clix;
	public static Socket neoy;
	public static ObjectOutputStream ocnt,timx;
	ObjectInputStream cint;
	public static use neco;
	static int neot,lint=0,mint=0,yint=0,lent=10,ecnj=0,letx=0,lety=0,wcnj=0,ocnj=0;
	static byte ncix[];
	static int tcem;
	String nctm[];
	StringBuffer nicy=new StringBuffer();
	int cinx=0;
	Vector dint=new Vector();
	Vector unode,xint;
	public static String dinx,uint,pac="";
	String dcuf,flnx,nemx,nemy;
	static String wint,letw,filo,dict,leox="",leoy="",leoj="",linw[];
	InetAddress ieno;
	int fint=0,timy=0,ketm=10,flcj=0,flcy=0;
	File finx;
    String letn="";
    static String imet[];
	FileInputStream finy;
String ncot="",intx="",inty;
public static String uinx="",into,ecnf="",ecny="",ecnw="",linx="",nlmj[],necm="",necw[],detx,ncem[],haso,jaso,liny,faso,xaso,tclo="n",paf="0",ucm[];
int fetx,timj,ncoy=0;	
//String tcem[];
String fcem="";
long intw;
File filx;
	
	dec necy=new dec();

static int inex;
Vector lcwt=new Vector();
Vector lcwx=new Vector();

public method()throws Exception
	{
	dint.add("hai");
	}
public method(String ucet,String winx)throws Exception
	{
	uinx=ucet;
	}
		public void imet(String dico)
	        {
			dinx=dico;
	        }
			
			
		public void select(String flno,String uint,String dicx)throws Exception
	       {
			System.out.println("Entry field")	;
		dict="";
		 clim=new Socket(leto,4000);
	   ocnt=new ObjectOutputStream(clim.getOutputStream());

	   ocnt.writeObject("linx");
	   ocnt.writeObject(uint+"&"+dicx);
       ocnt.writeObject("0");

	    cint=new ObjectInputStream(clim.getInputStream());
	   linx=(String)cint.readObject();
	   linw=linx.split("#");
	   nlmj=linw[2].split("&");
	   
	   System.out.println("Path detail list is :"+linx);

				int chot=nlmj.length;
				System.out.println("nlmj length: "+chot);
				if(chot!=0)
			   {
			   

neco.jctn.append("\n Available path is \n");

dict="";
for(int i=0;i<nlmj.length;i++)
			   {
neco.jctn.append("\n"+nlmj[i]+"\n");
System.out.println("nlmj["+i+"]: "+nlmj[i]);
			   }
			   nlmj[0]=linw[0];
neco.jctn.append("\n Best path is \n");
neco.jctn.append( nlmj[0]+"\n"+linw[1]);

					ncem=nlmj[0].split(">");
for(int j=1;j<ncem.length;j++)
				   {
	

	if(j!=ncem.length-1)
					   {
		System.out.println("nlmj.length 11: j value: "+j+" nlmj.length 11"+nlmj.length);
dict=dict+ncem[j]+">";
System.out.println("dict : "+dict);

					   }
	else
					   {
	System.out.println("nlmj.length 22:"+"j value: "+j+" nlmj.length 11"+nlmj.length);
		dict=dict+ncem[j];
System.out.println("dict : "+dict);
					   }
				   }
//int tcanx=ncix.length();
int tcanx=ncix.length;
tcanx=tcanx/100;
//neco.jctn.append("\n total packets count:"+tcanx+"\n");
int clot=ncem.length-1;
while(clot>0)
				   {
clim=new Socket(leto,4000);
	   ocnt=new ObjectOutputStream(clim.getOutputStream());

	   ocnt.writeObject("enck");
	   ocnt.writeObject(ncem[clot]);

	    cint=new ObjectInputStream(clim.getInputStream());
	   liny=(String)cint.readObject();
neco.jctn.append("Data enc done by node :"+ncem[clot]+" is mas key ("+liny+") \n");
clot--;
				   }

			   ncem=dict.split(">");
			   
clim=new Socket(leto,4000);
	   ocnt=new ObjectOutputStream(clim.getOutputStream());

	   ocnt.writeObject("inet");
       ocnt.writeObject(ncem[0]);

	   cint=new ObjectInputStream(clim.getInputStream());
	   String ncum=(String)cint.readObject();
	   String imet=(String)cint.readObject();
	  
       clim=new Socket(imet,Integer.parseInt(ncum));
	   ocnt=new ObjectOutputStream(clim.getOutputStream());
	   ocnt.writeObject(dict);
	   ocnt.writeObject(flno);
	   ocnt.writeObject(String.valueOf(ncix.hashCode()));
	   ocnt.writeObject(ncix);
	   ocnt.writeObject(uint+"&"+uint);
	   ocnt.writeObject(neco.ncex);
			   ocnt.writeObject(nlmj[0]);


	   }
	   else
			   {
	neco.jctn.append("No Path available \n");

			   }


	  
	  
		   }
		

	   
	
public void packet(String nlox)throws Exception
	{
int lent=nlox.length();
int clut= lent/ketm;
int main=lent%ketm;
int clux=ketm-1;
if(main==0)
    tcem=clut;
else
    tcem=clut+1;
int jnex=0;
nctm=new String[tcem+1];
for(int ineo=1;ineo<=tcem;ineo++)
		{
	if(ineo==tcem)
		nctm[ineo]=nlox.substring(jnex,lent);
	else
nctm[ineo]=nlox.substring(jnex,jnex+clux);
jnex=jnex+ketm;
		}

	}

	public Vector ndetails(String linw)throws Exception
	{
		 clim=new Socket(leto,4000);
	   ocnt=new ObjectOutputStream(clim.getOutputStream());

	   ocnt.writeObject("detm");
        	   ocnt.writeObject(linw);

	    cint=new ObjectInputStream(clim.getInputStream());
	  Vector nimx=(Vector)cint.readObject();
  
	   

 return nimx;

	}

	public void connection(String ncmx,String dcet)throws Exception
	{
		 clim=new Socket(leto,4000);
	   ocnt=new ObjectOutputStream(clim.getOutputStream());

	   ocnt.writeObject("link");
	   Random tchu=new Random();
						int tchy=tchu.nextInt(100);
									 System.out.println("tchy:"+tchy);
       ocnt.writeObject(ncmx+"&"+dcet+"&"+String.valueOf(tchy));

	   
	}
public void connectio(String ncmx,String dcet)throws Exception
	{
		 clim=new Socket(leto,4000);
	   ocnt=new ObjectOutputStream(clim.getOutputStream());

	   ocnt.writeObject("lin");
	   Random tchu=new Random();
						int tchy=tchu.nextInt(900);
									 System.out.println("tchy:"+tchy);
       ocnt.writeObject(ncmx+"&"+dcet+"&"+String.valueOf(tchy));

	   
	}

	
	public void bwse(String fily)
	{
		try
		{
					
					
	
		finx=new File(fily);
		finy=new FileInputStream(finx);
		ncix=new byte[finy.available()];
		finy.read(ncix);
		lint=finy.available();
		//packetsplit=100;
		ncot=new String(ncix);
		if(fily.endsWith(".txt") )
                    {
			//jsc5.setVisible(true);
			ketm=10;
			neco.jctx.setText(new String(ncix));
			JOptionPane.showMessageDialog(null,"Data Encypted by "+neco.ncex);

				   String ecnx=necy.Enc(ncot);
				   			neco.jctx.setText(ecnx);

					}
					else if(fily.endsWith(".java"))
					{
					ketm=10;
			neco.jctx.setText(new String(ncix));
			JOptionPane.showMessageDialog(null,"Data Encypted by "+neco.ncex);

				   String ecnj=necy.Enc(ncot);
				   			neco.jctx.setText(ecnj);
					}
					else if(fily.endsWith(".doc"))
					{
             ketm=10;
			neco.jctx.setText(new String(ncix));
			JOptionPane.showMessageDialog(null,"Data Encypted by "+neco.ncex);

				   String ecnw=necy.Enc(ncot);
				   			neco.jctx.setText(ecnw);
					}
					else
					{
					ketm=10;
			JOptionPane.showMessageDialog(null,"Data Encypted by "+neco.ncex);
				   String encmsg=necy.Enc(ncot);
					}
		packet(new String(ncix));
		
				}
				catch (Exception einx)
				{
					einx.printStackTrace();
				}
				
	}



public  int login()throws Exception
	{
	 clim=new Socket(leto,4000);
	   ocnt=new ObjectOutputStream(clim.getOutputStream());
	     ieno=InetAddress.getLocalHost();
imet=String.valueOf(ieno).split("/");
 	   ocnt.writeObject(imet[1]);
        
	    cint=new ObjectInputStream(clim.getInputStream());
	  String clin=(String)cint.readObject();
	    neot=Integer.parseInt(clin);

 return neot;
		
	   
	}
public void ulogin(String ucej,String winx,String winy,String cetx,String xval,String yval)throws Exception
	{
	 clim=new Socket(leto,4000);
	   ocnt=new ObjectOutputStream(clim.getOutputStream());
	   
	   ocnt.writeObject("uinx");
	   	  ieno=InetAddress.getLocalHost();
		  imet=String.valueOf(ieno).split("/");
 
	   ocnt=new ObjectOutputStream(clim.getOutputStream());

 	    
	   
	   //random num generation start
Random xscmo= new Random();
int andomInt1 = xscmo.nextInt(100);
String mkey=String.valueOf(andomInt1);
mkey="m"+mkey;


int andomInt2 = xscmo.nextInt(200);
String skey=String.valueOf(andomInt2);
skey="s"+skey;

int andomInt3 = xscmo.nextInt(300);
String ekey=String.valueOf(andomInt3);
ekey="e"+ekey;

	   ocnt.writeObject(ucej+"&"+String.valueOf(neot)+"&"+imet[1]+"&"+winx+"&"+cetx+"&"+winy+"&"+xval+"&"+yval+"&"+"s&"+mkey+"&"+skey+"&l&n&y&"+ekey);
	 
        cint=new ObjectInputStream(clim.getInputStream());
	  String leom=(String)cint.readObject();
	    
	   if(leom.equals("exist"))
		{

 JOptionPane.showMessageDialog(null,"Node Already Exist ");
          System.exit(0);
		}
		else
		{
			JOptionPane.showMessageDialog(null,"mas key is: "+mkey);
System.out.println("mkey "+mkey);
JOptionPane.showMessageDialog(null,"sec key is: "+skey);
System.out.println("skey: "+skey);
JOptionPane.showMessageDialog(null,"enc key is: "+ekey);
System.out.println("ekey: "+ekey);

		}
	 
	}

	public void valid(String uecx,String wnit,String winy,String cetx)throws Exception
	{
 clim=new Socket(leto,4000);
	   ocnt=new ObjectOutputStream(clim.getOutputStream());
	   
	   ocnt.writeObject("deto");

	   ieno=InetAddress.getLocalHost();
imet=String.valueOf(ieno).split("/");
    ocnt=new ObjectOutputStream(clim.getOutputStream());
	   
 ocnt.writeObject(uecx+"&"+String.valueOf(neot)+"&"+imet[1]+"&"+wnit);
	 
	  cint=new ObjectInputStream(clim.getInputStream());
	   leox=(String)cint.readObject();
	  	   leoy=(String)cint.readObject();
		   	  	   leoj=(String)cint.readObject();

			 System.out.println("leoy:"+leoy);

	  //Vector ls=(Vector)cint.readObject();  
	    if(leox.equals("ok1"))
		{

 JOptionPane.showMessageDialog(null,"Enter the Valid Details");
          System.exit(0);
		}
		else
		{
						/*Random tchu=new Random();
						int tchy=tchu.nextInt(100);
									 System.out.println("tchy:"+tchy);
*/
						neco=new use(uecx,leox,leoy,leoj);

			//for(int sz=0;sz<ls.size();sz++)
			//{
			//neco.jcb.addItem(String.valueOf(ls.elementAt(1)));
			//}
		}
	 
	}
	
	public void exit(String leow)throws Exception
	{
       clim=new Socket(leto,4000);
       ocnt=new ObjectOutputStream(clim.getOutputStream());
	   ocnt.writeObject("exit");
	   ocnt=new ObjectOutputStream(clim.getOutputStream());
	   ocnt.writeObject(leow);

	}
	public void nodes(String ucej)throws Exception
	{
clim=new Socket(leto,4000);
	   ocnt=new ObjectOutputStream(clim.getOutputStream());
	   ocnt.writeObject("nodes");
	   ocnt.writeObject(ucej);
}

	public  void listen()throws Exception
	{

InputStream minx=page.fint.getInputStream();
	
		 ObjectInputStream oint=new ObjectInputStream(minx);
		
		

	  String ncmo=(String)oint.readObject();
	  //String ncmy="",nnamepz="",nnamel="", nnamep="";
	System.out.println("listen method");
				 System.out.println("ncmo:"+ncmo);

	if(ncmo.equals(neco.uinx))
		{
		String ncmx=(String)oint.readObject();
	   	String ncmy=(String)oint.readObject();
	    ncix=(byte[])oint.readObject();
	    String ncmj=(String)oint.readObject();
		 String ecny=(String)oint.readObject();
ecnf=(String)oint.readObject();

		ucm=ncmj.split("&");
clim=new Socket(leto,4000);
	   ocnt=new ObjectOutputStream(clim.getOutputStream());

	   ocnt.writeObject("inet");
       ocnt.writeObject(ucm[0]);

	   cint=new ObjectInputStream(clim.getInputStream());
	   String ncum=(String)cint.readObject();
	   String imet=(String)cint.readObject();
	   System.out.println("ncmy.hashCode(); "+ncmy.hashCode());
	  		haso=ncmy;//String.valueOf(ncmy.hashCode());
System.out.println("haso: "+haso);
       clim=new Socket(imet,Integer.parseInt(ncum));
	   ocnt=new ObjectOutputStream(clim.getOutputStream());
	   ocnt.writeObject("xstaus");
	   ocnt.writeObject(ncmy);
	   ocnt.writeObject(haso);
	   					JOptionPane.showMessageDialog(null," you got file: "+haso);


neco.jctn.append(ncmx+" file is send by "+ucm[0]+"\n");

int tcanx=ncix.length;
tcanx=tcanx/100;


		//neco.jctn.append("nodeid details : "+ncmy+"\n");
//neco.jctn.append("_______________________________\n");
		neco.jctn.append("The hasing value : "+haso+"\n");
//clim=new Socket(leto,4000);
	   //ocnt=new ObjectOutputStream(clim.getOutputStream());

	   //ocnt.writeObject("encw");
	   	  // ocnt.writeObject("ucm[2]");
//faso=ncmj+" is send fle " +ncmx+" to "+ neco.uinx;
if(paf.hashCode()==ucm[1].hashCode())
	faso="0";
else
	faso="1";
	   ocnt.writeObject(faso);

       //ocnt.writeObject(ncmy);
	  //jaso="";
jaso=JOptionPane.showInputDialog("Give hash value");
if(jaso==null)
			{
		System.out.println("jaso null l");

			}
			else
			{
if(jaso.equals(haso))
			{
					JOptionPane.showMessageDialog(null," The Hash value matched");
		neco.jctn.append("Dec key is \n"+ecny);

	if(ncmx.endsWith(".txt"))
				{
		System.out.println(".txt file selected");

				new show(1,ncix,neco.uinx,new String(ncix),ncmx,ecny);
				}
				else if(ncmx.endsWith(".java"))
				{
							System.out.println(".java file selected");
				new show(1,ncix,neco.uinx,new String(ncix),ncmx,ecny);

				}
				else if(ncmx.endsWith(".doc"))
				{
							System.out.println(".doc file selected");
				 new show(1,ncix,neco.uinx,new String(ncix),ncmx,ecny);

				}
				 else
				{
					 		System.out.println("else file selected");
					 String file="File :"+ncmx+" got";
				 new show(0,ncix,neco.uinx,file,ncmx,ecny);
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null," The Hash value mismatched");
			}
			}
			
		}
		


			else if(ncmo.equals("xstaus"))
		{
					  String ncmjx=(String)oint.readObject();
					  String ncmjy=(String)oint.readObject();
		neco.jctn.append("nodeid details :"+ncmjx+"\n");
neco.jctn.append("__________________________________\n");
        		neco.jctn.append("The hasing value :"+ncmjy+"\n");

						 System.out.println("ncmjx:"+ncmjx);


	          
		}
			
			else if(ncmo.equals("cstaus"))
		{
					  String ncmjx=(String)oint.readObject();

         String enot=neco.nicw.getText();

						 System.out.println("enot:"+enot);

 ocnt=new ObjectOutputStream(page.fint.getOutputStream());
       ocnt.writeObject(enot);
	          
		}
		else if(ncmo.equals("mstaus"))
		{
					  String ncmjx=(String)oint.readObject();

         String enot=neco.jcym.getText();

						 System.out.println("enot:"+enot);

 ocnt=new ObjectOutputStream(page.fint.getOutputStream());
       ocnt.writeObject(enot);
	          
		}
		else if(ncmo.equals("estaus"))
		{
					  String ncmjx=(String)oint.readObject();

         String enot=neco.jcym.getText();

						 System.out.println("enot:"+enot);

 ocnt=new ObjectOutputStream(page.fint.getOutputStream());
       ocnt.writeObject(enot);
	          
		}
	
			
			else
		{


	    String ncmx=(String)oint.readObject();
								 System.out.println("ncmx:"+ncmx);

		String ncmy=(String)oint.readObject();
								 System.out.println("ncmy:"+ncmy);

		ncix=(byte[])oint.readObject();
	    String ncmj=(String)oint.readObject();
								 System.out.println("ncmj:"+ncmj);


		String ecny=(String)oint.readObject();
							//	 System.out.println("ecny:"+ecny);
ecnf=(String)oint.readObject();
ucm=ncmj.split("&");
			ncem=ncmo.split(">");
dict="";
neco.jctn.append(ncmx+" file send  by "+ucm[0]+"\n");
clim=new Socket(leto,4000);
	   ocnt=new ObjectOutputStream(clim.getOutputStream());

	   ocnt.writeObject("enco");
	   ocnt.writeObject(neco.uinx);

	    cint=new ObjectInputStream(clim.getInputStream());
	   liny=(String)cint.readObject();
	   System.out.println("***********neco.uinx: "+neco.uinx);
   	   System.out.println("liny: "+liny);
neco.jctn.append("Data  dec done by node :"+neco.uinx+" is sec key ("+liny+") \n");

for(int j=1;j<ncem.length;j++) 
				   {
	if(j!=ncem.length-1)
					   {
	//System.out.println("nlmj.length 11: j value: "+j+" nlmj.length 11"+nlmj.length);
dict=dict+ncem[j]+">";
System.out.println("dict : "+dict);
					   }
	else
					   {
	//System.out.println("nlmj.length 22:"+"j value: "+j+" nlmj.length 11"+nlmj.length);
		dict=dict+ncem[j];
System.out.println("dict : "+dict);
					   }
				   }
ncem=dict.split(">");

 clim=new Socket(leto,4000);
	   timx=new ObjectOutputStream(clim.getOutputStream());
	   timx.writeObject("inet");
	    timx.writeObject(ncem[0]);
	    oint=new ObjectInputStream(clim.getInputStream());
           String ncum=(String)oint.readObject();
		   String imet=(String)oint.readObject();
		  
               int inet =Integer.parseInt(ncum);
			  ncmy=ncmy+"!"+neco.uinx+dinx+"&"+neco.ctime;
			   clim=new Socket(imet,inet);
	   timx=new ObjectOutputStream(clim.getOutputStream());
	    timx.writeObject(dict);
		timx.writeObject(ncmx);
		timx.writeObject(ncmy);
		timx.writeObject(ncix);
        timx.writeObject(ucm[0]+"&"+neco.uinx);
		timx.writeObject(ecny);
			timx.writeObject(ecnf);

				}

	
}

		
			
		
	

public void lety(int flcj) throws Exception{

	ecnj=0;
 letx=1;
String enly="";
wcnj=0;
necm="";
	for (int ineo=0;ineo<nlmj.length;ineo++)
{//for start
clim=new Socket(leto,4000);
	   ocnt=new ObjectOutputStream(clim.getOutputStream());

	   ocnt.writeObject("ipz");
       ocnt.writeObject(nlmj[ineo]);

	   cint=new ObjectInputStream(clim.getInputStream());
	   String ncum=(String)cint.readObject();
	   String imet=(String)cint.readObject();
	  if(imet!="0")
	{//imet if
       clim=new Socket(imet,Integer.parseInt(ncum));
	   ocnt=new ObjectOutputStream(clim.getOutputStream());
	   if(flcj==0)
		{//flcj if
	        ocnt.writeObject("xstaus");
			 ocnt.writeObject(uint);
			 System.out.println("xstatus:");

cint=new ObjectInputStream(clim.getInputStream());
	  enly=(String)cint.readObject();

			 System.out.println("enly:"+enly);

	   			 System.out.println("nlmj.length:"+nlmj.length);
String enlx[]=enly.split(":");
neco.jctn.append("Node :"+nlmj[ineo]+"\n");
neco.jctn.append("Plimt :"+enlx[1]+"\n");

if(ineo!=0)
			{//ineo if
if(Integer.parseInt(enlx[1])>ecnj)
	{
	
ecnj=Integer.parseInt(enlx[1]);
			 System.out.println("ecnj:"+ecnj);

necm=nlmj[ineo];

letx=0;
		}

		
			}
else
	{
            ecnj=Integer.parseInt(enlx[1]);
            letx=0;
            necm=nlmj[ineo];
			}
			
		
		}
	  
        if(flcj==9)
		{
		   	  ocnt.writeObject("estaus");
		ocnt.writeObject(uint);

 System.out.println("estatus:");

cint=new ObjectInputStream(clim.getInputStream());
	  enly=(String)cint.readObject();
	  

			 System.out.println("enly:"+enly);

	   			 System.out.println("nlmj.length:"+nlmj.length);
//String enlx[]=enly.split(":");
neco.jctn.append("Node :"+nlmj[ineo]+"\n");
neco.jctn.append("Englev :"+enly+"\n");

if(ineo!=0)
			{
	
			
if(Integer.parseInt(enly)>=ecnj)
	{
	if(Integer.parseInt(enly)==ecnj)
				{
		
ecnj=Integer.parseInt(enly);
necm=necm+nlmj[ineo]+"&";
letx=1;
				}
				else
		{
ecnj=Integer.parseInt(enly);
necm=nlmj[ineo]+"&";
letx=0;
		}

		}
				
		
			}
			else
			{
              ecnj=Integer.parseInt(enly);
			  letx=0;
              necm=necm+nlmj[ineo]+"&";

			}
		}

	  


	
		
	
		neco.jctn.append("-----------------------------\n");

}
}

}

public void letj(int flcj) throws Exception{

	ecnj=0;
 letx=1;
String enly="";
ocnj=0;
necm="";
	for (int ineo=0;ineo<necw.length;ineo++)
{
clim=new Socket(leto,4000);
	   ocnt=new ObjectOutputStream(clim.getOutputStream());

	   ocnt.writeObject("ipz");
       ocnt.writeObject(necw[ineo]);

	   cint=new ObjectInputStream(clim.getInputStream());
	   String ncum=(String)cint.readObject();
	   String imet=(String)cint.readObject();
	  if(imet!="0")
	{
       clim=new Socket(imet,Integer.parseInt(ncum));
	   ocnt=new ObjectOutputStream(clim.getOutputStream());
	   if(flcj==1)
		{
	        ocnt.writeObject("cstaus");
			 ocnt.writeObject(uint);
			 System.out.println("cstatus:");

cint=new ObjectInputStream(clim.getInputStream());
	  enly=(String)cint.readObject();

			 System.out.println("enly:"+enly);

String enlx[]=enly.split(":");
neco.jctn.append("Node   :"+necw[ineo]+"\n");
neco.jctn.append("Thtput :"+enlx[1]+"\n");
if(ineo!=0)
			{
	
			
if(Integer.parseInt(enlx[1])>=ecnj)
	{
	if(Integer.parseInt(enlx[1])==ecnj)
				{
		
ecnj=Integer.parseInt(enlx[1]);
necm=necm+necw[ineo]+"&";
letx=1;
				}
				else
		{
ecnj=Integer.parseInt(enlx[1]);
necm=necw[ineo]+"&";
letx=0;
		}

		}
				
		
			}
			else
			{
              ecnj=Integer.parseInt(enlx[1]);
			  letx=0;
              necm=necm+necw[ineo]+"&";

			}
		}

	  


	
		
	
		neco.jctn.append("-----------------------------\n");

}
}

		}
}
	
