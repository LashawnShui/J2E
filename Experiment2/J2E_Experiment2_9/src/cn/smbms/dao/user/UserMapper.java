package cn.smbms.dao.user;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
	public int deleteUserById(@Param("id")Integer delId);
}
