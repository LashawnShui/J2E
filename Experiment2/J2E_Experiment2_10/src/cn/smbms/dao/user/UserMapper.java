package cn.smbms.dao.user;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.smbms.pojo.User;

public interface UserMapper {
	public List<User> getUserListByRoleId(@Param("userRole")Integer roleId);
}