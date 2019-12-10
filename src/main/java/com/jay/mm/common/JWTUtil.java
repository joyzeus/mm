package com.jay.mm.common;

import com.jay.mm.module.entity.doo.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.apache.commons.codec.binary.Base64;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhouxu
 * @version v1.0
 * @email 1419982188@qq.com
 * @date 2019/11/24 14:07
 */
@Component
public class JWTUtil {

    private final JWTConfig jwtConfig;

    public JWTUtil(JWTConfig jwtConfig) {
        this.jwtConfig = jwtConfig;
    }

    /**
     * 创建jwt
     *
     * @param id        防止重复
     * @param user      用户信息
     * @param ttlMillis 过期的时间长度
     * @return 返回用户的token
     */
    public String createJWT(String id, User user, long ttlMillis) {
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);

        Map<String, Object> claims = new HashMap<>();
        claims.put("uid", user.getId());
        claims.put("mobile", user.getMobile());
        claims.put("account", user.getAccount());

        SecretKey key = generalKey();

        JwtBuilder builder = Jwts.builder()
                .setClaims(claims)
                .setId(id)
                .setIssuedAt(now)
                .setSubject(String.valueOf(user.getId()))
                .signWith(signatureAlgorithm, key);

        if (ttlMillis >= 0) {
            long expMillis = nowMillis + ttlMillis;
            Date exp = new Date(expMillis);
            builder.setExpiration(exp);
        }
        return builder.compact();
    }

    /**
     * 解密jwt
     *
     * @param jwt 解析的字符串
     * @return io.jsonwebtoken.Claims
     */
    public Claims parseJWT(String jwt) {
        SecretKey key = generalKey();
        return Jwts.parser()
                .setSigningKey(key)
                .parseClaimsJws(jwt)
                .getBody();
    }


    /**
     * 由字符串生成加密key
     *
     * @return javax.crypto.SecretKey
     */
    public SecretKey generalKey() {
        String stringKey = jwtConfig.jwtSecret;
        byte[] encodedKey = Base64.decodeBase64(stringKey);
        return new SecretKeySpec(encodedKey, 0, encodedKey.length, "AES");
    }
}
