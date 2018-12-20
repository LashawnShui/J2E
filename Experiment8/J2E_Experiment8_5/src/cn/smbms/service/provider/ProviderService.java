package cn.smbms.service.provider;

import java.util.List;
import cn.smbms.pojo.Provider;

public interface ProviderService {
	
	/**
	 * ͨ����Ӧ�����ơ������ȡ��Ӧ���б�-ģ����ѯ-providerList
	 * @param proName
	 * @param proCode
	 * @param currentPageNo
	 * @param pageSize
	 * @return
	 */
	public List<Provider> getProviderList(String proName,String proCode,Integer currentPageNo, Integer pageSize) throws Exception;

	
	/**
	 * ͨ��������ѯ-��Ӧ�̱��¼��
	 * @param proName
	 * @param proCode
	 * @return
	 * @throws Exception
	 */
	public int getproviderCount(String proName,String proCode) throws Exception;
	
	/**
	 * ���ӹ�Ӧ��
	 * @param provider
	 * @return
	 * @throws Exception
	 */
	public boolean add(Provider provider) throws Exception;
	
	/**
	 * ͨ��proId��ȡProvider
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Provider getProviderById(Integer id) throws Exception;
	
	/**
	 * �޸Ĺ�Ӧ����Ϣ
	 * @param provider
	 * @return
	 * @throws Exception
	 */
	public boolean modify(Provider provider) throws Exception;
	
	/**
	 * ͨ��proIdɾ��Provider
	 * @param delId
	 * @return
	 * @throws Exception
	 */
	public boolean smbmsdeleteProviderById(Integer delId) throws Exception;
}
