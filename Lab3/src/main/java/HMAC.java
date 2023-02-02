import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;

public class HMAC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HMAC();

	}
	
	public static void HMAC() {
		KeyGenerator kg;
		try {
			kg = KeyGenerator.getInstance("HmacSHA256");

			SecretKey sk = kg.generateKey();
			String message = "Hi There" ;
			Mac mac = Mac.getInstance("HmacSHA256");
			mac.init(sk);
			byte[] result = mac.doFinal(message.getBytes());
			System.out.println(result.length);
			/// Receiver
			Mac mac2 = Mac.getInstance("HmacSHA256");
			mac2.init(sk);
			byte[] result2 = mac.doFinal(message.getBytes());
			System.out.println("Check: " +
			Arrays.equals(result, result2));
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
