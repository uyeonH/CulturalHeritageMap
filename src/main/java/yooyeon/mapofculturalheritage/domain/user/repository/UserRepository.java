package yooyeon.mapofculturalheritage.domain.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yooyeon.mapofculturalheritage.domain.user.domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryCustom {
    Optional<User> findByEmail(String email);
}
