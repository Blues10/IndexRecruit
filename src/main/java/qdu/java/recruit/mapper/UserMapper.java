package qdu.java.recruit.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import qdu.java.recruit.entity.User;

import java.util.ArrayList;

public interface UserMapper {

    @Select("select * from user")
    ArrayList<User> listUser();

    @Select("select * from user where userId = #{userId}")
    User getUser(@Param("userId") int userId);
}