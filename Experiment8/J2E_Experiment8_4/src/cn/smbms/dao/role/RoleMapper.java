package cn.smbms.dao.role;
import java.util.List;
import cn.smbms.pojo.Role;

public interface RoleMapper {
	
	
	/**
	 * ��ȡ��ɫ�б�
	 * @return
	 * @throws Exception
	 */
	public List<Role> getRoleList()throws Exception;
}
