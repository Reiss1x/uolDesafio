package reis1x.uoltest.core.usecases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reis1x.uoltest.core.domain.User;
import reis1x.uoltest.core.domain.UserDTO;
import reis1x.uoltest.core.domain.UserRepo;

@Service
public class RegisterUserCase {
    
    @Autowired
    private UserRepo ur;

    public User execute(UserDTO user){
        User u = new User();
        u.setName(user.name());
        u.setEmail(user.email());
        u.setTel(user.tel());
        u.setCodename(user.codename());     
        u.setGroup(user.group()); 
        ur.persist(u);  
        return u;
    }
}
