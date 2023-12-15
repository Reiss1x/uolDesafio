package reis1x.uoltest.data.jb.jpa;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import reis1x.uoltest.core.domain.User;
import reis1x.uoltest.core.domain.UserRepo;

@Repository
public class UserRepoImp implements UserRepo {
    
    @Autowired
    private JpaUserRepo repo;
    
    @Override
    public User persist(User user){
        return repo.save(user);
    }

    @Override
    public Optional<User> findById(Long id) {
        return repo.findById(id);
    }

    @Override
    public Iterable<User> findAll() {
        return repo.findAll();
    }
}
