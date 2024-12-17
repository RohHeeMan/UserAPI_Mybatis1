package com.users.users.service;

import com.users.users.dto.UserDTO;
import com.users.users.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    // 생성자 주입 방식
    private final UserRepository userRepository;

    public List<UserDTO> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public UserDTO getUserById(int id) {
        return userRepository.getUserById(id);
    }

    public UserDTO addUser(UserDTO user){
        // 저장할 경우는 user만 리턴한다.
        // userRepository에서 void로 넘긴다. void addUser(UserDTO user);
        userRepository.addUser(user);
        return user;
    }

    public UserDTO updateUser(@PathVariable("id") int id, @RequestBody UserDTO user) {
        userRepository.updateUser(id, user); // 업데이트 수행
        return user; // 업데이트된 user 반환
    }


//    public UserDTO updateUser(UserDTO user) {
//        userRepository.updateUser(user);
//        return user;
//    }
}
