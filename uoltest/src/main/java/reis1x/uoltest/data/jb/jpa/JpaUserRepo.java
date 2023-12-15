package reis1x.uoltest.data.jb.jpa;

import org.springframework.data.repository.CrudRepository;

import reis1x.uoltest.core.domain.User;

public interface JpaUserRepo extends CrudRepository<User, Long>{
}