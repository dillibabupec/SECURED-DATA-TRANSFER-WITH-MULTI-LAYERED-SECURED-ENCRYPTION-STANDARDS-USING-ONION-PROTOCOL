import java.sql.*;
import java.io.*;
import java.net.*;
import java.util.*;
public class set

	{ 
	public dat dint;
	public String wint;
	public String linm;
	public String linf;
	public String limf,clif;
	ResultSet lint;
	Connection cint;
	Statement timx,mint;
	Vector vint,ncot;
	static ServerSocket ncoy;
	static Socket clim,netx;
	ObjectInputStream dinx,dicx;
	ObjectOutputStream dcnx,dcny,ocnt;
	InputStream nicx;
	OutputStream niex;
    link fine;
	
net n;
	
    String nimy="",metx="",femt,ncox,ncex[],ncow,leto="127.0.0.1",fcox[],mcox,ucox,xcow,jcox[],ucow,nac[],nal[],linw;
	String icow[],icom="";
    static set sect;
    int inet=9000,ieint,inex=1,jaso=0;
 	public set()throws Exception
 	{ 
 		super(); 
		dint = new dat();
		timx=dint.dbc();
		mint=dint.dbc();
		 wint="update  undetil set fclient='disable'";
  		 dint.delt(wint);
		  wint="update  jcointm set clientx='disable'";
  		 dint.delt(wint);
		  wint="update  undetil set mclient='0'";
  		 dint.delt(wint);
		  wint="update  undetil set ycol='Node'";
  		 dint.delt(wint);
 		wint="delete  from flowetn";
  		 dint.delt(wint);
		 
 //n=new net();
 		
 	} 
  
 	
	public void listen()throws Exception
	 {
    			clim=ncoy.accept();

    dinx=new ObjectInputStream(clim.getInputStream());
	  String femt=(String)dinx.readObject();
	System.out.println("listen:"+femt);
	 
	   if(femt.equals("uinx"))
		 {
			 String oint="";
dinx=new ObjectInputStream(clim.getInputStream());
	  String ncem=(String)dinx.readObject();
	  String nimy[]=ncem.split("&");
	  int jnet=Integer.parseInt(nimy[1]);

	  
	  wint="select * from undetil where xclient='"+nimy[0]+"'";
	  if(dint.nceo(wint))
			 {
         oint="exist";
		 wint="delete from undetil where xclient=''";

 dint.delt(wint);
			 }
			 else
			 {
		
 	

	  wint="update undetil set  xclient='"+nimy[0]+"' where mclient='"+jnet+"'";
	  dint.inst(wint);
	  wint="update undetil set  wclient='"+nimy[3]+"' where mclient='"+jnet+"'";
	  dint.inst(wint);
	   wint="update undetil set  dclient='"+nimy[4]+"' where mclient='"+jnet+"'";
	  dint.inst(wint);

	  wint="update undetil set  oclient='10' where mclient='"+jnet+"'";
	  dint.inst(wint);
	  //wint="update undetil set  xcol='' where mclient='"+jnet+"'";
	  //dint.inst(wint);
	  wint="update undetil set  ycol='Node' where mclient='"+jnet+"'";
	  dint.inst(wint);
	  wint="update undetil set  mkey='"+nimy[9]+"' where mclient='"+jnet+"'";
	  dint.inst(wint);
	  wint="update undetil set  skey='"+nimy[10]+"' where mclient='"+jnet+"'";
	  dint.inst(wint);
	  wint="update undetil set  ekey='"+nimy[14]+"' where mclient='"+jnet+"'";
	  dint.inst(wint);
	  oint="ok";

		 }
			 
dcnx=new ObjectOutputStream(clim.getOutputStream());
 dcnx.writeObject(oint);
			 
		 }

 else if(femt.equals("linx"))
		 {
		 String ncet="n";
	  String ncox=(String)dinx.readObject();
	  	  String letm=(String)dinx.readObject();

	  String nimy[]=ncox.split("&");
	  	  System.out.println("ncox:"+ncox);
			  	  System.out.println("letm:"+letm);
		 wint="delete from flowetn ";
		 dint.delt(wint);		  
fine= new link(nimy[0],nimy[1]);
		  lint=timx.executeQuery("Select client0 from flowetn where client5='"+nimy[1]+"' order by client7 asc");
	 		  System.out.println("All available paths");
			  int f=0;
	  while(lint.next())
		 {
			 if(f==0)
			 {
				 ncet="";
				 f=1;
			 }
		  ncet=ncet+lint.getString(1)+"&";
		 }


nac=ncet.split("&");
		  System.out.println(ncet);
		  int m=0,n=0,t=0,w=0;
		  //ncet="";
while(m<nac.length)
{
	n=1;w=0;
	nal=nac[m].split(">");
	linw="";
	while(n<nal.length-1)
{
	System.out.println("n:"+n);
	 lint=timx.executeQuery("Select dclient from undetil where xclient='"+nal[n]+"'");//and xcol='0'"); //order by client7 asc";
	 		  //System.out.println("All available paths");
	  if(lint.next())
		 {
		
	System.out.println(":"+nal[n]+":"+linw);
	linm=lint.getString(1);
	linw=linw+">"+linm;
	System.out.println(":"+nal[n]+">"+linw);
	//w=0;
	     }
		
		  lint=timx.executeQuery("Select cliento from jcointm where clientj='"+nal[n]+"' and clienty='"+nal[n-1]+"' ");// order by client7 asc");
	 		  //System.out.println("All available paths");
	  if(lint.next())
		 {
	System.out.println("Node:"+nal[n-1]+" give the feed back about Node :"+nal[n]+"\n Capacity");
	linf=linf+"Node:"+nal[n-1]+"give the feed back about Node :"+nal[n]+" Capacity : ";
	limf=lint.getString(1);
	System.out.println("linm:"+linm+" limf:"+limf);
	linf=linf+limf+"\n";
	if(linm.hashCode()!=limf.hashCode())
	w=1;
	     }
		  lint=timx.executeQuery("Select cliento from jcointm where clientj='"+nal[n]+"' and clienty='"+nal[n+1]+"'");// order by client7 asc");
	 		  //System.out.println("All available paths");
	  if(lint.next())
		 {
			System.out.println("Node:"+nal[n+1]+" give the feed back about Node :"+nal[n]+"\n Capacity");
			 linf=linf+"Node:"+nal[n+1]+" give the feed back about Node >"+nal[n]+" Capacity : ";
	limf=lint.getString(1);
	linf=linf+limf+"\n";System.out.println("linm:"+linm+" limf:"+limf);
			 if(linm.hashCode()!=limf.hashCode())//lint.getString(1))
	w=1;
	//System.out.println("ncox:"+ncox);
	//w=1;
	     }
	n++;
}
if(w==0)
{
	if(t==0)
	{
	ncet=nac[m]+"#"+linw+"#"+ncet+"#"+linf;
	t=1;
	}
//	break;
}
	
	m++;
}
dcnx=new ObjectOutputStream(clim.getOutputStream());

dcnx.writeObject(ncet);
		 }
		
		
else if(femt.equals("inet"))
		 {
	String clit="";
	  String ncox=(String)dinx.readObject();
	  
	  	  System.out.println("ncox:"+ncox);
       		   lint=timx.executeQuery("Select fclient  from undetil where xclient='"+ncox+"' ");

		   if(lint.next())
			 {
		clit=lint.getString(1);
			 }
	if(clit.equals("enable"))
			 {

				   lint=timx.executeQuery("Select mclient from undetil where xclient='"+ncox+"' ");

	  if(lint.next())
		 {
		 //System.out.println("yint:"+lint.getString(1));
		 inet=Integer.parseInt(lint.getString(1));
		 }
	 lint=timx.executeQuery("Select yclient from undetil where xclient='"+ncox+"' ");
		   
	  if(lint.next())
		 {
		 //System.out.println("metx:"+lint.getString(1));
		 metx=lint.getString(1);
		 }
dcnx=new ObjectOutputStream(clim.getOutputStream());
// inet=inet+1;
 String yint=String.valueOf(inet);
 System.out.println("yint:"+yint);
 System.out.println("metx:"+metx);
dcnx.writeObject(yint);
dcnx.writeObject(metx);
System.out.println("send 1");
			 }
			 else
			 {
dcnx=new ObjectOutputStream(clim.getOutputStream());
// inet=inet+1;
 
dcnx.writeObject(String.valueOf(0));
dcnx.writeObject(String.valueOf(0));
System.out.println("send 1");
			 }
		 }




		 else if(femt.equals("deto"))
	 {


			  String oinx="",fclientj="",clio="",cliu="",cliw="";
dinx=new ObjectInputStream(clim.getInputStream());
	  String ncem=(String)dinx.readObject();
	  String nimy[]=ncem.split("&");
	  int jnet=Integer.parseInt(nimy[1]);
System.out.println("ncem:"+ncem);

	 wint="select fclient from undetil where xclient='"+nimy[0]+"'";
	  lint=timx.executeQuery(wint);
	  if(lint.next())
		 {
		  System.out.println("ncem:"+ncem);

		  fclientj=lint.getString(1);
		 }
		 if(fclientj.equals("disable"))
		 {
			 		  System.out.println("fclientj:"+fclientj);

	  	 wint="select wclient from undetil where  xclient='"+nimy[0]+"'";

	  String nwde=dint.select1(wint);
	  			 		  System.out.println("nwde:"+nwde);

	  	 wint="select xclient from undetil where   xclient='"+nimy[0]+"'";
	  String ucnt=dint.select1(wint);
	  			 		  System.out.println("ucnt:"+ucnt);

	  if(nwde.equals(nimy[3]))
		 {
	 System.out.println("ncem:"+ncem);

			
 if(ucnt.equals(nimy[0]))
			 {
	 System.out.println("ncem:"+ncem);

	  oinx="ok";
	    wint="update undetil set  mclient='"+jnet+"' where xclient='"+nimy[0]+"'";
	  dint.inst(wint);
	    wint="update undetil set  fclient='enable' where xclient='"+nimy[0]+"'";
	  dint.inst(wint);
	    wint="update jcointm set  clientx='enable' where clienty='"+nimy[0]+"'";
	  dint.inst(wint);
	   wint="update jcointm set  clientx='enable' where clientj='"+nimy[0]+"'";
	  dint.inst(wint);
	   wint="delete  from undetil  where xclient=''";
	  dint.inst(wint);
	 

		 wint="select ekey from undetil where  xclient='"+nimy[0]+"'";

	 oinx=dint.select1(wint);
	  	 wint="select skey from undetil where   xclient='"+nimy[0]+"'";
	  clio=dint.select1(wint);
 Random tchu=new Random();
						int tchy=tchu.nextInt(100);
									 System.out.println("tchy:"+tchy);
									 wint="select cliento from jcointm where   clientj='"+nimy[0]+"'";
	  clif=dint.select1(wint);
	   wint="update undetil set dclient='"+clif+"' where xclient='"+nimy[0]+"' ";
 dint.delt(wint);
  //wint="update jcointm set cliento='"+tchy+"' where clienty='"+nimy[0]+"' ";
// dint.delt(wint);
 System.out.println("check mkey");
	  wint="select mkey from undetil where   xclient='"+nimy[0]+"'";
	   System.out.println("check mkey1");
	  cliw=dint.select1(wint);
			 }
		 else
			 {
			 			 System.out.println("wint:::::::::::>");

			 oinx="ok1";
			 
			 }
			 }
			
			 else
			 {
				 System.out.println("wint:"+wint);

				 oinx="ok1";
			 }
		 }
		 else
		 {
			 System.out.println("wint:::::::::::");
				 oinx="ok1";

		 }
dcnx=new ObjectOutputStream(clim.getOutputStream());
 dcnx.writeObject(oinx);
dcnx.writeObject(clio);		
dcnx.writeObject(cliw+"\n Capacity :"+clif);		


	 }
		  else if(femt.equals("exit"))
		 {
			  dinx=new ObjectInputStream(clim.getInputStream());
	  String ncme=(String)dinx.readObject();
System.out.println("exit:"+ncme);
		  vint=new Vector();
		  wint="update undetil set fclient='disable' where xclient='"+ncme+"' ";
 dint.delt(wint);
  wint="update jcointm set clientx='disable' where clientj='"+ncme+"' ";
 dint.delt(wint);
 
		 }
 else if(femt.equals("nctx"))
		 {
	  String ncme=(String)dinx.readObject();
System.out.println("exit:"+ncme);
		  
		  wint="update jcointm set clientx='disable' where clientj='"+ncme+"' ";
 dint.delt(wint);
 wint="update jcointm set clit='disable' where clienty='"+ncme+"' ";
 dint.delt(wint);
		 }
else if(femt.equals("xclient"))
		 {
	  String ncme=(String)dinx.readObject();
System.out.println("exit:"+ncme);
		  
		  wint="update jcointm set clit='enable' where clientj='"+ncme+"' ";
 dint.delt(wint);
 wint="update jcointm set clit='enable' where clienty='"+ncme+"' ";
 dint.delt(wint);
		 }
		 else if(femt.equals("system"))
		 {
			 int inet=0;
			  ncox=(String)dinx.readObject();
	  
	  	  System.out.println("ncox:"+ncox);
       
		   lint=timx.executeQuery("Select mclient from undetil where xclient='"+ncox+"' ");
		   
	  if(lint.next())
		 {
		 
		 inet=Integer.parseInt(lint.getString(1));
		 }
	 lint=timx.executeQuery("Select yclient from undetil where xclient='"+ncox+"' ");
		   
	  if(lint.next())
		 {
		
		 metx=lint.getString(1);
		 }
dcnx=new ObjectOutputStream(clim.getOutputStream());
String yint=String.valueOf(inet);
 System.out.println("yint:"+yint);
 System.out.println("metx:"+metx);
dcnx.writeObject(metx);
dcnx.writeObject(yint);

System.out.println("send 1");
		 }
 else if(femt.equals("enck"))
		 {
			  ncox=(String)dinx.readObject();
	  
	  	  System.out.println("ncox:"+ncox);
       
		   lint=timx.executeQuery("Select mkey from undetil where xclient='"+ncox+"' ");
		   
	  if(lint.next())
		 {
		 			  ncow=lint.getString(1);

		 }
	 
dcnx=new ObjectOutputStream(clim.getOutputStream());

 System.out.println("mkey:"+ncow);
dcnx.writeObject(ncow);

		 }

		 else if(femt.equals("enco"))
		 {
			  ncox=(String)dinx.readObject();
	  
	  	  System.out.println("ncox:"+ncox);
       
		   lint=timx.executeQuery("Select skey from undetil where xclient='"+ncox+"' ");
		   
	  if(lint.next())
		 {
		 			  ncow=lint.getString(1);

		 }
	 
dcnx=new ObjectOutputStream(clim.getOutputStream());

 System.out.println("skey:"+ncow);
dcnx.writeObject(ncow);

		 }
else if(femt.equals("encw"))
		 {
			  ncox=(String)dinx.readObject();
	  		  mcox=(String)dinx.readObject();
			  ucox=(String)dinx.readObject();
fcox=ncox.split(">");
	  	  System.out.println("ncox:"+ncox);
		  	  	  System.out.println("mcox:"+mcox);
	  	  System.out.println("ucox:"+ucox);
icom="";
		  jcox=ucox.split("!");
       int faso=0,haso=1,waso=0;
		  while(waso<jcox.length)
			 {
			  icow=jcox[waso].split("&");
			  icom=icom+icow[1]+"&";
			waso++;
			 }
			 icow=icom.split("&");
			 waso=1;
	   while(haso<fcox.length-1)
			 {

			
		   lint=timx.executeQuery("Select * from undetil where xclient='"+fcox[haso]+"' ");
		   
	  if(lint.next())
		 {
		 			  ncow=lint.getString(6);
		 			  xcow=lint.getString(7);
		 			  ucow=lint.getString(9);

		 }
		 	  	  System.out.println("waso:"+waso);

		   System.out.println("xcow:"+xcow);
	  	  System.out.println("icow[waso]:"+icow[waso]);
		 if(xcow.equals(icow[waso]))
				 {
			 //faso=ncow;
			 faso=Integer.parseInt(ncow);
			 faso=faso+1000;
ncow=String.valueOf(faso);
ucow="Node";
				 }
				 else
				 {
ucow="Malicous";
 dint.delt(wint);
  wint="update undetil set fclient='m' where xclient='"+fcox[haso]+"' ";
  dint.delt(wint);

				 }
				 		  wint="update undetil set ycol='"+ucow+"' where xclient='"+fcox[haso]+"' ";
 dint.delt(wint);
 // wint="update undetil set fclient='m',ycol='"+ucow+"' where xclient='"+fcox[haso]+"' ";
// dint.delt(wint);
 haso++;
 waso++;
			 }
			 		ncox="";   

  lint=timx.executeQuery("Select xclient,yclient,dclient,ycol from undetil");
	  while(lint.next())
		 {
		 			  ncow=lint.getString(1);
		 			  xcow=lint.getString(3);
		 			  ucow=lint.getString(4);
ncox=ncox+ncow+"     "+xcow+"     "+ucow+"     &";
		 }

 netx=new Socket(leto,6000);
	   ocnt=new ObjectOutputStream(netx.getOutputStream());

	   ocnt.writeObject("uinx");
       ocnt.writeObject(ncox);
	   ocnt.writeObject(mcox);

		 }
		 else if(femt.equals("link"))
		 {
			 System.out.println("femt connection: "+femt);
			 String detm=(String)dinx.readObject();
			 String deto[]=detm.split("&");
lint=timx.executeQuery("Select dclient from undetil where xclient='"+deto[0]+"'");
	  if(lint.next())
		 {
		 			  ncow=lint.getString(1);
		 }
		  wint="Insert into jcointm values('"+deto[0]+"','"+deto[1]+"','1','disable','"+ncow+"')";
 dint.inst(wint);
		 lint=timx.executeQuery("Select dclient from undetil where xclient='"+deto[1]+"'");
	  if(lint.next())
		 {
		 			  ncow=lint.getString(1);
		 }
	  //wint="Insert into jcointm values('"+deto[0]+"','"+deto[1]+"','1','disable','"+ncow+"')";
 //int.inst(wint);
 wint="Insert into jcointm values('"+deto[1]+"','"+deto[0]+"','1','disable','"+ncow+"')";
 dint.inst(wint);

 System.out.println("detm:"+detm);

		 }
		  else if(femt.equals("lin"))
		 {
			 System.out.println("femt connection: "+femt);
			 String detm=(String)dinx.readObject();
			 String deto[]=detm.split("&");
			 				 		  wint="update undetil set dclient='"+deto[1]+"' where xclient='"+deto[0]+"' ";
 dint.delt(wint);
 /*
lint=timx.executeQuery("Select cliento from undetil where xclient='"+deto[1]+"'");
	  if(lint.next())
		 {
		 			  ncow=lint.getString(1);
		 }
	  wint="Insert into jcointm values('"+deto[0]+"','"+deto[1]+"','1','disable','"+ncow+"')";
 dint.inst(wint);
 wint="Insert into jcointm values('"+deto[1]+"','"+deto[0]+"','1','disable','"+ncow+"')";
 dint.inst(wint);

 System.out.println("detm:"+detm);*/

		 }
else if(femt.equals("detm"))
		 {
System.out.println("femt detm: "+femt);
	Vector fint=new Vector();
				 String ncej=(String)dinx.readObject();
				 System.out.println("femt detm ncej1: "+ncej);
			 if(!ncej.equals(""))
			 {
				wint="select xclient from undetil where xclient!='"+ncej+"' and fclient='enable'";
			 }
			 else
			 {
                  wint="select xclient from undetil where xclient!='"+ncej+"'";
				  				 System.out.println("femt detm ncej2: "+ncej);
			 }
lint=timx.executeQuery(wint);
				 System.out.println("femt detm ncej3: "+ncej);
				 				 System.out.println("femt detm ncej3 lint: "+lint);
fint.add("select");
while(lint.next())
			 {
	String ncme=lint.getString(1);
	System.out.println("ncej3 ncme: "+ncme);
	if(!ncme.equals(""))
	fint.add(ncme);
			 }
dcnx=new ObjectOutputStream(clim.getOutputStream());
 dcnx.writeObject(fint);
		 }
		
		 else
		 {


dcnx=new ObjectOutputStream(clim.getOutputStream());

//  wint="select max(mclient) from undetil";// where   clientj='"+nimy[0]+"'";
	//  inet=dint.select1(wint);
	//  if(inet!=0)
	//		 {
	//wint="select max(mclient) from undetil";// where   clientj='"+nimy[0]+"'";
	//  inet=dint.select1(wint);
		//	 }
			// else
			// {
			//	 inet=9000;
			 

			// }
	
inet=inet+1;
String yint=String.valueOf(inet);
 System.out.println("yint:"+yint);
// wint="Insert into undetil values('','"+femt+"','"+inet+"','disable','','','')";
wint="Insert into undetil values('','"+femt+"','"+inet+"','disable','','d','','1','node','','','')";
 dint.inst(wint);
	 dcnx.writeObject(yint);
	
System.out.println("send");
			 
		 }
	 }
	 
 
  
  
  
  
 

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
   
  
 //============================= Testing ================================// 
 //=                                                                    =// 
 //= The following main method is just for testing this class you built.=// 
 //= After testing,you may simply delete it.                            =// 
 //======================================================================// 
 	public static void main(String[] miet) 
 	{ 
 		
 		try 
 		{ 
			
			ncoy=new ServerSocket(4000);
			sect=new set();
			while(true)
			{
		    sect.listen();
			} 
 			//UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel"); 
 		} 
 		catch (Exception eint) 
 		{ 
 			System.out.println("Failed loading lint&fint: "); 
 			System.out.println(eint); 
 		} 
 		
 	} 
 //= End of Testing = 
  
  
 } 