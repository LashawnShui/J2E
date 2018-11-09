package cn.smbms.dao.user;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
	public int updatePwd(@Param("id")Integer id, @Param("userPassword")String pwd);
}
