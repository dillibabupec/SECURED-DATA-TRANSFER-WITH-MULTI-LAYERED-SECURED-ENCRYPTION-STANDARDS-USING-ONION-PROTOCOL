import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.*;


public class dec
{
	KeyGenerator kcen;
	SecretKey ncey;
	byte[] eint;
	SecretKeySpec nkex;
	String texm,ecny,ecnx;
	byte[] ectx,ecty;

	public dec()throws Exception
	{
		kcen = KeyGenerator.getInstance("RC4");
        ncey = kcen.generateKey();
        eint = ncey.getEncoded();
        nkex = new SecretKeySpec(eint, "RC4");
	}


	public String Enc(String texm) throws Exception{
		
		Cipher cint = Cipher.getInstance("RC4");
        cint.init(Cipher.ENCRYPT_MODE, nkex);
        ectx = cint.doFinal(texm.getBytes());
		ecny = new String(ectx);
		//System.out.println(ecny);
		return ecny;
	}
	
	public String Dec(String texm)throws Exception{

		Cipher timx = Cipher.getInstance("RC4");
        timx.init(Cipher.DECRYPT_MODE,nkex);
        ecty = timx.doFinal(texm.getBytes());
		ecnx = new String(ecty);
		//System.out.println(ecnx);
		return ecnx;
	
	}
	
	
}