package cn.smbms.service.role;

import java.util.List;

import cn.smbms.pojo.Role;

public interface RoleService {
	
	/**
	 * ��ȡ��ɫ�б�
	 * @return
	 * @throws Exception
	 */
	public List<Role> getRoleList() throws Exception;
	
}
