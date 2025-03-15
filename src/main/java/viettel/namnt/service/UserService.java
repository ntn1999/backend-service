package viettel.namnt.service;

import viettel.namnt.controller.request.UserCreationRequest;
import viettel.namnt.controller.request.UserPasswordRequest;
import viettel.namnt.controller.request.UserUpdateRequest;
import viettel.namnt.controller.response.UserResponse;

import java.util.List;

public interface UserService {
    List<UserResponse> findAll();

    UserResponse findById(Long id);

    UserResponse findByUsername(String username);

    UserResponse findByEmail(String email);

    long save(UserCreationRequest req);

    void update(UserUpdateRequest req);

    void changePassword(UserPasswordRequest req);

    void delete(Long id);
}
