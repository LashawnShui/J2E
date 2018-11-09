package cn.smbms.dao.user;

import java.util.List;
import java.util.Map;

import cn.smbms.pojo.User;

public interface UserMapper {
	public List<User> getUserListByMap(Map<String, String> userMap);
}
