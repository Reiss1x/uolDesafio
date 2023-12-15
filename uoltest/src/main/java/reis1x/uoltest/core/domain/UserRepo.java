package reis1x.uoltest.core.domain;

import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo {
    User persist(User user);
    Optional<User> findById(Long id);
    Iterable<User> findAll();    
}
