package viettel.namnt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import viettel.namnt.model.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
