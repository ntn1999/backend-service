package viettel.namnt.service;

import viettel.namnt.controller.request.SignInRequest;
import viettel.namnt.controller.response.TokenResponse;

public interface AuthenticationService {
    TokenResponse getAccessToken(SignInRequest request);

    TokenResponse getRefreshToken(String request);
}
