package com.s13.resource;

import com.s13.model.User;
import com.s13.repository.UserRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserResource {
   @Autowired
    UserRepository userRepository;
   @PostMapping("/user/create")
    public ResponseEntity<User> create(@RequestBody User user){
        User usrResponse=userRepository.save(user);
       return new ResponseEntity<>(usrResponse, HttpStatus.OK);
    };

    @GetMapping("/user/{id}")
    public ResponseEntity<User> userById(@PathVariable Long id){
        Optional<User> usrResponse=userRepository.findById(id);
            if(usrResponse.isPresent()){
                return new ResponseEntity<>(usrResponse.get(), HttpStatus.OK);
            }
       return  new ResponseEntity<>(usrResponse.get(),HttpStatus.NOT_FOUND);
    }

    @GetMapping("/user/all")
    public ResponseEntity<List<User>> getAll(){
        List<User> usrList=userRepository.findAll();
        if(usrList.size()!=0){
            return new ResponseEntity<>(usrList, HttpStatus.OK);
        }
        return  new ResponseEntity<>(usrList,HttpStatus.NOT_FOUND);
    }
}
