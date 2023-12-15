package reis1x.uoltest.presenter;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import reis1x.uoltest.core.domain.User;
import reis1x.uoltest.core.domain.UserDTO;
import reis1x.uoltest.core.usecases.RegisterUserCase;

/**
 * UserController
 */
@RestController
 public class UserController {

    @Autowired
    private RegisterUserCase registerUser;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody UserDTO userDto){
        return new ResponseEntity<User>(registerUser.execute(userDto), HttpStatus.OK);
    }

    @GetMapping("/")
    public ModelAndView homePage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("users.html");
        return modelAndView;
    }
}