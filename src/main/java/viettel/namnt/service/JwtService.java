package viettel.namnt.service;

import org.springframework.stereotype.Service;
import viettel.namnt.common.TokenType;

import java.util.List;

@Service
public interface JwtService {
    String generateAccessToken(String username, List<String> authorities);

    String generateRefreshToken(String username, List<String> authorities);

    String extractUsername(String token, TokenType type);
}
