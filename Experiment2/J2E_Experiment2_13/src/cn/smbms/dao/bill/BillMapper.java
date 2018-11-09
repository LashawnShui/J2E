package cn.smbms.dao.bill;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.smbms.pojo.Bill;

public interface BillMapper {
	public List<Bill> getBillListByProviderId(@Param("productName")String productName, @Param("providerId")Long providerId, @Param("isPayment")Integer isPayment);
}
