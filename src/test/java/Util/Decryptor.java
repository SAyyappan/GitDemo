package Util;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;


public class Decryptor extends TestBase {	
	
	//String value = excelData.password("password");
	String value = "pvEdpfV9bBdnOCpa+6NhnQ==";
    String key = "BigWater12012012"; // 128 bit key
    String initVector = "RandomInitVector"; // 16 bytes IV
    				
	//****************Decryption*************
		public String decryption(String pass)	{	
        try {
        	  IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
              SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

              Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
              cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
              
              byte[] decrypt = Base64.getDecoder().decode(value);

              byte[] pwd = cipher.doFinal(decrypt);
              
              return new String(pwd); 
             			           
        	} catch (Exception ex) {
            ex.printStackTrace();
        	}
        
         return null;
       
		}

	
}
