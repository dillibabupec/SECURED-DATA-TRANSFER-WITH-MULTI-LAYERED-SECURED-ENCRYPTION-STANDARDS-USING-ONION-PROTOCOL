

import java.sql.*;
import java.util.*;

public class link
{
	public dat dcen;
	public Statement tinx,timx;
	public ResultSet lint,lino,linx;
	public String ncet = "";
	public int indx = -1;
	public String mint[] = new String[100];
	public boolean fliy = true,flix = true, flim = false;
	public static  Vector <String> vint= new Vector<String>();
	public int weit = 0,dely=0;
	public static String  dent = "";
	public static String  nect= ""; 
	
	public link( String necx,String necy )
	{
		try
		{
			dcen= new dat();
			tinx=dcen.dbc();
	timx=dcen.dbc();
			
			dent = necy;
			nect = necx;
			fliy = true;
			flix = true;
			flim = false;
				
			indx = -1;
			weit = 0;
			getPath(necx);
			
	   }
		catch( Exception eint )
		{
			eint.printStackTrace( );
		}  
	}
	

	public void getPath( String necw )
	{
	  try
		{
			

		  //lint = tinx.executeQuery( "select * from jcointm where clientj like '"+necw.trim( )+"' and clientx='enable'" );
lint = tinx.executeQuery( "select * from jcointm m,undetil u where m.clientj like '"+necw.trim( )+"' and u.fclient='enable' and u.xclient=m.clientj" );
		
		 while( lint.next( ) )
		 {
			 			
			flim  = true;
			if( fliy == false )
			{
				for( int intm=0;intm < indx;intm++ )
				{
					mint[intm] = mint[intm+1];
				}
				indx--;
				fliy = true;
			}
			
			String neco = lint.getString( 2 );
			
			String ncot[ ] = nect.split( ">" );
			
			for( int intm=0;intm < ncot.length;intm++ )
			{
				if( ncot[intm].equalsIgnoreCase( neco ))
				{
					flix = false;
				}
			}
			
			if( flix == true )
			{
				mint[ ++indx ] = nect + ">" + neco;
			}
			
			flix = true;
		}   
			 			
		if( flim == true )
		{
			flim = false;

			for( int intm = 0;intm <= indx;intm++ )
			{
				findNode( mint[intm] );

			}
		}
		else
		{
			for( int intm = 0; intm < indx; intm++ )
			{
				mint[ intm ] = mint[ intm+1 ];
			}
			indx--;
			flim = true;
			findNode(mint[0]);
		}
		
		}catch( Exception eint ) { eint.printStackTrace( ); }

}

public void findNode( String necm )
{
				
	  nect = necm;
	System.out.println("necm for error: "+necm.lastIndexOf(">"));
	  int end = necm.lastIndexOf(">");
	 
      if(necm.substring(end + 1).equals(dent))
	  {
		findWeight( necm );
		if( indx != 0 )
		{
		  for( int intm = 0; intm <= indx; intm++ )
		  {
			mint[intm] = mint[intm+1];
		  }
		   indx--;
		   fliy = true;
		   nect = mint[0];
		   findNode(mint[0]);
		}
	 }
	else
	{
	  fliy = false;
	  getPath( necm.substring(end + 1) );

	}
}

	public void findWeight( String necm )
	{
		
		String[ ] limx = necm.split(">");
		
		try
		{
			for( int intm = 0;intm < limx.length-1;intm++ )
			{
				lint = tinx.executeQuery("select clientm from jcointm where clientj  = '"+limx[intm].trim( )+"' and clienty = '"+limx[intm+1].trim()+"'");
				while( lint.next( ))
				{
					weit += lint.getInt(1);
					if(intm>0)
					{
					System.out.println("node:"+limx[intm-1]+" node:"+limx[intm]+" ->"+limx[intm+1]);
					
					}
				}
			 }
			
			String limy =necm+"#"+weit;
			

			tinx.executeUpdate( "insert into flowetn values( '"+dent+"','"+necm+"',"+weit+",'0.0','0.0' )" );
			
			//limit = 0;
			weit = 0;
			           
		
			
		}	
		catch( Exception eint )
		{
			eint.printStackTrace( );
		}
	}




}
		