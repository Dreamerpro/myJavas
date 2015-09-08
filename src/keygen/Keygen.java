package keygen;

import java.security.NoSuchAlgorithmException;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class Keygen {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		// TODO Auto-generated method stub
		KeyGenerator keyGen = KeyGenerator.getInstance("HmacMD5");
	    SecretKey key = keyGen.generateKey();

	    // Generate a key for the HMAC-SHA1 keyed-hashing algorithm
	    keyGen = KeyGenerator.getInstance("HmacSHA1");
	    key = keyGen.generateKey();
	   
	}

}
