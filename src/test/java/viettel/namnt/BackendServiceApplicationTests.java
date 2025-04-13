package viettel.namnt;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import viettel.namnt.controller.AuthenticationController;
import viettel.namnt.controller.EmailController;
import viettel.namnt.controller.UserController;

@SpringBootTest
class BackendServiceApplicationTests {

    @Autowired
    private AuthenticationController authenticationController;

    @Autowired
    private EmailController emailController;

    @Autowired
    private UserController userController;

    // Testing if application loads correctly
    @Test
    void contextLoads() {
        Assertions.assertThat(authenticationController).isNotNull();
        Assertions.assertThat(userController).isNotNull();
        Assertions.assertThat(emailController).isNotNull();
    }

}
