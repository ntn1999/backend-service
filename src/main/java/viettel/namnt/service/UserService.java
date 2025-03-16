package viettel.namnt.service;

import viettel.namnt.controller.request.UserCreationRequest;
import viettel.namnt.controller.request.UserPasswordRequest;
import viettel.namnt.controller.request.UserUpdateRequest;
import viettel.namnt.controller.response.UserPageResponse;
import viettel.namnt.controller.response.UserResponse;

public interface UserService {
    UserPageResponse findAll(String keyword, String sort, int page, int size);

    UserResponse findById(Long id);

    UserResponse findByUsername(String username);

    UserResponse findByEmail(String email);

    long save(UserCreationRequest req);

    void update(UserUpdateRequest req);

    void changePassword(UserPasswordRequest req);

    void delete(Long id);
}
