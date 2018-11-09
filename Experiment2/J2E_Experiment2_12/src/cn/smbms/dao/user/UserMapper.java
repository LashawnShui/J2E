package cn.smbms.dao.user;

import org.apache.ibatis.annotations.Param;

import cn.smbms.pojo.User;

public interface UserMapper {
	public User getAddressListByUserId(@Param("id")Integer userId);
}
