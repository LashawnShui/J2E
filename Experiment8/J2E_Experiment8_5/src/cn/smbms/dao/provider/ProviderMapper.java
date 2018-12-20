package cn.smbms.dao.provider;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.smbms.pojo.Provider;

public interface ProviderMapper {
	
	/**
	 * �����û���Ϣ
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public int add(Provider provider)throws Exception;
	
	/**
	 * ͨ��������ѯ-providerList
	 * @param proName
	 * @param proCode
	 * @param currentPageNo
	 * @param pageSize
	 * @return
	 * @throws Exception
	 */
	public List<Provider> getProviderList(@Param("proName")String proName,@Param("proCode")String proCode,
								@Param("from")Integer currentPageNo, @Param("pageSize")Integer pageSize)throws Exception;
	
	/**
	 * ͨ��������ѯ-��Ӧ�̱��¼��
	 * @param proName
	 * @param proCode
	 * @return
	 * @throws Exception
	 */
	public int getProviderCount(@Param("proName")String proName,@Param("proCode")String proCode)throws Exception;
	
	/**
	 * ͨ����Ӧ��idɾ����Ӧ����Ϣ
	 * @param delId
	 * @return
	 * @throws Exception
	 */
	public int deleteProviderById(@Param("id")Integer delId)throws Exception; 
	
	/**
	 * ����provider id ��ȡ��Ӧ����Ϣ
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Provider getProviderById(@Param("id")Integer id)throws Exception; 
	
	/**
	 * �޸Ĺ�Ӧ��
	 * @param provider
	 * @return
	 * @throws Exception
	 */
	public int modify(Provider provider)throws Exception;
	
}
