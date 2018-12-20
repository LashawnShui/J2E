package cn.smbms.dao.bill;

import org.apache.ibatis.annotations.Param;

public interface BillMapper {
	
	/**
	 * ���ݹ�Ӧ��ID��ѯ��������
	 * @param providerId
	 * @return
	 * @throws Exception
	 */
	public int getBillCountByProviderId(@Param("providerId")Integer providerId)throws Exception;
	
	/**
	 * ���ݹ�Ӧ��IDɾ��������Ϣ
	 * @param providerId
	 * @return
	 * @throws Exception
	 */
	public int deleteBillByProviderId(@Param("providerId")Integer providerId)throws Exception;

}
