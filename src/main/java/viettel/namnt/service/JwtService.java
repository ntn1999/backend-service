package viettel.namnt.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;
import viettel.namnt.common.TokenType;

import java.util.Collection;

@Service
public interface JwtService {
    String generateAccessToken(long userId, String username, Collection<? extends GrantedAuthority> authorities);

    String generateRefreshToken(long userId, String username, Collection<? extends GrantedAuthority> authorities);

    String extractUsername(String token, TokenType type);
}
