import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Encoders;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;

public class JwtSecretKeyGenerator {

    public static void main(String[] args) {
        // 64바이트 길이의 비밀키 생성
        SecretKey secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS512);
        String base64EncodedKey = Encoders.BASE64.encode(secretKey.getEncoded());

        // 생성된 키를 출력
        System.out.println("Base64 Encoded Secret Key: " + base64EncodedKey);
    }
}
