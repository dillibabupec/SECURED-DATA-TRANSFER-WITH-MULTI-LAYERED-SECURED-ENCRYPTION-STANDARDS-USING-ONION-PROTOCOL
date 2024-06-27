import java.sql.*;
import java.util.*;
class dat
{
	ResultSet lint;
	Connection cint;
	Statement timx;
	Vector vint;
	String linx="";
	public Statement dbc()throws Exception
	{
         //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		//cint=DriverManager.getConnection("jdbc:odbc:ant");
Class.forName("com.mysql.jdbc.Driver");
		 cint=DriverManager.getConnection("jdbc:mysql://localhost:3306/netcom","root","admin");
	
		 timx=cint.createStatement();
		return timx;
	}
	public void inst(String nimx)throws Exception
	{
      timx.executeUpdate(nimx);
	}
	public void delt(String timo)throws Exception
	{
      timx.executeUpdate(timo);
	}


	public String select1(String nimy)throws Exception
	{
		 vint=new Vector();
     lint= timx.executeQuery(nimy);
	 while(lint.next())
		{
		
 linx=lint.getString(1);
		 		 
		}
		return linx;
	}

	public boolean nceo(String nimx)throws Exception
	{
     lint= timx.executeQuery(nimx);
	 if(lint.next())
		{
		 return true;
		}
		return false;
	}


	

}