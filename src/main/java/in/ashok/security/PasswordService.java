package in.ashok.security;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
public class PasswordService {

public static String encode(String txt) {
Encoder encode=Base64.getEncoder();
return encode.encodeToString((txt.getBytes()));

}
public static String decode(String txt) {
	   Decoder decode= Base64.getDecoder();
               byte[] arr=  decode.decode(txt);
                  return new String(arr);

}
}
