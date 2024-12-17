package com.users.users.repository;

import com.users.users.dto.UserDTO;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.annotations.*;

import java.util.List;

// Dependencies에 설정
// implementation 'org.mybatis.spring.boot:mybatis-spring-boot-starter:3.0.3'
@Mapper
public interface UserRepository {
    @Select("SELECT * FROM users")
    List<UserDTO> getAllUsers();

    @Select("select * from users where id=#{id}")
    UserDTO getUserById(int id);

    @Insert("insert into users(name,email) values (#{user.name}, #{user.email})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    // @Param을 사용하여 명확히 알려주고 상단에서 user.name, user.email로 명확히 작성해야 한다.
    void addUser(@Param("user") UserDTO user);

    // 모델을 넘길 경우는 명확히 맵핑을 시켜줘야 오류가 안난다 / user.name / user.email
    @Update("update users set name=#{user.name}, email=#{user.email} where id=#{id}" )
    void updateUser(int id, @Param("user") UserDTO user);
}
