package cn.smbms.dao.bill;

import org.apache.ibatis.annotations.Param;

public interface BillMapper {
	
	/**
	 * 根据供应商ID查询订单数量
	 * @param providerId
	 * @return
	 * @throws Exception
	 */
	public int getBillCountByProviderId(@Param("providerId")Integer providerId)throws Exception;
	
	/**
	 * 根据供应商ID删除订单信息
	 * @param providerId
	 * @return
	 * @throws Exception
	 */
	public int deleteBillByProviderId(@Param("providerId")Integer providerId)throws Exception;

}
